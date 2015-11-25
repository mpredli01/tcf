/**
 * Baseball.java
 * @version 1.0.0 8/31/2001
 * @author Michael P. Redlich
 */

package org.tcf.sports;

import java.text.DecimalFormat;

public class Baseball extends Sports {
    /**
     * Default constructor.
     */
	public Baseball() {
		super();
		}

    /**
     * Primary constructor.
     *
     * @param team
     * @param win
     * @param loss
     */
	public Baseball(String team,int win,int loss) {
		super(team,win,loss,0);
		}

    /**
     *
     */
	public void display() {
		DecimalFormat df1 = new DecimalFormat("#00");
		DecimalFormat df2 = new DecimalFormat("0.000");
		System.out.println(getTeam() + "\t"
			+ df1.format(getWin()) + " "
			+ df1.format(getLoss()) + " "
			+ df2.format(getPct()));
		}
	}

