import java.util.Queue;
import java.util.LinkedList;

Queue<Integer> queue = new LinkedList<>();      // LinkedList를 이용하여 생성

// Queue 삽입 : Enqueue
queue.add(1);                                   // add는 삽입 성공시 true 반환, 사용 가능한 공간 없어서 삽입 실패시 illegalStateException 발생
queue.add(2);
queue.offer(3);                                 // offer는 삽입 성공시 true 반환, 하지만 사용 가능한 공간이 없어 삽입 실패시 false 반환

// Queue 삭제 : Dequeue
queue.poll();                                   // 헤드 요소를 조회(출력 가능)하고 제거, 하지만 큐가 비어있다면 null 반환
queue.remove();                                 // 헤드 요소를 조회(출력 가능)하고 제거, 하지만 큐가 비어있다면 예외 발생

// Queue 헤드 조회        
queue.element();                                // 헤드 요소 조회 및 반환, 하지만 큐가 비어있다면 예외 발생     
queue.peek();                                   // 헤드 요소 조회 및 반환, 하지만 큐가 비어있다면 null 반환
