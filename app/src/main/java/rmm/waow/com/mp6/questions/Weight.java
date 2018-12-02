package rmm.waow.com.mp6.questions;

/**
 * A simple class that stores the tag of the Weight and its offset when applied.
 */
public class Weight
{
    /** The category of the Weight. */
    private String category;
    /** The value of the Weight. */
    private int value;
    
    /**
     * The simple constructor for a new Weight object.
     * @param initCategory the category of the Weight
     * @param initValue the value of the Weight
     */
    public Weight(String initCategory, int initValue)
    {
        category = initCategory;
        value = initValue;
    }
    /**
     *
     * @param other the Weight being copied
     */
    Weight(Weight other)
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
