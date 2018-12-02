package rmm.waow.com.mp6.questions;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Instances of this class hold the flavor text of an answer and the weighting values associated
 * with choosing it.
 */
public class Answer implements Iterable<Weight>
{
    /** The text of the answer itself. */
    private String text;
    /** A list of the weighting effects of this choice. */
    private ArrayList<Weight> weights;
    
    /**
     * Default constructor.
     */
    public Answer()
    {
        text = "EMPTY";
        weights = new ArrayList<>();
    }
    /**
     * Simple constructor, takes only the display text of the Answer.
     * @param initText the text of the Answer
     */
    public Answer(String initText)
    {
        text = initText;
        weights = new ArrayList<>();
    }
    /**
     * Self-constructor, copies the contents of another Answer object into a new one.
     * @param other the Answer being copied
     */
    Answer(Answer other)
    {
        text = other.getText();
        weights = new ArrayList<>();
        for (Weight currentWeight: other)
        {
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
