// 2018.10.01 28기 전재현
package com.cafe24.iumium.generalaffairs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cafe24.iumium.generalaffairs.dto.VehicleDto;
import com.cafe24.iumium.generalaffairs.service.VehicleService;

@Controller
public class VehicleController {

	@Autowired
	private VehicleService vehicleService;
	
	// 리스트 이동
	@RequestMapping(value="/personnel/generalAffairsManagement/vehicle/listVehicle", method = RequestMethod.GET)
	public String vehicleList() {
		
		return "personnel/generalAffairsManagement/vehicle/listVehicle";
	}
	
	// 검색 리스트 출력
	@RequestMapping(value="/personnel/generalAffairsManagement/vehicle/selectVehicleList", method = RequestMethod.GET)
	public String selectVehicleList(Model model ,String ApprovalStatus) {
		System.out.println("controller-ApprovalStatus  : " +ApprovalStatus);
		
		List<VehicleDto> vehicleList = vehicleService.vehicleList();

		model.addAttribute("vehicleList" ,vehicleList);
		
		return "personnel/generalAffairsManagement/vehicle/listVehicle";
	}
}
