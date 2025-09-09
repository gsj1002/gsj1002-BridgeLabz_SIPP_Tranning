import java.util.*;
import java.util.stream.Collectors;

class Student {
    private String name;
    private String gradeLevel;
    
    public Student(String name, String gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
    }
    
    public String getName() { return name; }
    public String getGradeLevel() { return gradeLevel; }
}

public class StudentGrouping {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", "Freshman"),
            new Student("Bob", "Sophomore"),
            new Student("Charlie", "Freshman"),
            new Student("Diana", "Junior"),
            new Student("Eve", "Sophomore")
        );
        
        Map<String, List<String>> studentsByGrade = students.stream()
            .collect(Collectors.groupingBy(
                Student::getGradeLevel,
                Collectors.mapping(Student::getName, Collectors.toList())
            ));
        
        System.out.println("Students grouped by grade level:");
        studentsByGrade.forEach((grade, names) -> 
            System.out.println(grade + ": " + names));
    }
}