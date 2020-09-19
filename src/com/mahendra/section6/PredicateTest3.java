package com.mahendra.section6;

import java.util.function.Predicate;

public class PredicateTest3 {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setUsrId("John");
		user1.setPwd("Secret");

		User user2 = new User();
		user2.setUsrId("John");
		user2.setPwd("dummy");

		Predicate<User> usrPredicate = u -> "John".equals(u.getUsrId()) && "Secret".equals(u.getPwd());
		System.out.println("Login success " + usrPredicate.test(user1));
		System.out.println("Login success " + usrPredicate.test(user2));

		Predicate<User> isSameUser = Predicate.isEqual(new User("John", "Secret"));
		System.out.println(isSameUser.test(user1));
		System.out.println(isSameUser.test(user2));
	}

}

class User {
	private String usrId;
	private String pwd;

	User() {

	}

	User(String usrId, String pwd) {
		this.usrId = usrId;
		this.pwd = pwd;
	}

	public String getUsrId() {
		return usrId;
	}

	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
		result = prime * result + ((usrId == null) ? 0 : usrId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (pwd == null) {
			if (other.pwd != null)
				return false;
		} else if (!pwd.equals(other.pwd))
			return false;
		if (usrId == null) {
			if (other.usrId != null)
				return false;
		} else if (!usrId.equals(other.usrId))
			return false;
		return true;
	}

}
