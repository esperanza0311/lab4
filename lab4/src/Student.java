public class Student{
    String name=" ";
    int age;
    boolean isJunior;
    String gender;
    public Student(){
        name="--";
        age=0;
        isJunior=false;
        gender="M";

    }
    public Student(String name,int age,boolean isJunior,String gender){
        this.name=name;
        this.age=age;
        this.isJunior=isJunior;
        this.gender= String.valueOf(gender.charAt(0));
    }
    public void Info() {
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("is student junior?: "+isJunior);
        System.out.println("gender: "+gender);
    }


   public  static void main(String[] args) {
        Student stu1=new Student();
        stu1.Info();
        stu1.name="İlkerinooooo";
        stu1.age=21;
        stu1.isJunior=true;
        stu1.gender="m";
        stu1.Info();



    }
}