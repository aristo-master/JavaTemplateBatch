/**
 *
 */
package net.aristo.template.batch.exe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 自分のクラスをnewすることも出来るというサンプルです。
 *
 * @author アリストマスター
 *
 */
public class MyClazzInstanceExecuter {

	private static final Logger log = LoggerFactory.getLogger(MyClazzInstanceExecuter.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * mainメソッドから直接メソッドを実行しようとすると、他のメソッドも全部staticにしなければならない。
		 * しかし、自分自身をnewしてインスタンスを作成することは出来ますので、
		 * それを使えばより自然に実装が出来るでしょう。
		 */

		MyClazzInstanceExecuter exe = new MyClazzInstanceExecuter();
		exe.start();

	}

	public void start() {

		log.info("自分自身のクラスをnewしてインスタンスを作成することが出来ます。");

	}

}
