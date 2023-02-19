package com.crud.crudapi.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="marks")
public class Marks {

	@Id
	int id;
	String session;
	String semester;
	int total_subject;
	int total_marks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public int getTotal_subject() {
		return total_subject;
	}

	public void setTotal_subject(int total_subject) {
		this.total_subject = total_subject;
	}

	public int getTotal_marks() {
		return total_marks;
	}

	public void setTotal_marks(int total_marks) {
		this.total_marks = total_marks;
	}

	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Marks(int id, String session, String semester, int total_subject, int total_marks) {
		super();
		this.id = id;
		this.session = session;
		this.semester = semester;
		this.total_subject = total_subject;
		this.total_marks = total_marks;
	}

}
