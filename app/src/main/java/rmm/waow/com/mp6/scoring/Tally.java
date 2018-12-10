package rmm.waow.com.mp6.scoring;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * All of the answers from a single quiz session stored together.
 */
public class Tally
{
    /** The logging tag for this class. */
    private static final String TAG = "Waow:scoring.Tally";
    /** The String name of the Weights in a JSON object describing a Tally object. */
    private static final String WEIGHTS = "weights";
    /** The list of Weights accumulated in this Tally. */
    private ArrayList<Weight> weights;
    /** The String name of the name in a JSON object describing a Tally object. */
    private static final String NAME = "name";
    /** The name of the quiz-taker, identifies the quiz session. */
    private String name;
    /** The String name of the name in a JSON object describing a Tally object. */
    private static final String GENDER = "gender";
    /**
     * The gender of the quiz-taker, 0 = male, 1 = female, -1 = no Gender.
     * <p>
     *     Some Pokemon have no gender and this is meant to accommodate that.
     * </p>
     */
    private int gender;
    /** Failed Map constant for debugging, use in the form typeMap.getOrDefault(String, MAP_FAILED). */
    private static final int MAP_FAILED = 0;
    /** Maps the String name of all 18 types to their index values. */
    private static Map<String, Integer> typeMap;
    
    /**
     * Default constructor, initializes everything as empty or default.
     */
    public Tally() throws JSONException
    {
        if (typeMap == null)
        {
            typeMap = new HashMap();
//            try
//            {
//                for (int i = 0; i < tempQuestions.length(); i++)
//                {
//                    add(new Question(tempQuestions.getJSONObject(i)));
//                }
//            }
//            catch (JSONException e)
//            {
//                Log.d(TAG, "JSON Read error. Name: < " + QUESTIONS + " >", e);
//            }
//            typeMap.put();
        }
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
     * JSON constructor, creates the Tally from the userdata.json file.
     * @param initUserData the local quiz files, read only.
     */
    public Tally(JSONObject initUserData) throws JSONException
    {
        name = initUserData.getString(NAME);
        gender = initUserData.getInt(GENDER);
        JSONArray tempWeights = initUserData.getJSONArray(WEIGHTS);
        try
        {
            for (int i = 0; i < tempWeights.length(); i++)
            {
                add(new Weight(tempWeights.getJSONObject(i)));
            }
        }
        catch (JSONException e)
        {
            Log.d(TAG, "JSON Read error. Name: < " + WEIGHTS + " >", e);
        }
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
     * Adds a copy of the passed Weight to the Tally's list of Weights.
     * @param toAdd the Weight being considered.
     */
    public void add(Weight toAdd)
    {
        weights.add(new Weight(toAdd));
    }
//    /**
//     *
//     */
//    private Tally finalizeTally()
//    {
//        //todo implement
//    }
}
