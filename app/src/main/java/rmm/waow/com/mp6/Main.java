package rmm.waow.com.mp6;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

import java.util.ArrayList;

import rmm.waow.com.mp6.questions.Question;

import static com.android.volley.VolleyLog.TAG;

/**
 * This is where the fun begins.
 */
public class Main
{
    /** The list of every question in the quiz. */
    private ArrayList<Question> allQuestions;
    
    /**
     * The main method of the app.
     * @param unused N/A
     */
    public static void main(String unused[])
    {
//        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
//                Request.Method.GET,
//                "https://pokeapi.co/api/v2/pokemon-species/1/",
//                null,
//                new Response.Listener<JSONObject>()
//                {
//                    @Override
//                    public void onResponse(final JSONObject response)
//                    {
//                        Log.d(TAG, response.toString());
//                    }
//                }
//                , new Response.ErrorListener()
//                {
//                    @Override
//                    public void onErrorResponse(final VolleyError error)
//                    {
//                        Log.w(TAG, error.toString());
//                    }
//        });
    }
}
