import java.io.*;
import java.util.*;

public class Amimals{
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in); 
        int i = 0;
        int num = 50;
        //System.out.println("Input 1 to add an animal,2 to search, 3 to delete , 4 to change, 0 is over:");
        int n = 1;
        Animal[] allanim = new Animal[num];
        //Animal allanim = new Animal();
        while(n > 0){
            System.out.println("Input 1 to add an animal,2 to search, 3 to delete , 4 to change, 0 is over:");
            n = in.nextInt();
            switch(n){
                case 1:{
                    allanim[i] = new Animal();
                    i++;
                    break;
                    //throw new MyException("is full");
                }
                case 2:{
                    System.out.println("input age to find:");
                    int a = in.nextInt();
                    for(int j = 0 ; j < i;j++){
                        if(allanim[j].getage() == a){
                            allanim[j].print();
                        }else if(allanim[j].getage() != a){
                            System.out.println("can't find.");
                        }
                    }
                    break;
                }
                case 3:{
                    System.out.println("input age to delete:");
                    int del = in.nextInt();
                    for(int j = 0 ; j < i;j++){
                        if(allanim[j].getage() == del){
                            for(;j<i;j++){
                                allanim[j] = allanim[j+1];
                            }
                            
                        }else if(allanim[j].getage() != del){
                            System.out.println("can't find.");
                        }
                    }
                    break;
                }
                case 4:{
                    System.out.println("input age to change:");
                    int a = in.nextInt();
                    for(int j = 0 ; j < i;j++){
                        if(allanim[j].getage() == a){
                            allanim[j].change();
                        }else{
                            System.out.println("can't find.");
                        }
                    }
                    break;
                }
                default:{
                    System.out.println("erro.");
                    continue;
                    //throw new MyException("don't allow");
                }
            }
        }
    }
}

class Animal {
    //private Animal head;
    //private List<String> type = new ArrayList<String>();
    private String type;
    private String sex;
    private int age;
    public  Animal(){
        Scanner in = new Scanner(System.in);
        System.out.println("type:");
        type = in.nextLine();
        System.out.println("sex:");
        sex = in.nextLine();
        System.out.println("age");
        age = in.nextInt();
        System.out.println("over");
    }
    
    public void print(){
        System.out.println("We hava"+type+" "+sex+" "+age+" ");
    }
    public int getage() {
        return age;
    }
    public void change() {
        Scanner in = new Scanner(System.in);
        System.out.println("type:");
        type = in.nextLine();
        System.out.println("sex:");
        sex = in.nextLine();
        System.out.println("age");
        age = in.nextInt();
        System.out.println("over");
    }
}


/*
public class MyException extends Exception{  //创建自定义异常
    public MyException(String ErrorExceptin){	//构造方法
        super(ErrorExceptin);		//父类构造方法
    }
}*/