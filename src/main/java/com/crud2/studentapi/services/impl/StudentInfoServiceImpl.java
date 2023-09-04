package com.crud2.studentapi.services.impl;

import com.crud2.studentapi.dtos.StudentContactInfoDTO;
import com.crud2.studentapi.dtos.StudentInfoDTO;
import com.crud2.studentapi.entities.StudentContactInfo;
import com.crud2.studentapi.entities.StudentInfo;
import com.crud2.studentapi.repos.StudentInfoRepository;
import com.crud2.studentapi.services.interfaces.StudentInfoService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentInfoServiceImpl implements StudentInfoService {
@Autowired
private StudentInfoRepository studentInfoRepository;
    @Override
    public StudentInfoDTO createStudentInfo(StudentInfoDTO studentInfoDTO) {
        StudentInfo studentInfo = mapToEntity(studentInfoDTO);
        StudentInfo createdStudentInfo = studentInfoRepository.save(studentInfo);
        StudentInfoDTO studentInfoDTO1 = mapToDTO(createdStudentInfo);

        return studentInfoDTO;
    }
    @Override
    public List<StudentInfoDTO> getAllStudentInfo() {
        List<StudentInfo> studentInfoList = studentInfoRepository.findAll();
        return studentInfoList.stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public StudentInfoDTO updateStudentInfo(Long studentId, StudentInfoDTO studentInfoDTO) {
        StudentInfo studentInfo = mapToEntity(studentInfoDTO);
        StudentInfo updateStudentInfo = studentInfoRepository.findById(studentInfoDTO.getStudentId())
                .orElseThrow(()-> new EntityNotFoundException(("Student not found with ID: " + studentInfoDTO.getStudentId())));

        // Update student information
        studentInfo.setStudentName(studentInfoDTO.getStudentName());
        studentInfo.setFatherName(studentInfoDTO.getFatherName());
        studentInfo.setRollNo(studentInfoDTO.getRollNo());
        studentInfo.setStatus(studentInfoDTO.getStatus());

        // Save the updated studentInfo
        StudentInfo studentInfo1 = studentInfoRepository.save(studentInfo);

        // Map the updated student to the DTO and return it
        return mapToDTO(studentInfo1);
    }

    @Override
    public void deleteStudentInfo(Long studentId) {

        // Check if the student exists
        if (!studentInfoRepository.existsById(studentId)){
            throw new EntityNotFoundException("Student not found with ID: " + studentId);
        }

        // Delete the student by ID
        studentInfoRepository.deleteById(studentId);

    }


    //mapToEntity & mapToDTO
    private StudentInfo mapToEntity (StudentInfoDTO studentInfoDTO) {
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setStudentName(studentInfoDTO.getStudentName());
        studentInfo.setFatherName(studentInfoDTO.getFatherName());
        studentInfo.setStatus(studentInfoDTO.getStatus());
        studentInfo.setRollNo(studentInfoDTO.getRollNo());
        studentInfo.setStudentContactInfo(studentInfoDTO.getStudentContactInfo());
        return studentInfo;
    }
    private StudentInfoDTO mapToDTO (StudentInfo studentInfo){
        StudentInfoDTO studentInfoDTO = new StudentInfoDTO();
        studentInfoDTO.setStudentId(studentInfo.getStudentId());
        studentInfoDTO.setStudentName(studentInfo.getStudentName());
        studentInfoDTO.setStudentName(studentInfo.getStudentName());
        studentInfoDTO.setFatherName(studentInfo.getFatherName());
        studentInfoDTO.setStatus(studentInfo.getStatus());
        studentInfoDTO.setRollNo(studentInfo.getRollNo());
        studentInfoDTO.setStudentContactInfo(studentInfo.getStudentContactInfo());
        return studentInfoDTO;
    }

    private StudentContactInfo mapToEntity (StudentContactInfoDTO studentContactInfoDTO){
        StudentContactInfo studentContactInfo = new StudentContactInfo();
        studentContactInfo.setAddress(studentContactInfoDTO.getAddress());
        studentContactInfo.setCity(studentContactInfoDTO.getCity());
        studentContactInfo.setCountryCode(studentContactInfo.getCountryCode());
        return studentContactInfo;
    }

    private StudentContactInfoDTO mapToDTO (StudentContactInfo studentContactInfo){
        StudentContactInfoDTO studentContactInfoDTO = new StudentContactInfoDTO();
        studentContactInfoDTO.setStudentContactId(studentContactInfo.getStudentContactId());
        studentContactInfoDTO.setAddress(studentContactInfo.getAddress());
        studentContactInfoDTO.setCity(studentContactInfo.getCity());
        studentContactInfoDTO.setCountryCode(studentContactInfo.getCountryCode());
        return studentContactInfoDTO;

    }


}
