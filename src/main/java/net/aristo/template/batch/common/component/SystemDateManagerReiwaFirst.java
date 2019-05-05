package net.aristo.template.batch.common.component;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * システム日付を令和初日固定で取得する。
 *
 * @author アリストマスター
 *
 */
@Component("net.aristo.template.batch.common.component.SystemDateManagerReiwaFirst")
public class SystemDateManagerReiwaFirst implements SystemDateManager {

   /** logger */
   private static final Logger logger = LoggerFactory.getLogger(SystemDateManagerSystemDate.class);

   /* (非 Javadoc)
    * @see net.aristo.template.batch.common.util.SystemDateManager#getDate()
    */
   @Override
   public Date getDate() {

      logger.info("令和元年最初モードで日付を取得します。");

      Calendar c = Calendar.getInstance(TimeZone.getTimeZone("JST"));
      c.clear();
      c.set(2019, 5 - 1, 1, 0, 0, 0);

      return c.getTime();

   }
}
