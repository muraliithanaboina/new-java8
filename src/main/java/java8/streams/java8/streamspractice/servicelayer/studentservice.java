package java8.streams.java8.streamspractice.servicelayer;

import java8.streams.java8.streamspractice.dao.studentjpa;
import java8.streams.java8.streamspractice.dto.studentsdto;
import java8.streams.java8.streamspractice.models.students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Service
public class studentservice {

    @Autowired
    private studentjpa student;
    @Autowired
    private students studentss;
    public  students mapping(studentsdto s){
    return students.builder()
            .company(s.getCompany())
            .lastname(s.getLastname())
            .salary(s.getSalary())
            .name(s.getName())
            .build();


    };
    public studentsdto studentdmapp(students s){
        return  studentsdto.builder()
                .lastname(s.getLastname())
                .company(s.getCompany())
                .salary(s.getSalary())
                .name(s.getName())
                .build();
    }
    public ResponseEntity<String> post(studentsdto ss){
      students k= (students) Stream.of(ss).map(h->mapping(h));
      student.save(k);

      return  new ResponseEntity<String>("sucess", HttpStatus.OK);

    }
    public List<studentsdto> fetch(){
     List<students> jl=  student.findAll();
     List<studentsdto>kk=jl.stream().limit(2).map(s->studentdmapp(s)).distinct().collect(Collectors.toList());


      return  kk;

    }
}

