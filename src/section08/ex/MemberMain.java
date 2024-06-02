package section08.ex;

public class MemberMain {

    public static void main(String[] args) {
        Member member = new Member("myId", "kim");
        member.print();

        member.changeData("myId2", "seo");
        member.print();

        member.changeData("park");
        member.print();
    }
}
