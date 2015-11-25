/**
 * BeansApp.java
 * @version 1.0.0 3/18/2015
 * @author Michael P. Redlich
 */

package org.tcf.beans;

import java.io.*;

public class BeansApp {

    public BeansApp() {
        }

	public static void main(String[] args) {

        final String filename = "/usr/local/presentations/tcf/java/beans/redlich.ser";
        PersonBean personBean = null;

        BeansApp beansDemo = new BeansApp();
        beansDemo.displayHeader();

		PersonBean person01 = new PersonBean();
        System.out.println(person01);

        PersonBean redlich = new PersonBean("Redlich","Michael");
        System.out.println(redlich);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(redlich);
            outputStream.close();
            fileOutputStream.close();
            System.out.println("Serialized data saved in redlich.ser");
            }
        catch(IOException exception) {
            exception.printStackTrace();
            }

        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            personBean = (PersonBean)inputStream.readObject();
            inputStream.close();
            fileInputStream.close();
            }
        catch(IOException exception) {
            exception.printStackTrace();
            return;
            }
        catch(ClassNotFoundException exception) {
            exception.printStackTrace();
            return;
            }

        System.out.println("Deserialized object...");
        System.out.println("Last Name: " + personBean.getLastName());
        System.out.println("First Name: " + personBean.getFirstName());
        System.out.println("Valid?: " + personBean.isValid());

        PersonBean person03 = new PersonBean("Burd","Barry");
		System.out.println(person03);
		}

    public void displayHeader() {
        System.out.println();
        System.out.println("*--------------------------------------------------*");
        System.out.println("* Java Advanced Features                           *");
        System.out.println("* Java Beans Demo Application                      *");
        System.out.println("*--------------------------------------------------*");
        System.out.println();
        }
    }

