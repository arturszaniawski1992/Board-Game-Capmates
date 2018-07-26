package com.capgemini.boardgamecapmates.dto;

import com.capgemini.boardgamecapmates.enums.Level;


	public class UpdateProfilTo {

		private Long id;
		private String login;
		private String firstname;
		private String password;
		private String mail;
		private String motto;
		private Level level;
		private double points;

		public UpdateProfilTo(Long id, String login, String firstname, String password, String mail, String motto,
				Level level, double points) {
			super();
			this.id = id;
			this.login = login;
			this.firstname = firstname;
			this.password = password;
			this.mail = mail;
			this.motto = motto;
			this.level = level;
			this.points = points;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getLogin() {
			return login;
		}

		public void setLogin(String login) {
			this.login = login;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getMail() {
			return mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}

		public String getMotto() {
			return motto;
		}

		public void setMotto(String motto) {
			this.motto = motto;
		}

		public Level getLevel() {
			return level;
		}

		public void setLevel(Level level) {
			this.level = level;
		}

		public double getPoints() {
			return points;
		}

		public void setPoints(double points) {
			this.points = points;
		}

	}
