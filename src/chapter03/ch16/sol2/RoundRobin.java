package chapter03.ch16.sol2;

public class RoundRobin implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("상담 전화 순서대로 대기열에서 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("다음 순서의 상담원에게 배분합니다.");
    }
}
