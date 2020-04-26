package oop.construct;

public class ConstructExtends {
}
class people{
    String name;
    people(String name) {
        this.name = name;
    }
}
class stu extends people{
    stu(String name,int age){
        super(name);//此处隐藏一句super() 父类没有，所以不写有参数构造方法的话会编译错误
        System.out.println(age);
    }
}