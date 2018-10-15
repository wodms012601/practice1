package com.cafe24.iumium.common.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.iumium.common.dao.CommonCodeDao;
import com.cafe24.iumium.common.dto.BuildingCode;
import com.cafe24.iumium.common.dto.CountryCode;
import com.cafe24.iumium.common.dto.DepartmentCode;
import com.cafe24.iumium.common.dto.JobGroupCode;
import com.cafe24.iumium.common.dto.JobPositionCode;
import com.cafe24.iumium.common.dto.JobRankCode;
import com.cafe24.iumium.common.dto.JobTypeCode;
import com.cafe24.iumium.common.dto.RoomCode;
import com.cafe24.iumium.common.dto.TeamCode;
import com.cafe24.iumium.common.dto.OrganizationCode;
import com.cafe24.iumium.common.dto.AgencyCode;

@Service
@Transactional
public class CommonCodeService {
	@Autowired
	private CommonCodeDao commonCodeDao;

	
//공통코드 리스트 service
	
	
	// 모든 직군 코드 리스트
	public List<JobGroupCode> selectAllJobGroupCodes(){ 
		return commonCodeDao.selectAllJobGroupCodes();
	}
	
	// 모든 직종 코드 리스트
	public List<JobTypeCode> selectAllJobTypeCodes(){ 
		return commonCodeDao.selectAllJobTypeCodes();
	}
	
	// 모든 직급 코드 리스트
	public List<JobRankCode> selectAllJobRankCodes(){ 
		return commonCodeDao.selectAllJobRankCodes();
	}
	
	// 모든 직위 코드 리스트
	public List<JobPositionCode> selectAllJobPositionCodes(){ 
		return commonCodeDao.selectAllJobPositionCodes();
	}
	
	// 모든 건물 코드 리스트
	public List<BuildingCode> selectAllBuildingCodes(){ 
		return commonCodeDao.selectAllBuildingCodes();
	}
	
	// 모든 강의실 코드 리스트
	public List<RoomCode> selectAllRoomCodes(){ 
		return commonCodeDao.selectAllRoomCodes();
	}
	
	// 모든 국가 코드 리스트
	public List<CountryCode> selectAllCountryCodes(){ 
		return commonCodeDao.selectAllCountryCodes();
	}

	// 직군 코드 추가
	public int addJobGroupCodeAction(JobGroupCode jobGroupCode, String recordId){ 
		jobGroupCode.setRecordId(recordId);
		return commonCodeDao.addJobGroupCodeAction(jobGroupCode);
	}
	
	// 모든 기관 코드 리스트
	public List<AgencyCode> selectAllAgencyCodes() {
        return commonCodeDao.selectAllAgencyCodes();
    }	
	
	// 모든 기구 코드 리스트
	public List<OrganizationCode> selectAllOrganizationCodes() {
        return commonCodeDao.selectAllOrganizationCodes();
    }
	
	// 모든 부서 코드 리스트 
	public List<DepartmentCode> selectAllDepartmentCodes() {
        return commonCodeDao.selectAllDepartmentCodes();
	}
	
	// 모든 팀 코드 리스트
	public List<TeamCode> addTeamCodeForm(){
		return commonCodeDao.addTeamCodeForm();
	}
	
	
	
//공통코드 입력처리, selectBox 데이터 조회 service	
	
	// 모든 직군명, 코드 리스트
	public List<JobTypeCode> addJobTypeCodesForm(){ 
		return commonCodeDao.addJobTypeCodesForm();
	}
	
	// 직종 코드 추가
	public int addJobTypeCodesAction(JobTypeCode jobTypeCode, String recordId){ 
		jobTypeCode.setRecordId(recordId);
		return commonCodeDao.addJobTypeCodesAction(jobTypeCode);
	}
	
	// 모든 직군코드, 직종코드, 직종명 리스트
	public List<JobRankCode> addJobRankCodesForm(){ 
		return commonCodeDao.addJobRankCodesForm();
	}
	
