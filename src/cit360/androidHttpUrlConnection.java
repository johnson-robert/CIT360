/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
//can use 
//import java.net.*;

public class androidHttpUrlConnection {

    public static void main(String[] args) {
        //Populate output from url
        String output = getUrlContents("http://google.com");
        //String output = getUrlContents("http://google.com");
        //Print output
        System.out.println(output);
    }

    private static String getUrlContents(String theUrl) {
        // Try-Catch
        StringBuilder content = new StringBuilder();
        try {
            //URL
            URL url = new URL(theUrl);
            //URLConnection
            URLConnection urlConnection = url.openConnection();
            //BufferedReader
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            // Read from the urlconnection through bufferedreader.
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line + "\n");
            }
            bufferedReader.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
