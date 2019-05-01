/**
 *
 */
package net.aristo.template.batch.exe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.aristo.template.batch.common.exception.InputParameterCheckException;

/**
 * 自分のクラスをnewすることも出来るというサンプルです。
 *
 * @author アリストマスター
 *
 */
public class MyClazzInstanceExecuter extends AbstractExecuter {

   /** logger */
   private static final Logger log = LoggerFactory.getLogger(MyClazzInstanceExecuter.class);

   /**
    * @param args
    * @throws InputParameterCheckException
    */
   public static void main(String[] args) throws InputParameterCheckException {

      /*
       * mainメソッドから直接メソッドを実行しようとすると、他のメソッドも全部staticにしなければならない。
       * しかし、自分自身をnewしてインスタンスを作成することは出来ますので、
       * それを使えばより自然に実装が出来るでしょう。
       */

      MyClazzInstanceExecuter exe = new MyClazzInstanceExecuter();
      exe.start(args);

   }

   @Override
   public void doStart(String[] args) {

      log.info("自分自身のクラスをnewしてインスタンスを作成することが出来ます。");

   }

}
