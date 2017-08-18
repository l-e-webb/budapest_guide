package louiswebb.com.budaspestguide;

import android.app.Activity;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class AttractionAdapter extends ArrayAdapter<Attraction> {

    AttractionAdapter(Activity context, ArrayList<Attraction> attractions) {
        super(context, 0, attractions);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(
                    R.layout.attraction_item_layout, viewGroup, false
            );
        }

        Attraction attraction = getItem(i);
        Resources resources = getContext().getResources();

        //Set background colors of items to alternate between red and green.
        view.setBackgroundColor(resources.getColor(
                (i % 2 == 0) ? R.color.colorSecondary : R.color.colorPrimaryDark
        ));

        //Set the title of this list item.
        ((TextView) view.findViewById(R.id.attraction_name)).setText(
                resources.getString(attraction.nameId)
        );

        //Set the description of this list item.
        ((TextView) view.findViewById(R.id.attraction_description)).setText(
                resources.getString(attraction.descriptionId)
        );

        //Set the image of this list item, if it is present; otherwise, hide the image view.
        ImageView imageView = (ImageView) view.findViewById(R.id.attraction_image);
        if (attraction.imageId >= 0) {
            imageView.setImageResource(attraction.imageId);
            imageView.setVisibility(View.VISIBLE);
            imageView.setContentDescription(resources.getString(attraction.descriptionId));
        } else {
            view.findViewById(R.id.attraction_image).setVisibility(View.GONE);
        }

        return view;
    }
}
