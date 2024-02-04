package com.learning.spring.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CourseController {

    @RequestMapping("/courses/{courseId}")
    public void test(@PathVariable Long courseId,
                     @RequestParam String name,
                     @RequestParam String instructor){
        System.out.println(courseId + " " + name + " " + instructor);
    }
}
