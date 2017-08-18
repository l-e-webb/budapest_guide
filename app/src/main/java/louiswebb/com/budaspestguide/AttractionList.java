package louiswebb.com.budaspestguide;

import java.util.HashMap;
import java.util.Map;

/**
 * Class holding static instances of Attraction objects.
 */
class AttractionList {

    private static Map<Integer, Attraction> attractions = new HashMap<Integer, Attraction>() {{
        Attraction[] attractionArray = new Attraction[] {
                new Attraction(R.string.basilica_name, R.string.basilica_description),
                new Attraction(R.string.parliament_name, R.string.parliament_description, R.drawable.parliament),
                new Attraction(R.string.chain_bridge_name, R.string.chain_bridge_description),
                new Attraction(R.string.liberty_bridge_name, R.string.liberty_bridge_description),
                new Attraction(R.string.fine_arts_museum_name, R.string.fine_arts_museum_description),
                new Attraction(R.string.national_museum_name, R.string.national_museum_description),
                new Attraction(R.string.opera_house_name, R.string.opera_house_description),
                new Attraction(R.string.bartok_concert_hall_name, R.string.bartok_concert_hall_description)
        };
        for (Attraction attraction : attractionArray) {
            this.put(attraction.nameId, attraction);
        }
    }};

    static Attraction getAttraction(int key) {
        return attractions.get(key);
    }
}
