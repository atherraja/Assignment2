package com.crud2.studentapi.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
@Data
@Entity
@Table(name = "student_info")
public class StudentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "student_info_id")
    private Long studentId;
    private String studentName;
    private String fatherName;
    private int rollNo;
    //@Enumerated(EnumType.ORDINAL)
    private Status status;

    @OneToMany(mappedBy = "studentInfo", cascade = CascadeType.ALL)
    private List<StudentContactInfo> studentContactInfo = new ArrayList<>();
}
