package model;

import javax.faces.context.FacesContext;
/**
 * 
 * @author dwojdyla
 * @12.06.2016
 * 
 * In der Klasse werden User und Passwort überprüft.
 */
public class User {
	private String name;
	private String password;
	private boolean loggedIn;

	public User() {
		loggedIn = false;
	}

	/**
	 * @return the loggedIn
	 */
	public boolean isLoggedIn() {
		return loggedIn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Wenn user und passwortangabe richtig ist, dann wird true returned, wenn nicht, dann failed
	 */
	public String login() {
		String ret = "failed";
	
			if(name=="user" && password=="userpasswort"){
				loggedIn = true;
				return "success";
			}else{
				
		return ret;
			}
	}

	public String logout() {
		loggedIn = false;
		// This session is now invalid!
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "logout";
	}
}