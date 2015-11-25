/*
 * SportsApp.cpp
 * @version 1.0.1 3/23/2015
 * @author Michael P. Redlich
 */

#include <iostream>
#include "Sports.h"
#include "Baseball.h"
#include "Basketball.h"
#include "Football.h"
#include "Hockey.h"

void displayHeader(void) {
    cout << endl;
    cout << "*--------------------------------------------------*" << endl;
    cout << "* Getting Started with C++                         *" << endl;
    cout << "* Sports Demo Application                          *" << endl;
    cout << "*--------------------------------------------------*" << endl;
    cout << endl;
    }

int main(int argc,char *argv[]) {
    displayHeader();

	Sports *mets = new Baseball("Mets",97,65);
	mets->display();

	Sports *jets = new Football("Jets",12,3,1);
	jets->display();

	Sports *devils = new Hockey("Devils",47,32,3);
	devils->display();

	Sports *nets = new Basketball("Nets",51,29,2);
	nets->display();

	return 0;
	}
