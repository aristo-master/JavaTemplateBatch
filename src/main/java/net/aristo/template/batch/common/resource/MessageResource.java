/**
 *
 */
package net.aristo.template.batch.common.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * messageResource.propertiesから値を取得します。
 *
 * @author アリストマスター
 *
 */
@Configuration
@PropertySource("classpath:/messageResource.properties")
public class MessageResource {

   /** 環境読み込み */
   @Autowired
   private Environment env;

   /**
    * プロパティファイルの値を取得する。
    *
    * @param key キー
    * @return 値
    */
   public String getValue(String key) {

      return env.getProperty(key);

   }

   /**
    * プロパティファイルの値を取得する。
    *
    * @param key キー
    * @param str 挿入値
    * @return 値
    */
   public String getValue(String key, String str) {

      return String.format(env.getProperty(key), str);

   }

}