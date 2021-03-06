package chapter05.ch11;

import chapter05.ch09.Member;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList(){
        arrayList = new ArrayList<>();
    }

    public MemberArrayList(int size){
        arrayList = new ArrayList<>(size);
    }

    public void addMember(Member member){
        arrayList.add(member);
    }

    public boolean remove(int memberId){
        Iterator<Member> ir = arrayList.iterator();

        while(ir.hasNext()){
            Member member = ir.next();
            if(member.getMemberId() == memberId){
                arrayList.remove(member);
                return true;
            }
        }
        System.out.println(memberId+" 가 없습니다.");
        return false;
    }

    public void showAllMember(){
        for(Member m: arrayList){
            System.out.println(m);
        }
    }
}
