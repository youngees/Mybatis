package com.kosmo.mybatis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mybatis.MyBoardDTO;
import mybatis.MybatisDAOImpl;

@Controller
public class CollectionController {
	
	//Mybatis를 사용하기위한 자동주입
	@Autowired
	private SqlSession sqlSession;
	
	//HashMap컬렉션을 Mapper에서 사용하기
	@RequestMapping("/Collection/hashMap.do")
	public String hashMap(Model model) {
		
		//검색어 저장을 위한 Map컬렉션을 생성한다.
		Map<String, String> hashMap = new HashMap<String, String>();
		//각 Key값에 원하는 검색어(파라미터)를 추가한다. 
		hashMap.put("key_id", "test");
		hashMap.put("key_name", "스모");
		hashMap.put("key_contents", "잔치집");
		
		//파라미터를 저장한 Map객체를 인터페이스를 통해 Mapper로 전달한다. 
		ArrayList<MyBoardDTO> lists = 
				sqlSession.getMapper(MybatisDAOImpl.class).hashMapUse(hashMap);
		
		//Mapper에서 동적으로 생성된 쿼리문을 로그로 출력한다.
		String sql = sqlSession.getConfiguration()
				.getMappedStatement("hashMapUse").getBoundSql(hashMap).getSql();
		System.out.println("sql="+sql);
		
		model.addAttribute("lists", lists);
		
		return "08CollectionUse/hashMapUse";
	}
	
	//List를 Mapper에서 사용하기
	@RequestMapping("/Collection/arrayList.do")
	public String arrayList(Model model) {
		
		//Mapper로 전달할 List컬렉션 생성 및 파라미터 추가 
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("고스톱");
		arrayList.add("낙자쌤");
		arrayList.add("기즈모");
		arrayList.add("테스트");
		
		//Mapper를 호출한다. 
		ArrayList<MyBoardDTO> lists =
				sqlSession.getMapper(MybatisDAOImpl.class).arrayListUse(arrayList);
		
		model.addAttribute("lists", lists);
		return "08CollectionUse/ArrayListUse";
	}
	
}
