package org.jvnet.inflector;
import org.jvnet.inflector.Pluralizer;

import junit.framework.TestCase;

public class PluralizerUserDefinedRulesTest extends TestCase {

  private Pluralizer pluralizer;

  @@Override
  protected void setUp() {
    pluralizer = new Pluralizer();
  }

  public void testNoUserDefinedRules() {
    assertEquals("Unixes", pluralizer.pluralizeNoun("Unix"));
  }

  // TODO: Write user-defined API tests.

}