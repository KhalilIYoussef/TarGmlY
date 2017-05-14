package khaliliyoussef.gradproject;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.database.Cursor;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
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
import khaliliyoussef.gradproject.data.InsertWords;

import static khaliliyoussef.gradproject.data.TransContract.TaskEntry.COLUMN_ARABIC;
import static khaliliyoussef.gradproject.data.TransContract.TaskEntry.COLUMN_ENGLISH;
import static khaliliyoussef.gradproject.data.TransContract.TaskEntry.CONTENT_URI_ARABIC;
import static khaliliyoussef.gradproject.data.TransContract.TaskEntry.CONTENT_URI_ENGLISH;

public class MainActivity extends AppCompatActivity
{
    Toolbar toolbar;
    private final int REQ_CODE_SPEECH_INPUT = 100;
    private static final int RC_OCR_CAPTURE = 9003;

    EditText editText;
    TextView textView;
    ImageButton searchButton;
    ImageButton cameraButton;
    ImageButton audioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        toolbar.getBackground().setAlpha(0);
        textView = (TextView) findViewById(R.id.textView);
        cameraButton= (ImageButton) findViewById(R.id.cameraButton);
        audioButton= (ImageButton) findViewById(R.id.audioButton);
        searchButton= (ImageButton) findViewById(R.id.searchButton);
        editText= (EditText) findViewById(R.id.EditText_word);
        searchButton= (ImageButton) findViewById(R.id.searchButton);
        //insert general words words
            // InsertWords.insertGeneralWords(this);
        //insert Scientific words
        InsertWords.insertScientificWords(this);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

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
                   while (cursor.moveToNext()) {
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
                Intent intent = new Intent(MainActivity.this, OcrCaptureActivity.class);
                startActivityForResult(intent, RC_OCR_CAPTURE);
            }
        });
        audioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                askSpeechInput();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.addWord)
        {
            InsertWords.insertGeneralWords(this);
        }
else if(item.getItemId()==R.id.addScientificWords)
        {
            InsertWords.insertScientificWords(this);
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
                    textView.setText(text);
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
                        textView.setText(result.get(0));
                    }
                    break;
                }

            }
    }


}
}

