package com.padrao.spring.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.padrao.spring.entities.Account;

@Controller
@RequestMapping(value="account")
public class AccountController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		Account conta = new Account();
		conta.setUsername("acc1");
		conta.setFullname("Conta Geral");
		conta.setBirthday(new Date());
		modelMap.put("account", conta);
		return "account/index";
	}
	
	@RequestMapping(value="save", method = RequestMethod.POST)
	public String save(@ModelAttribute("account") Account account, ModelMap modelMap) {
		modelMap.put("account", account);
		return "account/success";
	}
	
}
