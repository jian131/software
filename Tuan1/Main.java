package Tuan1;

import java.util.*;

public class Main {
  private static Map<String, Class> classes = new HashMap<>();

  public static void main(String[] args) {
    initializeData();

    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("\n=== QUAN LY SINH VIEN ===");
      System.out.println("Danh sach lop:");
      for (String classId : classes.keySet()) {
        System.out.println("- " + classId);
      }

      System.out.print("\nNhap ma lop (hoac 'exit'): ");
      String input = scanner.nextLine();

      if (input.equalsIgnoreCase("exit"))
        break;

      Class classroom = classes.get(input);
      if (classroom != null) {
        displayClassStats(classroom);
      } else {
        System.out.println("Lop khong ton tai!");
      }
    }
    scanner.close();
  }

  private static void displayClassStats(Class classroom) {
    System.out.println("\nThong ke lop " + classroom.getClassId());
    Map<String, Integer> stats = classroom.getRankStats();

    System.out.println("Xep loai A: " + stats.get("A"));
    System.out.println("Xep loai B: " + stats.get("B"));
    System.out.println("Xep loai C: " + stats.get("C"));
    System.out.println("Xep loai D: " + stats.get("D"));
    System.out.println("Xep loai F: " + stats.get("F"));

    System.out.println("\nDanh sach sinh vien:");
    for (Student student : classroom.getStudents()) {
      System.out.println(student);
    }
  }

  private static void initializeData() {
    Class class1 = new Class("CNTT1");
    class1.addStudent(new Student("Nguyen", "An", "01/01/2004", "Ha Noi", "CNTT1", 9.0, 8.5, 8.0, 7.5, 9.0));
    class1.addStudent(new Student("Le", "Binh", "02/02/2004", "HCM", "CNTT1", 6.5, 7.0, 5.5, 6.0, 6.5));
    class1.addStudent(new Student("Pham", "Cuong", "05/05/2004", "Hue", "CNTT1", 8.2, 7.9, 8.5, 7.8, 8.1));
    class1.addStudent(new Student("Tran", "Dai", "06/06/2004", "Da Nang", "CNTT1", 7.0, 6.5, 7.8, 6.9, 7.2));
    class1.addStudent(new Student("Bui", "E", "07/07/2004", "Can Tho", "CNTT1", 5.8, 6.0, 5.5, 5.7, 5.9));
    classes.put("CNTT1", class1);

    Class class2 = new Class("CNTT2");
    class2.addStudent(new Student("Tran", "Chi", "03/03/2004", "Da Nang", "CNTT2", 4.5, 5.0, 4.0, 4.5, 5.0));
    class2.addStudent(new Student("Pham", "Duy", "04/04/2004", "Hai Phong", "CNTT2", 8.0, 7.5, 7.0, 8.0, 7.5));
    class2.addStudent(new Student("Vo", "F", "08/08/2004", "Hanoi", "CNTT2", 9.2, 8.9, 9.5, 9.1, 9.0));
    class2.addStudent(new Student("Dang", "G", "09/09/2004", "HCM", "CNTT2", 6.8, 6.9, 6.7, 6.5, 7.0));
    class2.addStudent(new Student("Ngo", "H", "10/10/2004", "Quang Nam", "CNTT2", 5.0, 4.5, 5.3, 5.1, 5.4));
    classes.put("CNTT2", class2);
  }
}
