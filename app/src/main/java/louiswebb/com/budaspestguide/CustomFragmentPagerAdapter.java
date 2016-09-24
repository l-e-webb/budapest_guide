package louiswebb.com.budaspestguide;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CustomFragmentPagerAdapter extends FragmentPagerAdapter {

    final static int LANDMARKS_POSITION = 0;
    final static int BRIDGES_POSITION = 1;
    final static int MUSEUMS_POSITION = 2;
    final static int MUSIC_POSITION = 3;

    Context context;

    public CustomFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new AttractionFragment();
        Bundle args = new Bundle();
        switch (position) {
            case LANDMARKS_POSITION:
                args.putInt(AttractionFragment.TITLE_KEY, R.string.landmarks_fragment_name);
                args.putInt(AttractionFragment.DESCRIPTION_KEY, R.string.landmarks_description);
                args.putIntArray(AttractionFragment.ATTRACTIONS_KEY, new int[]{
                        R.string.basilica_name,
                        R.string.parliament_name
                });
                break;
            case BRIDGES_POSITION:
                args.putInt(AttractionFragment.TITLE_KEY, R.string.bridges_fragment_name);
                args.putInt(AttractionFragment.DESCRIPTION_KEY, R.string.bridges_description);
                args.putIntArray(AttractionFragment.ATTRACTIONS_KEY, new int[]{
                        R.string.chain_bridge_name,
                        R.string.liberty_bridge_name
                });
                break;
            case MUSEUMS_POSITION:
                args.putInt(AttractionFragment.TITLE_KEY, R.string.museums_fragment_name);
                args.putInt(AttractionFragment.DESCRIPTION_KEY, R.string.museums_description);
                args.putIntArray(AttractionFragment.ATTRACTIONS_KEY, new int[]{
                        R.string.fine_arts_museum_name,
                        R.string.national_museum_name
                });
                break;
            case MUSIC_POSITION:
                args.putInt(AttractionFragment.TITLE_KEY, R.string.music_fragment_name);
                args.putInt(AttractionFragment.DESCRIPTION_KEY, R.string.music_description);
                args.putIntArray(AttractionFragment.ATTRACTIONS_KEY, new int[]{
                        R.string.opera_house_name,
                        R.string.bartok_concert_hall_name
                });
                break;
        }
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Resources resources = context.getResources();
        switch (position) {
            case LANDMARKS_POSITION:
                return resources.getString(R.string.landmarks_fragment_name);
            case BRIDGES_POSITION:
                return resources.getString(R.string.bridges_fragment_name);
            case MUSEUMS_POSITION:
                return resources.getString(R.string.museums_fragment_name);
            case MUSIC_POSITION:
                return resources.getString(R.string.music_fragment_name);
            default:
                return "";
        }
    }
}
