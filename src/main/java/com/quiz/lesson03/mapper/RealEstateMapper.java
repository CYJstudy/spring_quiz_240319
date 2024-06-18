package com.quiz.lesson03.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.quiz.lesson03.domain.RealEstate;

@Mapper
public interface RealEstateMapper {

	// 1-1
	// input: id
	// output: 매물정보
	public RealEstate selectRealEstateById(int id);
	
	// 1-2
	public List<RealEstate> selectRealEstateListByRentPrice(int rentPrice);
	
	// 1-3
	// mapper 인터페이스가 xml로 파라미터 전송 시 1개만 보낼 수 있다.
	// @Param을 사용하면 파라미터를 하나의 맵으로 구성해주므로 2개 이상 보낼 수 있다.
	// xml에 있는 변수명과 @Param()안에 있는 키값과 매핑하기때문에 괄호안에 있는 키가 중요함
	public List<RealEstate> selectRealEstateListByAreaPrice(
			@Param("area") int area11111, 
			@Param("price") int price1111111);
	
	public int insertRealEstate(RealEstate realEstate);
	
	public int insertRealEstateAsField(
			@Param("realtorId") int RealtorId,
			@Param("address") String address, 
			@Param("area") int area, 
			@Param("type") String type, 
			@Param("price") int price, 
			@Param("rentPrice") Integer rentPrice);
	
	public int updateRealEstateById(
			@Param("id") int id, 
			@Param("type") String type, 
			@Param("price") int price);
	
	public int deleteRealEstateById(int id);
}
