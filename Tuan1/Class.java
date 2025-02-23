package Tuan1;

import java.util.*;

public class Class {
  private String classId;
  private List<Student> students;

  public Class(String classId) {
    this.classId = classId;
    this.students = new ArrayList<>();
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public Map<String, Integer> getRankStats() {
    Map<String, Integer> stats = new HashMap<>();
    stats.put("A", 0);
    stats.put("B", 0);
    stats.put("C", 0);
    stats.put("D", 0);
    stats.put("F", 0);

    for (Student student : students) {
      String rank = student.getRank();
      stats.put(rank, stats.get(rank) + 1);
    }
    return stats;
  }

  public String getClassId() {
    return classId;
  }

  public List<Student> getStudents() {
    return students;
  }
}
