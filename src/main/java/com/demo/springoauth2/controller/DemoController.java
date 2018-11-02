package com.demo.springoauth2.controller;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mkarki
 */
@Controller
public class DemoController {
	Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

	@RequestMapping("/user")
	public Principal user(Principal principal) {
		LOGGER.info("the logged in user will be sent");
		return principal;
	}

}
