/*
 * Sports.h
 * @version 1.0.1 3/5/2015
 * @author Michael P. Redlich
 */

#ifndef __SPORTS_H
#define __SPORTS_H

#include <string>

using namespace std;

class Sports {
	private:
		char *team;
		int win;
		int loss;
		int tie;
		float pct;

	public:
		Sports(void);
		Sports(char const *,int,int,int);
		~Sports(void);
		char const *getTeam(void) const;
		void setTeam(char const *);
		int getWin(void) const;
		void setWin(int);
		int getLoss(void) const;
		void setLoss(int);
		int getTie(void) const;
		void setTie(int);
		float getPct(void) const;
		void setPct(int,int,int);
		virtual void display(void);
	};

/*
 * Default constructor
 */
Sports::Sports(void) : win(0),loss(0),tie(0) {
	setTeam("{ team }");
	setPct(0,0,0);
	}

/*
 * Primary constructor
 */
Sports::Sports(char const *_team,int _win,int _loss,int _tie) : win(_win),loss(_loss),tie(_tie) {
	setTeam(_team);
	setPct(_win,_loss,_tie);
	}

/*
 * Destructor
 */
inline Sports::~Sports(void) {
	delete[] team;
	}

/*
 * char const *getTeam(void) const
 */
inline char const *Sports::getTeam(void) const {
	return team;
	}

/*
 * void setTeam(char const *)
 */
void Sports::setTeam(char const *_team) {
	team = new char[strlen(_team) + 1];
	strcpy(team,_team);
	}

/*
 * int getWin(void) const
 */
inline int Sports::getWin(void) const {
	return win;
	}

/*
 * void setWin(int)
 */
void Sports::setWin(int _win) {
	win = _win;
	}

/*
 * int getLoss(void) const
 */
inline int Sports::getLoss(void) const {
	return loss;
	}

/*
 * void setLoss(int)
 */
void Sports::setLoss(int _loss) {
	loss = _loss;
	}

/*
 * int getTie(void) const
 */
inline int Sports::getTie(void) const {
	return tie;
	}

/*
 * void setTie(void)
 */
void Sports::setTie(int _tie) {
	tie = _tie;
	}

/*
 * float getPct(void) const
 */
inline float Sports::getPct(void) const {
	return pct;
	}

/*
 * void setPct(int,int,int)
 */
void Sports::setPct(int _win,int _loss,int _tie) {
	if(win == 0 && loss == 0) {
		pct = 0.0;
		}
	else {
		pct = (float)_win / ((float)_win + (float)_loss + (float)_tie);
		}
	}

/*
 * void display(void)
 */
void Sports::display(void) {
	cout << getTeam() << "\t" << getWin() << " " << getLoss() << " " << getTie() << " " << getPct() << endl;
	}

#endif
