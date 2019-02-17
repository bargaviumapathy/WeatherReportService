package com.example.demo.util;

import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.DTO.WeatherReportEntity;
import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;

public class CSVReaderUtil {
	
	
	
	public static List<WeatherReportEntity> getWeatherReportEntity(String fileName){
		
		
    CsvToBean<WeatherReportEntity> csvToBean = new CsvToBean<WeatherReportEntity>();
    
    List<WeatherReportEntity> weatherReportEntityList = null;
		
	Map<String, String> mapping = new 
            HashMap<String, String>();
	
	mapping.put("date", "date"); 
	mapping.put("temperaturemin", "temperaturemin");
	mapping.put("temperaturemax", "temperaturemax"); 
	mapping.put("percipitation", "percipitation"); 
	mapping.put("snowfall", "snowfall"); 
	mapping.put("snowdepth", "snowdepth"); 
	mapping.put("avgwindspeed", "avgwindspeed"); 
	mapping.put("fastest2minwinddir", "fastest2minwinddir"); 
	mapping.put("fastest2minwindspeed", "fastest2minwindspeed"); 
	mapping.put("fastest5secwinddir", "fastest5secwinddir"); 
	mapping.put("fastest5secwindspeed", "fastest5secwindspeed");
	mapping.put("fog", "fog");  
	mapping.put("fogheavy", "fogheavy"); 
	mapping.put("mist", "mist"); 
	mapping.put("rain", "rain"); 
	mapping.put("fogground", "fogground"); 
	mapping.put("ice", "ice"); 
	mapping.put("glaze", "glaze"); 
	mapping.put("drizzle", "drizzle"); 
	mapping.put("snow", "snow"); 
	mapping.put("freezingrain", "freezingrain"); 
	mapping.put("smokehaze", "smokehaze"); 
	mapping.put("thunder", "thunder"); 
	mapping.put("highwind", "highwind"); 
	mapping.put("hail", "hail"); 
	mapping.put("blowingsnow", "blowingsnow"); 
	mapping.put("dust", "dust"); 
	mapping.put("freezingfog", "freezingfog"); 
	
	 String[] columns = new String[] {"date","temperaturemin","temperaturemax","precipitation","snowfall","snowdepth","avgwindspeed","fastest2minwinddir","fastest2minwindspeed","fastest5secwinddir","fastest5secwindspeed","fog","fogheavy","mist","rain","fogground","ice","glaze","drizzle","snow","freezingrain","smokehaze","thunder","highwind","hail","blowingsnow","dust","freezingfog"						
};
	 
	ColumnPositionMappingStrategy <WeatherReportEntity> strategy = 
			   new ColumnPositionMappingStrategy<WeatherReportEntity>(); 

	strategy.setType(WeatherReportEntity.class); 
	strategy.setColumnMapping(columns); 
	
	CSVReader csvReader = null; 

	
	try { 
	  csvReader = new CSVReader(new FileReader (fileName),';', '"', 1);
	  
	   weatherReportEntityList = csvToBean.parse(strategy,csvReader);
	} 
	catch (Exception e) { 
	  e.printStackTrace(); 
	}
	 return weatherReportEntityList;
	}

}
