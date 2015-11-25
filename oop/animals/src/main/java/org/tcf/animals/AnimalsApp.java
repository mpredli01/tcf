/**
 * AnimalsApp.java
 * @version 1.0.0 3/19/2015
 * @author Michael P. Redlich
 */

package org.tcf.animals;

public class AnimalsApp {
    /**
     *
     * @param args none
     */
    public static void main(String[] args) {
        AnimalsApp animalsApp = new AnimalsApp();
        animalsApp.displayHeader();

		Animal dog = new Dog();
		System.out.println("The dog says, " + dog.speak());

		Animal cat = new Cat();
		System.out.println("The cat says, " + cat.speak());
		}

    /**
     * Displays a header that describes the presentation related to this application.
     *
     */
    public void displayHeader() {
        System.out.println();
        System.out.println("*---------------------------------------------------------------------*");
        System.out.println("* Introduction to Object-Oriented Programming & Design Principles     *");
        System.out.println("* Animals Demo Application                                            *");
        System.out.println("*---------------------------------------------------------------------*");
        System.out.println();
        }
	}

