package com.crud2.studentapi.dtos;

import com.crud2.studentapi.entities.Status;
import com.crud2.studentapi.entities.StudentContactInfo;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class StudentInfoDTO {
    private Long studentId;
    private String studentName;
    private String fatherName;
    private int rollNo;

    private Status status;
    private List<StudentContactInfo> studentContactInfo;


}
