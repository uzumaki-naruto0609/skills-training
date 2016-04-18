/**
 * 
 */
package common;

import common.CommonWorld.Languages;

/**
 * @author Hung
 *
 */
public class Testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CommonWorld w = new AndroidWorld(1000, Languages.Java);
		w.Display();
		System.exit(0);
	}

}
