package com.quiz.lesson07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson07.bo.CompanyBO;
import com.quiz.lesson07.entity.CompanyEntity;

@RequestMapping("/lesson07/quiz01")
@RestController
public class Lesson07Quiz01RestController {

	@Autowired
	private CompanyBO companyBO;
	
	// /lesson07/quiz01/save1
	@GetMapping("/save1")
	public CompanyEntity save1() {

		return companyBO.addCompany("넥손", "컨텐츠 게임", "대기업", 3585);
	}
	
	// /lesson07/quiz01/save2
	@GetMapping("/save2")
	public CompanyEntity save2() {
//		String name = "버블팡";
//		String business = "여신 금융업";
//		String scale = "대기업";
//		int headcount = 6834;
//		return companyBO.addCompany(name, business, scale, headcount);
		
		return companyBO.addCompany("버블팡", "여신 금융업", "대기업", 6834);
	}
	
	// lesson07/quiz01/update
	@GetMapping("/update")
	public CompanyEntity update() {
		// 버블팡(id=8) 정보 변경 > "scale": "중소기업", "headcount": 34,
		return companyBO.updateCompanyById(8, "중소기업", 34);
	}
	
	// lesson07/quiz01/delete
	@GetMapping("/delete")
	public String delete() {
		// 버블팡(id=8) 삭제
		companyBO.deleteCompanyById(8);
		
		return "수행 완료";
	}
	
	
}



