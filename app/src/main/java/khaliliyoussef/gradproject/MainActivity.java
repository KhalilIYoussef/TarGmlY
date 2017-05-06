package khaliliyoussef.gradproject;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.database.Cursor;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.ArrayList;
import java.util.Locale;

import khaliliyoussef.gradproject.data.InsertWords;
import khaliliyoussef.gradproject.data.TransContract;

import static khaliliyoussef.gradproject.data.TransContract.TaskEntry.COLUMN_ARABIC;
import static khaliliyoussef.gradproject.data.TransContract.TaskEntry.COLUMN_ENGLISH;
import static khaliliyoussef.gradproject.data.TransContract.TaskEntry.CONTENT_URI;
import static khaliliyoussef.gradproject.data.TransContract.TaskEntry.CONTENT_URI_ARABIC;

public class MainActivity extends AppCompatActivity {
    private final int REQ_CODE_SPEECH_INPUT = 100;
    private static final int RC_OCR_CAPTURE = 9003;
    EditText editText;
    ImageButton searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText= (EditText) findViewById(R.id.EditText_word);
        searchButton= (ImageButton) findViewById(R.id.searchButton);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             String s = String.valueOf(getContentResolver().query(CONTENT_URI_ARABIC,
                        new String[]{COLUMN_ARABIC},
                        COLUMN_ENGLISH+ "=?",
                        new String[]{editText.getText().toString()},
                        null));
                Toast.makeText(MainActivity.this,s,Toast.LENGTH_SHORT).show();
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
        if(item.getItemId()==R.id.audioToText)
        {
            askSpeechInput();
        }

        else if(item.getItemId()==R.id.imageToText)
            {
                Intent intent = new Intent(MainActivity.this, OcrCaptureActivity.class);
                startActivityForResult(intent, RC_OCR_CAPTURE);
            }
        else if(item.getItemId()==R.id.addWord)
        {
            InsertWords.insertFakeData(this);
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
                "اوعى تتكلم");
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
                        editText.setText(result.get(0));
                    }
                    break;
                }

            }
    }


}
}

