package com.mortagage.mortagage.controller;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mortagage.mortagage.Entity.LoanOffer;
import com.mortagage.mortagage.Entity.User;
import com.mortagage.mortagage.service.LoanOfferService;

@RestController
public class LoanOfferController {

    @Autowired
	LoanOfferService loanOfferService;
    
    /**This method is used to loan offers available for particular user
     * @param user is used to check loan offer
     * @return is returning list of loan offers applicable for passed user
     * @throws Exception
     */
    @PostMapping("/checkLoanOffer")
	public ResponseEntity<List<LoanOffer>> checkLoanOffer(@RequestBody User user) throws Exception{
    	
    	if(user.getDob()==null&& user.getGender()==null&&user.getName()==null&&user.getPanNo()==null&&
				user.getPinNo()==null&&user.getPropAddress()==null&&Objects.isNull(user.getPropArea())&&
				Objects.isNull(user.getSalalry()))
			throw new Exception("Please provide all details");
    	
	    Period diff= Period.between(user.getDob(),LocalDate.now());
    	int age = diff.getYears();
    	  
    	 if(age<25)
    		throw new Exception("Age should be greater than or equal to 25");
    	
         if(user.getSalalry()<=10000)
    		throw new Exception("salary should be greater than 10,000");
    	
    return new ResponseEntity<List<LoanOffer>>(loanOfferService.checkLoanOffer(user),HttpStatus.OK);
    	
	}
}
