package data;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JsonDataReader {

    public String email , password ,Fname,Lname,Gender,Mopile,EmailAddress ,DateOfBirth,nationalIdCheckCheck,fullNameCheck,mopilecheck,emailCheck ;

    public void JsonReader() throws IOException, ParseException
    {
        String filePath = System.getProperty("user.dir")+"/src/test/java/data/loginData.json";

        File srcFile = new File(filePath);

        JSONParser parser = new JSONParser();
        JSONArray jarray = (JSONArray)parser.parse(new FileReader(srcFile));

        for(Object jsonObj : jarray)
        {
            JSONObject person = (JSONObject) jsonObj ;


            email = (String) person.get("email");
            password = (String) person.get("password");


        }

    }
    public void JsonReader2() throws IOException, ParseException
    {
        String filePath = System.getProperty("user.dir")+"/src/test/java/data/loginData.json";

        File srcFile = new File(filePath);

        JSONParser parser = new JSONParser();
        JSONArray jarray = (JSONArray)parser.parse(new FileReader(srcFile));

        for(Object jsonObj : jarray)
        {
            JSONObject person = (JSONObject) jsonObj ;


            email = (String) person.get("email");
            password = (String) person.get("password");
            Fname = (String) person.get("firstName");
            Lname = (String) person.get("lastName");
            Gender = (String) person.get("gender");
            Mopile = (String) person.get("mobile");
            EmailAddress = (String) person.get("emailAddress");
            DateOfBirth = (String) person.get("dataOfBirth");


        }

    }
    public void JsonReader3() throws IOException, ParseException
    {
        String filePath = System.getProperty("user.dir")+"/src/test/java/data/loginData.json";

        File srcFile = new File(filePath);

        JSONParser parser = new JSONParser();
        JSONArray jarray = (JSONArray)parser.parse(new FileReader(srcFile));

        for(Object jsonObj : jarray)
        {
            JSONObject person = (JSONObject) jsonObj ;


            email = (String) person.get("email");
            password = (String) person.get("password");
          //  nationalIdCheck = (String) person.get("nationalIdCheck");
            fullNameCheck = (String) person.get("fullNameCheck");
            mopilecheck = (String) person.get("mobileCheck");
            emailCheck = (String) person.get("emailAddressCheck");


        }

    }
}
