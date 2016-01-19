package com.tbs.ecm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.tbs.ecm.service.UserService;
import com.tbs.ecm.util.EncDecRest;
import com.tbs.ecm.vo.UserRestTJVO;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping("/hello")
	public ModelAndView getUser() {
		ModelAndView mv = new ModelAndView("helloworld");
		return mv;
	}

	@RequestMapping("/loginIdOrEmail")
	public UserRestTJVO getUserByLoginId(@RequestParam String loginId,
			@RequestParam String source) {
		loginId = EncDecRest.decrypt(loginId);
		return userService.getUserByLoginIdOrEmail(loginId);

	}

	@RequestMapping(value = "/loginSrlNo")
	public UserRestTJVO getUserBySerialNo(@RequestParam String loginSrlNo,
			@RequestParam String source) {
		Long loginSrNo = Long.valueOf(EncDecRest.decrypt(loginSrlNo));
		return userService.getUser(loginSrNo);
	}

	@RequestMapping(value = "/email3AndAgent")
	public UserRestTJVO getUserByEmailAndAgent(@RequestParam String email3,
			@RequestParam String agent, @RequestParam String source) {
		email3 = EncDecRest.decrypt(email3);
		agent = EncDecRest.decrypt(agent);
		return userService.getUserByEmailAndAgent(email3, agent);
	}

	@RequestMapping(value = "/updatePremiumExpDate")
	public Boolean updateUserPremiumExpDate(@RequestParam String loginId,
			@RequestParam String source) {
		loginId = EncDecRest.decrypt(loginId);
		return userService.updateUserPremiumExpDate(loginId);
	}
}
