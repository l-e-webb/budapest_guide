package louiswebb.com.budaspestguide;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AttractionFragment extends Fragment {

    public static final String LOG_TAG = AttractionFragment.class.getSimpleName();

    public static final String TITLE_KEY = "titles";
    public static final String DESCRIPTION_KEY = "description";
    public static final String ATTRACTIONS_KEY = "attractions";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.attraction_fragment, container, false);

        Bundle args = getArguments();

        //Extract the description to appear at the top of the fragment.
        try {
            ((TextView) layout.findViewById(R.id.attraction_type_description)).setText(
                    getContext().getResources().getString(args.getInt(DESCRIPTION_KEY))
            );
        } catch (NullPointerException e) {
            Log.d(LOG_TAG, "Error--attraction fragment has no attraction type description.");
        }

        //Extract an ArrayList of Attractions based on the attraction ids in this fragments args
        //bundle.
        ArrayList<Attraction> attractions = new ArrayList<>();
        try {
            for (int attractionId : args.getIntArray(ATTRACTIONS_KEY)) {
                attractions.add(AttractionList.getAttraction(attractionId));
            }
        } catch (NullPointerException e) {
            Log.d(LOG_TAG, "Error--attraction fragment has no attraction list.");
        }

        //Set the adapter of the list view to a new attraction adapter with the above attractions
        //ArrayList.
        ((ListView) layout.findViewById(R.id.attraction_list)).setAdapter(
                new AttractionAdapter((Activity) getContext(), attractions)
        );

        return layout;
    }
}
