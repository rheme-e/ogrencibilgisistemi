package Deneme;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1=new Teacher("Hüseyin Ceylan","0555","Ulş");
        Teacher teacher2=new Teacher("Ali Haydar Kayhan","0554","Mkv");
        Teacher teacher3=new Teacher("Ali Kalkan","0553","Btn");
        Course course1=new Course("Ulaştırma","101","Ulş");
        course1.addteacher(teacher1);
        Course course2=new Course("Mukavemet","101","Mkv");
        course2.addteacher(teacher2);
        Course course3=new Course("Betonarme","101","Btn");
        course3.addteacher(teacher3);
        Student student1=new Student("Esra Gönül","8","1. Sınıf");
        student1.addCourse(course1,course2,course3);
        Student student2=new Student("Rojda Baturalp","10","1. Sınıf");
        student2.addCourse(course1,course2,course3);

        student1.addBulkExamNote(100,50,0,0,50,90);

        student2.addBulkExamNote(30,97,64,34,65,90);

        student1.printStudent();
        student1.calcAvarage();

        student2.printStudent();
        student2.calcAvarage();




    }
}
