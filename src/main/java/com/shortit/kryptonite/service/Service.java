package com.shortit.kryptonite.service;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import model.ParameterStringBuilder;

public class Service {

  public void openConnection() {

    try {
      URL url = new URL("https://api.rebrandly.com/v1/links");
      HttpURLConnection con = (HttpURLConnection) url.openConnection();
      con.setRequestMethod("POST");
      Map<String, String> parameters = new HashMap<>();
      parameters.put("param1", "val");

      con.setDoOutput(true);
      DataOutputStream out = new DataOutputStream(con.getOutputStream());
      out.writeBytes(ParameterStringBuilder.getParamsString(parameters));
      out.flush();
      out.close();
      con.setRequestProperty("Content-Type", "application/json");
      con.setRequestProperty("apikey", "dc53837134a84fb98c677216da8b7f3b");
      BufferedReader in = new BufferedReader(
          new InputStreamReader(con.getInputStream()));
      String inputLine;
      StringBuffer content = new StringBuffer();
      while ((inputLine = in.readLine()) != null) {
        content.append(inputLine);
      }
      System.out.println(content.toString());
      in.close();
    } catch (Exception e) {
      System.out.println("kutyaaa");
    }



  }

}
