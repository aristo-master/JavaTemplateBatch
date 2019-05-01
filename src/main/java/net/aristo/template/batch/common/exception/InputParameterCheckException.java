/**
 *
 */
package net.aristo.template.batch.common.exception;

/**
 * 入力引数チェック例外
 *
 * @author アリストマスター
 *
 */
public class InputParameterCheckException extends Exception {

   /**
    * 
    */
   private static final long serialVersionUID = 1L;

   /**
    *
    */
   public InputParameterCheckException() {

   }

   /**
    * @param message
    */
   public InputParameterCheckException(String message) {

      super(message);
   }

   /**
    * @param cause
    */
   public InputParameterCheckException(Throwable cause) {

      super(cause);
   }

   /**
    * @param message
    * @param cause
    */
   public InputParameterCheckException(String message, Throwable cause) {

      super(message, cause);
   }

   /**
    * @param message
    * @param cause
    * @param enableSuppression
    * @param writableStackTrace
    */
   public InputParameterCheckException(String message, Throwable cause, boolean enableSuppression,
         boolean writableStackTrace) {

      super(message, cause, enableSuppression, writableStackTrace);
   }

}
