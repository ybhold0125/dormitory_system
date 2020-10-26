package dms.boot.student.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dms.boot.student.domain.Student;
import dms.boot.student.service.IStudentSerivce;

@RestController
@RequestMapping("student")
public class StudentController {
	@Autowired
	private IStudentSerivce iStudentSerivce;
	
	@GetMapping("/queryStudentList")
	public Map<String, Object> queryStudentList() {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Student> studentList = iStudentSerivce.queryStudentList();
		map.put("data", studentList);
		return map;
	}
}
