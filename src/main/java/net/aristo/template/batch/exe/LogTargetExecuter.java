/**
 *
 */
package net.aristo.template.batch.exe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import net.aristo.template.batch.App;
import net.aristo.template.batch.service.LogNotTargetService;
import net.aristo.template.batch.service.LogTargetService;

/**
 * SpringBootのDIコンポーネントを使用してバッチをスタートするサンプルです。
 *
 * @author アリストマスター
 *
 */
@Component
public class LogTargetExecuter extends AbstractExecuter {

   /** logger */
   private static final Logger logger = LoggerFactory.getLogger(LogTargetExecuter.class);

   @Autowired
   private LogTargetService logTargetService;

   @Autowired
   private LogNotTargetService logNotTargetService;

   /**
    * 処理実行
    *
    * @param args 入力引数
    * @throws Exception
    */
   public static void main(String[] args) throws Exception {

      ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

      LogTargetExecuter exe = context.getBean(LogTargetExecuter.class);
      exe.start(args);

   }

   /* (非 Javadoc)
    * @see net.aristo.template.batch.exe.AbstractExecuter#doStart(java.lang.String[])
    */
   @Override
   public void doStart(String[] args) {

      logger.warn("エラーが発生しました。");

      logTargetService.log();

      logNotTargetService.log();
   }

}
