/**
 *
 */
package net.aristo.template.batch.common.util;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * @author アリストマスター
 *
 */
public class ClazzPathFileReaderTest {

   /**
    * {@link net.aristo.template.batch.common.util.ClazzPathFileReader#getClassPathFile(java.lang.String)}
    * のためのテスト・メソッド。
    */
   @Test
   public void testGetClassPathFile() {

      ClazzPathFileReader clazzPathFileReader = ClazzPathFileReader.getInstance();
      File file = clazzPathFileReader.getClassPathFile("/logback-spring.xml");

      assertThat(file.exists(), is(true));
   }

   /**
    * {@link net.aristo.template.batch.common.util.ClazzPathFileReader#readClassPathFileList(java.lang.String)}
    * のためのテスト・メソッド。
    *
    * @throws IOException
    */
   @Test
   public void testReadClassPathFileList() throws IOException {

      ClazzPathFileReader clazzPathFileReader = ClazzPathFileReader.getInstance();
      List<String> textList = clazzPathFileReader.readClassPathFileList("/logback-spring.xml");

      assertThat(textList.size(), is(greaterThan(1)));
   }

   /**
    * {@link net.aristo.template.batch.common.util.ClazzPathFileReader#readClassPathFile(java.lang.String)}
    * のためのテスト・メソッド。
    *
    * @throws IOException
    */
   @Test
   public void testReadClassPathFile() throws IOException {

      ClazzPathFileReader clazzPathFileReader = ClazzPathFileReader.getInstance();
      String text = clazzPathFileReader.readClassPathFile("/logback-spring.xml");

      assertThat(text, is(not(nullValue())));

   }

}
