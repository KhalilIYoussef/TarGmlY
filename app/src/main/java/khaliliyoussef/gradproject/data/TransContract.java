package khaliliyoussef.gradproject.data;
import android.net.Uri;
import android.provider.BaseColumns;


public class TransContract {


    // The authority, which is how your code knows which Content Provider to access
    public static final String AUTHORITY = "khaliliyoussef.gradproject";

    // The base content URI = "content://" + <authority>
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + AUTHORITY);

    // Define the possible paths for accessing data in this contract
    // This is the path for the "tasks" directory
    public static final String PATH_TASKS = "words";

    /* TaskEntry is an inner class that defines the contents of the task table */
    public static final class TaskEntry implements BaseColumns {

        // TaskEntry content URI = base content URI + path
        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_TASKS).build();


        // Task table and column names
        public static final String TABLE_NAME = "words";

        // Since TaskEntry implements the interface "BaseColumns", it has an automatically produced
        // "_ID" column in addition to the two below
        public static final String COLUMN_ENGLISH = "english";
        public static final String COLUMN_ARABIC = "arabic";


        /*
        The above table structure looks something like the sample table below.
        With the name of the table and columns on top, and potential contents in rows

        Note: Because this implements BaseColumns, the _id column is generated automatically

        tasks
         - - - - - - - - - - - - - - - - - - - - - -
        | _id  |    english         |    arabic     |
         - - - - - - - - - - - - - - - - - - - - - -
        |  1   |      Android       |    نظام تشغيل |
         - - - - - - - - - - - - - - - - - - - - - -
        |  2   |      Charge        |      شحنة      |
         - - - - - - - - - - - - - - - - - - - - - -
        .
        .
        .
         - - - - - - - - - - - - - - - - - - - - - -
        | 43   |   Content Provider    |    مش عارف  |
         - - - - - - - - - - - - - - - - - - - - - -

         */

    }
}
