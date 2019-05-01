
/**
 *
 */
package net.aristo.template.batch.exe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.aristo.template.batch.common.exception.InputParameterCheckException;

/**
 * ログ出力の挙動を確認する為のサンプルクラスです。
 *
 * @author アリストマスター
 *
 */
public class LogSampleExecuter extends AbstractExecuter {

   private static final Logger log = LoggerFactory.getLogger(LogSampleExecuter.class);

   /**
    * 処理実行
    *
    * @param args 入力引数
    * @throws InputParameterCheckException
    */
   public static void main(String[] args) throws InputParameterCheckException {

      LogSampleExecuter logSampleExecuter = new LogSampleExecuter();
      logSampleExecuter.start(args);

   }

   /* (非 Javadoc)
    * @see net.aristo.template.batch.exe.AbstractExecuter#doStart(java.lang.String[])
    */
   @Override
   public void doStart(String[] args) {

      log.trace("{}レベルのログ出力テストです。", "trace");
      log.debug("{}レベルのログ出力テストです。", "debug");
      log.info("{}レベルのログ出力テストです。", "info");
      log.warn("{}レベルのログ出力テストです。", "warn");
      log.error("{}レベルのログ出力テストです。", "error");

   }

}
