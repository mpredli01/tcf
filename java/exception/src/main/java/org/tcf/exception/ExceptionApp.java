/**
 * ExceptionApp.java
 * @version 1.0.0 3/17/2015
 * @author Michael P. Redlich
 */

package org.tcf.exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.Exception;

public class ExceptionApp {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
		ExceptionApp exceptionApp = new ExceptionApp();
        exceptionApp.displayHeader();
        exceptionApp.fred();
		}

    /**
     * 
     */
    public void fred() {
        try {
            FileInputStream fileInputStream = new FileInputStream("/usr/local/presentations/tcf/java/exception/build.gradle");
            fileInputStream.close();

            int g = george(5);
            System.out.println("g = " + g);
            }
        catch(IOException exception) {
            System.out.println("ERROR: could not open file...");
            exception.printStackTrace();
            }
        catch(Exception exception) {
            System.out.print("ERROR: value less than zero...");
            exception.printStackTrace();
            }
        }

    /**
     * 
     * @param n
     * @return n * n
     * @throws Exception
     */
    public int george(int n) throws Exception {
        if(n < 0) {
            throw new Exception();
            }
        return n * n;
        }

    /**
     *
     */
    public void displayHeader() {
        System.out.println();
        System.out.println("*--------------------------------------------------*");
        System.out.println("* Java Advanced Features                           *");
        System.out.println("* Exception Demo Application                       *");
        System.out.println("*--------------------------------------------------*");
        System.out.println();
        }
	}
