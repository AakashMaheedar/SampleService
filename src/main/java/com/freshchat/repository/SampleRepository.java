package com.freshchat.repository;

import com.freshchat.domain.Sample;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

public class SampleRepository {

    private static final String template = "Hello, %s!";

}
