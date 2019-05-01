/**
 *
 */
package net.aristo.template.batch.common.util;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * ハッシュ文字列作成ユーティリティ
 *
 * @author アリストマスター
 *
 */
public class MessageDigestUtils {

   /**
    * MD2でハッシュ化する。
    *
    * @param text ハッシュ化テキスト
    * @return
    * @throws NoSuchAlgorithmException
    */
   public static String messageDigestMD2(String text) throws NoSuchAlgorithmException {

      byte[] cipher_byte;
      MessageDigest md = MessageDigest.getInstance("MD2");
      md.update(text.getBytes());
      cipher_byte = md.digest();
      StringBuilder sb = new StringBuilder();
      for (byte b : cipher_byte) {
         sb.append(String.format("%02x", b & 0xff));
      }

      return sb.toString();

   }

   /**
    * MD5でハッシュ化する。
    *
    * @param text ハッシュ化テキスト
    * @return
    * @throws NoSuchAlgorithmException
    */
   public static String messageDigestMD5(String text) throws NoSuchAlgorithmException {

      byte[] cipher_byte;
      MessageDigest md = MessageDigest.getInstance("MD5");
      md.update(text.getBytes());
      cipher_byte = md.digest();
      StringBuilder sb = new StringBuilder();
      for (byte b : cipher_byte) {
         sb.append(String.format("%02x", b & 0xff));
      }

      return sb.toString();

   }

   /**
    * SHA1でハッシュ化する。
    *
    * @param text ハッシュ化テキスト
    * @return
    * @throws NoSuchAlgorithmException
    */
   public static String messageDigestSHA1(String text) throws NoSuchAlgorithmException {

      byte[] cipher_byte;
      MessageDigest md = MessageDigest.getInstance("SHA1");
      md.update(text.getBytes());
      cipher_byte = md.digest();
      StringBuilder sb = new StringBuilder();
      for (byte b : cipher_byte) {
         sb.append(String.format("%02x", b & 0xff));
      }

      return sb.toString();

   }

   /**
    * SHA256でハッシュ化する。
    *
    * @param text ハッシュ化テキスト
    * @return
    * @throws NoSuchAlgorithmException
    */
   public static String messageDigestSHA256(String text) throws NoSuchAlgorithmException {

      byte[] cipher_byte;
      MessageDigest md = MessageDigest.getInstance("SHA-256");
      md.update(text.getBytes());
      cipher_byte = md.digest();
      StringBuilder sb = new StringBuilder();
      for (byte b : cipher_byte) {
         sb.append(String.format("%02x", b & 0xff));
      }

      return sb.toString();

   }

   /**
    * SHA-384でハッシュ化する。
    *
    * @param text ハッシュ化テキスト
    * @return
    * @throws NoSuchAlgorithmException
    */
   public static String messageDigestSHA384(String text) throws NoSuchAlgorithmException {

      byte[] cipher_byte;
      MessageDigest md = MessageDigest.getInstance("SHA-384");
      md.update(text.getBytes());
      cipher_byte = md.digest();
      StringBuilder sb = new StringBuilder();
      for (byte b : cipher_byte) {
         sb.append(String.format("%02x", b & 0xff));
      }

      return sb.toString();

   }

   /**
    * SHA-512でハッシュ化する。
    *
    * @param text ハッシュ化テキスト
    * @return
    * @throws NoSuchAlgorithmException
    */
   public static String messageDigestSHA512(String text) throws NoSuchAlgorithmException {

      byte[] cipher_byte;
      MessageDigest md = MessageDigest.getInstance("SHA-512");
      md.update(text.getBytes());
      cipher_byte = md.digest();
      StringBuilder sb = new StringBuilder();
      for (byte b : cipher_byte) {
         sb.append(String.format("%02x", b & 0xff));
      }

      return sb.toString();

   }

   /**
    * SHA256HMACでハッシュ化する。
    *
    * @param text ハッシュ化テキスト
    * @param secretKey 秘密鍵
    * @return
    * @throws NoSuchAlgorithmException
    * @throws InvalidKeyException
    */
   public static String messageDigestHmac(String text, String secretKey)
         throws NoSuchAlgorithmException, InvalidKeyException {

      SecretKeySpec sk = new SecretKeySpec(secretKey.getBytes(), "HmacSHA256");
      Mac mac = Mac.getInstance("HmacSHA256");
      mac.init(sk);

      byte[] mac_bytes = mac.doFinal(text.getBytes());

      StringBuilder sb = new StringBuilder();
      for (byte b : mac_bytes) {
         sb.append(String.format("%02x", b & 0xff));
      }

      return sb.toString();

   }

}
