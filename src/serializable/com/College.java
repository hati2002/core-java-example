package serializable.com;

import java.awt.*;
import java.util.List;

public class College {
    private List<Student> Students;

    public List<Student> getStudents() {
        return Students;
    }

    public void setStudents(List<Student> students) {
        this.Students = students;
    }
}
