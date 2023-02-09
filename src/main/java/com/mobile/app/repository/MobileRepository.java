package com.mobile.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobile.app.entity.Mobile;

public interface MobileRepository extends JpaRepository<Mobile, Integer>{

	public List<Mobile>findByMobileName(String mobileName);
	
	public List<Mobile>findByMobileCost(Double cost);
	
	public List<Mobile>findByModelNumber(String modelNumber);
	
	public List<Mobile>findByCompanyName(String companyName);
}
