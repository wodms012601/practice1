package com.cafe24.iumium;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cafe24.iumium.common.dto.BuildingCode;
import com.cafe24.iumium.common.dto.CountryCode;
import com.cafe24.iumium.common.dto.DepartmentCode;
import com.cafe24.iumium.common.dto.JobGroupCode;
import com.cafe24.iumium.common.dto.JobPositionCode;
import com.cafe24.iumium.common.dto.JobRankCode;
import com.cafe24.iumium.common.dto.JobTypeCode;
import com.cafe24.iumium.common.dto.RoomCode;
import com.cafe24.iumium.common.dto.TeamCode;
import com.cafe24.iumium.common.service.CommonCodeService;
import com.cafe24.iumium.common.dto.OrganizationCode;
import com.cafe24.iumium.common.dto.AgencyCode;


@Controller
public class CommonCodeController {
	@Autowired
	private CommonCodeService commonCodeService;
	
	//공통 코드 리스트 Controller	
	
		// 기관코드 관리
		@RequestMapping(value="/common/codes/agency", method = RequestMethod.GET)
	    public String AgencyList(Model model) {
	        List<AgencyCode> list = commonCodeService.selectAllAgencyCodes();
	        
	        //객체 내부에 기관 코드 리스트 저장
	        model.addAttribute("list", list);
	        
	        return "commonCode/agencyCode";
	    }
		
		// 기구코드 관리
		@RequestMapping(value="/common/codes/organization", method = RequestMethod.GET)
	    public String OrgList(Model model) {
	        List<OrganizationCode> list = commonCodeService.selectAllOrganizationCodes();
	       
	        //객체 내부에 기구 코드 리스트 저장
	        model.addAttribute("list", list);
	        
	        return "commonCode/organizationCode";
	    }
		
		// 부서코드 관리
		@RequestMapping(value="/common/codes/department", method = RequestMethod.GET)
	    public String DeptList(Model model) {
	        List<DepartmentCode> list = commonCodeService.selectAllDepartmentCodes();
	       
	        //객체 내부에 부서 코드 리스트 저장
	        model.addAttribute("list", list);
	        
	        return "commonCode/departmentCode";
	    }
		
		// 팀코드 관리
		@RequestMapping(value="/common/codes/teamCode", method = RequestMethod.GET)
	    public String TeamList(Model model) {
	        List<TeamCode> list = commonCodeService.selectAllTeamCodes();
	        
	        //객체 내부에 팀 코드 리스트 저장
	        model.addAttribute("list", list);
	        
	        return "commonCode/teamCode";
	    }
		
		// 직군코드 관리
		@RequestMapping(value="/common/codes/jobGroup", method=RequestMethod.GET)
		public String getAllJobGroubCodes(Model model) {
			List<JobGroupCode> jobGroupCodes = commonCodeService.selectAllJobGroupCodes();
			
			// 직군 코드 model 객체 내부에 저장
			model.addAttribute("jobGroupCodes", jobGroupCodes);
			
			return "commonCode/jobGroupCode";
		}
		
		// 직종코드 관리
		@RequestMapping(value="/common/codes/jobType", method=RequestMethod.GET)
		public String getAllJobTypeCodes(Model model) {
			List<JobTypeCode> jobTypeCodes = commonCodeService.selectAllJobTypeCodes();
			
			// 직종 코드 model 객체 내부에 저장
			model.addAttribute("jobTypeCodes", jobTypeCodes);
			
			return "commonCode/jobTypeCode";
		}
		
		// 직급코드 관리
		@RequestMapping(value="/common/codes/jobRank", method=RequestMethod.GET)
		public String getAllJobRankCodes(Model model) {
			List<JobRankCode> JobRankCodes = commonCodeService.selectAllJobRankCodes();
			
			// 직급 코드 model 객체 내부에 저장
			model.addAttribute("jobRankCodes", JobRankCodes);
			
			return "commonCode/jobRankCode";
		}
		
		// 직위코드 관리
		@RequestMapping(value="/common/codes/jobPosition", method=RequestMethod.GET)
		public String getAllJobPositionCodes(Model model) {
			List<JobPositionCode> jobPositionCodes = commonCodeService.selectAllJobPositionCodes();
			
			// 직위 코드 model 객체 내부에 저장
			model.addAttribute("jobPositionCodes", jobPositionCodes);
			
			return "commonCode/jobPositionCode";
		}
		
		// 건물코드 관리
		@RequestMapping(value="/common/codes/building", method=RequestMethod.GET)
		public String getAllBuildingCodes(Model model) {
			List<BuildingCode> buildingCodes = commonCodeService.selectAllBuildingCodes();
			
			// 건물 코드 model 객체 내부에 저장
			model.addAttribute("buildingCodes", buildingCodes);
			
			return "commonCode/buildingCode";
		}
		
