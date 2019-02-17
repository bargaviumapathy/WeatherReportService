package com.example.demo.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.AllTimeReport;
import com.example.demo.DTO.MonthlyReport;
import com.example.demo.DTO.WeatherReportEntity;
import com.example.demo.service.WeatherReportEntryService;

@RestController
@RequestMapping("/weather")
public class WeatherReportEntryController {
	
	@Autowired
	WeatherReportEntryService weatherReportEntryService;
	
	
@GetMapping(value = "/fetchReport/{date}", consumes = MediaType.APPLICATION_JSON_VALUE,
produces = MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<WeatherReportEntity> fetchReport(@PathVariable("date") String reportDate){
	WeatherReportEntity weatherReportEntity = weatherReportEntryService.getReport(reportDate);
	
	return ResponseEntity.ok(weatherReportEntity);
}

@GetMapping("/fetchAllTimeReport")
public ResponseEntity<AllTimeReport> fetchAllTimeReport(){
	AllTimeReport allTimeReport = weatherReportEntryService.getAllTimeReport();
	return ResponseEntity.ok(allTimeReport);
}

@GetMapping("/fetchMonthlyReport/{date}")
public ResponseEntity<List<WeatherReportEntity>> fetchMonthlyReport(@PathVariable("date") String reportDate){
	List<WeatherReportEntity> monthlyReport = weatherReportEntryService.getMonthlyReport(reportDate);
	return ResponseEntity.ok(monthlyReport);
}

}
