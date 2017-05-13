package khaliliyoussef.gradproject.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;

import java.util.ArrayList;
import java.util.List;

import static khaliliyoussef.gradproject.data.TransContract.TaskEntry.CONTENT_URI;


public class InsertWords
  {

    public static void insertFakeData( Context context){


        //create a list of fake guests
        List<ContentValues> list = new ArrayList<ContentValues>();
//notice all english words are small case and arabic are single word
        ContentValues cv = new ContentValues();
        cv.put(TransContract.TaskEntry.COLUMN_ENGLISH, "android");
        cv.put(TransContract.TaskEntry.COLUMN_ARABIC,"روبوت");
        list.add(cv);


        //insert all guests in one transaction
        try
        {
            //db.beginTransaction();
            //clear the table first
          // db.delete (TransContract.TaskEntry.TABLE_NAME,null,null);
            context.getContentResolver().delete(CONTENT_URI,null,null);
            // go through the list and add one by one
            for(ContentValues c:list){
               // db.insert(TransContract.TaskEntry.TABLE_NAME, null, c);
                context.getContentResolver().insert(CONTENT_URI,c);
            }
           // db.setTransactionSuccessful();
        }
        catch (SQLException e) {

            //error while inserting the values
            //too bad :(
        }





    }


}
