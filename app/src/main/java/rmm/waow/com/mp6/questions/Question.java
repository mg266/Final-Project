package rmm.waow.com.mp6.questions;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * One single question that stores its flavor text and multiple answers.
 */
public class Question implements Iterable<Answer>
{
    /** The text of the question itself. */
    private String text;
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
    //todo Matthew add JSON constructor
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
