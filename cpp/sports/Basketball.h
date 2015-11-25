/**
 * Basketball.h
 * @version 1.0.1 3/23/2015
 * @author Michael P. Redlich
 */

#ifndef __BASKETBALL_H
#define __BASKETBALL_H

#include "Sports.h"

using namespace std;

class Basketball : public Sports {
	public:
		Basketball(void);
		Basketball(char const *,int,int,int);
		~Basketball(void);
	};

/*
 * Default constructor
 */
Basketball::Basketball(void) : Sports() {
	}

/*
 * Primary constructor
 */
Basketball::Basketball(char const *team,int win,int loss,int tie) : Sports(team,win,loss,tie) {
	}

/*
 * Destructor
 */
inline Basketball::~Basketball(void) {
    }

#endif
