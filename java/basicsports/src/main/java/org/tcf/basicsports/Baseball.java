/**
 * Baseball.java
 * @version 1.0.0 8/31/2001
 * @author Michael P. Redlich
 */

package org.tcf.basicsports;

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
        super(team,win,loss);
		}
	}
