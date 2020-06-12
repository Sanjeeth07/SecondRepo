package com.employee.detail.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.detail.entity.Empoyee_Contact;
import com.employee.detail.service.Emp_Service;

@RestController
public class Emp_Controller {
	@Autowired
	private Emp_Service emp_Service;
	
	@GetMapping("/getallempvalues")
	public ResponseEntity<List<Empoyee_Contact>> getAllEmp()
	{
		System.out.println("HI");
		return Optional.ofNullable(emp_Service.getAllEmp())
				.map(emp->new ResponseEntity<>(emp,HttpStatus.OK))
				.orElse(new ResponseEntity<>(HttpStatus.BAD_REQUEST));
	}
	@PostMapping("/insertempdetails")
	public ResponseEntity<Boolean> insertEmpDetails(@RequestBody List<Empoyee_Contact> empoyee_Contact){
		return Optional.ofNullable(emp_Service.insertEmpDetails(empoyee_Contact))
				.map(val->new ResponseEntity<>(val,HttpStatus.OK))
				.orElse(new ResponseEntity<>(HttpStatus.BAD_REQUEST));
	}
	@DeleteMapping("/deletebyid/{eId}")
	public ResponseEntity<Boolean> empDelById(@PathVariable("eId") int eId)
	{
		return Optional.ofNullable(emp_Service.delByEmpId(eId))
				.map(Res->new ResponseEntity<>(Res,HttpStatus.OK))
				.orElse(new ResponseEntity<>(HttpStatus.BAD_REQUEST));
	}
	/*
	 * @PutMapping("/updatebyid") public ResponseEntity<Boolean>
	 * empUpdateByID(@RequestBody Empoyee_Contact empoyee_Contact){ return
	 * Optional.ofNullable(emp_Service.empUpdateById(empoyee_Contact)) .map(res->new
	 * ResponseEntity<>(res,HttpStatus.OK)) .orElse(new
	 * ResponseEntity<>(HttpStatus.BAD_REQUEST)); }
	 * 
	 */

}
