package khaliliyoussef.gradproject;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import khaliliyoussef.gradproject.view.MainActivity;

import static android.support.test.espresso.Espresso.onView;

/**
 * Created by Khalil on 6/27/2017.
 */
@RunWith(AndroidJUnit4.class)
public class GradProjectTest
{
@Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule=
        new ActivityTestRule<MainActivity>(MainActivity.class);
    @Test
    public  void clickAddButton_openAddNoteUI() throws Exception
    {
            
    }

}