		// 강의실코드 관리
		@RequestMapping(value="/common/codes/room", method=RequestMethod.GET)
		public String getAllRoomCodes(Model model) {
			List<RoomCode> roomCodes = commonCodeService.selectAllRoomCodes();
			
			// 강의실 코드 model 객체 내부에 저장
			model.addAttribute("roomCodes", roomCodes);
			
			return "commonCode/roomCode";
		}
		
		// 국가코드 관리
		@RequestMapping(value="/common/codes/country", method=RequestMethod.GET)
		public String getAllCountryCodes(Model model) {
			List<CountryCode> countryCodes = commonCodeService.selectAllCountryCodes();
			
			model.addAttribute("countryCodes", countryCodes);
			
			return "commonCode/countryCode";
		}
		
		

		
		
	//공통 코드 입력 처리 Controller
		
		// 기관코드 입력 폼 이동 관리
		@RequestMapping(value="/common/codes/addAgencyCodeForm", method = RequestMethod.GET)
	    public String AddAgencyCodeForm(Model model) {
			return "commonCode/form/addAgencyCodeForm";
	    }
		
		// 기관코드 입력 처리 관리
		@RequestMapping(value="/common/codes/addAgencyCodeAction", method = RequestMethod.POST)
	    public String AddAgencyCodeAction(AgencyCode agencyCode, HttpSession session) {
			String sessionId = (String) session.getAttribute("userId");
			commonCodeService.AddAgencyCodes(agencyCode, sessionId);
			return "redirect:/common/codes/agency";
	    }
		
		// 기구코드 입력 폼 이동 관리
		@RequestMapping(value="/common/codes/addOrganizationCodeForm", method = RequestMethod.GET)
	    public String AddOrgCodeForm(Model model) {
	        List<OrganizationCode> list = commonCodeService.selectAllAgencyName();
	       
	        //객체 내부에 뽑아온 기관 코드, 이름 리스트 저장.
	        model.addAttribute("list", list);
	        
	        return "commonCode/form/addOrganizationCodeForm";
	    }
		
		// 기구코드 입력 처리 관리
		@RequestMapping(value="/common/codes/addOrganizationCodeAction", method = RequestMethod.POST)
	    public String AddOrgCodeAction(OrganizationCode orgCode, HttpSession session) {
			String sessionId = (String) session.getAttribute("userId");
			commonCodeService.AddOrgCodeAction(orgCode, sessionId);
			return "redirect:/common/codes/organization";
	    }
		
		// 부서코드 입력 폼 이동 관리
		@RequestMapping(value="/common/codes/addDepartmentCodeForm", method = RequestMethod.GET)
	    public String AddDeptCodeForm(Model model) {
	    List<DepartmentCode> list = commonCodeService.selectAllOrgName();
	       
	        //객체 내부에 뽑아온 기구코드, 기구명, 기관코드 리스트에 저장.
	        model.addAttribute("list", list);
	        
	        return "commonCode/form/addDepartmentCodeForm";
	    }
		
		// 부서코드 입력 처리 관리
		@RequestMapping(value="/common/codes/addDepartmentCodeAction", method = RequestMethod.POST)
	    public String addDeptCodeAction(DepartmentCode deptCode, HttpSession session) {
			String sessionId = (String) session.getAttribute("userId");
			commonCodeService.addDeptCodeAction(deptCode, sessionId);
	        return "redirect:/common/codes/department";
	    }
		
		// 팀 코드 입력 폼 이동 관리
		@RequestMapping(value="/common/codes/addTeamCodeForm", method = RequestMethod.GET)
	    public String addTeamCodeForm(Model model) {
	    List<TeamCode> list = commonCodeService.addTeamCodeForm();
	       
	        //객체 내부에 뽑아온 부서코드, 부서명, 기구코드, 기관코드 리스트에 저장.
	        model.addAttribute("list", list);
	        
	        return "commonCode/form/addTeamCodeForm";
	    }
		
		// 팀 코드 입력 처리 관리
		@RequestMapping(value="/common/codes/addTeamCodeAction", method = RequestMethod.POST)
	    public String addTeamCodeAction(TeamCode teamCode, HttpSession session) {
			String sessionId = (String) session.getAttribute("userId");
			commonCodeService.addTeamCodeAction(teamCode, sessionId);
	        
	        return "redirect:/common/codes/teamCode";
	    }
		
		// 직군코드 입력 폼 이동 관리
		@RequestMapping(value="/common/codes/addJobGroupForm", method=RequestMethod.GET)
		public String addJobGroubCodesForm(Model model) {
			
			return "commonCode/form/addJobGroupCodeForm";
		}
		
		// 직군코드 입력 처리 관리
		@RequestMapping(value="/common/codes/addJobGroupCodeAction", method=RequestMethod.POST)
		public String addJobGroubCodeAction(JobGroupCode jobGroupCode, HttpSession session) {
			String sessionId = (String) session.getAttribute("userId");
			commonCodeService.addJobGroupCodeAction(jobGroupCode, sessionId);
			
			return "redirect:/common/codes/jobGroup";
		}
		
