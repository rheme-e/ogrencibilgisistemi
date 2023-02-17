package Deneme;

public class Teacher {
    String name;
    String mpNo;
    String branch;
    Teacher(String name,String mpNo,String branch){
        this.name=name;
        this.mpNo=mpNo;
        this.branch=branch;
    }
    void printteacher(){
        System.out.println("Öğretmen Adı:"+this.name);
        System.out.println("Öğretmen Telefon Numarası:"+this.mpNo);
        System.out.println("Öğretmen Branşı:"+this.branch);

    }


}
