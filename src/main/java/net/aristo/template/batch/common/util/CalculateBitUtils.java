/**
 *
 */
package net.aristo.template.batch.common.util;

/**
 * 論理積を計算するサンプルです。
 *
 * @author アリストマスター
 *
 */
public class CalculateBitUtils {

   /**
    * 論理積を計算する。 論理積が1より大きい場合、true 論理積が0以下の場合、false
    *
    * @param param1 10進数の数値その１
    * @param param2 10進数の数値その２
    * @return true(1以上)/false(0)
    */
   public static boolean calculateLogicalAndZero(int param1, int param2) {

      /*
       * 論理積の計算
       * 10進数のintに対し「&」演算子を使用することで論理積を算出できる。
       */
      int logicalAnd = param1 & param2;

      return logicalAnd > 0;

   }

}
