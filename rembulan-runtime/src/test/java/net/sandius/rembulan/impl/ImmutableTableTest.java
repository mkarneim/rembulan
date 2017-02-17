package net.sandius.rembulan.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;

public class ImmutableTableTest {

  @Test
  public void test_equals_returns_true_for_both_empty_tables() {
    // Given:
    ImmutableTable underTest = new ImmutableTable.Builder().build();
    ImmutableTable other = new ImmutableTable.Builder().build();

    // When:
    boolean actual = underTest.equals(other);

    // Then:
    assertTrue("actual", actual);
  }

  @Test
  public void test_hashCode_is_same_for_both_empty_tables() {
    // Given:
    ImmutableTable underTest = new ImmutableTable.Builder().build();
    ImmutableTable other = new ImmutableTable.Builder().build();

    // When:
    int actual = underTest.hashCode();
    int expected = other.hashCode();

    // Then:
    assertEquals("actual", expected, actual);
  }

  @Test
  public void test_can_add_empty_table_as_key_to_hashmap() {
    // Given:
    ImmutableTable underTest = new ImmutableTable.Builder().build();
    HashMap<ImmutableTable, Object> someMap = new HashMap<>();

    // When:
    Exception actual = null;
    try {
      someMap.put(underTest, "any value");
    } catch (Exception ex) {
      actual = ex;
    }

    // Then:
    assertNull("actual", actual);
  }
}
