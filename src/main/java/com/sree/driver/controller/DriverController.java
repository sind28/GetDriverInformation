package com.sree.driver.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sree.driver.entity.DriverEntity;
import com.sree.driver.repository.DriverRepository;

@Controller
@RequestMapping("/drivers")
public class DriverController {
	private DriverRepository driverRepository;
	
	@Autowired
	public DriverController(DriverRepository driverRepository) {
		this.driverRepository=driverRepository;
	}
	
	@RequestMapping(value="/{driverId}", method=RequestMethod.GET)
	public String driverName(@PathVariable("driverId") int driverId,Model model) {
		DriverEntity drv=driverRepository.findByDriverId(driverId);
		return drv.getFirst_name();
	}
}
