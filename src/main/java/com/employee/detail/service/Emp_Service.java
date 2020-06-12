package com.employee.detail.service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.detail.entity.Empoyee_Contact;
import com.employee.detail.map.Emp_Repository;


@Service
public class Emp_Service {
	@Autowired
	private Emp_Repository emp_Repository;
	
	public List<Empoyee_Contact> getAllEmp()
	{List<Empoyee_Contact> empoyee=emp_Repository.findByeId(1);
		//List<Empoyee_Contact> empoyee_Contact=(List<Empoyee_Contact>) emp_Repository.findAll();
		//List<Empoyee_Contact> emp=empoyee_Contact.stream().filter(val->val.geteMobileNo().length()==10).collect(Collectors.toList());
	//	emp.forEach(obj->System.out.println(" 10 digit Mobile No"+ obj.geteId()+ obj.getEmailId()+obj.geteMobileNo()));
		//List<Empoyee_Contact> sort=empoyee_Contact.stream().sorted(Comparator.comparing(Empoyee_Contact::getEmailId)).collect(Collectors.toList());
		//sort.forEach(obj->System.out.println(obj.getEmailId()));
		empoyee.forEach(on->on.geteMobileNo());
		
				//length()==10).collect(Collectors.toList());
				//==10).collect(Collectors.toList());

		return empoyee;
	}
	
public Boolean insertEmpDetails(List<Empoyee_Contact> empoyee_Contact) {
Boolean res=false;	

	//emp_Repository.save(empoyee_Contact);
	emp_Repository.saveAll(empoyee_Contact);
//emp_Repository.save(empoyee_Contact);
res=true;
return res;
		
}
public Boolean delByEmpId(int eId)
{
	Boolean res=false;
	emp_Repository.deleteById(eId);
	return res;
}


	/*
	 * public Boolean empUpdateById(Empoyee_Contact empoyee_Contact) { Boolean
	 * res=false; Empoyee_Contact
	 * empCon=emp_Repository.findById(empoyee_Contact.geteId());
	 * empCon.setEmailId(empoyee_Contact.getEmailId());
	 * empCon.seteMobileNo(empoyee_Contact.geteMobileNo());
	 * emp_Repository.save(empCon)
	 * 
	 * res=true; return res; }
	 */
}