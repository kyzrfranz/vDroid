package vergecurrency.vergewallet.models.dataproc;

import org.json.JSONException;
import org.json.JSONObject;

public class ApifyDataReader {

    public ApifyDataReader(){}

    //to be moved into a apify parser
    public String readIP(String rawData) {

        if (rawData != null && !rawData.equals("")) {
            JSONObject reader;
            try {
                reader = new JSONObject(rawData);
                return reader.getString("ip");
            } catch (JSONException e) {
                e.printStackTrace();
                return "error";
            }
        } else return "error";
    }
}
