package org.jvnet.inflector;
import org.jvnet.inflector.Noun;

import junit.framework.TestCase;

public class NounTest extends TestCase {
  public void test() {
    assertEquals("You bought 1 loaf.", String.format("You bought %s.", new Noun(1, "loaf")));
    assertEquals("You bought 2 loaves.", String.format("You bought %s.", new Noun(2, "loaf")));
  }
}