	// 직급 코드 추가
	public int addJobRankCodesAction(JobRankCode jobRankCode, String recordId){ 
		jobRankCode.setRecordId(recordId);
		String code = jobRankCode.getJobTypeCode();
        int idx = code.indexOf(":"); 
        String jobG = code.substring(0, idx);
        String jobT = code.substring(idx+1);
        jobRankCode.setJobGroupCode(jobG);
        jobRankCode.setJobTypeCode(jobT);
		return commonCodeDao.addJobRankCodesAction(jobRankCode);
	}
	
	// 직위 코드 추가
	public int addJobPositionCodesAction(JobPositionCode jobPositionCode, String recordId){ 
		jobPositionCode.setRecordId(recordId);
		return commonCodeDao.addJobPositionCodesAction(jobPositionCode);
	}
	
	// 건물 코드 입력 폼 select box 기관코드
	public List<BuildingCode> addBuildingCodesForm(){ 
		return commonCodeDao.addBuildingCodesForm();
	}
	
	// 건물 코드 추가
	public int addBuildingCodesAction(BuildingCode buildingCode, String recordId){ 
		buildingCode.setRecordId(recordId);
		return commonCodeDao.addBuildingCodesAction(buildingCode);
	}
	
	// 강의실 코드 입력 폼 select box 건물코드
	public List<RoomCode> addRoomCodesForm(){ 
		return commonCodeDao.addRoomCodesForm();
	}
	
	// 강의실 코드 추가
	public int addRoomCodesAction(RoomCode roomCode, String recordId){ 
		roomCode.setRecordId(recordId);
		return commonCodeDao.addRoomCodesAction(roomCode);
	}
	
	// 국가 코드 추가
	public int addCountryCodesAction(CountryCode countryCode, String recordId){
		countryCode.setRecordId(recordId);
		return commonCodeDao.addCountryCodesAction(countryCode);
	}
	
	// 기관 코드 추가 
	public int AddAgencyCodes(AgencyCode agencyCode, String recordId) {
	    agencyCode.setRecordId(recordId);
		return commonCodeDao.AddAgencyCodes(agencyCode);
	}
	
	// 모든 기관 코드, 이름 리스트
	public List<OrganizationCode> selectAllAgencyName() {
        return commonCodeDao.selectAllAgencyName();
    }
	
	// 기구 코드 추가  
	public int AddOrgCodeAction(OrganizationCode orgCode, String recordId) {
		orgCode.setRecordId(recordId);
		return commonCodeDao.AddOrgCodeAction(orgCode);
	}
	
	// 모든 기구코드, 이름, 기관 코드 리스트
	public List<DepartmentCode> selectAllOrgName() {
        return commonCodeDao.selectAllOrgName();
	}
	
	// 모든 기구코드, 이름, 기관 코드 리스트
	public int addDeptCodeAction(DepartmentCode deptCode, String recordId) {
		deptCode.setRecordId(recordId);
		String code = deptCode.getOrgCode();
        int idx = code.indexOf(":"); 
        String orgCode = code.substring(0, idx);
        String agency = code.substring(idx+1);
		deptCode.setAgencyCode(agency);
		deptCode.setOrgCode(orgCode);
		return commonCodeDao.addDeptCodeAction(deptCode);
	}
	
	// 모든 부서코드, 부서명, 기구코드, 기관코드 리스트
	public List<TeamCode> selectAllTeamCodes(){
		return commonCodeDao.selectAllTeamCodes();
	}

	// 팀 코드 추가
	public int addTeamCodeAction(TeamCode teamCode, String recordId){
		teamCode.setRecordId(recordId);
		String code = teamCode.getDeptCode();
		int idx = code.indexOf(":");
		int idx2 = code.indexOf("?");
		String agencyCode = code.substring(0, idx);
		String orgCode = code.substring(idx+1, idx2);
		String deptCode = code.substring(idx2+1);
		
		teamCode.setAgencyCode(agencyCode);
		teamCode.setOrgCode(orgCode);
		teamCode.setDeptCode(deptCode);
		return commonCodeDao.addTeamCodeAction(teamCode);
	}
}
