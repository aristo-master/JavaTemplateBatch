package net.aristo.template.batch.common.util;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 実行環境のシステム日付を取得する。
 *
 * @author アリストマスター
 *
 */
@Component("net.aristo.template.batch.common.util.SystemDateManagerSystemDate")
public class SystemDateManagerSystemDate implements SystemDateManager {

   /** logger */
   private static final Logger logger = LoggerFactory.getLogger(SystemDateManagerSystemDate.class);

   /* (非 Javadoc)
    * @see net.aristo.template.batch.common.util.SystemDateManager#getDate()
    */
   @Override
   public Date getDate() {

      logger.debug("システム日付を取得します。");

      return new Date();

   }
}
