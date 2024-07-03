package com.quiz.lesson07.bo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson07.entity.CompanyEntity;
import com.quiz.lesson07.repository.CompanyRepository;

@Service
public class CompanyBO {
	
	@Autowired
	private CompanyRepository companyRepository;

	// create
	// input: 파라미터 4개 (name, business, scale, headcount)
	// output: CompanyEntity
	public CompanyEntity addCompany(String name, String business, String scale, int headcount) {
		
		return companyRepository.save(
				CompanyEntity.builder()
				.name(name)
				.business(business)
				.scale(scale)
				.headcount(headcount)
				.build());
	}
	
	// update
	// input: id, scale, headcount
	// output: CompanyEntity or null
	public CompanyEntity updateCompanyById(int id, String scale, int headcount) {
		// 기존데이터 조회 CompanyEntity 가져온다
		CompanyEntity company = companyRepository.findById(id).orElse(null); // .orElse(null) > 가져온값이 없으면 null로 처리하겠다
		
		// Entity에 update하고싶은 값으로 데이터를 변경한다
		if (company != null) {
			// 저장
			company = companyRepository.save(
					company.toBuilder()
					.scale(scale)
					.headcount(headcount)
					.build());
		}
		
		return company;
	}
	
	// create
	// input: id
	// output: X
	public void deleteCompanyById(int id) {
		Optional<CompanyEntity> companyOptional = companyRepository.findById(id);
		companyOptional.ifPresent(c -> companyRepository.delete(c));
	}
	
}
