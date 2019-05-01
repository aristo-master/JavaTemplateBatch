/**
 *
 */
package net.aristo.template.batch.exe;

import net.aristo.template.batch.common.exception.InputParameterCheckException;

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
    * @throws InputParameterCheckException
    */
   public void start(String[] args) throws InputParameterCheckException;
}
