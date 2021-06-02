package chapter05.ch12;


public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberArrayList = new MemberHashSet();

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");
        Member memberHong = new Member(1003, "홍길동");
        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberKang);
        memberArrayList.showAllMember();
        memberArrayList.addMember(memberHong);
        System.out.println();
        memberArrayList.showAllMember();
        System.out.println();
        memberArrayList.remove(memberKim.getMemberId());
        memberArrayList.showAllMember();

    }
}
