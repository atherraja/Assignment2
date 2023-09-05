package com.crud2.studentapi.repos;

import com.crud2.studentapi.dtos.StudentInfoDTO;
import com.crud2.studentapi.entities.Status;
import com.crud2.studentapi.entities.StudentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentInfoRepository extends JpaRepository<StudentInfo, Long> {

    List<StudentInfo> findByStatusNot(Status status);
   StudentInfo findByRollNo(int rollNo);

}
