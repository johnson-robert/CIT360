/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

/**
 * Rob Johnson
 */
// Java program for write JSON to a file 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import org.json.simple.JSONObject;

public class JsonWriteExample {

    public static void main(String[] args) throws FileNotFoundException {
        // create JSONObject and write to file
        JSONObject moto = new JSONObject();

        // putting data to JSONObject 
        moto.put("brand", "Ducati");
        moto.put("model", "Monster");
        moto.put("year", "1999");

        

        try (PrintWriter pw = new PrintWriter("C:\\Users\\User\\Documents"
                        + "\\NetBeansProjects\\cit360\\src\\json"
                        + "\\JSONExampleFile.json")) 
        {
            pw.write(moto.toJSONString());
            pw.flush();
            System.out.println(moto);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
    }
}
