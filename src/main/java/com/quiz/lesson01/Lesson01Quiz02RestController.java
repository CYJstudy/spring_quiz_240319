package com.quiz.lesson01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/quiz02")
@RestController // @Controller + @ResponseBody
public class Lesson01Quiz02RestController {

	// http://localhost:8080/lesson01/quiz02/1
	@RequestMapping("/1")
	public List<Map<String, Object>> quiz02_1() {
		List<Map<String, Object>> movieList = new ArrayList<>();
		
		Map<String, Object> movieInfo = new HashMap<>();
		movieInfo.put("rate", 15);
		movieInfo.put("director", "봉준호");
		movieInfo.put("time", 131);
		movieInfo.put("title", "기생충");
		movieList.add(movieInfo);
		
		movieInfo.put("rate", 0);
		movieInfo.put("director", "로베르토 베니니");
		movieInfo.put("time", 116);
		movieInfo.put("title", "인생은 아름다워");
		movieList.add(movieInfo);
		
		movieInfo.put("rate", 12);
		movieInfo.put("director", "크리스토퍼 놀란");
		movieInfo.put("time", 147);
		movieInfo.put("title", "인셉션");
		movieList.add(movieInfo);
		
		movieInfo.put("rate", 19);
		movieInfo.put("director", "윤종빈");
		movieInfo.put("time", 133);
		movieInfo.put("title", "범죄와의 전쟁 : 나쁜놈들 전성시대");
		movieList.add(movieInfo);
		
		movieInfo.put("rate", 15);
		movieInfo.put("director", "프란시스 로렌스");
		movieInfo.put("time", 137);
		movieInfo.put("title", "헝거게임");
		movieList.add(movieInfo);
		
		return movieList;
	}
	
	// http://localhost:8080/lesson01/quiz02/2
	@RequestMapping("/2")
	public List<Board> quiz02_2() {
		// @ResponseBody + return String => HttpMessageConverter => HTML
		// @ResponseBody + return 객체(Map, 객체, List) => HttpMessageConverter => jackson lib => JSON
		
		List<Board> list = new ArrayList<>();
		
		Board board = new Board();
		board.setTitle("안녕하세요 가입인사 드립니다.");
		board.setUser("marobiana");
		board.setContent("안녕하세요. 가입했어요. 앞으로 잘 부탁 드립니다.");
		list.add(board);
		
		board = new Board();
		board.setTitle("헐 대박");
		board.setUser("bada");
		board.setContent("오늘 목요일이었어... 금요일인줄");
		list.add(board);
		
		board = new Board();
		board.setTitle("오늘 데이트 한 이야기 해드릴게요.");
		board.setUser("dulumary");
		board.setContent("...");
		list.add(board);
		
		return list;
	}


	// http://localhost:8080/lesson01/quiz02/3
	@RequestMapping("/3")
	public ResponseEntity<Board> quiz02_3() {
		
		Board board = new Board();
		board.setTitle("안녕하세요 가입인사 드립니다.");
		board.setUser("marobiana");
		board.setContent("안녕하세요. 가입했어요. 앞으로 잘 부탁드립니다. 활동 열심히 하겠습니다.");
		
		return new ResponseEntity<>(board, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}





