package edu.gatech.oad.antlab.person;
import java.util.Random;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Bob
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
		Random ran = new Random();
		String randomString = "";
		String shuffledString = "";
		while(randomString.length() < input.length()) {
			int num = ran.nextInt(input.length());
			if (input.indexOf(input.substring(num, num + 1)) == -1) {
				randomString += input.substring(num, num + 1);
			}
		}
		for (int i = 0; i < input.length(); i++) {
			shuffledString += input.substring(Integer.parseInt(randomString.substring(i)), Integer.parseInt(randomString.substring(i)) + 1);
		}
		return shuffledString;

	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
