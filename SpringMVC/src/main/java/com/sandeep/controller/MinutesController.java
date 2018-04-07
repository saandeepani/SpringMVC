package com.sandeep.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sandeep.model.Activity;
import com.sandeep.model.ExcercisePojo;

@Controller
public class MinutesController {
	
	@RequestMapping(value ="/addMinutesMapping")
	public String addMinutes(@ModelAttribute ("excersiceForCommand") ExcercisePojo excersiceBean) {
		
		System.out.println("Excersice: " + excersiceBean.getMinutes());
		return "forward:addMoreMinutesMappingUrl.html";
		//return "redirect:addMoreMinutesMappingUrl.html";
		
		/*Notes # Difference between Forward and redirect# Forward will keep session data and process 
		 * Redirect will clear session data and process*/
	}
	
	/*Chaining the controller using Forward Command*/
	@RequestMapping(value ="/addMoreMinutesMappingUrl")
	public String addMoreMinutes(@ModelAttribute("excersiceForCommand") ExcercisePojo excersice) {
		
		System.out.println("More Excersice: " + excersice.getMinutes());
		return "addMinutes";
	}
	
	//
	@RequestMapping(value = "/activities", method = RequestMethod.GET) 
	// Since we reading we want to use a get method associated with this
	public @ResponseBody List<Activity> findActivities(){
		
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);
		
		Activity bike = new Activity();
		run.setDesc("Bike");
		activities.add(bike);
		
		Activity swim = new Activity();
		run.setDesc("Swim");
		activities.add(swim);
		
		return activities;
		
		
	}

}
