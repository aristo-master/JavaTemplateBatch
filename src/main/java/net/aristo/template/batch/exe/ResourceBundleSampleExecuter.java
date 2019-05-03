/**
 *
 */
package net.aristo.template.batch.exe;

import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ResourceBundleの挙動確認用サンプルです。
 *
 * @author アリストマスター
 *
 */
public class ResourceBundleSampleExecuter extends AbstractExecuter {

   /** logger */
   private static final Logger logger = LoggerFactory.getLogger(ResourceBundleSampleExecuter.class);

   /**
    * 処理実行
    *
    * @param args 入力引数
    * @throws Exception
    */
   public static void main(String[] args) throws Exception {

      ResourceBundleSampleExecuter exe = new ResourceBundleSampleExecuter();
      exe.start(args);

   }

   /* (非 Javadoc)
    * @see net.aristo.template.batch.exe.AbstractExecuter#doStart(java.lang.String[])
    */
   @Override
   public void doStart(String[] args) {

      ResourceBundle bundle = ResourceBundle.getBundle("application");

      logger.info("valueSampleString={}", bundle.getString("valueSampleString"));
      logger.info("valueSampleInteger={}", bundle.getString("valueSampleInteger"));
      logger.info("valueSampleBoolean={}", bundle.getString("valueSampleBoolean"));

   }

}
