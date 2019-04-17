/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 17 00:27:49 GMT 2019
 */

package com.desafio.desafiob2w;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.fail;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DesafioB2wApplication_ESTest extends DesafioB2wApplication_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "6Ds";
      stringArray0[4] = "p=u**x(S)ZPQMO#*@";
      stringArray0[5] = "GfTGkG#Q";
      // Undeclared exception!
      try { 
        DesafioB2wApplication.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.autoconfigure.condition.OnClassCondition", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DesafioB2wApplication desafioB2wApplication0 = new DesafioB2wApplication();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      // Undeclared exception!
      try { 
        DesafioB2wApplication.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.autoconfigure.condition.OnClassCondition", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "Ib";
      stringArray0[1] = "MUl]kJ4QQ.'g4fa=$";
      stringArray0[2] = "DEFAULT";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "h\"`pKh8$$Jib{HkAp";
      // Undeclared exception!
      try { 
        DesafioB2wApplication.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.autoconfigure.condition.OnClassCondition", e);
      }
  }
}
