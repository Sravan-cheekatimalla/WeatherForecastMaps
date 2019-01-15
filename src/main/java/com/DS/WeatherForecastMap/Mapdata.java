package com.DS.MapWeather.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "maptest")
public class MapWeatherBean {
	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	 	
	 	private Integer mapid;
	    private String source;
	    private String destination;
	    
	    public String getSource() {
			return source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getDestination() {
			return destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}		
}
