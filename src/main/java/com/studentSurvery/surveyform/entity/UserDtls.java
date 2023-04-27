package com.studentSurvery.surveyform.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Table;
import lombok.Getter;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
@Table(name="user_details")
public class UserDtls {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String first_name;
	private String last_name;
	private String street_address;
	private String city;
	private String state;
	private String zip;
	private String telephone_number;
	private String email;
	private String date_of_survey;
	private String interest_source;
	private String recommendation;
	private String raffle;
	private String comments;
	private String liked_most;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getStreet_address() {
		return street_address;
	}
	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getTelephone_number() {
		return telephone_number;
	}
	public void setTelephone_number(String telephone_number) {
		this.telephone_number = telephone_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDate_of_survey() {
		return date_of_survey;
	}
	public void setDate_of_survey(String date_of_survey) {
		this.date_of_survey = date_of_survey;
	}
	public String getInterest_source() {
		return interest_source;
	}
	public void setInterest_source(String interest_source) {
		this.interest_source = interest_source;
	}
	public String getRecommendation() {
		return recommendation;
	}
	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}
	public String getRaffle() {
		return raffle;
	}
	public void setRaffle(String raffle) {
		this.raffle = raffle;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getLiked_most() {
		return liked_most;
	}
	public void setLiked_most(String liked_most) {
		this.liked_most = liked_most;
	}
	@Override
	public String toString() {
		return "UserDtls [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", street_address="
				+ street_address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", telephone_number="
				+ telephone_number + ", email=" + email + ", date_of_survey=" + date_of_survey + ", interest_source="
				+ interest_source + ", recommendation=" + recommendation + ", raffle=" + raffle + ", comments="
				+ comments + ", liked_most=" + liked_most + "]";
	}
	
	
	
	
	
	
	
	
}
