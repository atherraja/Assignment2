package com.crud2.studentapi.dtos;

import com.crud2.studentapi.entities.StudentContactInfo;
import com.crud2.studentapi.entities.StudentInfo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentContactInfoDTO extends StudentContactInfo {
    private Long studentContactId;

    private String address;

    private String city;

    private int countryCode;

    private StudentInfo studentInfo;


}
