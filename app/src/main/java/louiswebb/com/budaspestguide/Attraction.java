package louiswebb.com.budaspestguide;

/**
 * Class representing information about individual attractions.
 */
class Attraction {

    int nameId;
    int descriptionId;
    int imageId;

    Attraction(int nameId, int descriptionId) {
        this.nameId  = nameId;
        this.descriptionId = descriptionId;
        this.imageId = -1;
    }

    Attraction(int nameId, int descriptionId, int imageId) {
        this(nameId, descriptionId);
        this.imageId = imageId;
    }

}
