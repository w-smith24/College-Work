public class p9 {
  
  public static void main (String[] args) {
    
    Student student1;
    Student student2;
    Student student3;
    
    student1 = new Student();
    student1.setName("Bob Stevens");
    student1.setTest1(89);
    student1.setTest2(92);
    student1.setFinal(93);
    System.out.println("student1.getName() = " + student1.getName());
    System.out.println("student1.getTest1() = " + student1.getTest1());
    System.out.println("student1.getTest2() = " + student1.getTest2());
    System.out.println("student1.getFinal() = " + student1.getFinal());
    System.out.println("student1.getAverage() = " + student1.getAverage());
    System.out.println(student1.toString());
    
    student2 = new Student("James Kline");
    student2.setGrades(75, 66, 89);
    System.out.println("\nstudent2.getName() = " + student2.getName());
    System.out.println("student2.getTest1() = " + student2.getTest1());
    System.out.println("student2.getTest2() = " + student2.getTest2());
    System.out.println("student2.getFinal() = " + student2.getFinal());
    System.out.println("student2.getAverage() = " + student2.getAverage());
    System.out.println(student2.toString());
    
    student3 = new Student("Nancy Keen", 94, 97, 100);
    student3.setTest1(95);
    System.out.println("\nstudent3.getName() = " + student3.getName());
    System.out.println("student3.getTest1() = " + student3.getTest1());
    System.out.println("student3.getTest2() = " + student3.getTest2());
    System.out.println("student3.getFinal() = " + student3.getFinal());
    System.out.println("student3.getAverage() = " + student3.getAverage());
    System.out.println(student3.toString());
        
  }
  
}