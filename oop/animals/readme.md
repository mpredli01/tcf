## Animals Demo Application

#### Introduction to Object-Oriented Programming & Design Principles

This small application accompanies the presentation, **Introduction to Object-Oriented Programming & Design Principles**.  It demonstrates the Design Principle, **Program to Interfaces, Not Implementations** that was reviewed in the presentation.

#### Source Code:

From the root of your application directory, the source code can be found in the folder hierarchy:

`src/main/java/org/tcf/animals`

The first part of this hierarchy, `src/main/java`, follows the convention used by **Gradle**.  The second part of this hierarchy, `org\tcf\animals`, is referenced in the package access defined in the source code as `package org.tcf.animals;` and is user-defined.

#### Building the Application:

This application is built and executed with **Gradle**, [http://www.gradle.org/](http://). After installing Gradle and downloading the application, you can build the application with the following command:

	$ gradle build
	C:\> gradle build

from the root of your application directory.

Please note that the `build.gradle` file is setup such that you should have no difficulties building the application provided that the source code folder hierarchy show earlier is maintained.  Your own root folder for the application is independent of the build process.

#### Running the Application:

Once the application has been built, you can run the application with the following command:

	$ gradle run
	C:\> gradle run

#### Feeback:

Feedback (good, bad, or indifferent) and questions are **always** welcome and can be sent to [mailto:mike@redlich.net](http://).
