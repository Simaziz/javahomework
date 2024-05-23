package homeWork;

public class Course {
    private String course;
    private String instructor;
    private String requirement;

    public Course(String course, String instructor, String requirement) {
        this.course = course;
        this.instructor = instructor;
        this.requirement = requirement;
    }

    public String getCourse() {
        return course;
    }

    public String getInstructor() {
        return instructor;
    }

    public String getRequirement() {
        return requirement;
    }

    @Override
    public String toString() {
        return "Course{" +
                "course='" + course + '\'' +
                ", instructor='" + instructor + '\'' +
                ", requirement='" + requirement + '\'' +
                '}';
    }
}

