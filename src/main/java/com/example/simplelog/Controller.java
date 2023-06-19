//package com.example.simplelog;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.UUID;
//
//@Slf4j
//@RestController
//@ResponseBody
//@RequestMapping("/echo")
//public class Controller {
//
//    @GetMapping("{str}")
//    public String getEcho(@PathVariable String str) {
//        log.info("getEcho() : {}", str);
//        String id = UUID.randomUUID().toString();
//        log.info("getEcho() : {} {}", str, id);
//        return id;
//
//    }
//}
