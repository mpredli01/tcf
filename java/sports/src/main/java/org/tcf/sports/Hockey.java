/**
 * Hockey.java
 * @version 1.0.0 8/31/2001
 * @author Michael P. Redlich
 */

package org.tcf.sports;

public class Hockey extends Sports {
	/**
	 * Default constructor.
	 */
	public Hockey() {
		super();
		}

    /**
     * Primary constructor.
     *
     * @param team
     * @param win
     * @param loss
     * @param tie
     */
	public Hockey(String team,int win,int loss,int tie) {
		super(team,win,loss,tie);
		}
	}

