package com.crud2.studentapi.entities;

import com.crud2.studentapi.dtos.StudentContactInfoDTO;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "student_contact_info")
public class StudentContactInfo  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "student_contact_id")
    private Long studentContactId;

    private String address;

    private String city;

    private int countryCode;
  @ManyToOne
  @JoinColumn(name = "studentId")
  private StudentInfo studentInfo;

}
