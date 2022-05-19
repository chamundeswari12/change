package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Doctor {
	
	 @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private int id;
	   private String doctorName;
	   private String specialist;
	   
	   private String feedback;
	    private int rating;
	    private String location;
	    private int doctorfee;

//	    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY ,mappedBy="doctor")
//	    private List<Slots> slots;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getDoctorName() {
			return doctorName;
		}

		public void setDoctorName(String doctorName) {
			this.doctorName = doctorName;
		}

		public String getSpecialist() {
			return specialist;
		}

		public void setSpecialist(String specialist) {
			this.specialist = specialist;
		}

	

		public String getFeedback() {
			return feedback;
		}

		public void setFeedback(String feedback) {
			this.feedback = feedback;
		}

		public int getRating() {
			return rating;
		}

		public void setRating(int rating) {
			this.rating = rating;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public int getDoctorfee() {
			return doctorfee;
		}

		public void setDoctorfee(int doctorfee) {
			this.doctorfee = doctorfee;
		}

//		public List<Slots> getSlots() {
//			return slots;
//		}
//
//		public void setSlots(List<Slots> slots) {
//			this.slots = slots;
//		}

		public Doctor(int id, String doctorName, String specialist,  String feedback, int rating,
				String location, int doctorfee) {
			super();
			this.id = id;
			this.doctorName = doctorName;
			this.specialist = specialist;
			
			this.feedback = feedback;
			this.rating = rating;
			this.location = location;
			this.doctorfee = doctorfee;
			
		}
	    
	    
		public Doctor() {}
	    
	    
}
