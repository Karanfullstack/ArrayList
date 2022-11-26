import java.util.*;
class Student{
  int Rollno;
  String Name;
  public Student(int Rollno, String Name){
    this.Rollno = Rollno;
    this.Name = Name;
  }

  public String toString(){
    return Rollno +  "----> " + Name;
  }

}

class ListInterFaceDemo{
  static Student [] arr = new Student[10];
  static Student s;

  public static void main(String args[]){
    ArrayList<Student> tab1 = new <Student>ArrayList();
    getData(arr);
    for(int i = 0; i < 10; i++)
    tab1.add(arr[i]);
    for(int i = 0; i<10; i++)
    System.out.println(tab1.get(i));
    tab1.add(5, new Student(11, "Arjun"));
    System.out.println(tab1);
    Iterator iter = tab1.iterator();
    ///
    while(iter.hasNext()){
      Student s = (Student) iter.next();
      System.out.println(s);
    }
    List<Student>SubLi = tab1.subList(2,5);
    ListIterator<Student> li = SubLi.listIterator();
    System.out.println("Forward Traverser");
    while(li.hasNext()){
      Student s = li.next();
      System.out.println(s);
    }
    System.out.println("Backward Traversing");
    while(li.hasPrevious()){
      Student s = li.previous();
      if(s.Rollno == 4)
      li.remove();
    }
    System.out.println(SubLi);
    tab1.remove(8);
    System.out.println(tab1);

  }

static void getData(Student [] A){

  A[0] = new Student(1,"Karan");
  A[1] = new Student(2,"Alka");
  A[2] = new Student(3,"Agnieszka");
  A[3] = new Student(4,"Malik");
  A[4] = new Student(5,"Raj");
  A[5] = new Student(6,"Pushpa");
  A[6] = new Student(7,"Ritik");
  A[7] = new Student(8,"Lalita");
  A[8] = new Student(9,"Dev");
  A[9] = new Student(10,"Adelka");

}
 }
