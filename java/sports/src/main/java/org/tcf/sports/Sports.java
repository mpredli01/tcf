/**
 * Sports.java
 * @version 1.0.0 8/31/2001
 * @author Michael P. Redlich
 */

package org.tcf.sports;

import java.text.DecimalFormat;

public class Sports {
	private String team;
	private int win;
	private int loss;
	private int tie;
	private double pct;

	/**
	 * Default constructor.
	 */
	public Sports() {
		setTeam("Team");
		setWin(0);
		setLoss(0);
		setTie(0);
		setPct(0,0,0);
		}

    /**
     * Primary constructor.
     *
     * @param team
     * @param win
     * @param loss
     * @param tie
     */
	public Sports(String team,int win,int loss,int tie) {
		setTeam(team);
		setWin(win);
		setLoss(loss);
		setTie(tie);
		setPct(win,loss,tie);
		}

    /**
     *
     * @return team
     */
	public String getTeam() {
		return team;
		}

    /**
     *
     * @param team
     */
	public void setTeam(String team) {
		this.team = team;
		}

    /**
     *
     * @return win
     */
	public int getWin() {
		return win;
		}

    /**
     *
     * @param win
     */
	public void setWin(int win) {
		this.win = win;
		}

    /**
     *
     * @return loss
     */
	public int getLoss() {
		return loss;
		}

    /**
     *
     * @param loss
     */
	public void setLoss(int loss) {
		this.loss = loss;
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
     * @return pct
     */
	public double getPct() {
		return pct;
		}

    /**
     *
     * @param win
     * @param loss
     * @param tie
     */
	public void setPct(int win,int loss,int tie) {
		if(win == 0 && loss == 0)
			this.pct = 0.0;
		else
			this.pct = (double)win / ((double)win + (double)loss + (double)tie);
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

    /**
     *
     * @return
     */
	public String toString() {
		return("toString()...");
		}
	}

