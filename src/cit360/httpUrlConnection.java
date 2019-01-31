/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

/**
 *
 * @author User
 */

//can use
//import java.net.*;

import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class httpUrlConnection {

	public static void main(String[] args) throws Exception {

		URLConnection urlConnection = new URL("https://github.com/johnson-robert/Robert_Goodspeed.git").openConnection();
                //URLConnection urlConnection = new URL("https://www.example.org/").openConnection();
		urlConnection.setRequestProperty("Accept", "text/html");

		try (Scanner scanner = new Scanner(urlConnection.getInputStream())) {
			printResponseHeaders(urlConnection);
			printResponseBody(scanner);
		}
	}

	private static void printResponseHeaders(URLConnection urlConnection) {
		for (Map.Entry<String, List<String>> header : urlConnection.getHeaderFields().entrySet()) {
			if (header.getKey() == null) {
				System.out.println(header.getValue().get(0));
				continue;
			}
			System.out.printf("%s: %s%n", header.getKey(), header.getValue());
		}
	}

	private static void printResponseBody(Scanner scanner) {
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
	}
}