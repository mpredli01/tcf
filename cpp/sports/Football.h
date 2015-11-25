/*
 * Football.h
 * @version 1.0.1 3/23/2015
 * @author Michael P. Redlich
 */

#ifndef __FOOTBALL_H
#define __FOOTBALL_H

#include "Sports.h"

using namespace std;

class Football : public Sports {
	public:
		Football(void);
		Football(char const *,int,int,int);
		~Football(void);
	};

/*
 * Default constructor
 */
Football::Football(void) : Sports() {
	}

/*
 * Primary constructor
 */
Football::Football(char const *team,int win,int loss,int tie) : Sports(team,win,loss,tie) {
	}

/*
 * Destructor
 */
inline Football::~Football(void) {
    }

#endif
