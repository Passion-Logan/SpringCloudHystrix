package com.cody.controller;

import com.cody.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2019 XXX, Inc. All rights reserved. <p>
 *
 * @author WQL
 * @since 2019年12月6日 0006 18:33
 */
@RestController
public class DcController {

    @Autowired
    ConsumerService service;

    @GetMapping("consumer")
    public String dc() {
        return service.consumer();
    }
}
