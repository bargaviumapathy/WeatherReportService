package com.example.demo.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Date;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.AllTimeReport;
import com.example.demo.DTO.MonthlyReport;
import com.example.demo.DTO.WeatherReportEntity;
import com.example.demo.configuration.FileReaderConfiguration;
import com.example.demo.util.CSVReaderUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class WeatherReportEntryService {
	
	@Autowired
	FileReaderConfiguration fileReaderConfiguration ;
	
	ObjectMapper mapper = new ObjectMapper();
	
	Map<String, WeatherReportEntity> weatherMap = new HashMap<String, WeatherReportEntity>();
	
	
	public WeatherReportEntity  getReport(String reportDate){
		
		WeatherReportEntity weatherEntity = weatherMap.get(reportDate);
		
		return  weatherEntity;
		
	}

	public AllTimeReport getAllTimeReport() {
		
		AllTimeReport allTimeReport = new AllTimeReport();
		
		Comparator<WeatherReportEntity> hottestcomparator = Comparator.comparing( WeatherReportEntity::getTemperaturemax );
		Comparator<WeatherReportEntity> coldestcomparator = Comparator.comparing( WeatherReportEntity::getTemperaturemin );
		Comparator<WeatherReportEntity> rainiestcomparator = Comparator.comparing( WeatherReportEntity::getRain );
		Comparator<WeatherReportEntity> windiest2Seccomparator = Comparator.comparing( WeatherReportEntity::getFastest2minwindspeed );
		Comparator<WeatherReportEntity> windiest5Seccomparator = Comparator.comparing( WeatherReportEntity::getFastest5secwindspeed );
		
		allTimeReport.setHottestDay(weatherMap.values().stream().max(hottestcomparator).get().getDate());
		allTimeReport.setColdestDay(weatherMap.values().stream().max(coldestcomparator).get().getDate());
		allTimeReport.setRainiestDay(weatherMap.values().stream().max(rainiestcomparator).get().getDate());
		allTimeReport.setWindiestDay(weatherMap.values().stream().max(windiest2Seccomparator).get().getDate());
		allTimeReport.setAverageWindSpeed(weatherMap.values().stream().max(windiest5Seccomparator).get().getDate());
		
		return allTimeReport;
	}

	public List<WeatherReportEntity> getMonthlyReport(String date) {
		
		List<WeatherReportEntity> weatherReportEntityList = weatherMap.values().stream().filter(entity -> entity.getDate().substring(0,6).equalsIgnoreCase(date)).collect(Collectors.toList());
		
		return weatherReportEntityList;
		
	}

	
	@PostConstruct
	public void postConstruct() throws Exception {
		
		 CSVReaderUtil.getWeatherReportEntity( fileReaderConfiguration.getFileName());
		 
		 System.out.println(CSVReaderUtil.getWeatherReportEntity( fileReaderConfiguration.getFileName()));
		 
		 List<WeatherReportEntity> weatherEntityList = CSVReaderUtil.getWeatherReportEntity( fileReaderConfiguration.getFileName());
		 
		 weatherEntityList.stream().forEach(entity->{
			 
			 weatherMap.put(entity.getDate(),entity);
			 
			 try {
				System.out.println(entity.date+" " +mapper.writeValueAsString(entity));
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		       
		 });
		 
		 
		 
	
    }

}
