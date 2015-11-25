/**
 * PersonBean.java
 * @version 1.0.0 3/18/2015
 * @author Michael P. Redlich
 */

package org.tcf.beans;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.StringCharacterIterator;

public class PersonBean implements Serializable {
	private String lastName;
	private String firstName;
	private boolean valid;

    /**
     * Default constructor.
     */
    public PersonBean() {
		setLastName("lastName");
		setFirstName("firstName");
		setValid(true);
		}

    /**
     * Primary constructor.
     *
     * @param lastName
     * @param firstName
     */
    public PersonBean(String lastName,String firstName) {
		validateName(lastName);
        setLastName(lastName);
        validateName(firstName);
		setFirstName(firstName);
		if(lastName.equals("") || firstName.equals("")) { 
			setValid(false);
			}
		else {
			setValid(true);
			}
		}

    /**
     *
     * @return lastName
     */
    public String getLastName() {
		return lastName;
		}

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
		this.lastName = lastName;
		}

    /**
     *
     * @return firstName
     */
    public String getFirstName() {
		return firstName;
		}

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
		this.firstName = firstName;
		}

    /**
     *
     * @return valid
     */
    public boolean isValid() {
		return valid;
		}

    /**
     *
     * @param valid
     */
    public void setValid(boolean valid) {
		this.valid = valid;
		}

    /**
     *
     * @param name
     */
    private void validateName(String name) {
        boolean hasContent = (name != null) && (!name.equals(""));
        if(!hasContent) {
            throw new IllegalArgumentException("Names must be not null and not empty");
            }
        StringCharacterIterator iterator = new StringCharacterIterator(name);
        char character = iterator.current();
        while(character != StringCharacterIterator.DONE) {
            boolean isValidChar = (Character.isLetter(character) || Character.isSpaceChar(character) || character == '\'');
            if(isValidChar) {
                setValid(true);
                }
            else {
                setValid(false);
                String message = "Names can contain only letters, spaces, and apostrophes.";
                throw new IllegalArgumentException(message);
                }
            character = iterator.next();
            }
        }

    /**
     *
     * @param inputStream
     * @throws ClassNotFoundException
     * @throws IOException
     */
    private void readObject(ObjectInputStream inputStream) throws ClassNotFoundException, IOException {
        // always perform the default de-serialization first
        inputStream.defaultReadObject();
        }

    /**
     *
     * @param outputStream
     * @throws IOException
     */
    private void writeObject(ObjectOutputStream outputStream) throws IOException {
        // perform the default serialization for all non-transient, non-static fields
        outputStream.defaultWriteObject();
        }

    /**
     *
     * @return lastName, firstName, valid
     */
    public String toString() {
		return getLastName() + ", " + getFirstName() + ", " + isValid();
		}
	}

