// 2018.10.01 28기 전재현
package com.cafe24.iumium.generalaffairs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cafe24.iumium.generalaffairs.dto.HolidayDto;
import com.cafe24.iumium.generalaffairs.service.HolidayService;

@Controller
public class HolidayController {
	
	@Autowired
	private HolidayService holidayService;
	
	// 휴일 리스트 출력
	@RequestMapping(value="/personnel/generalAffairsManagement/holiday/listHoliday", method = RequestMethod.GET)
	public String holidayList(Model model) {
		
		List<HolidayDto> holidayList = holidayService.holidayList();
		
		model.addAttribute("holidayList", holidayList);
		
		return "personnel/generalAffairsManagement/holiday/listHoliday";
	}
}
