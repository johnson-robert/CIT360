/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author User
 */
public class JsonReadExample {

    public static void main(String[] args) throws Exception {
        // read JSONExampleFile.json and print
        Object motoread = new JSONParser().parse(new FileReader("C:\\Users\\User\\Documents"
                + "\\NetBeansProjects\\cit360\\src\\json"
                + "\\JSONExampleFile.json"));

        JSONObject motoright = (JSONObject) motoread;

        String brand = (String) motoright.get("brand");
        String model = (String) motoright.get("model");
        String year = (String) motoright.get("year");
        
        System.out.println("brand: " + brand);
        System.out.println("model: " + model);
        System.out.println("year: " + year);
    }
}
