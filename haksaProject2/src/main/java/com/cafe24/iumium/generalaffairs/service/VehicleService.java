// 2018.10.02 28기 전재현
package com.cafe24.iumium.generalaffairs.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.iumium.generalaffairs.dao.VehicleDao;
import com.cafe24.iumium.generalaffairs.dto.VehicleDto;

@Service
@Transactional
public class VehicleService {

	private VehicleDao vehicleDao;
	
	// 리스트 출력
	public List<VehicleDto> vehicleList() {
		
		return vehicleDao.selectVehicleList();
	}
	
}
