package com.rp.sec04;

import com.rp.courseutil.Util;
import com.rp.sec04.helper.OrderService;
import com.rp.sec04.helper.UserService;

public class Lec11Concat {
    public static void main(String[] args) {
        UserService.getUsers()
                .concatMap(user-> OrderService.getOrders(user.getUserId()))
                .subscribe(Util.subscriber());

        Util.sleep(10);
    }

    //final
    

}
