package com.cts;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
class Student {
    public String name;
    public int age;
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    // can be passed as method argument
    public  String customShow(Function<Student,String> fun){
        return fun.apply(this);
    }
}

public class FunctionDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList();
        list.add(new Student("Ram",20));
        list.add(new Student("Shyam",22));
        list.add(new Student("Kabir",18));
        // Simple use of function
        for(Student st: list){
            System.out.println(st.customShow(s->s.name+": "+s.name));
        }
        //Style one to declare function with lamba expression
        Function<Student,String> styleOne = (s)->{
            String result =  "Name:"+s.name +" and Age:"+s.age;
            return result;
        };
        //Style two to declare function
        Function<Student,String> styleTwo = s->"Name:"+s.name +" and Age:"+s.age;
            
            
            
        System.out.println("--print value by style one--");
        //print the values of list using stle one function
        for(Student st: list){
            System.out.println(st.customShow(styleOne));
        }
        System.out.println("--print value by style two--");
        //print the values of list using style two function
        for(Student st: list){
            System.out.println(st.customShow(styleTwo));
        }
    }
}








 