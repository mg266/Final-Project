package rmm.waow.com.mp6.questions;

import android.support.annotation.NonNull;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

import rmm.waow.com.mp6.scoring.Weight;

/**
 * Instances of this class hold the flavor text of an answer and the weighting values associated
 * with choosing it.
 */
public class Answer implements Iterable<Weight>
{
    /** The logging tag for this class. */
    private static final String TAG = "Waow:question.Answer";
    /** The String name of the answer text in a JSON object describing an Answer object. */
    private static final String TEXT = "answerText";
    /** The text of the answer itself. */
    private String text;
    /** The String name of the weights in a JSON object describing an Answer object. */
    private static final String WEIGHTS = "weights";
    /** A list of the weighting effects of this choice. */
    private ArrayList<Weight> weights;
    /** The default text for an uninitialized Answer. */
    private static final String DEFAULT_ANSWER_TEXT = "EMPTY";
    
    /**
     * Default constructor, sets everything to its default value.
     */
    public Answer()
    {
        text = DEFAULT_ANSWER_TEXT;
        weights = new ArrayList<>();
    }
    /**
     * Simple constructor, takes only the display text of the Answer.
     * @param initText the text of the Answer
     */
    public Answer(final String initText)
    {
        text = initText;
        weights = new ArrayList<>();
    }
    /**
     * JSON constructor, creates an Answer from a JSON file.
     * @param jsonObject the JSON template for the Answer.
     */
    Answer(final JSONObject jsonObject) throws JSONException
    {
        text = jsonObject.getString(TEXT);
        weights = new ArrayList<>();
        JSONArray tempWeights = jsonObject.getJSONArray(WEIGHTS);
        try
        {
            for (int i = 0; i < tempWeights.length(); i++)
            {
                add(new Weight(tempWeights.getJSONObject(i)));
            }
        }
        catch (JSONException e)
        {
            Log.d(TAG, "JSON Read error. Name: < " + text + " >", e);
        }
    }
    /**
     * Self-constructor, copies the contents of another Answer object into a new one.
     * @param other the Answer being copied
     */
    Answer(final Answer other)
    {
        text = other.getText();
        weights = new ArrayList<>();
        for (Weight currentWeight: other)
        {
            //add copies a new object, which is why this is a reference
            add(currentWeight);
        }
    }
    
    /**
     * Adds a Weight object to the local list of Weights.
     * @param toAdd the Weight to be added.
     */
    public void add(Weight toAdd)
    {
        weights.add(new Weight(toAdd));
    }
    /**
     * Gets the text to be displayed.
     * @return the text.
     */
    public String getText()
    {
        return text;
    }
    /**
     * The iterator for Answer, iterates through all the Weights of this Answer.
     * @return an Iterator for this class.
     */
    @NonNull
    @Override
    public Iterator<Weight> iterator()
    {
        return weights.iterator();
    }
}
