/**
 *
 */
package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnit5Test {

   @BeforeAll
   public static void beforeAll() {

      System.out.println("最初の一回だけ実行される。");

   }

   @AfterAll
   public static void afterAll() {

      System.out.println("最後の一回だけ実行される。");

   }

   @BeforeEach
   public void beforeEach() {

      System.out.println("各テストの前に毎回呼ばれる。");

   }

   @AfterEach
   public void afterEach() {

      System.out.println("各テストの後に毎回呼ばれる。");

   }

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
