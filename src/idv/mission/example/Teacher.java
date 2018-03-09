package idv.mission.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
	
	@Value("${response}")
    private String message;

    public void say() {
        System.out.println(message);
    }
}
