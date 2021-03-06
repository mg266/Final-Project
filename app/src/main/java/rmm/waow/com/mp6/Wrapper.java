package rmm.waow.com.mp6;

import android.util.Log;

import com.android.volley.Cache;
import com.android.volley.Network;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

import java.io.File;

/**
 * A wrapper class that takes input and returns the information requested in parsed form.
 */
public class Wrapper
{
    /** Default logging tag for messages from the main activity. */
    private static final String TAG = "MP6:Wrapper";
    /** The cache. */
    private static Cache cache;
    /** The network used for requests. */
    private static Network network;
    /** Request queue for our network requests. */
    private static RequestQueue requestQueue;
    
    /**
     * todo implement
     * The default constructor
     */
    public Wrapper()
    {
        //nothing here
    }
    
    /**
     * Returns the RequestQueue of every object of this
     * @return the RequestQueue
     */
    public RequestQueue getRequestQueue()
    {
        if (cache == null || network == null || requestQueue == null)
        {
            cache = new DiskBasedCache(new File("runtime_cache"), 1024 * 1024);
            network = new BasicNetwork(new HurlStack());
            requestQueue = new RequestQueue(cache, network);
        }
        return requestQueue;
    }
    /**
     * todo implement
     * Builds a URL based on a specified request.
     */
    private String buildURL() {
        return "";
    }
    /**
     * todo use output
     * Makes an API call to the specified URL.
     * @param url the provided url to make the call to.
     */
    private void startAPICall(String url)
    {
        try
        {
            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                Request.Method.GET,
                url,
                null,
                new Response.Listener<JSONObject>()
                {
                    @Override
                    public void onResponse(final JSONObject response)
                    {
                        Log.d(TAG, response.toString());
                    }
                },
                new Response.ErrorListener()
                {
                    @Override
                    public void onErrorResponse(final VolleyError error)
                    {
                        Log.w(TAG, error.toString());
                    }
                }
            );
            requestQueue.add(jsonObjectRequest);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
