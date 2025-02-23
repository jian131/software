package Tuan1;

public class Student {
  private String firstName;
  private String lastName;
  private String birthdate;
  private String address;
  private String className;
  private double[] scores = new double[5]; // Array to store 5 subject scores

  public Student(String firstName, String lastName, String birthdate,
      String address, String className,
      double oop, double pm, double ml, double db, double mobile) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthdate = birthdate;
    this.address = address;
    this.className = className;
    this.scores = new double[] { oop, pm, ml, db, mobile };
  }

  public double getAverage() {
    double sum = 0;
    for (double score : scores) {
      sum += score;
    }
    return sum / scores.length;
  }

  public String getRank() {
    double avg = getAverage();
    if (avg >= 8.5)
      return "A";
    if (avg >= 7.0)
      return "B";
    if (avg >= 5.5)
      return "C";
    if (avg >= 4.0)
      return "D";
    return "F";
  }

  @Override
  public String toString() {
    return String.format("%s %s - Average: %.2f - Rank: %s",
        firstName, lastName, getAverage(), getRank());
  }
}
