package section06.access.b;

//import section06.access.a.DefaultClass1;
//import section06.access.a.DefaultClass2;
import section06.access.a.PublicClass;

public class PublicClassOuterMain {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // 다른 패키지 접근 불가
//        DefaultClass1 class1 = new DefaultClass1();
//        DefaultClass2 class1 = new DefaultClass2();
    }
}
