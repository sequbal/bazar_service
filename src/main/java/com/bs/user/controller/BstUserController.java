package com.bs.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bs.user.dto.User;

@RestController
@RequestMapping(value="/v1/bs")
public class BstUserController {

	private static final Logger LOG = LoggerFactory.getLogger(BstUserController.class);
	
	@RequestMapping(value = "/saveNewUser", method = RequestMethod.POST)
	public User showHome(@RequestBody User user) {
		LOG.info("Insides howHome() ");
		return user;
	}
}
