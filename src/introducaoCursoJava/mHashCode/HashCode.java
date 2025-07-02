package introducaoCursoJava.mHashCode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashCode {

    static class hashEqualsTest {
        String name;
        String email;

        public hashEqualsTest(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            hashEqualsTest that = (hashEqualsTest) o;
            return Objects.equals(name, that.name) && Objects.equals(email, that.email);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, email);
        }
    }


    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Tv");
        set.add("Notbook");
        set.add("Phone");

        System.out.println(set.contains("Tv"));
        set.remove("Notbook");
        for (String s : set) {
            System.out.println(s);
        }


    }
}
