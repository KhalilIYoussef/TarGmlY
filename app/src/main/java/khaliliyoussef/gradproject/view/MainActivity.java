package khaliliyoussef.gradproject.view;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.PersistableBundle;
import android.preference.PreferenceManager;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.api.CommonStatusCodes;

import java.util.ArrayList;
import java.util.Locale;

import khaliliyoussef.gradproject.R;
import khaliliyoussef.gradproject.data.InsertWords;

import static khaliliyoussef.gradproject.data.TransContract.TaskEntry.COLUMN_ARABIC;
import static khaliliyoussef.gradproject.data.TransContract.TaskEntry.COLUMN_ENGLISH;
import static khaliliyoussef.gradproject.data.TransContract.TaskEntry.CONTENT_URI_ARABIC;
import static khaliliyoussef.gradproject.data.TransContract.TaskEntry.CONTENT_URI_ENGLISH;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    Toolbar toolbar;
    private final int REQ_CODE_SPEECH_INPUT = 100;
    private static final int RC_OCR_CAPTURE = 9003;
    EditText editText;
    TextView textView;
    ImageButton searchButton;
    ImageButton cameraButton;
    ImageButton audioButton;
    ImageButton favoriteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        //make the tool bar transparent
       toolbar.getBackground().setAlpha(0);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
          Intent i =getIntent();
        textView = (TextView) findViewById(R.id.textView);
        cameraButton= (ImageButton) findViewById(R.id.cameraButton);
        audioButton= (ImageButton) findViewById(R.id.audioButton);
        searchButton= (ImageButton) findViewById(R.id.searchButton);
        editText= (EditText) findViewById(R.id.EditText_word);
        searchButton= (ImageButton) findViewById(R.id.searchButton);
        favoriteButton= (ImageButton) findViewById(R.id.favorite);


        //by default it's Scientific dictionary
        if(savedInstanceState!=null) {
            Toast.makeText(this, "the default case", Toast.LENGTH_SHORT).show();
            InsertWords.insertScientificWords(this);
        }

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //TODO change the button background and turn it back
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    searchButton.setBackground(getDrawable(R.drawable.button_background_pressed));
                }
                else
                searchButton.setBackground(getResources().getDrawable(R.drawable.button_background_pressed));
                new Handler().postDelayed(new Runnable() {

                    public void run() {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            searchButton.setBackground(getDrawable(R.drawable.button_background));
                        }
                        else
                            searchButton.setBackground(getResources().getDrawable(R.drawable.button_background));
                    }
                }, 250);



                InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                imm.showSoftInput(editText, InputMethodManager.SHOW_FORCED);
                TextToSpeech tts=null;
                boolean isEnglish = true;
                String str=editText.getText().toString();


                for ( char c : str.toCharArray() ) {
                    if ( Character.UnicodeBlock.of(c) != Character.UnicodeBlock.BASIC_LATIN ) {
                        isEnglish = false;
                        break;
                    }
                }
                if(isEnglish)
                {
                    str.toLowerCase();
                    Cursor cursor = getContentResolver().query(CONTENT_URI_ARABIC,
            new String[]{COLUMN_ARABIC},
            COLUMN_ENGLISH + "=?",
            new String[]{str},
            null);
                    while (cursor.moveToNext()) {
                        int index = cursor.getColumnIndex(COLUMN_ARABIC);
                        String s = cursor.getString(index);
                        //Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
                        textView.setText(s);

                    }
                }
                else
               {

                   Cursor     cursor = getContentResolver().query(CONTENT_URI_ENGLISH,
                           new String[]{COLUMN_ENGLISH},
                           COLUMN_ARABIC + "=?",
                           new String[]{str},
                           null);
                   while (cursor.moveToNext())  {
                       int index = cursor.getColumnIndex(COLUMN_ENGLISH);
                       String s = cursor.getString(index);
                     //Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
                       textView.setText(s);
//                       if(s!=null||!s.isEmpty()) {
//                           if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                               tts.speak(String.valueOf(s), TextToSpeech.QUEUE_ADD, null, "DEFAULT");
//                           } else
//                               tts.speak("hi there", TextToSpeech.QUEUE_ADD, null);
//                       }
                   }
                 }

            }
        });

        cameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    cameraButton.setBackground(getDrawable(R.drawable.button_background_pressed));
                }
                else
                    cameraButton.setBackground(getResources().getDrawable(R.drawable.button_background_pressed));
                new Handler().postDelayed(new Runnable()
                {

                    public void run() {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            cameraButton.setBackground(getDrawable(R.drawable.button_background));
                        }
                        else
                            cameraButton.setBackground(getResources().getDrawable(R.drawable.button_background));
                    }
                }, 250);
                Intent intent = new Intent(MainActivity.this, OcrCaptureActivity.class);
                startActivityForResult(intent, RC_OCR_CAPTURE);
            }
        });
        audioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    audioButton.setBackground(getDrawable(R.drawable.button_background_pressed));
                }
                else
                    audioButton.setBackground(getResources().getDrawable(R.drawable.button_background_pressed));
                new Handler().postDelayed(new Runnable() {

                    public void run() {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            audioButton.setBackground(getDrawable(R.drawable.button_background));
                        }
                        else
                            audioButton.setBackground(getResources().getDrawable(R.drawable.button_background));
                    }
                }, 250);
                askSpeechInput();
            }
        });


        favoriteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    favoriteButton.setBackground(getDrawable(R.drawable.button_background_pressed));
                }
                else
                    favoriteButton.setBackground(getResources().getDrawable(R.drawable.button_background_pressed));
                new Handler().postDelayed(new Runnable()
                {

                    public void run() {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            favoriteButton.setBackground(getDrawable(R.drawable.button_background));
                        }
                        else
                            favoriteButton.setBackground(getResources().getDrawable(R.drawable.button_background));
                    }
                }, 250);
                Intent intent = new Intent(MainActivity.this, OnlineActivity.class);
                startActivity(intent);


            }
        });

    }



    private void ResetDatabaseType() {
        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);

        if(preferences.getBoolean(getString(R.string.pref_reset_database),true))
        {
            CheckDatabaseType();
            }
        }

    private void CheckDatabaseType() {
        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);
        String databaseType=preferences.getString(getString(R.string.pref_type_key),getString(R.string.pref_insert_scientific));

    if (databaseType.equals(getString(R.string.pref_insert_general))) {
        InsertWords.insertGeneralWords(this);
        Toast.makeText(this, "General Words added", Toast.LENGTH_SHORT).show();
    } else if (databaseType.equals(getString(R.string.pref_insert_scientific))) {
        InsertWords.insertScientificWords(this);
        Toast.makeText(this, "Scientific Words added", Toast.LENGTH_SHORT).show();
    } else {
        InsertWords.insertScientificWords(this);
        Toast.makeText(this, "else block", Toast.LENGTH_SHORT).show();
    }
}




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.rateUs)
        {
           // InsertWords.insertGeneralWords(MainActivity.this);

        }

        else if (item.getItemId()==R.id.settings)
        {
            Intent intent =new Intent(MainActivity.this, Settings.class);
            startActivity(intent);

        }

        return true;
    }


    // Showing google speech input dialog

    private void askSpeechInput() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT,
                "say something");
        try {
            startActivityForResult(intent, REQ_CODE_SPEECH_INPUT);
        } catch (ActivityNotFoundException a) {

        }
    }

    // Receiving speech input


    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if(requestCode == RC_OCR_CAPTURE)
        {
            if (resultCode == CommonStatusCodes.SUCCESS)
            {
                if (data != null)
                {
                    String text = data.getStringExtra(OcrCaptureActivity.TextBlockObject);
                    Toast.makeText(this,text,Toast.LENGTH_SHORT).show();

                   // editText.setText(text);
                    editText.setText(text);
                    //TODO  Log.d(TAG, "Text read: " + text);
                } else
                {

                    //TODO  Log.d(TAG, "No Text captured, intent data is null");
                }
            } else {

            }
        }
        else {
            super.onActivityResult(requestCode, resultCode, data);
            switch (requestCode) {
                case REQ_CODE_SPEECH_INPUT: {
                    if (resultCode == RESULT_OK && null != data) {

                        ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                       // editText.setText(result.get(0));
                        editText.setText(result.get(0));
                    }
                    break;
                }

            }
    }


}

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home)
        {
            // goto home activity
        }
        else if (id == R.id.nav_online)
        {
            //go onlineActivity
            Intent intent =new Intent(this,OnlineActivity.class);
            startActivity(intent);

        }
        else if (id == R.id.nav_settings)
        {
            Intent intent =new Intent(this,Settings.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_add)
        {
            Intent intent =new Intent(this,AddWord.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_share)
        {
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT,
                    "Hey check out my app at: https://play.google.com/store/apps/details?id=com.google.android.apps.plus");
            sendIntent.setType("text/plain");
            startActivity(Intent.createChooser(sendIntent,"Share With"));

        }
        else if (id == R.id.nav_send)
        {

            Intent intent=new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            String [] to={getString(R.string.email)};
            intent.putExtra(Intent.EXTRA_EMAIL,to);
            intent.setType("message/rfc822");
            Intent chooser=Intent.createChooser(intent,"Send With");
            startActivity(chooser);

        }
else if (id==R.id.nav_about)
        {
            //about
            AlertDialog.Builder builder;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                builder = new AlertDialog.Builder(this, android.R.style.Theme_Material_Dialog_Alert);
            } else {
                builder = new AlertDialog.Builder(this);
            }
            builder.setTitle("About US")
                    .setMessage("We are a team of programmers form Faculty of computer and Information, Minia University ,Under The supervision Dr.Alhussien seddik , Khalil Ibrahim , Thomas Edward, Romany Essa, Khalaf Makram, Girgis Monier, Marina Reda, Mariam Moris")
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // continue with delete
                        }
                    })
                    .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // do nothing
                        }
                    })
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .show();
        }
        else if (id==R.id.nav_copyright)
        {
            //copyRights
            AlertDialog.Builder builder;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                builder = new AlertDialog.Builder(this, android.R.style.Theme_Material_Dialog_Alert);
            } else {
                builder = new AlertDialog.Builder(this);
            }
            builder.setTitle("CopyRight")
                    .setMessage("Copyright ©2017. Minia University . All Rights Reserved. Permission to use, copy, modify, and distribute this software and its documentation for educational, research, and not-for-profit purposes, without fee and without a signed licensing agreement")
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // continue with delete
                        }
                    })
                    .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // do nothing
                        }
                    })
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .show();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

//    @Override
//    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
//        super.onSaveInstanceState(outState, outPersistentState);
//        outState.putBoolean("IsFirst",false);
//
//    }




}

