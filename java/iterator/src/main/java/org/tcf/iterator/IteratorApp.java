/**
 * IteratorApp.java
 * @version 1.0.0 3/18/2015
 * @author Michael P. Redlich
 */

package org.tcf.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class IteratorApp {
    /**
     *
     * @param args
     */
	public static void main(String[] args) {
        IteratorApp iteratorDemo = new IteratorApp();
        iteratorDemo.displayHeader();

		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0;i < 10;++i) {
			list.add(new Integer(i));
			}
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println("i = " + iterator.next());
			}
		}

    /**
     *
     */
    public void displayHeader() {
        System.out.println();
        System.out.println("*--------------------------------------------------*");
        System.out.println("* Java Advanced Features                           *");
        System.out.println("* Iterator Demo Application                        *");
        System.out.println("*--------------------------------------------------*");
        System.out.println();
        }
	}
