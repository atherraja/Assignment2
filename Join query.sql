SELECT student_info.student_id, student_info.father_name, student_info.roll_no, student_info.status, student_info.student_name, 
student_contact_info.address, student_contact_info.city, student_contact_info.country_code
FROM student_info INNER JOIN student_contact_info
ON student_info.student_id = student_contact_info .student_contact_id;
