package com.mortagage.mortagage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mortagage.mortagage.Entity.LoanOffer;

@Repository
public interface LoanOfferRepository extends JpaRepository<LoanOffer,Integer>{

	@Query(value="select * from loan_offer where loan_amount<= :userLoanAmount", nativeQuery=true)
	List<LoanOffer> findByLoanAmount(long userLoanAmount);

}
