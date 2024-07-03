package com.quiz.lesson07;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson07.entity.RecruitEntity;
import com.quiz.lesson07.repository.RecruitRepository;

@RequestMapping("/lesson07/quiz02")
@RestController
public class Lesson07Quiz02RestController {

	@Autowired
	private RecruitRepository recruitRepository;
	
	@GetMapping("/select1")
	public List<RecruitEntity> select1() {
		// id가 8인 공고를 조회
		return recruitRepository.findById(8);
	}
	
	@GetMapping("/select2")
	public List<RecruitEntity> select2() {
		// company id가 1인 값을 조회
		return recruitRepository.findByCompanyId(1);
	}
	
	@GetMapping("/select3")
	public List<RecruitEntity> select3() {
		// 웹 back-end 개발자 이고 정규직인 값 조회
		return recruitRepository.findByCompanyId(1);
	}
}
