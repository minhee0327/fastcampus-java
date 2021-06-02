package chapter05.ch13;


public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberLee = new Member(1004, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1001, "강감찬");
        Member memberHong = new Member(1003, "홍길동");

        //Member class 에 comparable interface 구현해서 이름 정렬되어 나옴(오름차)
        memberTreeSet.addMember(memberHong);
        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberKang);

        memberTreeSet.showAllMember();
        System.out.println();
        memberTreeSet.remove(memberKim.getMemberId());
        memberTreeSet.showAllMember();

    }
}
