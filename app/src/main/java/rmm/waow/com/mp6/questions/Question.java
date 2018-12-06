package rmm.waow.com.mp6.questions;

import android.support.annotation.NonNull;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * One single question that stores its flavor text and multiple answers.
 */
public class Question implements Iterable<Answer>
{
    /** The logging tag for this class. */
    private static final String TAG = "Waow:questions.Question";
    /** The String name of the question text in a JSON object describing a Question object. */
    private static final String TEXT = "questionText";
    /** The text of the question itself. */
    private String text;
    /** The String name of the possible answers in a JSON object describing an Answers object. */
    private static final String ANSWERS = "answers";
    /** The possible answers to this question. */
    private ArrayList<Answer> answers;
    /** The default text for an uninitialized Question. */
    private static final String DEFAULT_QUESTION_TEXT = "EMPTY?";
    
    /**
     * Default constructor, sets everything to its default value.
     */
    public Question()
    {
        text = DEFAULT_QUESTION_TEXT;
        answers = new ArrayList<>();
    }
    /**
     * Basic constructor, takes question text as input.
     * @param initText the text of the question
     */
    public Question(final String initText)
    {
        text = initText;
        answers = new ArrayList<>();
    }
    /**
     * JSON constructor, creates a Question from a JSON file.
     * @param jsonObject the JSON template for the Question.
     */
    public Question(final JSONObject jsonObject) throws JSONException
    {
        text = jsonObject.getString(TEXT);
        answers = new ArrayList<>();
        JSONArray tempAnswers = jsonObject.getJSONArray(ANSWERS);
        try
        {
            for (int i = 0; i < tempAnswers.length(); i++)
            {
                add(new Answer(tempAnswers.getJSONObject(i)));
            }
        }
        catch (JSONException e)
        {
            Log.d(TAG, "JSON Read error. Name: < " + text + " >", e);
        }
    }
    /**
     * Self-constructor, copies the contents of another Question object into a new one.
     * @param other the Question being copied
     */
    public Question(final Question other)
    {
        text = other.getText();
        answers = new ArrayList<>();
        for (Answer currentAnswer: other)
        {
            //add copies a new object, which is why this is a reference
            add(currentAnswer);
        }
    }
    
    /**
     * Adds an Answer object to the local list of Answers.
     * @param toAdd the answer being added
     */
    public void add(final Answer toAdd)
    {
        answers.add(new Answer(toAdd));
    }
    /**
     * Gets the Question's text.
     * @return the text.
     */
    public String getText()
    {
        return text;
    }
    /**
     * The iterator for Question, iterates through all the Answers to the Question.
     * @return an Iterator for this class
     */
    @NonNull
    @Override
    public Iterator<Answer> iterator()
    {
        return answers.iterator();
    }
}
