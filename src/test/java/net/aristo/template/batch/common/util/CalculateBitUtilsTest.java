/**
 *
 */
package net.aristo.template.batch.common.util;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.Test;

/**
 * CalculateBitUtilsのテスト
 *
 * @author アリストマスター
 *
 */
public class CalculateBitUtilsTest {

   /**
    * {@link net.aristo.template.batch.common.util.CalculateBitUtils#calculateLogicalAndZero(int, int)}
    * のためのテスト・メソッド。
    */
   @Test
   public void testCalculateLogicalAndZero_000() {

      boolean actual = CalculateBitUtils.calculateLogicalAndZero(0, 0);

      boolean expected = false;

      assertThat(actual, is(expected));

   }

   /**
    * {@link net.aristo.template.batch.common.util.CalculateBitUtils#calculateLogicalAndZero(int, int)}
    * のためのテスト・メソッド。
    */
   @Test
   public void testCalculateLogicalAndZero_001() {

      boolean actual = CalculateBitUtils.calculateLogicalAndZero(1, 1);

      boolean expected = true;

      assertThat(actual, is(expected));

   }

   /**
    * {@link net.aristo.template.batch.common.util.CalculateBitUtils#calculateLogicalAndZero(int, int)}
    * のためのテスト・メソッド。
    */
   @Test
   public void testCalculateLogicalAndZero_002() {

      boolean actual = CalculateBitUtils.calculateLogicalAndZero(1, 2);

      boolean expected = false;

      assertThat(actual, is(expected));

   }

   /**
    * {@link net.aristo.template.batch.common.util.CalculateBitUtils#calculateLogicalAndZero(int, int)}
    * のためのテスト・メソッド。
    */
   @Test
   public void testCalculateLogicalAndZero_003() {

      boolean actual = CalculateBitUtils.calculateLogicalAndZero(1, 3);

      boolean expected = true;

      assertThat(actual, is(expected));

   }

}
