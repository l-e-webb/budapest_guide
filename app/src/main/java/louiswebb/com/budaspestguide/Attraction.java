package louiswebb.com.budaspestguide;

/**
 * Class representing information about individual attractions.
 */
public class Attraction {

    int nameId;
    int descriptionId;
    int imageId;

    public Attraction(int nameId, int descriptionId) {
        this.nameId  = nameId;
        this.descriptionId = descriptionId;
        this.imageId = -1;
    }

    public Attraction(int nameId, int descriptionId, int imageId) {
        this(nameId, descriptionId);
        this.imageId = imageId;
    }

}
