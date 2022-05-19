package com.example.demo.entity;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;



@Entity
public class Slots {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date date;
	private LocalTime Time;
//	@Enumerated(EnumType.STRING)
	private boolean booked;
    @OneToOne(cascade = CascadeType.ALL,targetEntity = Doctor.class)
	private Doctor doctor;
    
    
    
    
    
    
    
	public boolean isBooked() {
		return booked;
	}
	public void setBooked(boolean booked) {
		this.booked = booked;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return Time;
	}
	public void setTime(LocalTime time) {
		Time = time;
	}
//	public AppointmentStatus getApstatus() {
//		return apstatus;
//	}
//	public void setApstatus(AppointmentStatus apstatus) {
//		this.apstatus = apstatus;
//	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Slots(int id, Date date, LocalTime time, Doctor doctor) {
		super();
		this.id = id;
		this.date = date;
		Time = time;
	
		this.doctor = doctor;
	}
	public Slots() {
		super();
	}
	@Override
	public String toString() {
		return "Slots [id=" + id + ", date=" + date + ", Time=" + Time + ", doctor=" + doctor
				+ "]";
	}
    
    
    
    
    

}
