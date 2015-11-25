/*
 * Baseball.h
 * @version 1.0.1 3/23/2015
 * @author Michael P. Redlich
 */

#ifndef __BASEBALL_H
#define __BASEBALL_H

#include "Sports.h"

using namespace std;

class Baseball : public Sports {
	public:
		Baseball(void);
		Baseball(char const *,int,int);
		~Baseball(void);
		virtual void display(void);
	};

/*
 * Default constructor
 */
Baseball::Baseball(void) : Sports() {
	}

/*
 * Primary constructor
 */
Baseball::Baseball(char const *team,int win,int loss) : Sports(team,win,loss,0) {
	}

/*
 * Destructor
 */
inline Baseball::~Baseball(void) {
	}

/*
 * void display(void)
 */
void Baseball::display(void) {
	cout << getTeam() << "\t" << getWin() << " " << getLoss() << " " << getPct() << " " << endl;
	}

#endif
