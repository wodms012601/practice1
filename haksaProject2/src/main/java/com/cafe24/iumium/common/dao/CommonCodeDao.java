package com.cafe24.iumium.common.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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

@Repository
public class CommonCodeDao {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	private final String nameSpace = "com.cafe24.iumium.common.dao.CommonCodeMapper.";


//공통 코드 리스트 DAO
	
	
	// 직군 코드 리스트 조회
	public List<JobGroupCode> selectAllJobGroupCodes(){
		return sqlSessionTemplate.selectList(nameSpace + "selectAllJobGroupCodes");
	}
	
	// 직종 코드 리스트 조회
	public List<JobTypeCode> selectAllJobTypeCodes(){
		return sqlSessionTemplate.selectList(nameSpace + "selectAllJobTypeCodes");
	}
	
	// 직급 코드 리스트 조회
	public List<JobRankCode> selectAllJobRankCodes(){
		return sqlSessionTemplate.selectList(nameSpace + "selectAllJobRankCodes");
	}
	
	// 직위 코드 리스트 조회
	public List<JobPositionCode> selectAllJobPositionCodes(){
		return sqlSessionTemplate.selectList(nameSpace + "selectAllJobPositionCodes");
	}
	
	// 건물 코드 리스트 조회
	public List<BuildingCode> selectAllBuildingCodes(){
		return sqlSessionTemplate.selectList(nameSpace + "selectAllBuildingCodes");
	}
	
	// 강의실 코드 리스트 조회
	public List<RoomCode> selectAllRoomCodes(){
		return sqlSessionTemplate.selectList(nameSpace + "selectAllRoomCodes");
	}
	
	// 국가 코드 리스트 조회
	public List<CountryCode> selectAllCountryCodes(){
		return sqlSessionTemplate.selectList(nameSpace + "selectAllCountryCodes");
	}
	
	//기관 코드 리스트 조회
	public List<AgencyCode> selectAllAgencyCodes() {
        return sqlSessionTemplate.selectList(nameSpace+"selectAllAgencyCodes");
    }
	
	//기구 코드 리스트 조회
	public List<OrganizationCode> selectAllOrganizationCodes() {
        return sqlSessionTemplate.selectList(nameSpace+"selectAllOrganizationCodes");
    }
	
	//부서 코드 리스트 조회
	public List<DepartmentCode> selectAllDepartmentCodes() {
        return sqlSessionTemplate.selectList(nameSpace+"selectAllDepartmentCodes");
    }
	
	// 직군 코드 추가
	public int addJobGroupCodeAction(JobGroupCode jobGroupCode){
		return sqlSessionTemplate.insert(nameSpace + "addJobGroupCodeAction", jobGroupCode);
	}
	
	// 직군 코드, 이름 리스트
	public List<JobTypeCode> addJobTypeCodesForm(){
		return sqlSessionTemplate.selectList(nameSpace + "addJobTypeCodesForm");
	}
	
	// 직종 코드 추가
	public int addJobTypeCodesAction(JobTypeCode jobTypeCode){
		return sqlSessionTemplate.insert(nameSpace + "addJobTypeCodesAction", jobTypeCode);
	}
	
	//팀 코드 리스트 조회
	public List<TeamCode> selectAllTeamCodes() {
        return sqlSessionTemplate.selectList(nameSpace+"selectAllTeamCodes");
    }
	
	
	
	
//공통코드 입력처리, selectBox 데이터 조회.
	
	
	// 직군코드, 직종코드, 직종명 리스트 조회
	public List<JobRankCode> addJobRankCodesForm(){
		return sqlSessionTemplate.selectList(nameSpace + "addJobRankCodesForm");
	}
	
	// 직급 코드 추가
	public int addJobRankCodesAction(JobRankCode jobRankCode){
		return sqlSessionTemplate.insert(nameSpace + "addJobRankCodesAction", jobRankCode);
	}
	
	// 직위 코드 추가
	public int addJobPositionCodesAction(JobPositionCode jobPositionCode){
		return sqlSessionTemplate.insert(nameSpace + "addJobPositionCodesAction", jobPositionCode);
	}
	
	// 건물 코드 입력 폼 select box 기관코드
	public List<BuildingCode> addBuildingCodesForm(){
		return sqlSessionTemplate.selectList(nameSpace + "addBuildingCodesForm");
	}
	
	// 건물 코드 추가
	public int addBuildingCodesAction(BuildingCode buildingCode){
		return sqlSessionTemplate.insert(nameSpace + "addBuildingCodesAction", buildingCode);
	}
	
	// 강의실 코드 입력 폼 select box 건물코드
	public List<RoomCode> addRoomCodesForm(){
		return sqlSessionTemplate.selectList(nameSpace + "addRoomCodesForm");
	}
	
	// 강의실 코드 추가
	public int addRoomCodesAction(RoomCode roomCode){
		return sqlSessionTemplate.insert(nameSpace + "addRoomCodesAction", roomCode);
	}
	
	// 국가 코드 추가
	public int addCountryCodesAction(CountryCode countryCode){
		return sqlSessionTemplate.insert(nameSpace + "addCountryCodesAction", countryCode);
	}
	
	//기관 코드 추가
	public int AddAgencyCodes(AgencyCode agencyCode) {
        return sqlSessionTemplate.insert(nameSpace+"AddAgencyCodes", agencyCode);
    }
	
	// 기관 코드, 이름 리스트 조회
	public List<OrganizationCode> selectAllAgencyName() {
        return sqlSessionTemplate.selectList(nameSpace+"selectAllAgencyName");
    }
	
	// 기구 코드 추가
	public int AddOrgCodeAction(OrganizationCode orgCode) {
        return sqlSessionTemplate.insert(nameSpace+"AddOrgCodeAction", orgCode);
    }
	
	// 기구코드, 이름, 기관 코드 히스트 조회
	public List<DepartmentCode> selectAllOrgName() {
        return sqlSessionTemplate.selectList(nameSpace+"selectAllOrgName");
    }
	
	// 기구 코드 추가
	public int addDeptCodeAction(DepartmentCode deptCode) {
        return sqlSessionTemplate.insert(nameSpace+"addDeptCodeAction", deptCode);
    }
	
	//부서코드, 부서명, 기구코드, 기관코드 리스트 조회
	public List<TeamCode> addTeamCodeForm() {
        return sqlSessionTemplate.selectList(nameSpace+"addTeamCodeForm");
    }
	
	//팀 코드 추가
	public int addTeamCodeAction(TeamCode team) {
        return sqlSessionTemplate.insert(nameSpace+"addTeamCodeAction", team);
    }
}
