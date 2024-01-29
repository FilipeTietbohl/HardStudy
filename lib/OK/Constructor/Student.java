package OK.Constructor;

class Student {
  private String studentName;
  private int regNo;
  private Double gpa;
  Student(String s, int i, Double d) {
    this.studentName = s;
    this.regNo = i;
    this.gpa = d;
  }
  // overriding the toString() method
  @Override
  public String toString() {
    return this.studentName + " " + this.regNo + " " + this.gpa;
  }
}