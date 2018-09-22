/**
 * 
 */
package problems.basic.programs;

/**
 * Java program to print uppercase and lowercase alphabets.
 * 
 * @author Mrityunjay 21-Sep-2018 4:07:17 PM
 *
 */
public class PrintAlphabetUsingLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 65; i < 123; i++) {
			if (i < 91 || i > 96) {
				System.out.print(" " + (char) i);
				if (i == 90) {
					System.out.println();
				}
			}

		}

	}

}
