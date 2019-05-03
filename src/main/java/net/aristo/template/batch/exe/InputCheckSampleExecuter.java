
/**
 *
 */
package net.aristo.template.batch.exe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.aristo.template.batch.common.exception.InputParameterCheckException;

/**
 * コマンドラインからの入力引数をチェックするサンプルクラスです。
 *
 * @author アリストマスター
 *
 */
public class InputCheckSampleExecuter extends AbstractExecuter {

   /** logger */
   private static final Logger logger = LoggerFactory.getLogger(InputCheckSampleExecuter.class);

   /**
    * 処理実行
    *
    * @param args 入力引数
    * @throws Exception
    */
   public static void main(String[] args) throws Exception {

      InputCheckSampleExecuter exe = new InputCheckSampleExecuter();
      exe.start(args);

   }

   /**
    * 入力引数のバリデーションチェック
    *
    * @param args 入力引数
    * @throws InputParameterCheckException
    */
   @Override
   protected void inputParameterCheck(String[] args) throws InputParameterCheckException {

      logger.debug("inputParameterCheck:{}", "start");

      if (args == null || args.length == 0) {

         throw new InputParameterCheckException("入力引数がありません。");

      }

      logger.debug("inputParameterCheck:{}", "end");

   };

   /* (非 Javadoc)
    * @see net.aristo.template.batch.exe.AbstractExecuter#doStart(java.lang.String[])
    */
   @Override
   public void doStart(String[] args) {

      logger.warn("本体の処理です。");

   }

}
