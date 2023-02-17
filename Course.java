package Deneme;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int notevize;
    int notefinal;

    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.notevize=0;
        this.notefinal=0;
    }
         void addteacher(Teacher teacher){
                if(teacher.branch.equals(this.prefix)){
                    this.teacher=teacher;
                }else{
                    System.out.println("Öğretmen Branş Uyumsuzluğu!");
                }

    }

        void printCourse(){
            System.out.println("Ders Adı:"+this.name);
            System.out.println("Ders Kodu:"+this.code);
            System.out.println("Ders Kısaltması:"+this.prefix);
            this.teacher.printteacher();
        }






}
