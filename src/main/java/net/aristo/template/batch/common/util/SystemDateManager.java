package net.aristo.template.batch.common.util;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * システム日付を管理するインターフェース
 *
 * @author アリストマスター
 *
 */
@Component
public interface SystemDateManager {

   /**
    * システム日付を取得する。
    *
    * @return システム日付
    */
   public Date getDate();

}
