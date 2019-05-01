/**
 *
 */
package net.aristo.template.batch.exe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.aristo.template.batch.common.exception.InputParameterCheckException;

/**
 * バッチ実行クラスの共通クラス
 *
 * @author アリストマスター
 *
 */
public abstract class AbstractExecuter implements Executer {

   /** logger */
   private static final Logger log = LoggerFactory.getLogger(LogSampleExecuter.class);

   /* (非 Javadoc)
    * @see net.aristo.template.batch.exe.Executer#start(java.lang.String[])
    */
   public void start(String[] args) throws InputParameterCheckException {

      /*
       * 入力引数のバリデーションチェックを行う。
       */
      try {

         inputParameterCheck(args);

      } catch (InputParameterCheckException e) {

         log.error("入力引数チェックにて不正を検知しました。");
         throw e;

      }

      /*
       * 処理の本体を実行する。
       */
      doStart(args);

   }

   /**
    * 入力引数のバリデーションチェック
    *
    * @param args 入力引数
    * @throws InputParameterCheckException
    */
   protected void inputParameterCheck(String[] args) throws InputParameterCheckException {

      log.debug("inputParameterCheck:{}", "start");

      log.debug("入力引数のバリデーションチェックはありません。");

      log.debug("inputParameterCheck:{}", "end");

   };

   /**
    * 処理の本体
    *
    * @param args 入力引数
    */
   public abstract void doStart(String[] args);
}
