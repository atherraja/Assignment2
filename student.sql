SELECT *
FROM student_info
INNER JOIN student_contact_info ON student_info.student_contact_id = student_contact_info.student_contact_id;

SELECT student_info.student_id, student_info.name, student_contact_info.address
FROM student_info
INNER JOIN student_contact_info ON student_info.student_contact_id = student_contact_info.student_contact_id;
 