package java8.streams.java8.streamspractice.servicelayer;

import java8.streams.java8.streamspractice.dto.studentsdto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface studentservi {
    public ResponseEntity<String> post(studentsdto ss);
    public List<studentsdto> fetch();
}
