/**
 *
 */
package net.aristo.template.batch.exe;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import net.aristo.template.batch.App;
import net.aristo.template.batch.common.util.SystemDateManager;

/**
 * システム日付をＤＩ注入で切り替えるサンプルです。
 *
 * @author アリストマスター
 *
 */
@SpringBootApplication
public class SystemDateExecuter extends AbstractExecuter {

   /** logger */
   private static final Logger logger = LoggerFactory.getLogger(SystemDateExecuter.class);

   @Resource(name = "${SystemDateManager}")
   @Autowired
   private SystemDateManager systemDateManager;

   /**
    * @param args
    * @throws Exception
    */
   public static void main(String[] args) throws Exception {

      ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

      SystemDateExecuter exe = context.getBean(SystemDateExecuter.class);
      exe.start(args);

   }

   @Override
   public void doStart(String[] args) {

      logger.info("システム日付={}", systemDateManager.getDate().toString());

   }

}
