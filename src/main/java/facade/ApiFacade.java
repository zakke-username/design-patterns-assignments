package facade;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiFacade {

    public String getAttributeValueFromJson(String urlString, String attributeName) throws IllegalArgumentException, IOException {
        // Send http request
        URL url = new URL(urlString);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        // Read response
        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            // Parse attribute value
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(content.toString());
            if (!jsonObject.containsKey(attributeName)) {
                throw new IllegalArgumentException("Attribute not found: " + attributeName);
            }

            // Return attribute value as string
            return (String) jsonObject.get(attributeName);
        } catch (Exception e) {
            throw new IllegalArgumentException("Failed to parse JSON response: " + e.getMessage());
        } finally {
            con.disconnect();
        }
    }
}
