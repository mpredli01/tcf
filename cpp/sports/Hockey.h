/*
 * Hockey.h
 * @version 1.0.1 3/23/2015
 * @author Michael P. Redlich
 */

#ifndef __HOCKEY_H
#define __HOCKEY_H

#include "Sports.h"

using namespace std;

class Hockey : public Sports {
	public:
		Hockey(void);
		Hockey(char const *,int,int,int);
		~Hockey(void);
	};

/*
 * Default constructor
 */
Hockey::Hockey(void) : Sports() {
	}

/*
 * Primary constructor
 */
Hockey::Hockey(char const *team,int win,int loss,int tie) : Sports(team,win,loss,tie) {
	}

/*
 * Destructor
 */
inline Hockey::~Hockey(void) {
    }

#endif
