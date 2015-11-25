/**
 * SportsApp.java
 * @version 1.0.0 8/31/2001
 * @author Michael P. Redlich
 */

package org.tcf.basicsports;

public class SportsApp {
    /**
     *
     * @param args
     */
	public static void main(String[] args) {
        SportsApp sportsApp = new SportsApp();
        sportsApp.displayHeader();

		Sports nymets = new Baseball("Mets",97,65);
		nymets.display();

        Sports nyjets = new Football("Jets",12,3,1);
		nyjets.display();

        int win = nymets.getWin();
		System.out.println("The number of wins for the " + nymets.getTeam() + " is " + win);
		}

    /**
     *
     */
    void displayHeader() {
        System.out.println();
        System.out.println("*--------------------------------------------------*");
        System.out.println("* Getting Started with Java                        *");
        System.out.println("* Sports Demo Application                          *");
        System.out.println("*--------------------------------------------------*");
        System.out.println();
        }
    }
