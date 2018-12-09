package rmm.waow.com.mp6;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import rmm.waow.com.mp6.questions.Question;
import rmm.waow.com.mp6.scoring.Tally;

/**
 * This is what stores all of the Questions, Tallies, and .
 */
public class Quiz
{
    /** The logging tag for this class. */
    private static final String TAG = "Waow:Quiz";
    /** The String name of the Questions in a JSON object describing a Quiz object. */
    private static final String QUESTIONS = "questions";
    /** The list of every Question in the quiz. */
    private ArrayList<Question> allQuestions;
    /** The list of every Tally for this quiz. */
    private ArrayList<Tally> allTallies;
    /** The app's data as read from appdata.json. */
    private JSONObject appData;
    
    /**
     * JSON constructor, creates the Quiz from the appdata.json file.
     * @param initAppData the local quiz files, read only.
     */
    public Quiz(JSONObject initAppData) throws JSONException
    {
        JSONArray tempQuestions = initAppData.getJSONArray(QUESTIONS);
        try
        {
            for (int i = 0; i < tempQuestions.length(); i++)
            {
                add(new Question(tempQuestions.getJSONObject(i)));
            }
        }
        catch (JSONException e)
        {
            Log.d(TAG, "JSON Read error. Name: < questions >", e);
        }
    }
    
    /**
     * Adds a Question to the Quiz.
     * @param toAdd the Question being added
     */
    private void add(Question toAdd)
    {
        allQuestions.add(toAdd);
    }
}
