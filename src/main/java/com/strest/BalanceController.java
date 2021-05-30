package com.strest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping("/check-balance")
    public double checkBalance() {

        return 10000.00;
    }

    @GetMapping("/check-balance/{user}")
    public double checkBalanceForUser(@PathVariable String user){

        if(user.equalsIgnoreCase("hello")){
            return 100.00;
        }

        else if (user.equalsIgnoreCase("hii")){
            return 1000.00;
        }
        else if (user.equalsIgnoreCase("welcome")){
            return 10000.00;
        }
        return 100000.00;
    }
}
