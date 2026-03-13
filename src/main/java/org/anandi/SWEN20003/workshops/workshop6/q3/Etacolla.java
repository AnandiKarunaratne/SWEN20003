package org.anandi.SWEN20003.workshops.workshop6.q3;

import java.util.ArrayList;
import java.util.List;

public class Etacolla {

    private final UniversityService universityService;

    public Etacolla(UniversityService universityService) {
        this.universityService = universityService;
    }

    public void generateTimetable(Student student) {
        List<String> subjectNames = universityService.getEnrolledSubjectCodes(student);
        List<Subject> subjects = new ArrayList<>();
        for (String subjectName : subjectNames) {
            Subject subject = universityService.getSubject(subjectName);
            subjects.add(subject);
        }
        // allocate activities to student ...
        List<Activity> allocated = allocatePreferences(student.getPreferences(), subjects);
        for (Activity activity : allocated) {
            universityService.registerStudentInActivity(student, activity);
        }
    }

    private List<Activity> allocatePreferences(String preferences, List<Subject> subjects) {
        return null;
    }

}
