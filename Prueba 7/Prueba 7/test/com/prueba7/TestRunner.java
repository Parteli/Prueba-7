/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba7;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(AspiranteSuiteTest.class);

      result.getFailures().stream().forEach((failure) -> {
          System.out.println(failure.toString());
       });
		
      System.out.println(result.wasSuccessful());
   }
}  	