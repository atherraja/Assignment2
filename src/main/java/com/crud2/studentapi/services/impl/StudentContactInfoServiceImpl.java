package com.crud2.studentapi.services.impl;

import com.crud2.studentapi.dtos.StudentContactInfoDTO;
import com.crud2.studentapi.repos.StudentContactInfoRepository;
import com.crud2.studentapi.services.interfaces.StudentContactInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentContactInfoServiceImpl implements StudentContactInfoService {
@Autowired
private StudentContactInfoRepository studentContactInfoRepository;
    @Override
    public StudentContactInfoDTO createStudentContactInfo(StudentContactInfoDTO studentContactInfoDTO) {
        return null;
    }

    @Override
    public List<StudentContactInfoDTO> getAllStudentContactInfo() {
        return null;
    }

    @Override
    public StudentContactInfoDTO updateStudentContactInfo(Long studentContactId, StudentContactInfoDTO studentContactInfoDTO) {
        return null;
    }

    @Override
    public void deleteStudentContactInfo(Long StudentContactId) {

    }
}
