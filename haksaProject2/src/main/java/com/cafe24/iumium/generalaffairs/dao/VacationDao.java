// 2018.10.02 28기 전재현
package com.cafe24.iumium.generalaffairs.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.iumium.generalaffairs.dto.VacationDto;

@Repository
public class VacationDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	final String nameSpace = "com.cafe24.iumium.generalaffairs.dao.VacationMapper.";
	
	// 휴가 리스트 출력
	public List<VacationDto> selectVacationList() {
		System.out.println("vacationDao-selectVacationList()");
		
		return sqlSessionTemplate.selectList(nameSpace +"selectVacationList");
	}
}
