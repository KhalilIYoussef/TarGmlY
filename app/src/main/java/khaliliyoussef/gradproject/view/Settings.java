package khaliliyoussef.gradproject.view;

import android.os.Build;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.support.annotation.RequiresApi;
import android.widget.Toast;

import khaliliyoussef.gradproject.R;
import khaliliyoussef.gradproject.data.InsertWords;

/**
 * Created by Khalil on 6/15/2017.
 */

public class Settings extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new MyPreferenceFragment())
                .commit();
    }

    public static class MyPreferenceFragment extends PreferenceFragment
    {
        @Override
        public void onCreate(final Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.preferences);
            final ListPreference listPreference= (ListPreference) findPreference(getString(R.string.pref_type_key));
            listPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {

                @Override
                public boolean onPreferenceChange(Preference preference, Object newValue) {

                  //  String type=listPreference.getValue();
                    if(newValue.toString().equals(getString(R.string.pref_insert_general)))
                    {
                        InsertWords.insertGeneralWords(getActivity().getApplicationContext());
                        Toast.makeText(getActivity(), "General database added", Toast.LENGTH_SHORT).show();
                        listPreference.setValue(getString(R.string.pref_insert_general));
                    }
                    else if(newValue.toString().equals(getString(R.string.pref_insert_scientific)))
                    {
                        InsertWords.insertScientificWords(getActivity().getApplicationContext());
                        Toast.makeText(getActivity(), "Scientific Database added", Toast.LENGTH_SHORT).show();
                        listPreference.setValue(getString(R.string.pref_insert_scientific));

                    }
                        return false;
                }
            });
            final CheckBoxPreference checkBoxPreference= (CheckBoxPreference) findPreference(getString(R.string.pref_reset_database));
            checkBoxPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
                @Override
                public boolean onPreferenceChange(Preference preference, Object newValue) {
                    InsertWords.insertScientificWords(getActivity());
                    checkBoxPreference.equals(false);
                    listPreference.setValue(getString(R.string.pref_insert_scientific));
                    Toast.makeText(getActivity(),"Database reseted to default",Toast.LENGTH_SHORT).show();

                    return false;
                }
            });
        }
    }

}
