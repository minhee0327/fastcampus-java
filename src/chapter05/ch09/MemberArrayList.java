package chapter05.ch09;

import java.util.ArrayList;

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
        for(int i= 0; i < arrayList.size(); i++){
            if(arrayList.get(i).getMemberId() == memberId){
                arrayList.remove(i);
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
