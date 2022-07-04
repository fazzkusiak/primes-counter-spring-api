package com.kub.async_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/primes")
    public int count(@RequestParam int start, @RequestParam int end) {
        return CountPrimes.sieveOfEratosthenes(start, end);
    }

}
