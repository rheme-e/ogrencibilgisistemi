package Deneme;

public class Student {

    Course course1;
    Course course2;
    Course course3;

    String name;
    String stuNo;
    String classes;
    double avarage1;
    double avarage2;
    double avarage3;
    boolean isPass;


            Student(String name,String stuNo,String classes){
                this.name=name;
                this.stuNo=stuNo;
                this.classes=classes;
                this.avarage1=0.0;
                this.avarage2=0.0;
                this.avarage3=0.0;
                this.isPass=false;


            }

            void addCourse(Course course1, Course course2, Course course3){
                this.course1=course1;
                this.course2=course2;
                this.course3=course3;
            }

            void printStudent(){
                System.out.println("Öğrenci Adı:"+name);
                System.out.println("Öğrenci Numarası:"+stuNo);
                System.out.println("Öğrenci Sınıfı:"+classes);

            }

            void addBulkExamNote(int notevize1,int notefinal1,int notevize2,int notefinal2,int notevize3,int notefinal3){

                if(notevize1>=0 && notevize1<=100){
                    course1.notevize=notevize1;
                }

                if(notefinal1>=0 && notefinal1<=100){
                    course1.notefinal=notefinal1;
                }

                if(notevize2>=0 && notevize2<=100){
                    course2.notevize=notevize2;
                }

                if(notefinal2>=0 && notefinal2<=100){
                    course2.notefinal=notefinal2;
                }

                if(notevize3>=0 && notevize3<=100){
                    course3.notevize=notevize3;
                }

                if(notevize3>=0 && notevize3<=100){
                    course3.notefinal=notefinal3;
                }

            }

            void printNote(){
                System.out.println(course1.name+" vize notu:"+ course1.notevize);
                System.out.println(course1.name+" final notu:"+ course1.notefinal);
                System.out.println(course2.name+" vize notu:"+ course2.notevize);
                System.out.println(course2.name+" final notu:"+ course2.notefinal);
                System.out.println(course3.name+" vize notu:"+ course3.notevize);
                System.out.println(course3.name+" final notu:"+ course3.notefinal);
            }

            void calcAvarage(){
                this.avarage1= course1.notevize*0.2+course1.notefinal*0.8;
                this.avarage2= course2.notevize*0.2+course2.notefinal*0.8;
                this.avarage3= course3.notevize*0.2+course3.notefinal*0.8;
                System.out.println(course1.name+" Dersi Ortalaması: "+avarage1);

                if(this.avarage1>50){
                    System.out.println("Dersi Geçti.");
                }else{
                    System.out.println("Kaldı.");
                }
                System.out.println(course2.name+" Dersi Ortalaması: "+avarage2);

                if(this.avarage2>50){
                    System.out.println("Dersi Geçti.");
                }else{
                    System.out.println("Kaldı.");
                }
                System.out.println(course3.name+" Dersi Ortalaması: "+avarage3);

                if(this.avarage3>50){
                    System.out.println("Dersi Geçti.");
                }else{
                    System.out.println("Kaldı.");
                }
            }

}
