package rmm.waow.com.mp6;

import org.json.JSONObject;

import java.util.ArrayList;

import rmm.waow.com.mp6.questions.Question;

/**
 * This is what stores all of the Questions, Tallies, and .
 */
public class Quiz
{
    /** The list of every question in the quiz. */
    private ArrayList<Question> allQuestions;
    /** The app's data as read from appdata.json. */
    private JSONObject appData;
    
    /**
     * JSON constructor, creates the Quiz from the appdata.json file.
     * @param initAppData the local quiz files, read only.
     */
    public Quiz(JSONObject initAppData)
    {
        appData = initAppData;
        //todo Matthew implement
    }
}
