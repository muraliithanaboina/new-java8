package java8.streams.java8.streamspractice.dto;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;

@Component
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Slf4j
@Builder
public class studentsdto {

    private String name;
    private String lastname;
    private  String company;
    private Long salary;
}
