package org.jvnet.inflector;

import junit.framework.TestCase;

import static org.jvnet.inflector.Noun.pluralOf;

public class PluralizerEdgeCasesTest extends TestCase {

  public void testNull() {
    try {
      pluralOf(null);
      fail("Should throw NullPointerException");
    } catch (NullPointerException e) {
      // Expected
    }
  }

  public void testEmptyString() {
    assertEquals("", pluralOf(""));
  }

  public void testBlankString() {
    String blank = " \r\n\t";
    assertEquals(blank, pluralOf(blank));
  }

  public void testLeadingAndTrailingWhitespace() {
    assertEquals("  apples ", pluralOf("  apple "));
  }


}