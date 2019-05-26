/**
 *
 */
package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class JUnit5TestNest {

   @Nested
   class WhenNew {

      @Test
      public void myTest1() {

         System.out.println("テストその１");

         assertEquals(2, 1 + 1);

      }

      @Test
      public void myTest2() {

         System.out.println("テストその２");

         assertEquals(2, 1 + 1);
      }
   }

   @Nested
   class WhenNew2 {

      @Test
      public void myTest1() {

         System.out.println("テストその３");

         assertEquals(2, 1 + 1);

      }

      @Test
      public void myTest2() {

         System.out.println("テストその４");

         assertEquals(2, 1 + 1);
      }
   }

}
