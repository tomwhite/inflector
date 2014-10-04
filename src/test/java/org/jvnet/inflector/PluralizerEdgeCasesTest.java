package org.jvnet.inflector;
import org.jvnet.inflector.Pluralizer;

import junit.framework.TestCase;

public class PluralizerEdgeCasesTest extends TestCase {

  private Pluralizer pluralizer;

  @Override
  protected void setUp() {
    pluralizer = new Pluralizer();
  }

  public void testNull() {
    try {
      pluralizer.pluralizeNoun(null);
      fail("Should throw NullPointerException");
    } catch (NullPointerException e) {
      // Expected
    }
  }

  public void testEmptyString() {
    assertEquals("", pluralizer.pluralizeNoun(""));
  }

  public void testBlankString() {
    String blank = " \r\n\t";
    assertEquals(blank, pluralizer.pluralizeNoun(blank));
  }

  public void testLeadingAndTrailingWhitespace() {
    assertEquals("  apples ", pluralizer.pluralizeNoun("  apple "));
  }


}