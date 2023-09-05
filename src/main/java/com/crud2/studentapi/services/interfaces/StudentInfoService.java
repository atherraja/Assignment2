package com.crud2.studentapi.services.interfaces;

import com.crud2.studentapi.dtos.StudentInfoDTO;
import com.crud2.studentapi.entities.Status;

import java.util.List;

public interface StudentInfoService {
    StudentInfoDTO createStudentInfo(StudentInfoDTO studentInfoDTO);
    List<StudentInfoDTO> getAllStudentInfo();
    List<StudentInfoDTO> getValidStudents();
    StudentInfoDTO updateStudentInfo(Long studentId, StudentInfoDTO studentInfoDTO);
    void deleteStudentInfo(Long studentId);



}
