package khaliliyoussef.gradproject.view;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.os.Handler;
import android.os.StrictMode;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import khaliliyoussef.gradproject.R;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static khaliliyoussef.gradproject.data.TransContract.TaskEntry.COLUMN_ARABIC;
import static khaliliyoussef.gradproject.data.TransContract.TaskEntry.COLUMN_ENGLISH;
import static khaliliyoussef.gradproject.data.TransContract.TaskEntry.CONTENT_URI_ARABIC;
import static khaliliyoussef.gradproject.data.TransContract.TaskEntry.CONTENT_URI_ENGLISH;

public class OnlineActivity extends AppCompatActivity {

    private EditText onlineEditText;
    private TextView onlineTextView;
    private ImageButton buttonTranslate;
    private ImageButton onlineAudioButton;
    private ImageButton onlineCameraButton;
    private final int REQ_CODE_SPEECH_INPUT = 200;
    private static final int RC_OCR_CAPTURE = 8003;

    private static final String KEY = "trnsl.1.1.20170210T124934Z.d35ea31d54902cf9.1111b58b85d4b141359d3f5d458c065e2c398fcf";
    private static final String URL = "https://translate.yandex.net";

    //создаем объект Gson
    private Gson gson = new GsonBuilder().create();

    //создаем объект класса Retrofit
    private Retrofit retrofit = new Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(gson))
            .baseUrl(URL)
            .build();

    //создаем объект интерфейса
    private Link link = retrofit.create(Link.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online);

        onlineEditText = (EditText) findViewById(R.id.online_editText);
        onlineTextView = (TextView) findViewById(R.id.online_textView);
        buttonTranslate = (ImageButton) findViewById(R.id.online_search_button);
//        onlineAudioButton = (ImageButton) findViewById(R.id.online_audio_button);
//        onlineCameraButton = (ImageButton) findViewById(R.id.online_camera_button);


        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        buttonTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getOnlineWord("en","ar");

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    buttonTranslate.setBackground(getDrawable(R.drawable.button_background_pressed));
                }
                else
                    buttonTranslate.setBackground(getResources().getDrawable(R.drawable.button_background_pressed));
                new Handler().postDelayed(new Runnable() {

                    public void run() {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            buttonTranslate.setBackground(getDrawable(R.drawable.button_background));
                        }
                        else
                            buttonTranslate.setBackground(getResources().getDrawable(R.drawable.button_background));
                    }
                }, 250);



                InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                imm.showSoftInput(onlineEditText, InputMethodManager.SHOW_FORCED);
                TextToSpeech tts=null;
                boolean isEnglish = true;
                String str=onlineEditText.getText().toString();


                for ( char c : str.toCharArray() ) {
                    if ( Character.UnicodeBlock.of(c) != Character.UnicodeBlock.BASIC_LATIN ) {
                        isEnglish = false;
                        break;
                    }
                }
                if(isEnglish)
                {
                    str.toLowerCase();
                    getOnlineWord("en","ar");
                }
                else
                {

                   getOnlineWord("ar","en");
                }


            }
        });

//
//        onlineCameraButton.setOnClickListener(new View.OnClickListener()
//
//        {
//            @Override
//            public void onClick(View v) {
//
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                    onlineCameraButton.setBackground(getDrawable(R.drawable.button_background_pressed));
//                } else
//                    onlineCameraButton.setBackground(getResources().getDrawable(R.drawable.button_background_pressed));
//                new Handler().postDelayed(new Runnable() {
//
//                    public void run() {
//                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                            onlineCameraButton.setBackground(getDrawable(R.drawable.button_background));
//                        } else
//                            onlineCameraButton.setBackground(getResources().getDrawable(R.drawable.button_background));
//                    }
//                }, 250);
//                Intent intent = new Intent(OnlineActivity.this, OcrCaptureActivity.class);
//                startActivityForResult(intent, RC_OCR_CAPTURE);
//            }
//        });
//
//        onlineAudioButton.setOnClickListener(new View.OnClickListener()
//
//        {
//            @Override
//            public void onClick(View v) {
//
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                    onlineAudioButton.setBackground(getDrawable(R.drawable.button_background_pressed));
//                } else
//                    onlineAudioButton.setBackground(getResources().getDrawable(R.drawable.button_background_pressed));
//                new Handler().postDelayed(new Runnable() {
//
//                    public void run() {
//                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                            onlineAudioButton.setBackground(getDrawable(R.drawable.button_background));
//                        } else
//                            onlineAudioButton.setBackground(getResources().getDrawable(R.drawable.button_background));
//                    }
//                }, 250);
//                askSpeechInput();
//            }
//        });
//
  }


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


    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RC_OCR_CAPTURE) {
            if (resultCode == CommonStatusCodes.SUCCESS) {
                if (data != null) {
                    String text = data.getStringExtra(OcrCaptureActivity.TextBlockObject);
                    Toast.makeText(this, text, Toast.LENGTH_SHORT).show();

                    // editText.setText(text);
                    onlineEditText.setText(text);
                    //TODO  Log.d(TAG, "Text read: " + text);
                } else {

                    //TODO  Log.d(TAG, "No Text captured, intent data is null");
                }
            } else {

            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
            switch (requestCode) {
                case REQ_CODE_SPEECH_INPUT: {
                    if (resultCode == RESULT_OK && null != data) {

                        ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        // editText.setText(result.get(0));
                        onlineEditText.setText(result.get(0));
                    }
                    break;
                }

            }
        }


    }



    protected void getOnlineWord(String from ,String to) {


        Map<String, String> mapJson = new HashMap<>();
        mapJson.put("key", KEY);
        mapJson.put("text", onlineEditText.getText().toString());
        mapJson.put("lang", from+"-"+to);

        //создаем объект Call
        Call<Object> call = link.translate(mapJson);

        try {
            Response<Object> response = call.execute();

            Map<String, String> map = gson.fromJson(response.body().toString(), Map.class);

            for (Map.Entry e : map.entrySet()) {

                if (e.getKey().equals("text")) {
                    onlineTextView.setText(e.getValue().toString());
                }
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

//
//    Map<String, String> mapJson = new HashMap<>();
//                mapJson.put("key", KEY);
//                        mapJson.put("text", onlineEditText.getText().toString());
//                        mapJson.put("lang", "en-ru");
//
//                        //создаем объект Call
//                        Call<Object> call = link.translate(mapJson);
//
//        try {
//        Response<Object> response = call.execute();
//
//        Map<String, String> map = gson.fromJson(response.body().toString(), Map.class);
//
//        for (Map.Entry e : map.entrySet()) {
//
//        if (e.getKey().equals("text")) {
//        onlineTextView.setText(e.getValue().toString());
//        }
//        }
//        } catch (IOException e) {
//        e.printStackTrace();
//        }