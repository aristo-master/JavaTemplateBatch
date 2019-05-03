
/**
 *
 */
package net.aristo.template.batch.exe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ログ出力の挙動を確認する為のサンプルクラスです。
 *
 * @author アリストマスター
 *
 */
public class LogSampleExecuter extends AbstractExecuter {

   /** logger */
   private static final Logger logger = LoggerFactory.getLogger(LogSampleExecuter.class);

   /**
    * 処理実行
    *
    * @param args 入力引数
    * @throws Exception
    */
   public static void main(String[] args) throws Exception {

      LogSampleExecuter exe = new LogSampleExecuter();
      exe.start(args);

   }

   /* (非 Javadoc)
    * @see net.aristo.template.batch.exe.AbstractExecuter#doStart(java.lang.String[])
    */
   @Override
   public void doStart(String[] args) {

      logger.trace("{}レベルのログ出力テストです。", "trace");
      logger.debug("{}レベルのログ出力テストです。", "debug");
      logger.info("{}レベルのログ出力テストです。", "info");
      logger.warn("{}レベルのログ出力テストです。", "warn");
      logger.error("{}レベルのログ出力テストです。", "error");

   }

}
