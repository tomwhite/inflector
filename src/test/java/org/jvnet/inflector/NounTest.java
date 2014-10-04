package org.jvnet.inflector;

import junit.framework.TestCase;

import static org.jvnet.inflector.Noun.pluralOf;

public class NounTest extends TestCase {
  public void test() {
    assertEquals("You bought 1 loaf.", String.format("You bought %d %s.", 1, pluralOf("loaf", 1)));
    assertEquals("You bought 2 loaves.", String.format("You bought %d %s.", 2, pluralOf("loaf", 2)));
  }
}