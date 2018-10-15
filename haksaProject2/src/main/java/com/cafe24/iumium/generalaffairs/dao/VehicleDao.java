// 2018.10.02 28기 전재현
package com.cafe24.iumium.generalaffairs.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.iumium.generalaffairs.dto.VehicleDto;

@Repository
public class VehicleDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	final String nameSpace = "com.cafe24.iumium.generalaffairs.dao.VehicleMapper.";
	
	// 차량 리스트 
	public List<VehicleDto> selectVehicleList() {
		System.out.println("VehicleDao-selectVehicleList()");
		
		return sqlSessionTemplate.selectList(nameSpace +"selectVehicleList");
	}
}
