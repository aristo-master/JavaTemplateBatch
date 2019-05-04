/**
 *
 */
package net.aristo.template.batch.exe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import net.aristo.template.batch.App;
import net.aristo.template.batch.common.resource.MessageResource;

/**
 * プロパティファイル読み込み確認用サンプルです。
 *
 * @author アリストマスター
 *
 */
@SpringBootApplication
public class PropertySampleExecuter extends AbstractExecuter {

   /** logger */
   private static final Logger logger = LoggerFactory.getLogger(PropertySampleExecuter.class);

   /** プロパティファイル */
   @Autowired
   private MessageResource messageResource;

   /**
    * 処理実行
    *
    * @param args 入力引数
    * @throws Exception
    */
   public static void main(String[] args) throws Exception {

      ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

      PropertySampleExecuter exe = context.getBean(PropertySampleExecuter.class);
      exe.start(args);

   }

   /* (非 Javadoc)
    * @see net.aristo.template.batch.exe.AbstractExecuter#doStart(java.lang.String[])
    */
   @Override
   public void doStart(String[] args) {

      logger.info("valueSampleString={}", messageResource.getValue("I0001"));
      logger.info("valueSampleString={}", messageResource.getValue("I0002", "にゃん"));

   }

}
