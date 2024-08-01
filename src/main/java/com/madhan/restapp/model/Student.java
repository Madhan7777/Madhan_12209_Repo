package com.madhan.restapp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="stud")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String studentname;
	@Column
	private String department;
	@Column
	private String year;
	@Column
	private int roomno;
	
	@OneToOne(targetEntity = Room.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "room")
	private Room room;

	public Student() {
		super();

	}

	public Student(int id, String studentname, String department, String year, int roomno, Room room) {
		super();
		this.id = id;
		this.studentname = studentname;
		this.department = department;
		this.year = year;
		this.roomno = roomno;
		this.room = room;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getRoomno() {
		return roomno;
	}

	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentname=" + studentname + ", department=" + department + ", year=" + year
				+ ", roomno=" + roomno + ", room=" + room + "]";
	}
	
	
	

}
