package com.arlengroup.web.controller.type;
import com.arlengroup.web.type.TypeExample;
import com.arlengroup.web.type.TypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuxingxing
 * @date 2020/5/7 16:46
 */
@RestController
@RequestMapping("/type/")
public class TypeController {
	@Autowired
	TypeMapper typeMapper;
	
	@RequestMapping("types")
	public void findAll(){
		System.out.println(typeMapper.selectByExample(new TypeExample()));
	}
}