		// 직종코드 입력 폼 이동 관리
		@RequestMapping(value="/common/codes/addJobTypeCodeForm", method=RequestMethod.GET)
		public String addJobTypeCodesForm(Model model) {
			List<JobTypeCode> jobTypeCodes = commonCodeService.addJobTypeCodesForm();
			
			// 직종 코드 model 객체 내부에 저장
			model.addAttribute("list", jobTypeCodes);
			
			return "commonCode/form/addJobTypeCodeForm";
		}
		
		// 직종코드 입력 처리 관리
		@RequestMapping(value="/common/codes/addJobTypeCodeAction", method=RequestMethod.POST)
		public String addJobTypeCodesAction(JobTypeCode jobTypeCode, HttpSession session) {
			String sessionId = (String) session.getAttribute("userId");
			commonCodeService.addJobTypeCodesAction(jobTypeCode, sessionId);
			
			return "redirect:/common/codes/jobType";
		}
		
		// 직급코드 입력 폼 이동 관리
		@RequestMapping(value="/common/codes/addJobRankCodeForm", method=RequestMethod.GET)
		public String addJobRankCodesForm(Model model) {
			List<JobRankCode> JobRankCodes = commonCodeService.addJobRankCodesForm();
			
			// 직급 코드 model 객체 내부에 저장
			model.addAttribute("list", JobRankCodes);
			
			return "commonCode/form/addJobRankCodeForm";
		}
		
		// 직급코드 입력 폼 이동 관리
		@RequestMapping(value="/common/codes/addJobRankCodeAction", method=RequestMethod.POST)
		public String addJobRankCodesAction(JobRankCode jobRankCode, HttpSession session) {
			String sessionId = (String) session.getAttribute("userId");
			commonCodeService.addJobRankCodesAction(jobRankCode, sessionId);
			
			return "redirect:/common/codes/jobRank";
		}
		
		// 직위코드 입력 폼 이동 관리
		@RequestMapping(value="/common/codes/addJobPositionCodeForm", method=RequestMethod.GET)
		public String addJobPositionCodesForm(Model model) {
			
			return "commonCode/form/addJobPositionCodeForm";
		}
		
		// 직위코드 입력 처리 관리
		@RequestMapping(value="/common/codes/addJobPositionCodeAction", method=RequestMethod.POST)
		public String addJobPositionCodesAction(JobPositionCode jobPositionCode, HttpSession session) {
			String sessionId = (String) session.getAttribute("userId");
			commonCodeService.addJobPositionCodesAction(jobPositionCode, sessionId);
			return "redirect:/common/codes/jobPosition";
		}
		
		// 건물코드 입력 폼 이동 관리
		@RequestMapping(value="/common/codes/addBuildingCodeForm", method=RequestMethod.GET)
		public String addBuildingCodesForm(Model model) {
			List<BuildingCode> buildingCodes = commonCodeService.addBuildingCodesForm();
			
			// 건물 코드 model 객체 내부에 저장
			model.addAttribute("list", buildingCodes);
			
			return "commonCode/form/addBuildingCodeForm";
		}
		
		// 건물코드 입력 처리 관리
		@RequestMapping(value="/common/codes/addBuildingCodeAction", method=RequestMethod.POST)
		public String addBuildingCodesAction(BuildingCode buildingCode, HttpSession session) {
			String sessionId = (String) session.getAttribute("userId");
			commonCodeService.addBuildingCodesAction(buildingCode, sessionId);
			
			return "redirect:/common/codes/building";
		}
		
		// 강의실코드 입력 폼 이동 관리
		@RequestMapping(value="/common/codes/addRoomCodeForm", method=RequestMethod.GET)
		public String addRoomCodesForm(Model model) {
			List<RoomCode> roomCodes = commonCodeService.addRoomCodesForm();
			
			// 강의실 코드 model 객체 내부에 저장
			model.addAttribute("list", roomCodes);
			
			return "commonCode/form/addRoomCodeForm";
		}
		
		// 강의실코드 입력 처리 관리
		@RequestMapping(value="/common/codes/addRoomCodeAction", method=RequestMethod.POST)
		public String addRoomCodesAction(RoomCode roomCode, HttpSession session) {
			String sessionId = (String) session.getAttribute("userId");
			commonCodeService.addRoomCodesAction(roomCode, sessionId);
			
			return "redirect:/common/codes/room";
		}
		
		// 국가코드 입력 폼 이동 관리
		@RequestMapping(value="/common/codes/addCountryCodeForm", method=RequestMethod.GET)
		public String addCountryCodesForm(Model model) {
			
			return "commonCode/form/addCountryCodeForm";
		}
		
		// 국가코드 입력 처리 관리
		@RequestMapping(value="/common/codes/addCountryCodeAction", method=RequestMethod.POST)
		public String addCountryCodesAction(CountryCode countyCode, HttpSession session) {
			String sessionId = (String) session.getAttribute("userId");
			commonCodeService.addCountryCodesAction(countyCode, sessionId);
			
			return "redirect:/common/codes/country";
		}
}
