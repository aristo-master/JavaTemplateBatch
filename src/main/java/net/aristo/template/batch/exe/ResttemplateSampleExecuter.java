/**
 *
 */
package net.aristo.template.batch.exe;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

/**
 * 自分のクラスをnewすることも出来るというサンプルです。
 *
 * @author アリストマスター
 *
 */
public class ResttemplateSampleExecuter extends AbstractExecuter {

   /** logger */
   private static final Logger logger = LoggerFactory.getLogger(ResttemplateSampleExecuter.class);

   /**
    * 処理実行
    *
    * @param args 入力引数
    * @throws Exception
    */
   public static void main(String[] args) throws Exception {

      /*
       * mainメソッドから直接メソッドを実行しようとすると、他のメソッドも全部staticにしなければならない。
       * しかし、自分自身をnewしてインスタンスを作成することは出来ますので、
       * それを使えばより自然に実装が出来るでしょう。
       */

      ResttemplateSampleExecuter exe = new ResttemplateSampleExecuter();
      exe.start(args);

   }

   /* (非 Javadoc)
    * @see net.aristo.template.batch.exe.AbstractExecuter#doStart(java.lang.String[])
    */
   @Override
   public void doStart(String[] args) throws IOException {

      RestTemplate restTemplate = new RestTemplate();
      String response = restTemplate.getForObject("http://dummy.restapiexample.com/api/v1/employees", String.class);

      logger.debug(response);

   }

}
