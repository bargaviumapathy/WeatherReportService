package com.example.demo.DTO;

import java.sql.Date;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
public class AllTimeReport {
	public String HottestDay;
	public String ColdestDay;
	public String RainiestDay;
	public String  WindiestDay ;
	public String AverageWindSpeed;
	
	
	public String getHottestDay() {
		return HottestDay;
	}
	public void setHottestDay(String hottestDay) {
		HottestDay = hottestDay;
	}
	public String getColdestDay() {
		return ColdestDay;
	}
	public void setColdestDay(String coldestDay) {
		ColdestDay = coldestDay;
	}
	public String getRainiestDay() {
		return RainiestDay;
	}
	public void setRainiestDay(String rainiestDay) {
		RainiestDay = rainiestDay;
	}
	public String getWindiestDay() {
		return WindiestDay;
	}
	public void setWindiestDay(String windiestDay) {
		WindiestDay = windiestDay;
	}
	public String getAverageWindSpeed() {
		return AverageWindSpeed;
	}
	public void setAverageWindSpeed(String averageWindSpeed) {
		AverageWindSpeed = averageWindSpeed;
	}
	
	
	
	
	

}
