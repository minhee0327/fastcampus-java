package chapter05.ch13;


import java.util.Comparator;

//comparator로 하고 싶을 때에는 MemberTreeSet쪽에 constructer 에서 생성할 때 Memeber 생성해줘야함.
public class Member implements Comparator<Member> {
    private int memberId;
    private String memberName;

    public Member() {
    }

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if( o instanceof Member){
            Member member = (Member) o;
            if(this.memberId == member.memberId){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public int compare(Member o1, Member o2) {
        return Integer.compare(o1.memberId, o2.memberId);
    }

    /*
    @Override
    public int compareTo(Member o) {
        //오름차
        return Integer.compare(this.memberId, o.memberId);
    }
     */

}
