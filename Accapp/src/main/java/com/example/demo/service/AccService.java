package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AccEntity;

import com.example.demo.repository.AccRepo;

@Service
public class AccService {
    
	@Autowired
	AccRepo sr;
	
	public AccEntity saveInfo(AccEntity ss)
	{
		return sr.save(ss);
	}
	public List<AccEntity> savedetails(List<AccEntity> ss)
    {
    	return (List<AccEntity>)sr.saveAll(ss);
    }
	public List<AccEntity> showInfo()
	{
		return sr.findAll();
	}
	public AccEntity changeInfo(AccEntity ss)
    {
    	return sr.saveAndFlush(ss);
    }
    public void deleteInfo(AccEntity ss)
    {
    	sr.delete(ss);
    }
    public void deleteid(int custid)
    {
    	sr.deleteById(custid);
    }
}
