/**
 * Sports.h
 * @version 1.0.1 3/23/2015
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
		float pct;

	public:
		Sports(void);
		Sports(char const *,int,int);
		~Sports(void);
		char const *getTeam(void) const;
		void setTeam(char const *);
		int getWin(void) const;
		void setWin(int);
		int getLoss(void) const;
		void setLoss(int);
		float getPct(void) const;
		void setPct(int,int);
		virtual void display(void);
	};

/**
 * Default constructor
 */
Sports::Sports(void) : win(0),loss(0) {
	setTeam("{ team }");
	setPct(0,0);
	}

/**
 * Primary constructor
 */
Sports::Sports(char const *_team,int _win,int _loss) : win(_win),loss(_loss) {
	setTeam(_team);
	setPct(_win,_loss);
	}

/**
 * Destructor
 */
inline Sports::~Sports(void) {
	delete[] team;
	}

/**
 * char const *getTeam(void) const
 */
inline char const *Sports::getTeam(void) const {
	return team;
	}

/**
 * void setTeam(char const *)
 */
void Sports::setTeam(char const *_team) {
	team = new char[strlen(_team) + 1];
	strcpy(team,_team);
	}

/**
 * int getWin(void) const
 */
inline int Sports::getWin(void) const {
	return win;
	}

/**
 * void setWin(int)
 */
void Sports::setWin(int _win) {
	win = _win;
	}

/**
 * int getLoss(void) const
 */
inline int Sports::getLoss(void) const {
	return loss;
	}

/**
 * void setLoss(int)
 */
void Sports::setLoss(int _loss) {
	loss = _loss;
	}

/**
 * float getPct(void) const
 */
inline float Sports::getPct(void) const {
	return pct;
	}

/**
 * void setPct(int,int)
 */
void Sports::setPct(int _win,int _loss) {
	if(win == 0 && loss == 0) {
		pct = 0.0;
		}
	else {
		pct = (float)_win / ((float)_win + (float)_loss);
		}
	}


/**
 * void display(void)
 */
void Sports::display(void) {
	cout << getTeam() << "\t" << getWin() << " " << getLoss() << " " << getPct() << endl;
	}

#endif
