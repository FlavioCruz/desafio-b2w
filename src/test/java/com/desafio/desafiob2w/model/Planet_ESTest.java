/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 17 00:25:52 GMT 2019
 */

package com.desafio.desafiob2w.model;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.*;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.*;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Planet_ESTest extends Planet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Planet planet0 = new Planet();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      planet0.setTerrain(arrayList0);
      planet0.getTerrain();
      assertEquals(0, (int)planet0.getMovieAppearances());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Planet planet0 = new Planet();
      Vector<String> vector0 = new Vector<String>();
      vector0.add("(` e~i|Lga?M;");
      planet0.setTerrain(vector0);
      planet0.getTerrain();
      assertEquals(0, (int)planet0.getMovieAppearances());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Planet planet0 = new Planet();
      planet0.setName("2TlClfEn-9TPk?yvN");
      planet0.getName();
      assertEquals(0, (int)planet0.getMovieAppearances());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Planet planet0 = new Planet();
      planet0.setName("");
      planet0.getName();
      assertEquals(0, (int)planet0.getMovieAppearances());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Planet planet0 = new Planet();
      Vector<String> vector0 = new Vector<String>();
      planet0.setMovies(vector0);
      List<String> list0 = planet0.getMovies();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Planet planet0 = new Planet();
      Vector<String> vector0 = new Vector<String>();
      vector0.add("zpFA|mw#,-vsLZ-?eX-");
      planet0.setMovies(vector0);
      List<String> list0 = planet0.getMovies();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Planet planet0 = new Planet();
      planet0.setMovieAppearances((Integer) null);
      Integer integer0 = planet0.getMovieAppearances();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Planet planet0 = new Planet();
      Integer integer0 = new Integer(1);
      planet0.setMovieAppearances(integer0);
      Integer integer1 = planet0.getMovieAppearances();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Planet planet0 = new Planet();
      Integer integer0 = new Integer((-1898));
      planet0.setMovieAppearances(integer0);
      Integer integer1 = planet0.getMovieAppearances();
      assertEquals((-1898), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Planet planet0 = new Planet();
      planet0.setId(3609);
      int int0 = planet0.getId();
      assertEquals(3609, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Planet planet0 = new Planet();
      planet0.setId((-2391));
      int int0 = planet0.getId();
      assertEquals((-2391), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Planet planet0 = new Planet();
      Vector<String> vector0 = new Vector<String>();
      vector0.add("zpFA|mw#,-vsLZ-?eX-");
      planet0.setClimate(vector0);
      planet0.getClimate();
      assertEquals(0, (int)planet0.getMovieAppearances());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Planet planet0 = new Planet();
      Stack<String> stack0 = new Stack<String>();
      List<String> list0 = stack0.subList(0, 0);
      stack0.add("/s\"T,0%nGY|Mz'");
      // Undeclared exception!
      try { 
        planet0.setMovies(list0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Planet planet0 = new Planet();
      planet0.setMovies((List<String>) null);
      assertEquals(0, (int)planet0.getMovieAppearances());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Planet planet0 = new Planet();
      planet0.getName();
      assertEquals(0, (int)planet0.getMovieAppearances());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Planet planet0 = new Planet();
      planet0.getClimate();
      assertEquals(0, (int)planet0.getMovieAppearances());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Planet planet0 = new Planet();
      Integer integer0 = planet0.getMovieAppearances();
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Planet planet0 = new Planet();
      planet0.getTerrain();
      assertEquals(0, (int)planet0.getMovieAppearances());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Planet planet0 = new Planet();
      int int0 = planet0.getId();
      assertEquals(0, int0);
      assertEquals(0, (int)planet0.getMovieAppearances());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Planet planet0 = new Planet();
      planet0.getMovies();
      assertEquals(0, (int)planet0.getMovieAppearances());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Planet planet0 = new Planet();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      planet0.setClimate(arrayList0);
      planet0.getClimate();
      assertEquals(0, (int)planet0.getMovieAppearances());
  }
}
