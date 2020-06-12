package com.employee.detail.map;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.detail.entity.Empoyee_Contact;

@Repository
public interface Emp_Repository extends CrudRepository<Empoyee_Contact,Integer>{
	
List<Empoyee_Contact> findByeId(int eid);
List<Empoyee_Contact> findByEMobileNoandeId(String eMobNo,String eId);

}
