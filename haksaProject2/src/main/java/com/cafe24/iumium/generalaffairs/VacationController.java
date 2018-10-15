// 2018.10.02 28기 전재현
package com.cafe24.iumium.generalaffairs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cafe24.iumium.generalaffairs.dto.VacationDto;
import com.cafe24.iumium.generalaffairs.service.VacationService;

@Controller
public class VacationController {

	@Autowired
	private VacationService vacationService;
	
	// 리스트 이동
		@RequestMapping(value="/personnel/generalAffairsManagement/vacation/listVacation", method = RequestMethod.GET)
		public String vacationList(Model model) {
			System.out.println("Controller-vacationList()");
			
			List<VacationDto> vacationList = vacationService.selectVacationList();
			
			model.addAttribute("vacationList" ,vacationList);
			
			return "personnel/generalAffairsManagement/vacation/listVacation";
		}
}
