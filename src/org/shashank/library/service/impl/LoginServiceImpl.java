package org.shashank.library.service.impl;

import org.shashank.library.dao.LoginDao;
import org.shashank.library.model.Login;
import org.shashank.library.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao loginDao;

	public Login addLogin(Login login) {
		if (!loginDao.isUnique(login))
			return null;
		login.setSalt(BCrypt.gensalt());
		login.setPassword(BCrypt.hashpw(login.getPassword(), login.getSalt()));
		return loginDao.addLogin(login);
	}

	public Login checkLogin(Login login) {
		Login login2 = loginDao.getLogin(login);
		if (login2 == null)
			return null;
		if (BCrypt.hashpw(login.getPassword(), login2.getSalt()).equals(login2.getPassword()))
			return login2;
		return null;

	}
}
