/**
 *
 */
package net.aristo.template.batch.exe;

import java.io.IOException;

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
   private static final Logger logger = LoggerFactory.getLogger(LogSampleExecuter.class);

   /* (非 Javadoc)
    * @see net.aristo.template.batch.exe.Executer#start(java.lang.String[])
    */
   @Override
   public void start(String[] args) throws Exception {

      /*
       * 入力引数のバリデーションチェックを行う。
       */
      try {

         inputParameterCheck(args);

      } catch (InputParameterCheckException e) {

         logger.error("入力引数チェックにて不正を検知しました。");
         throw e;

      }

      /*
       * バッチの二重起動チェックを行う。
       */
      doubleStartCheck();

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

      logger.debug("inputParameterCheck:{}", "start");

      logger.debug("入力引数のバリデーションチェックはありません。");

      logger.debug("inputParameterCheck:{}", "end");

   };

   /**
    * バッチの二重起動チェック
    *
    * @param args 入力引数
    * @throws IOException
    */
   protected void doubleStartCheck() throws IOException {

      logger.debug("doubleStartCheck:{}", "start");

      logger.debug("二重起動チェックはありません。");

      logger.debug("doubleStartCheck:{}", "end");

   };

   /**
    * 処理の本体
    *
    * @param args 入力引数
    * @throws Exception
    */
   public abstract void doStart(String[] args) throws Exception;
}
