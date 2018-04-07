package com.sandeep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sandeep.model.Goal;

@Controller
@SessionAttributes("goal") // it keep the goal object in session or it create new object every time
public class GoalController {
	/*Here we are going to pass in the model object(addGoal (Model model)) and it’s a type org.springframework.ui
	Spring will pass in the backing model to your method and since its pass by reference instead of pass by value because 
	this object available all the time*/ 
	@RequestMapping(value = "addGoal", method = RequestMethod.GET)
	public String addGoal(Model model) {
		
		Goal goal = new Goal();
		goal.setMinutes(10); // here it set default minutes
		
		model.addAttribute("goal", goal);
		
		return "addGoal";
	}
	@RequestMapping(value = "addGoal", method = RequestMethod.POST)
	public String updateGoal(@ModelAttribute("goal") Goal goal) {
		System.out.println("Minutes Updated: "+ goal.getMinutes());
		
		return "redirect:addMinutesMapping.html";
	}

}
