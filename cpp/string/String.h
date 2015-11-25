/*
 * String.h
 * @version 1.0.0 3/23/2015
 * @author Michael P. Redlich
 */

#ifndef __STRING_H
#define __STRING_H

using namespace std;

#include <string>

class String {
	private:
		char *string;

	public:
		String(char const *str) {
			string = new char[strlen(str) + 1];
			strcpy(string,str);
			}

		~String(void) {
			delete[] string;
			}

		char *getString(void) const {
			return string;
			}
	};

#endif
