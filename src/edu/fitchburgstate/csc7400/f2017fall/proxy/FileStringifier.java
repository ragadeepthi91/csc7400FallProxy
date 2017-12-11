/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 10
 * Students: Ragadeepthi, Manaswitha, Radhika
 * 
 * Date: 2017-10-12
 */
package edu.fitchburgstate.csc7400.f2017fall.proxy;
import java.io.*;

/**
 * Simple file reader that turns a file into a string
 */
public interface FileStringifier {
    /**
     * Outputs file contents to print writer
     * 
     * @param out a print writer
     */
	public void display(PrintWriter out);
	
    /**
     * Returns a string with all the file contents
     */
   public String stringify();
}
