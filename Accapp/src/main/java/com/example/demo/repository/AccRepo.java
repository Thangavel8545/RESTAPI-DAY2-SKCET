package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.AccEntity;


import jakarta.transaction.Transactional;

public interface AccRepo extends JpaRepository<AccEntity, Integer> {

	
	@Query(value="select * from billpro where custid=:s ",nativeQuery=true)
	public List<AccEntity> getBillInfo(@Param("s") int custid);
	
	
	@Modifying
	@Transactional
	@Query(value="delete from billpro where billno=:s",nativeQuery=true)
	public int deleteBillInfo(@Param("s") int billno);
	
	@Modifying
	@Transactional
	@Query(value="update billpro set buyer=?1 where buyer=?2",nativeQuery = true)
	public int updateBillInfo(String oldbuyer,String newbuyer);
}
