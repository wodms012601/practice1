// 2018.10.02 28기 전재현
package com.cafe24.iumium.generalaffairs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.iumium.generalaffairs.dao.VacationDao;
import com.cafe24.iumium.generalaffairs.dto.VacationDto;

@Service
@Transactional
public class VacationService {

	@Autowired
	private VacationDao vacationDao;
	
	// 휴가 리스트
	public List<VacationDto> selectVacationList() {
		System.out.println("Service-selectVacationList()");
		
		return vacationDao.selectVacationList();
	}
}
