class Student {

  
    int rollNo;
    String name;
    String branch;
    int marks;

    void getData(int rollNo, String name, String branch, int marks) {

        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.marks = marks;
    }
    void display() {
        System.out.println("Roll No  : " + rollNo);
        System.out.println("Name     : " + name);
        System.out.println("Branch   : " + branch);
        System.out.println("Marks    : " + marks);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
		s1.getData(1,"abs","cse",100);
		s2.getData(2,"sbs","ece",90);
		s1.display();
        s2.display();

       
    }
}
