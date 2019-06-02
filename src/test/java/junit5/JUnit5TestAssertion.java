/**
 *
 */
package junit5;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class JUnit5TestAssertion {

   @Nested
   class TestAssertAll {

      public Map<String, String> getSampleParam() {

         Map<String, String> map = new HashMap<String, String>();

         map.put("handle_name", "アリストマスター");
         map.put("real_name", "Tacy");

         return map;

      }

      @Test
      public void test1() {

         Map<String, String> actual = getSampleParam();

         assertEquals("アリストマスター", actual.get("handle_name"));
         assertEquals("Tacy", actual.get("real_name"));

      }

      @Test
      public void test2() {

         Map<String, String> actual = getSampleParam();

         assertAll(
               () -> assertEquals("アリストマスター", actual.get("handle_name")),
               () -> assertEquals("Tacy", actual.get("real_name")));

      }

   }

   @Nested
   class TestAssertThrow {

      public void sampleThrow() throws NullPointerException {

         throw new NullPointerException("テスト用のexeptionです。");

      }

      @Test
      public void test1() {

         assertThrows(NullPointerException.class, () -> sampleThrow());

      }

      public void sampleOK() throws NullPointerException {

         //例外が起きない。

      }

      @Test
      public void test2() {

         assertDoesNotThrow(() -> sampleOK());

      }

      @Test
      void exceptionTesting() {

         Throwable exception = assertThrows(NullPointerException.class, () -> sampleThrow());

         assertEquals("テスト用のexeptionです。", exception.getMessage());

      }

   }

   @Nested
   class TestAssertArray {

      @Test
      void sampleArrayEquals() {

         int[] expected = { 1, 2, 3 };

         int[] actual = { 1, 2, 3 };

         assertArrayEquals(expected, actual);

      }

      @Test
      void sampleAssertIterableEquals() {

         List<String> expected = new ArrayList<String>(Arrays.asList("a", "b", "c"));

         List<String> actual = new ArrayList<String>(Arrays.asList("a", "b", "c"));

         assertIterableEquals(expected, actual);

      }

      @Test
      void sampleAssertIterableEquals2() {

         String[] expected = { "a", "b", "c" };

         String[] actual = { "a", "b", "c" };

         assertIterableEquals(Arrays.asList(expected), Arrays.asList(actual));

      }

      @Test
      void sampleArrayEqualsHam() {

         String[] expected = { "a", "b", "c" };

         String[] actual = { "a", "b", "c" };

         assertArrayEquals(expected, actual);

         assertThat(actual, arrayContainingInAnyOrder(expected));

      }

   }

   @Nested
   class TestAssertSame {

      @Test
      public void myTest1() {

         String expected = new String("にゃん");

         String actual = "にゃん";

         assertEquals(expected, actual);
      }

      @Test
      public void myTest2() {

         String expected = "にゃん";

         String actual = "にゃん";

         assertSame(expected, actual);
      }

   }

}
