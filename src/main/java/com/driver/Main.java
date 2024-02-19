package com.driver;

public class Main {
  public static void main(String[] args) {
    RWOnly rw = new RWOnly();
    // Set value to name using setter function
    rw.setName("John");
    // Access value of name using getter function and print
    System.out.println(rw.getName()); // Output: John
  }
}