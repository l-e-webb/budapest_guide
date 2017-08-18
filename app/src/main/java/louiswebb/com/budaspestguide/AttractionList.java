package louiswebb.com.budaspestguide;

import java.util.HashMap;
import java.util.Map;

/**
 * Class holding static instances of Attraction objects.
 */
class AttractionList {

    private static Map<Integer, Attraction> attractions = new HashMap<Integer, Attraction>() {{
        Attraction[] attractionArray = new Attraction[] {
                new Attraction(R.string.basilica_name, R.string.basilica_description, R.drawable.basilica),
                new Attraction(R.string.parliament_name, R.string.parliament_description, R.drawable.parliament),
                new Attraction(R.string.chain_bridge_name, R.string.chain_bridge_description, R.drawable.chain_bridge),
                new Attraction(R.string.liberty_bridge_name, R.string.liberty_bridge_description, R.drawable.liberty_bridge),
                new Attraction(R.string.fine_arts_museum_name, R.string.fine_arts_museum_description, R.drawable.fine_arts_museum),
                new Attraction(R.string.national_museum_name, R.string.national_museum_description, R.drawable.national_museum),
                new Attraction(R.string.opera_house_name, R.string.opera_house_description, R.drawable.opera_house),
                new Attraction(R.string.bartok_concert_hall_name, R.string.bartok_concert_hall_description, R.drawable.bartok_concert_hall),
                new Attraction(R.string.liberty_statue_name, R.string.liberty_statue_description, R.drawable.liberty_statue),
                new Attraction(R.string.liszt_academy_name, R.string.liszt_academy_description, R.drawable.franz_liszt_academy),
                new Attraction(R.string.buda_castle_name, R.string.buda_castle_description, R.drawable.buda_castle),
                new Attraction(R.string.dohany_synagogue_name, R.string.dohany_synagogue_description, R.drawable.synagogue)
        };
        for (Attraction attraction : attractionArray) {
            this.put(attraction.nameId, attraction);
        }
    }};

    static Attraction getAttraction(int key) {
        return attractions.get(key);
    }
}
