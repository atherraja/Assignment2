package com.crud2.studentapi.services.interfaces;

import com.crud2.studentapi.dtos.StudentInfoDTO;

import java.util.List;

public interface StudentInfoService {
    StudentInfoDTO createStudentInfo(StudentInfoDTO studentInfoDTO);
    List<StudentInfoDTO> getAllStudentInfo();
    StudentInfoDTO updateStudentInfo(Long studentId, StudentInfoDTO studentInfoDTO);
    void deleteStudentInfo(Long studentId);
}
