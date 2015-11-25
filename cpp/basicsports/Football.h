/**
 * Football.h
 * @version 1.0.1 3/23/2015
 * @author Michael P. Redlich
 */

#ifndef __FOOTBALL_H
#define __FOOTBALL_H

#include "Sports.h"

using namespace std;

class Football : public Sports {
	private:
		int tie;

	public:
		Football(void);
		Football(char const *,int,int,int);
		~Football(void);
		int getTie(void) const;
		void setTie(int);
		virtual void display(void);
	};

/**
 * Default constructor
 */
Football::Football(void) : Sports() {
	setTie(0);
	setPct(0,0);
	}

/**
 * Primary constructor
 */
Football::Football(char const *team,int win,int loss,int tie) : Sports(team,win,loss) {
	setTie(tie);
	setPct(win,loss + tie);	
	}

/**
 * Destructor
 */
inline Football::~Football(void) {
        }

/**
 * int getTie()
 */
inline int Football::getTie(void) const {
	return tie;
	}

/**
 * void setTie(int)
 */
void Football::setTie(int _tie) {
	tie = _tie;
	}

/**
 * void display()
 */
void Football::display(void) {
    cout << getTeam() << "\t" << getWin() << " " << getLoss() << " " << getTie() << " " << getPct() << endl;
	}

#endif
