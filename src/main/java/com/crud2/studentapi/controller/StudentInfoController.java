package com.crud2.studentapi.controller;

import com.crud2.studentapi.dtos.StudentInfoDTO;
import com.crud2.studentapi.entities.Status;
import com.crud2.studentapi.services.interfaces.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Students")
public class StudentInfoController {
    @Autowired
    private StudentInfoService studentInfoService;

    @PostMapping
    public ResponseEntity<StudentInfoDTO> createStudentInfo(@RequestBody StudentInfoDTO studentInfoDTO) {
        return ResponseEntity.ok(studentInfoService.createStudentInfo(studentInfoDTO));
    }
    @GetMapping("all")
    public List<StudentInfoDTO> getAllStudentInfo(StudentInfoDTO studentInfoDTO){
        return studentInfoService.getAllStudentInfo();
    }
    @GetMapping("valid-students")
    public List<StudentInfoDTO> getValidStudents(){
        return studentInfoService.getValidStudents();
    }
    @PutMapping("update/{id}")
    public StudentInfoDTO updateStudentInfo(@RequestBody StudentInfoDTO studentInfoDTO) {
        return studentInfoService.updateStudentInfo(studentInfoDTO.getStudentId(), studentInfoDTO );
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteStudentInfo(@PathVariable Long id)  {
      studentInfoService.deleteStudentInfo(id);
        return ResponseEntity.ok("Student deleted successfully");
    }
}
