/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 17 00:24:11 GMT 2019
 */

package com.desafio.desafiob2w.service.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Level;
import com.desafio.desafiob2w.model.Planet;
import com.desafio.desafiob2w.repository.IPlanetDataAccess;
import com.desafio.desafiob2w.service.impl.PlanetServiceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Stack;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlanetServiceImpl_ESTest extends PlanetServiceImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PlanetServiceImpl planetServiceImpl0 = new PlanetServiceImpl();
      Planet planet0 = new Planet();
      ArrayList<Planet> arrayList0 = new ArrayList<Planet>();
      arrayList0.add(planet0);
      arrayList0.add(planet0);
      IPlanetDataAccess iPlanetDataAccess0 = mock(IPlanetDataAccess.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList0).when(iPlanetDataAccess0).findAll();
      Injector.inject(planetServiceImpl0, (Class<?>) PlanetServiceImpl.class, "planetDataAccess", (Object) iPlanetDataAccess0);
      Injector.validateBean(planetServiceImpl0, (Class<?>) PlanetServiceImpl.class);
      // Undeclared exception!
      try { 
        planetServiceImpl0.create((Planet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.desafio.desafiob2w.service.impl.PlanetServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PlanetServiceImpl planetServiceImpl0 = new PlanetServiceImpl();
      Planet planet0 = new Planet();
      IPlanetDataAccess iPlanetDataAccess0 = mock(IPlanetDataAccess.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(iPlanetDataAccess0).findAll();
      Injector.inject(planetServiceImpl0, (Class<?>) PlanetServiceImpl.class, "planetDataAccess", (Object) iPlanetDataAccess0);
      Injector.validateBean(planetServiceImpl0, (Class<?>) PlanetServiceImpl.class);
      // Undeclared exception!
      try { 
        planetServiceImpl0.create(planet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.desafio.desafiob2w.service.impl.PlanetServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PlanetServiceImpl planetServiceImpl0 = new PlanetServiceImpl();
      Planet planet0 = new Planet();
      planet0.setId((-1));
      IPlanetDataAccess iPlanetDataAccess0 = mock(IPlanetDataAccess.class, new ViolatedAssumptionAnswer());
      doReturn(planet0).when(iPlanetDataAccess0).getByName(anyString());
      Injector.inject(planetServiceImpl0, (Class<?>) PlanetServiceImpl.class, "planetDataAccess", (Object) iPlanetDataAccess0);
      Injector.validateBean(planetServiceImpl0, (Class<?>) PlanetServiceImpl.class);
      Planet planet1 = planetServiceImpl0.getByName("");
      assertEquals(0, (int)planet1.getMovieAppearances());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PlanetServiceImpl planetServiceImpl0 = new PlanetServiceImpl();
      Planet planet0 = new Planet();
      Optional.of(planet0);
      IPlanetDataAccess iPlanetDataAccess0 = mock(IPlanetDataAccess.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(iPlanetDataAccess0).findAll();
      Injector.inject(planetServiceImpl0, (Class<?>) PlanetServiceImpl.class, "planetDataAccess", (Object) iPlanetDataAccess0);
      Injector.validateBean(planetServiceImpl0, (Class<?>) PlanetServiceImpl.class);
      Integer integer0 = new Integer(304);
      // Undeclared exception!
      try { 
        planetServiceImpl0.create(planet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.desafio.desafiob2w.service.impl.PlanetServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PlanetServiceImpl planetServiceImpl0 = new PlanetServiceImpl();
      Stack<Planet> stack0 = new Stack<Planet>();
      IPlanetDataAccess iPlanetDataAccess0 = mock(IPlanetDataAccess.class, new ViolatedAssumptionAnswer());
      doReturn(stack0).when(iPlanetDataAccess0).findAll();
      Injector.inject(planetServiceImpl0, (Class<?>) PlanetServiceImpl.class, "planetDataAccess", (Object) iPlanetDataAccess0);
      Injector.validateBean(planetServiceImpl0, (Class<?>) PlanetServiceImpl.class);
      List<Planet> list0 = planetServiceImpl0.getAll();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PlanetServiceImpl planetServiceImpl0 = new PlanetServiceImpl();
      Planet planet0 = new Planet();
      ArrayList<Planet> arrayList0 = new ArrayList<Planet>();
      arrayList0.add(planet0);
      IPlanetDataAccess iPlanetDataAccess0 = mock(IPlanetDataAccess.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList0).when(iPlanetDataAccess0).findAll();
      Injector.inject(planetServiceImpl0, (Class<?>) PlanetServiceImpl.class, "planetDataAccess", (Object) iPlanetDataAccess0);
      Injector.validateBean(planetServiceImpl0, (Class<?>) PlanetServiceImpl.class);
      List<Planet> list0 = planetServiceImpl0.getAll();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PlanetServiceImpl planetServiceImpl0 = new PlanetServiceImpl();
      // Undeclared exception!
      try { 
        planetServiceImpl0.getByName("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.desafio.desafiob2w.service.impl.PlanetServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PlanetServiceImpl planetServiceImpl0 = new PlanetServiceImpl();
      Planet planet0 = new Planet();
      Optional<Planet> optional0 = Optional.ofNullable(planet0);
      IPlanetDataAccess iPlanetDataAccess0 = mock(IPlanetDataAccess.class, new ViolatedAssumptionAnswer());
      doReturn(optional0, (Optional) null).when(iPlanetDataAccess0).findById(anyInt());
      Injector.inject(planetServiceImpl0, (Class<?>) PlanetServiceImpl.class, "planetDataAccess", (Object) iPlanetDataAccess0);
      Injector.validateBean(planetServiceImpl0, (Class<?>) PlanetServiceImpl.class);
      Integer integer0 = JLayeredPane.DEFAULT_LAYER;
      planetServiceImpl0.getById(integer0);
      // Undeclared exception!
      try { 
        planetServiceImpl0.getById(integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.desafio.desafiob2w.service.impl.PlanetServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PlanetServiceImpl planetServiceImpl0 = new PlanetServiceImpl();
      IPlanetDataAccess iPlanetDataAccess0 = mock(IPlanetDataAccess.class, new ViolatedAssumptionAnswer());
      doReturn((Optional) null).when(iPlanetDataAccess0).findById(anyInt());
      Injector.inject(planetServiceImpl0, (Class<?>) PlanetServiceImpl.class, "planetDataAccess", (Object) iPlanetDataAccess0);
      Injector.validateBean(planetServiceImpl0, (Class<?>) PlanetServiceImpl.class);
      Integer integer0 = JLayeredPane.DEFAULT_LAYER;
      // Undeclared exception!
      try { 
        planetServiceImpl0.delete(integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.desafio.desafiob2w.service.impl.PlanetServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PlanetServiceImpl planetServiceImpl0 = new PlanetServiceImpl();
      IPlanetDataAccess iPlanetDataAccess0 = mock(IPlanetDataAccess.class, new ViolatedAssumptionAnswer());
      doReturn((Optional) null).when(iPlanetDataAccess0).findById(anyInt());
      Injector.inject(planetServiceImpl0, (Class<?>) PlanetServiceImpl.class, "planetDataAccess", (Object) iPlanetDataAccess0);
      Injector.validateBean(planetServiceImpl0, (Class<?>) PlanetServiceImpl.class);
      try { 
        planetServiceImpl0.getById((Integer) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Resource with given ID was not found.
         //
         verifyException("com.desafio.desafiob2w.service.impl.PlanetServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PlanetServiceImpl planetServiceImpl0 = new PlanetServiceImpl();
      IPlanetDataAccess iPlanetDataAccess0 = mock(IPlanetDataAccess.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(iPlanetDataAccess0).findAll();
      Injector.inject(planetServiceImpl0, (Class<?>) PlanetServiceImpl.class, "planetDataAccess", (Object) iPlanetDataAccess0);
      Injector.validateBean(planetServiceImpl0, (Class<?>) PlanetServiceImpl.class);
      List<Planet> list0 = planetServiceImpl0.getAll();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PlanetServiceImpl planetServiceImpl0 = new PlanetServiceImpl();
      Planet planet0 = new Planet();
      Optional<Planet> optional0 = Optional.ofNullable(planet0);
      IPlanetDataAccess iPlanetDataAccess0 = mock(IPlanetDataAccess.class, new ViolatedAssumptionAnswer());
      doReturn(optional0).when(iPlanetDataAccess0).findById(anyInt());
      Injector.inject(planetServiceImpl0, (Class<?>) PlanetServiceImpl.class, "planetDataAccess", (Object) iPlanetDataAccess0);
      Injector.validateBean(planetServiceImpl0, (Class<?>) PlanetServiceImpl.class);
      try { 
        planetServiceImpl0.delete((Integer) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Resource with given ID was not found to be deleted.
         //
         verifyException("com.desafio.desafiob2w.service.impl.PlanetServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PlanetServiceImpl planetServiceImpl0 = new PlanetServiceImpl();
      Planet planet0 = new Planet();
      Optional<Planet> optional0 = Optional.ofNullable(planet0);
      IPlanetDataAccess iPlanetDataAccess0 = mock(IPlanetDataAccess.class, new ViolatedAssumptionAnswer());
      doReturn(optional0).when(iPlanetDataAccess0).findById(anyInt());
      Injector.inject(planetServiceImpl0, (Class<?>) PlanetServiceImpl.class, "planetDataAccess", (Object) iPlanetDataAccess0);
      Injector.validateBean(planetServiceImpl0, (Class<?>) PlanetServiceImpl.class);
      Integer integer0 = Level.ALL_INTEGER;
      planetServiceImpl0.delete(integer0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PlanetServiceImpl planetServiceImpl0 = new PlanetServiceImpl();
      Planet planet0 = new Planet();
      IPlanetDataAccess iPlanetDataAccess0 = mock(IPlanetDataAccess.class, new ViolatedAssumptionAnswer());
      doReturn(planet0).when(iPlanetDataAccess0).getByName(anyString());
      Injector.inject(planetServiceImpl0, (Class<?>) PlanetServiceImpl.class, "planetDataAccess", (Object) iPlanetDataAccess0);
      Injector.validateBean(planetServiceImpl0, (Class<?>) PlanetServiceImpl.class);
      try { 
        planetServiceImpl0.getByName((String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Resource with given name was not found.
         //
         verifyException("com.desafio.desafiob2w.service.impl.PlanetServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PlanetServiceImpl planetServiceImpl0 = new PlanetServiceImpl();
      Planet planet0 = new Planet();
      IPlanetDataAccess iPlanetDataAccess0 = mock(IPlanetDataAccess.class, new ViolatedAssumptionAnswer());
      doReturn(planet0).when(iPlanetDataAccess0).getByName(anyString());
      Injector.inject(planetServiceImpl0, (Class<?>) PlanetServiceImpl.class, "planetDataAccess", (Object) iPlanetDataAccess0);
      Injector.validateBean(planetServiceImpl0, (Class<?>) PlanetServiceImpl.class);
      Planet planet1 = planetServiceImpl0.getByName("net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$OfMethod");
      assertNull(planet1.getName());
  }
}
