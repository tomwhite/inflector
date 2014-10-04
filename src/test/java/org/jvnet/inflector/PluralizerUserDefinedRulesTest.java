package org.jvnet.inflector;

import junit.framework.TestCase;

import static org.jvnet.inflector.Noun.pluralOf;

public class PluralizerUserDefinedRulesTest extends TestCase {

  public void testNoUserDefinedRules() {
    assertEquals("Unixes", pluralOf("Unix"));
  }

  // TODO: Write user-defined API tests.

}