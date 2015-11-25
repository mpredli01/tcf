/**
 * SportsApp.cpp
 * @version 1.0.1 3/23/2015
 * @author Michael P. Redlich
 */

#include <iostream>
#include "Sports.h"
#include "Baseball.h"
#include "Football.h"

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
	
    return 0;
	}
