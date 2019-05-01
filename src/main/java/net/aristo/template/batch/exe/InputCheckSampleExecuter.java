
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
   private static final Logger log = LoggerFactory.getLogger(InputCheckSampleExecuter.class);

   /**
    * 処理実行
    *
    * @param args 入力引数
    * @throws InputParameterCheckException
    */
   public static void main(String[] args) throws InputParameterCheckException {

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

      log.debug("inputParameterCheck:{}", "start");

      if (args == null || args.length == 0) {

         throw new InputParameterCheckException("入力引数がありません。");

      }

      log.debug("inputParameterCheck:{}", "end");

   };

   /* (非 Javadoc)
    * @see net.aristo.template.batch.exe.AbstractExecuter#doStart(java.lang.String[])
    */
   @Override
   public void doStart(String[] args) {

      log.warn("本体の処理です。");

   }

}
