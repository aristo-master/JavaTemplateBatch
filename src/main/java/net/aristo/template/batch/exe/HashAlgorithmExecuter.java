
/**
 *
 */
package net.aristo.template.batch.exe;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.aristo.template.batch.common.util.MessageDigestUtils;

/**
 * ハッシュ化処理を行うサンプルです。
 *
 * @author アリストマスター
 *
 */
public class HashAlgorithmExecuter extends AbstractExecuter {

   /** logger */
   private static final Logger logger = LoggerFactory.getLogger(HashAlgorithmExecuter.class);

   /**
    * 処理実行
    *
    * @param args 入力引数
    * @throws Exception
    */
   public static void main(String[] args) throws Exception {

      HashAlgorithmExecuter exe = new HashAlgorithmExecuter();
      exe.start(args);

   }

   /* (非 Javadoc)
    * @see net.aristo.template.batch.exe.AbstractExecuter#doStart(java.lang.String[])
    */
   @Override
   public void doStart(String[] args) throws NoSuchAlgorithmException, InvalidKeyException {

      //ハッシュのベースとなる文字列
      String baseText = "AristoMaster";

      //ソルト
      String salt = "hoge";

      /*
       * ベース文字列にソルトをくっつける。
       * ソルトを頭にくっつけるか、末尾にくっつけるか、それはプロジェクトの取り決めである。
       */
      String targetText = String.format("%s%s", baseText, salt);

      String hashTextMD2 = MessageDigestUtils.messageDigestMD2(targetText);
      logger.info("MD2={}", hashTextMD2);

      String hashTextMD5 = MessageDigestUtils.messageDigestMD5(targetText);
      logger.info("MD5={}", hashTextMD5);

      String hashTextSHA1 = MessageDigestUtils.messageDigestSHA1(targetText);
      logger.info("SHA1={}", hashTextSHA1);

      String hashTextSHA256 = MessageDigestUtils.messageDigestSHA256(targetText);
      logger.info("SHA256={}", hashTextSHA256);

      String hashTextSHA384 = MessageDigestUtils.messageDigestSHA384(targetText);
      logger.info("SHA34={}", hashTextSHA384);

      String hashTextSHA512 = MessageDigestUtils.messageDigestSHA512(targetText);
      logger.info("SHA512={}", hashTextSHA512);

      //秘密鍵
      String secretkey = "hogehoge";

      String hashTextHMAC = MessageDigestUtils.messageDigestHmac(baseText, secretkey);
      logger.info("HMAC={}", hashTextHMAC);

   }

}
