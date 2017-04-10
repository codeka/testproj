package au.com.codeka.testproj.server;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public final class Program {

  static class MyClass {
    public String hello;
  }

  public static void main(String[] args) {
    String json = "{\"hello\": \"world\"}";
    Gson gson = new GsonBuilder().create();
    MyClass myClass = gson.fromJson(json, MyClass.class);
    System.out.println(myClass.hello);
  }
}
