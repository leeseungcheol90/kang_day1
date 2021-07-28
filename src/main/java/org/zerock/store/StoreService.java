package org.zerock.store;

import lombok.NoArgsConstructor;

//메서드 우선 설계
//파라미터와 리턴 타입으로 데이터 위주
//생성자 의미 - ready
//멤버 변수 - 누적/상태/조력자
public class StoreService { // 로직 위주의 클래스

    private StoreDTO[] storeDTOS;

    public StoreService(StoreDTO[] storeDTOS) {
        this.storeDTOS = storeDTOS;
    }

    public StoreDTO findByMenuName(String menuName) {
        return null;
    }

}
