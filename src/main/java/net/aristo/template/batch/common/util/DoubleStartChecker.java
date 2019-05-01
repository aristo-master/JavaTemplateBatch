/**
 *
 */
package net.aristo.template.batch.common.util;

import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/**
 * 二重起動チェックツール
 *
 * @author アリストマスター
 *
 */
public class DoubleStartChecker implements Closeable {

   /** FileOutputStream */
   private FileOutputStream fos = null;

   /** FileChannel */
   private FileChannel fc = null;

   /** FileLock */
   private FileLock fl = null;

   /**
    * ファイル二重起動チェック
    *
    * @param lockFilePath ロック判定に使用するファイルのパス
    * @return true:正常 / false:error
    * @throws IOException
    */
   public boolean check(String lockFilePath) throws IOException {

      fos = new FileOutputStream(lockFilePath);
      fc = fos.getChannel();
      fl = fc.tryLock();

      if (fl == null) {

         return false;

      } else {

         return true;

      }
   }

   /* (非 Javadoc)
    * @see java.io.Closeable#close()
    */
   @Override
   public void close() throws IOException {

      if (fl != null) {
         fl.close();
      }

      if (fc != null) {
         fc.close();
      }

      if (fos != null) {
         fos.close();
      }

   }

}
