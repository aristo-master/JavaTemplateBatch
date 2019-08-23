
/**
 *
 */
package net.aristo.template.batch.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * ログ出力の挙動を確認する為のサンプルクラスです。
 *
 * @author アリストマスター
 *
 */
@Service
public class LogTargetService {

   /** logger */
   private static final Logger logger = LoggerFactory.getLogger(LogTargetService.class);

   public void log() {

      logger.error("エラーが発生しました。");
   }

}
