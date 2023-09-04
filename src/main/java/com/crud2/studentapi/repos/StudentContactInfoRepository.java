package com.crud2.studentapi.repos;

import com.crud2.studentapi.entities.StudentContactInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentContactInfoRepository extends JpaRepository<StudentContactInfo, Long> {

}
