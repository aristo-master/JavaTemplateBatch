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

      assertEquals(2, 1 + 1);

   }

   @Test
   public void myTest2() {

      System.out.println("テストその２");

      assertEquals(2, 1 + 1);
   }

   @Test
   public void メソッド名には日本語も使えるんだぜ() {

      assertEquals(2, 1 + 1);

   }

   @Test
   void dependentAssertions() {

      // コードブロック内でアサーションが失敗すると、同じブロック内の後続のコードはスキップされる。
      assertAll("properties",
            () -> {
               String firstName = "aaa";
               assertNotNull(firstName);

               // 上のアサーションが成功した場合のみ実行される。
               assertAll("first name",
                     () -> assertTrue(firstName.startsWith("J")),
                     () -> assertTrue(firstName.endsWith("n")));
            },
            () -> {
               // グループ化されたアサーションは、first name のアサーションとは独立して実行される。
               String lastName = "bbb";
               assertNotNull(lastName);

               // 上のアサーションが成功した場合のみ実行される。
               assertAll("last name",
                     () -> assertTrue(lastName.startsWith("b")),
                     () -> assertTrue(lastName.endsWith("e")));
            });
   }

   @Test
   void arrayEquals​OK() {

      int[] expected = { 1, 2, 3 };

      int[] actual = { 1, 2, 3 };

      assertArrayEquals(expected, actual);

   }

   @Test
   void myTest3() {

      int[] expected = { 1, 2, 3 };

      int[] actual = { 4, 5, 6 };

      assertArrayEquals(expected, actual);

   }

}
