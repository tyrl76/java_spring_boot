package com.example.put;

import com.example.put.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {

//    @PutMapping("/put")
//    public PutRequestDto put(@RequestBody PutRequestDto requestDto) {
//        System.out.println(requestDto);
//        return requestDto;
//    }

    @PutMapping("/put/{userId}")
    public PutRequestDto put(@RequestBody PutRequestDto requestDto, @PathVariable Long userId) {
        System.out.println(userId);
        return requestDto;
    }

}
