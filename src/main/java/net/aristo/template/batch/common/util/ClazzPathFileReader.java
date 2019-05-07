package net.aristo.template.batch.common.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * クラスパス上からファイルを読み込むサンプルです。
 *
 * SpringFrameworkの機能を使わないバージョンです。
 *
 * @author アリストマスター
 *
 */
public class ClazzPathFileReader {

   /** シングルトンインスタンス */
   private static ClazzPathFileReader instance;

   /**
    * シングルトン クラスパスの読み込み処理で使用する「this.getClass()」はstaticでは使用出来ない。
    */
   private ClazzPathFileReader() {

   }

   /**
    * インスタンスを取得する。
    *
    * @return ClazzPathFileReaderインスタンス
    */
   public static ClazzPathFileReader getInstance() {

      if (instance != null) {
         return instance;
      }

      return createInstance();

   }

   /**
    * インスタンスを生成する。
    *
    * @return ClazzPathFileReaderインスタンス
    */
   private synchronized static ClazzPathFileReader createInstance() {

      if (instance != null) {
         return instance;
      }

      instance = new ClazzPathFileReader();

      return instance;

   }

   /**
    * クラスパス上のファイルを取得する。
    *
    * 渡すパスの書き方は、 例えばresourcesファイルの直下の場合は「"/messageResource.properties"」などとなる。
    *
    * @param clazzFilePath クラスパス相対ファイルパス
    * @return ファイル
    */
   public File getClassPathFile(String clazzFilePath) {

      File file = new File(this.getClass().getResource(clazzFilePath).getPath());

      return file;

   }

   /**
    * クラスパス上のファイルを文字列として読み込む。
    *
    * 渡すパスの書き方は、 例えばresourcesファイルの直下の場合は「"/messageResource.properties"」などとなる。
    *
    * @param clazzFilePath クラスパス相対ファイルパス
    * @return ファイルの文字列リスト
    * @throws IOException
    */
   public List<String> readClassPathFileList(String clazzFilePath) throws IOException {

      File file = new File(this.getClass().getResource(clazzFilePath).getPath());

      Path filePath = Paths.get(file.getAbsolutePath());
      List<String> textList = Files.readAllLines(filePath);

      return textList;

   }

   /**
    * クラスパス上のファイルを文字列として読み込む。
    *
    * 渡すパスの書き方は、 例えばresourcesファイルの直下の場合は「"/messageResource.properties"」などとなる。
    *
    * @param clazzFilePath クラスパス相対ファイルパス
    * @return ファイルの文字列
    * @throws IOException
    */
   public String readClassPathFile(String clazzFilePath) throws IOException {

      File file = new File(this.getClass().getResource(clazzFilePath).getPath());

      Path filePath = Paths.get(file.getAbsolutePath());
      List<String> textList = Files.readAllLines(filePath); // UTF-8

      StringBuilder bul = new StringBuilder();
      textList.stream().forEach((text) -> {
         bul.append(text);
      });

      return bul.toString();

   }

}
