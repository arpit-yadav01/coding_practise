package src.arpit.medium.oops;



public class Encapsulation {
        public static void main(String[]  args){
            Student s = new Student();

            s.setName("arpit");
            System.out.println("the student name : " +  s.getName());
        }
}

    class Student{
        private String name;

        public void setName(String n  ){
            name=n ;

        }

        public String getName(){
            return name;
        }
    }
