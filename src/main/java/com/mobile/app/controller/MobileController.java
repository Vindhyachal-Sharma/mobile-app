package com.mobile.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.app.entity.Mobile;
import com.mobile.app.exception.CategoryNotFoundException;
import com.mobile.app.exception.MobileNotFoundException;
import com.mobile.app.service.MobileService;

@RestController
@CrossOrigin("*")
public class MobileController {

	@Autowired
	private MobileService mobileService;

	

	@GetMapping("/mobiles/{id}")
	public Mobile getMobileById(@PathVariable("id") Integer id) throws MobileNotFoundException {

		return mobileService.getMobileById(id);
	}

	@GetMapping("/mobiles")
	public List<Mobile> getAllMobiles() {
		return mobileService.getAllMobiles();
	}

	@GetMapping("/mobile/name/{mobileName}")
	public List<Mobile> getMobilesByName(@PathVariable("mobileName") String mobileName) throws MobileNotFoundException {
		return mobileService.getMobilesByName(mobileName);
	}

	@GetMapping("/mobile/cost/{cost}")
	public List<Mobile> getMobilesByPrice(@PathVariable("cost") Double cost) throws MobileNotFoundException {
		return mobileService.getMobilesByMobileCost(cost);
	}

	@GetMapping("/mobile/model/{modelNumber}")
	public List<Mobile> getMobilesByModelNumber(@PathVariable("modelNumber") String modelNumber)
			throws MobileNotFoundException {
		return mobileService.getMobilesByModelNumber(modelNumber);
	}

	@GetMapping("/mobile/company/{companyName}")
	public List<Mobile> getMobilesByCompanyName(@PathVariable("companyName") String companyName)
			throws MobileNotFoundException {
		return mobileService.getMobilesByCompanyName(companyName);
	}
//
//	@GetMapping("/mobile/company/{categoryId}")
//	public List<Mobile> getMobilesByCategoryId(@PathVariable("categoryId") Integer categoryId)
//			throws MobileNotFoundException, CategoryNotFoundException {
//		return mobileService.getMobilesByCategoryId(categoryId);
//	}

//	@PostMapping("/mobile/{categoryId}")
//	public Mobile addMobileByCategory(@Valid @RequestBody Mobile mobile, @PathVariable("categoryId") Integer categoryId)
//			throws CategoryNotFoundException {
//		return mobileService.addMobileToCategoryByCategoryId(mobile, categoryId);
//	}

//	@PutMapping("/mobile")
//	public String updateMobileDetails(@Valid @RequestBody Mobile mobile) throws MobileNotFoundException {
//
//		return mobileService.updateMobileDetails(mobile);
//	}

//	@DeleteMapping("/mobile/{mobileId}")
//	public String deleteMobileById( @RequestBody Integer categoryId, @PathVariable("mobileId") Integer mobileId)
//			throws MobileNotFoundException, CategoryNotFoundException {
//
//		return this.categoryService.removeMobileFromCategoryById(categoryId, mobileId);
//	}
}
