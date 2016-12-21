package org.shashank.library.dao;

import org.shashank.library.model.Login;

public interface LoginDao {

	public boolean isUnique(Login login);
	public Login addLogin(Login login);
	public Login getLogin(Login login);
}
