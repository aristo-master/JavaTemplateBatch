
/**
 *
 */
package net.aristo.template.batch.exe;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.aristo.template.batch.common.exception.DoubleStartCheckException;
import net.aristo.template.batch.common.exception.InputParameterCheckException;
import net.aristo.template.batch.common.util.DoubleStartChecker;

/**
 * 二重起動をチェックするサンプルクラスです。
 *
 * @author アリストマスター
 *
 */
public class DoubleStartCheckSampleExecuter extends AbstractExecuter {

   /** logger */
   private static final Logger logger = LoggerFactory.getLogger(DoubleStartCheckSampleExecuter.class);

   /** 二重起動防止ロックのファイルパス */
   private String lockFilePath = "R:\\/lock";

   /**
    * 処理実行
    *
    * @param args 入力引数
    * @throws Exception
    */
   public static void main(String[] args) throws Exception {

      DoubleStartCheckSampleExecuter exe = new DoubleStartCheckSampleExecuter();
      exe.start(args);

   }

   /**
    * バッチの二重起動チェック
    *
    * @param args 入力引数
    * @throws InputParameterCheckException
    * @throws IOException
    */
   @Override
   protected void doubleStartCheck() throws IOException {

      logger.debug("doubleStartCheck:{}", "start");

      try (DoubleStartChecker dsc = new DoubleStartChecker()) {

         if (!dsc.check(lockFilePath)) {

            throw new DoubleStartCheckException("DoubleStartCheckSampleExecuterが二重起動しています。");

         } else {

            logger.info("二重起動していません。");

         }

      }

      logger.debug("doubleStartCheck:{}", "end");

   };

   /* (非 Javadoc)
    * @see net.aristo.template.batch.exe.AbstractExecuter#doStart(java.lang.String[])
    */
   @Override
   public void doStart(String[] args) throws Exception {

      try (DoubleStartChecker dsc = new DoubleStartChecker()) {

         if (dsc.check("R:\\/file-to-lock")) {
            logger.info("正常に起動しました。");
         }

      }

   }

}
