package org.zerock.store;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        StoreDTO[] tmp=new StoreDTO[3];
        tmp[0]= StoreDTO.builder()
                .name("한글식당")
                .lat(37.12334)
                .lng(127.23332)
                .menu("제육밥")
                .build();
        tmp[1]= StoreDTO.builder()
                .name("짬밥식당")
                .lat(32.33334)
                .lng(117.23332)
                .menu("롯데버거")
                .build();
        tmp[2]= StoreDTO.builder()
                .name("김치식당")
                .lat(22.33334)
                .lng(107.23332)
                .menu("버거킹")
                .build();
        StoreService storeService=new StoreService(tmp);

     }

}
