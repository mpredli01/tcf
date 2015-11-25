/*
 * StringApp.cpp
 * @version 1.0.0 3/23/2015
 * @author Michael P. Redlich
 */

#include <iostream>
#include "String.h"

void displayHeader(void) {
    cout << endl;
    cout << "*--------------------------------------------------*" << endl;
    cout << "* C++ Advanced Features                            *" << endl;
    cout << "* String Demo Application                          *" << endl;
    cout << "*--------------------------------------------------*" << endl;
    cout << endl;
    }

int main(int argc,char *argv[]) {
    displayHeader();
	String *string1 = new String("Hello, C++ Users Group!");
	String *string2 = new String("Hello, Java Users Group!");
    
    cout << "string1 = " << string1->getString() << endl;
    cout << "string2 = " << string2->getString() << endl;
    cout << endl;

	if(strcpy(string1->getString(),string2->getString()) == 0)
		cout << "string1 and string2 are equal" << endl;
	else
		cout << "string1 and string2 aren't equal" << endl;
	}
