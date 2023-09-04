package com.crud2.studentapi.services.interfaces;

import com.crud2.studentapi.dtos.StudentContactInfoDTO;
import com.crud2.studentapi.dtos.StudentInfoDTO;
import com.crud2.studentapi.entities.StudentContactInfo;

import java.util.List;

public interface StudentContactInfoService {

    StudentContactInfoDTO createStudentContactInfo(StudentContactInfoDTO studentContactInfoDTO);
    List<StudentContactInfoDTO> getAllStudentContactInfo();
    StudentContactInfoDTO updateStudentContactInfo(Long studentContactId, StudentContactInfoDTO studentContactInfoDTO);
    void deleteStudentContactInfo(Long StudentContactId);


}
