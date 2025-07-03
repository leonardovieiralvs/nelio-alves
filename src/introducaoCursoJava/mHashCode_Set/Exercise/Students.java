package introducaoCursoJava.mHashCode_Set.Exercise;

import java.util.Objects;
import java.util.Set;

public class Students {
    private Integer id;

    public Students(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Objects.equals(id, students.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
