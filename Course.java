public class Course {

    private String courseId;
    private String courseName;
    private int duration;
    private Trainer trainer;

    // Default Constructor
    public Course() {

    }

    // Parameterized Constructor
    public Course(String courseId, String courseName, int duration, Trainer trainer) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.duration = duration;
        this.trainer = trainer;
    }

    // Getters
    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    // Setters
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    // toString
    @Override
public String toString() {

    return "Course{" +"courseId = " + courseId "}"
}
}
