package section09.extends01.super2;

public class ClassB extends ClassA {

//    public ClassB() {
//
//    }

    public ClassB(int a) {
//        super(); //기본 생성자 생략가능
        System.out.println("ClassB 생성자 a= " + a);
    }

    public ClassB(int a, int b) {
//        super(); //기본 생성자 생략가능
        System.out.println("ClassB 생성자 a= " + a + " b= " + b);
    }
}
