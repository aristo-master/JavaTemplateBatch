/**
 *
 */
package net.aristo.template.batch.exe;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 自分のクラスをnewすることも出来るというサンプルです。
 *
 * @author アリストマスター
 *
 */
public class JacksonSampleExecuter extends AbstractExecuter {

   /** logger */
   private static final Logger logger = LoggerFactory.getLogger(JacksonSampleExecuter.class);

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

      JacksonSampleExecuter exe = new JacksonSampleExecuter();
      exe.start(args);

   }

   /* (非 Javadoc)
    * @see net.aristo.template.batch.exe.AbstractExecuter#doStart(java.lang.String[])
    */
   @Override
   public void doStart(String[] args) throws IOException {

      ParamDto param = new ParamDto();
      param.setParam1("aa");
      param.setParam2("bb");
      param.setParam3("cc");

      String jsonStr = buildJsonSample(param);

      jsonToClass(jsonStr);

   }

   /**
    * JavaオブジェクトをJSON文字列に変換する。
    *
    * @param param Javaオブジェクト
    * @return JSON文字列
    * @throws JsonProcessingException
    */
   public String buildJsonSample(ParamDto param) throws JsonProcessingException {

      ObjectMapper mapper = new ObjectMapper();
      String json = mapper.writeValueAsString(param);

      logger.info("json={}", json);

      return json;

   }

   /**
    * Json文字列をオブジェクトに変換する。
    *
    * @param jsonStr JSON文字列
    * @return Javaオブジェクト
    * @throws IOException
    */
   public ParamDto jsonToClass(String jsonStr) throws IOException {

      logger.info("jsonStr={}", jsonStr);

      ObjectMapper mapper = new ObjectMapper();
      ParamDto param = mapper.readValue(jsonStr, ParamDto.class);

      logger.info("ParamDto.param1={}", param.getParam1());
      logger.info("ParamDto.param2={}", param.getParam2());
      logger.info("ParamDto.param3={}", param.getParam3());

      return param;

   }

   private static class ParamDto {

      private String param1;

      private String param2;

      private String param3;

      public String getParam1() {

         return param1;
      }

      public void setParam1(String param1) {

         this.param1 = param1;
      }

      public String getParam2() {

         return param2;
      }

      public void setParam2(String param2) {

         this.param2 = param2;
      }

      public String getParam3() {

         return param3;
      }

      public void setParam3(String param3) {

         this.param3 = param3;
      }

   }
}
