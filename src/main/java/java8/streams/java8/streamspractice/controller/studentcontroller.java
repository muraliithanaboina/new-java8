package java8.streams.java8.streamspractice.controller;

import java8.streams.java8.streamspractice.dto.studentsdto;
import java8.streams.java8.streamspractice.servicelayer.studentservi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class studentcontroller {
    @Autowired
    private java8.streams.java8.streamspractice.servicelayer.studentservi studentservi;
     @PostMapping("student")
    public ResponseEntity<String>  postt(studentsdto stud ){
       return studentservi.post(stud);

    }
}
