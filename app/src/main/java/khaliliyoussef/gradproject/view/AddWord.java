package khaliliyoussef.gradproject.view;

import android.content.ContentValues;
import android.database.SQLException;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.design.internal.SnackbarContentLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import khaliliyoussef.gradproject.R;

import static khaliliyoussef.gradproject.data.TransContract.TaskEntry.COLUMN_ARABIC;
import static khaliliyoussef.gradproject.data.TransContract.TaskEntry.COLUMN_ENGLISH;
import static khaliliyoussef.gradproject.data.TransContract.TaskEntry.CONTENT_URI;

public class AddWord extends AppCompatActivity {
Button button;
    EditText ed_english,ed_arabic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_word);
        ed_english= (EditText) findViewById(R.id.ed_english);
        ed_arabic= (EditText) findViewById(R.id.ed_arabic);
        button= (Button) findViewById(R.id.add_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String arabic = String.valueOf(ed_arabic.getText());
                String english= String.valueOf(ed_english.getText());
                ContentValues values = new ContentValues();
                values.put(COLUMN_ENGLISH,english);
                values.put(COLUMN_ARABIC,arabic);
                try {
                    getContentResolver().insert(CONTENT_URI, values);
                    Snackbar.make(findViewById(R.id.add_constrain),"Word added Successfully",Snackbar.LENGTH_SHORT).show();
                }
                catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }
        });

    }
}
