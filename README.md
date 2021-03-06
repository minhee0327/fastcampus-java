## FastCampus 
- 빠르게 java 복기 한다. (목표: 2021.04 말 ~ 2021.05 중순 저녁)
- 강의 자료: https://gitlab.com/easyspubjava/javacoursework
- 소스 코드: https://github.com/easyspubjava/FastCampus
- 되도록 쓰기보다 머리에 넣기
- 자주 잊거나, 잘 몰랐던 것들은 찾아보되 좋은 자료는 저장해두자.

## Reference
### Chapter02
- JVM Architecture 
    - https://bit.ly/3nIfWaR
    - https://2ssue.github.io/base/190509_PJI/
    - https://velog.io/@litien/JVM-%EA%B5%AC%EC%A1%B0
    - https://bit.ly/2PxpfgT
    - GC 방식: https://12bme.tistory.com/57
    - 아직 더 봐야되는 자료
      - https://d2.naver.com/helloworld/1329
      - https://d2.naver.com/helloworld/329631
      - https://yaboong.github.io/java/2018/06/09/java-garbage-collection/
  
- ch19 singleton pattern
  - 선생님 자료와 차이가 조금 있어서 주말에 Thomas 에게 물어보기
  
- Array
  - 배열 length 는 jvm 이 모두 관리한다. 한 번 생성하면, 변경할 수 없는 상수로 선언이 된다. (값을 읽을 수만 있고 변경 불가.) - java standard

- ch 21 deep copy vs shallow copy 차이.
    - `Object.clone` 에 대해 조금 더 알 필요 있음.
    - Cloneable interface override
    


### chapter03 
- ch03: super, 형변환
- ch10: 템플릿메서드
- ch15: diamond problem (다중상속에서 발생하는 문제)
    - https://siyoon210.tistory.com/125
    
### chapter04
- ch02: equal(), toString(), hashCode()
  - https://bit.ly/3tgD4OO
- ch03: string, stringBuilder(), stringBuffer()
  - https://ifuwanna.tistory.com/221

### chapter06
- ch06 stream 총정리
  - https://futurecreator.github.io/2018/08/26/java-8-streams/
- ch19 Decorator Pattern (Coffee 를 만들어서 데코레이터 패턴을 이해해보자)
  - 데코레이터 패턴은 마치 마트료시카(러시아 인형)처럼 계속 씌워나가는 패턴
  - 자바에서 입출력 스트림도 Decorator Pattern 내부적으로 구현하고있다.
  