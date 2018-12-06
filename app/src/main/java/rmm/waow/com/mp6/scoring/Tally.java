package rmm.waow.com.mp6.scoring;

import java.util.HashMap;
import java.util.Map;

/**
 * All of the answers from a single quiz session stored together.
 */
public class Tally
{
    /** The logging tag for this class. */
    private static final String TAG = "Waow:scoring.Tally";
    /** The name of the quiz-taker, identifies the quiz session. */
    private String name;
    /**
     * The gender of the quiz-taker, 0 = male, 1 = female, -1 = no Gender.
     * <p>
     *     Some Pokemon have no gender and this is meant to accommodate that.
     * </p>
     */
    private int gender;
    /** Failed Map constant for debugging, use in the form typeMap.getOrDefault(String, MAP_FAILED). */
    private static final int MAP_FAILED = -1;
    /** Maps the String name of all 18 types to their index values. */
    private static Map<String, Integer> categoryMap;
    
    /**
     * Default constructor, initializes everything as empty or default.
     */
    public Tally()
    {
        /**
         * todo Miranda
         * when initializing categoryMap check if it's null before creating it, and if it already
         * exists don't create it at all since it's static.
         */
    }
    /**
     * Basic constructor, takes the name of the quiz-taker as input and sets the rest as empty or default.
     * @param initName the name of the session.
     */
    public Tally(final String initName)
    {
        //todo Miranda
    }
    /**
     * Self-constructor, copies the contents of another Tally.
     * @param other the Tally being copied.
     */
    public Tally(final Tally other)
    {
        //todo Miranda
    }
    
    /**
     * Adds the passed
     * @param toAdd the Weight being considered.
     */
    public void add(Weight toAdd)
    {
        //todo Miranda
    }
}
