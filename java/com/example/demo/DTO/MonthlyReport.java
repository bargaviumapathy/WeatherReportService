package com.example.demo.DTO;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Component

public class MonthlyReport {
	
	private String monthAndYear ;
	private String monthlyLowestMinTemperature;
	private String monthlyHighestMaxTemperature;
	private String monthlyAveragePrecipitation;
	private String monthlyModeWindDirection;
	private String monthlyMedian2minWindSpeed;
	private String monthlyPercentageOfRainyDays;
	private String monthlyNumberOfFoggyDays;
	private String wasThereAtleaseOneSmokeHazardDay;
	public String getMonthAndYear() {
		return monthAndYear;
	}
	public void setMonthAndYear(String monthAndYear) {
		this.monthAndYear = monthAndYear;
	}
	public String getMonthlyLowestMinTemperature() {
		return monthlyLowestMinTemperature;
	}
	public void setMonthlyLowestMinTemperature(String monthlyLowestMinTemperature) {
		this.monthlyLowestMinTemperature = monthlyLowestMinTemperature;
	}
	public String getMonthlyHighestMaxTemperature() {
		return monthlyHighestMaxTemperature;
	}
	public void setMonthlyHighestMaxTemperature(String monthlyHighestMaxTemperature) {
		this.monthlyHighestMaxTemperature = monthlyHighestMaxTemperature;
	}
	public String getMonthlyAveragePrecipitation() {
		return monthlyAveragePrecipitation;
	}
	public void setMonthlyAveragePrecipitation(String monthlyAveragePrecipitation) {
		this.monthlyAveragePrecipitation = monthlyAveragePrecipitation;
	}
	public String getMonthlyModeWindDirection() {
		return monthlyModeWindDirection;
	}
	public void setMonthlyModeWindDirection(String monthlyModeWindDirection) {
		this.monthlyModeWindDirection = monthlyModeWindDirection;
	}
	public String getMonthlyMedian2minWindSpeed() {
		return monthlyMedian2minWindSpeed;
	}
	public void setMonthlyMedian2minWindSpeed(String monthlyMedian2minWindSpeed) {
		this.monthlyMedian2minWindSpeed = monthlyMedian2minWindSpeed;
	}
	public String getMonthlyPercentageOfRainyDays() {
		return monthlyPercentageOfRainyDays;
	}
	public void setMonthlyPercentageOfRainyDays(String monthlyPercentageOfRainyDays) {
		this.monthlyPercentageOfRainyDays = monthlyPercentageOfRainyDays;
	}
	public String getMonthlyNumberOfFoggyDays() {
		return monthlyNumberOfFoggyDays;
	}
	public void setMonthlyNumberOfFoggyDays(String monthlyNumberOfFoggyDays) {
		this.monthlyNumberOfFoggyDays = monthlyNumberOfFoggyDays;
	}
	public String getWasThereAtleaseOneSmokeHazardDay() {
		return wasThereAtleaseOneSmokeHazardDay;
	}
	public void setWasThereAtleaseOneSmokeHazardDay(String wasThereAtleaseOneSmokeHazardDay) {
		this.wasThereAtleaseOneSmokeHazardDay = wasThereAtleaseOneSmokeHazardDay;
	}
	
	

}
