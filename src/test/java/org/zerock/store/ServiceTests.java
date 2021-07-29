package org.zerock.store;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ServiceTests {
    private StoreService service;

    @Test
    public void test1() {
        service=new StoreService();
        StoreDTO storeDTO=service.findByMenuName("한식");
        System.out.println(storeDTO);
    }
}
