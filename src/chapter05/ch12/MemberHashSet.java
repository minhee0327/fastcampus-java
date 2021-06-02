package chapter05.ch12;


import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet(){ hashSet = new HashSet<>();
    }

    public MemberHashSet(int size){
        hashSet = new HashSet<>(size);
    }

    public void addMember(Member member){
        hashSet.add(member);
    }

    public boolean remove(int memberId){
        Iterator<Member> ir = hashSet.iterator();

        while(ir.hasNext()){
            Member member = ir.next();
            if(member.getMemberId() == memberId){
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId+" 가 없습니다.");
        return false;
    }

    public void showAllMember(){
        for(Member m: hashSet){
            System.out.println(m);
        }
    }
}
