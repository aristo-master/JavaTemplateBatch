/**
 *
 */
package net.aristo.template.batch.common.exception;

import java.io.IOException;

/**
 * バッチの二重起動発生時に使用するException
 *
 * @author アリストマスター
 *
 */
public class DoubleStartCheckException extends IOException {

   /**
    *
    */
   public DoubleStartCheckException() {

   }

   /**
    * @param message
    */
   public DoubleStartCheckException(String message) {

      super(message);
   }

   /**
    * @param cause
    */
   public DoubleStartCheckException(Throwable cause) {

      super(cause);
   }

   /**
    * @param message
    * @param cause
    */
   public DoubleStartCheckException(String message, Throwable cause) {

      super(message, cause);
   }

}
