package com.madhan.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="room")
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private int roomno;
	@Column
	private int hostelfees;
	@Column
	private int messfees;
	@Column
	private int total;
	public Room() {
		super();

	}
	public Room(int id, int roomno, int hostelfees, int messfees, int total) {
		super();
		this.id = id;
		this.roomno = roomno;
		this.hostelfees = hostelfees;
		this.messfees = messfees;
		this.total = total;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoomno() {
		return roomno;
	}
	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}
	public int getHostelfees() {
		return hostelfees;
	}
	public void setHostelfees(int hostelfees) {
		this.hostelfees = hostelfees;
	}
	public int getMessfees() {
		return messfees;
	}
	public void setMessfees(int messfees) {
		this.messfees = messfees;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Room [id=" + id + ", roomno=" + roomno + ", hostelfees=" + hostelfees + ", messfees=" + messfees
				+ ", total=" + total + "]";
	}
	
	
}
