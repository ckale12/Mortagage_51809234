package com.mortagage.mortagage.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.mortagage.mortagage.Entity.LoanOffer;
import com.mortagage.mortagage.Entity.PINPropertyValue;
import com.mortagage.mortagage.Entity.User;
import com.mortagage.mortagage.repository.LoanOfferRepository;
import com.mortagage.mortagage.repository.PinPropValueRepository;
import com.mortagage.mortagage.repository.RegistrationRepository;

@Service
public class LoanOfferService {

	@Autowired
	LoanOfferRepository loanOfferRepository;
	
	@Autowired
	PinPropValueRepository pinPropValueRepository;
	
	@Autowired
	RegistrationRepository registrationRepository;
	
	/**This method used to check laon offers applicable for passed user
	 * @param user is used to get
	 * @return
	 * @throws Exception 
	 */
	public List<LoanOffer> checkLoanOffer(User user) throws Exception {
		
		registrationRepository.save(user);
		 
	    PINPropertyValue pinData =pinPropValueRepository.findByPinNo(user.getPinNo());
	   
	    if (user.getPropArea()*pinData.getPropValue()<500000)
	    	throw new Exception("User is not eligible");
	    	
		long userLoanAmount =(long) (0.8*(user.getPropArea()*pinData.getPropValue()));
		
		List<LoanOffer> loanOfferList=loanOfferRepository.findByLoanAmount(userLoanAmount);
		
		return loanOfferList;
		
	}

	
}
