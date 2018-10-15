// 2018.10.01 28기 전재현
package com.cafe24.iumium.generalaffairs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.iumium.generalaffairs.dao.HolidayDao;
import com.cafe24.iumium.generalaffairs.dto.HolidayDto;


@Service
@Transactional
public class HolidayService {

	@Autowired
	private HolidayDao holidayDao;
	
	// 리스트 출력
	public List<HolidayDto> holidayList() {
		
		return holidayDao.selectHolidayList();
	}
}
