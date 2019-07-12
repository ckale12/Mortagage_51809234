package com.mortagage.mortagage.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mortagage.mortagage.Entity.PINPropertyValue;

@Repository
public interface PinPropValueRepository  extends JpaRepository<PINPropertyValue, Integer>{

	PINPropertyValue findByPinNo(String userPinNum);

}
