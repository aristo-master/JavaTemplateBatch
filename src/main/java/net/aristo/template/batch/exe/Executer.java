/**
 *
 */
package net.aristo.template.batch.exe;

/**
 * バッチ実行インターフェース
 *
 * @author アリストマスター
 *
 */
public interface Executer {

   /**
    * バッチを実行する。
    *
    * @param args 入力引数
    * @throws Exception
    */
   public void start(String[] args) throws Exception;
}
