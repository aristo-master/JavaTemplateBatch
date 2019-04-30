/**
 *
 */
package net.aristo.template.batch.exe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ログ出力の挙動を確認する為のサンプルクラスです。
 *
 * @author アリストマスター
 *
 */
public class LogSampleExecuter {

	private static final Logger log = LoggerFactory.getLogger(LogSampleExecuter.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LogSampleExecuter logSampleExecuter = new LogSampleExecuter();
		logSampleExecuter.start();

	}

	public void start() {

		log.trace("{}レベルのログ出力テストです。", "trace");
		log.debug("{}レベルのログ出力テストです。", "debug");
		log.info("{}レベルのログ出力テストです。", "info");
		log.warn("{}レベルのログ出力テストです。", "warn");
		log.error("{}レベルのログ出力テストです。", "error");

	}

}
