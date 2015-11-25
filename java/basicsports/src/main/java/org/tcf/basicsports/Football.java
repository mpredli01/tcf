/**
 * Football.java
 * @version 1.0.0 8/31/2001
 * @author Michael P. Redlich
 */

package org.tcf.basicsports;

import java.text.DecimalFormat;

public class Football extends Sports {
    private int tie;

	/**
	 * Default constructor.
	 */
	public Football() {
        super();
        setTie(0);
		}

    /**
     * Primary constructor.
     *
     * @param team
     * @param win
     * @param loss
     * @param tie
     */
	public Football(String team,int win,int loss,int tie) {
        super(team,win,loss);
        setTie(tie);
		}

    /**
     *
     * @return tie
     */
    public int getTie() {
        return tie;
        }

    /**
     *
     * @param tie
     */
    public void setTie(int tie) {
        this.tie = tie;
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
                + df1.format(getTie()) + " "
                + df2.format(getPct()));
        }
    }
