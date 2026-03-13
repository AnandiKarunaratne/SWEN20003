package org.anandi.SWEN20003.workshops.workshop6.q3;

import java.util.List;

public interface UniversityService {
    List<String> getEnrolledSubjectCodes(Student student);
    Subject getSubject(String subjectName);
    void registerStudentInActivity(Student student, Activity activity);

}
