package com.devwillcode.bitlyapiconsume.controller;

import com.devwillcode.bitlyapiconsume.model.BitlyRequest;
import com.devwillcode.bitlyapiconsume.service.BitlyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class BitlyRestController {

    @Autowired
    BitlyService bitlyService;

    @PostMapping("/processBitly")
    public String processBitly (@RequestBody BitlyRequest bitlyRequest) {

        String shortUrl = bitlyService.getShortURL(bitlyRequest.getLongURL());
        return shortUrl;
    }
}
