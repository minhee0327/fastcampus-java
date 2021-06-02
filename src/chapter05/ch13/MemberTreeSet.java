package chapter05.ch13;


import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private TreeSet<Member> treeSet;

    public MemberTreeSet(){ treeSet = new TreeSet<>(new Member());
    }

    public void addMember(Member member){
        treeSet.add(member);
    }

    public boolean remove(int memberId){
        Iterator<Member> ir = treeSet.iterator();

        while(ir.hasNext()){
            Member member = ir.next();
            if(member.getMemberId() == memberId){
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId+" 가 없습니다.");
        return false;
    }

    public void showAllMember(){
        for(Member m: treeSet){
            System.out.println(m);
        }
    }
}
