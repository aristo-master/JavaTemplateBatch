/**
 *
 */
package net.aristo.template.batch.exe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * SpringBootのDIコンポーネントを使用してバッチをスタートするサンプルです。
 *
 * @author アリストマスター
 *
 */
@SpringBootApplication
public class SpringBootApplicationExecuter extends AbstractExecuter {

   /** logger */
   private static final Logger log = LoggerFactory.getLogger(SpringBootApplicationExecuter.class);

   /**
    * @param args
    * @throws Exception
    */
   public static void main(String[] args) throws Exception {

      ConfigurableApplicationContext context = SpringApplication.run(SpringBootApplicationExecuter.class, args);

      SpringBootApplicationExecuter exe = context.getBean(SpringBootApplicationExecuter.class);
      exe.start(args);

   }

   @Override
   public void doStart(String[] args) {

      log.info("SpringBootを経由してインスタンスを作成しました。");

   }

}
