package rmm.waow.com.mp6.scoring;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * A simple class that stores the tag of the Weight and its offset when applied.
 */
public class Weight
{
    /** The String name of a category in a JSON object describing a Weight object. */
    private static final String CATEGORY = "category";
    /** The category of the Weight. */
    private String category;
    /** The String name of a value in a JSON object describing a Weight object. */
    private static final String VALUE = "value";
    /** The value of the Weight. */
    private int value;
    
    /**
     * The simple constructor for a new Weight object.
     * @param initCategory the category of the Weight
     * @param initValue the value of the Weight
     */
    public Weight(final String initCategory, final int initValue)
    {
        category = initCategory;
        value = initValue;
    }
    /**
     * JSON constructor, creates a Weight from a JSON file.
     * @param jsonObject the JSON template for the Weight.
     */
    public Weight(final JSONObject jsonObject) throws JSONException
    {
        category = jsonObject.getString(CATEGORY);
        value = jsonObject.getInt(VALUE);
    }
    /**
     * Self-constructor, copies the contents of another Weight object.
     * @param other the Weight being copied
     */
    public Weight(final Weight other)
    {
        category = other.getCategory();
        value = other.getValue();
    }
    
    /**
     * Simple getter for category.
     * @return the category of this Weight
     */
    public String getCategory()
    {
        return category;
    }
    /**
     * Simple getter for value.
     * @return the value of this Weight
     */
    public int getValue()
    {
        return value;
    }
}
