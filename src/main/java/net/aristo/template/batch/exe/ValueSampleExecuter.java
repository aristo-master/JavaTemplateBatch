/**
 *
 */
package net.aristo.template.batch.exe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import net.aristo.template.batch.App;

/**
 * Valueアノテーションの挙動確認用サンプルです。
 *
 * @author アリストマスター
 *
 */
@SpringBootApplication
public class ValueSampleExecuter extends AbstractExecuter {

   /** logger */
   private static final Logger logger = LoggerFactory.getLogger(ValueSampleExecuter.class);

   /** String型のセット検証 */
   @Value("${valueSampleString}")
   private String valueSampleString;

   /** Integer型のセット検証 */
   @Value("${valueSampleInteger}")
   private Integer valueSampleInteger;

   /** boolean型のセット検証 */
   @Value("${valueSampleBoolean}")
   private boolean valueSampleBoolean;

   /**
    * 処理実行
    *
    * @param args 入力引数
    * @throws Exception
    */
   public static void main(String[] args) throws Exception {

      ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

      ValueSampleExecuter exe = context.getBean(ValueSampleExecuter.class);
      exe.start(args);

   }

   /* (非 Javadoc)
    * @see net.aristo.template.batch.exe.AbstractExecuter#doStart(java.lang.String[])
    */
   @Override
   public void doStart(String[] args) {

      logger.info("valueSampleString={}", valueSampleString);
      logger.info("valueSampleInteger={}", valueSampleInteger);
      logger.info("valueSampleBoolean={}", valueSampleBoolean);

   }

}
