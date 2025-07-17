package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Slf4j
@RestController
public class LogTestController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {

        String name = "Spring";

        //log.trace("trace my log = " + name); -> 로그 출력 레벨을 info 로 설정해도 해당 코드에 있는 더하기 연산이 발생함.
        log.trace("trace log={}", name);
        log.debug("debug log={}", name); // 개발 서버용
        log.info("info log={}", name); // 운영 서버
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        // 로그를 사용하지 않아도 a+b 계산 로직이 먼저 실행됨. 이런 방식으로 사용하면 x
        log.debug("String concat log=" + name);

        return "ok";
    }
}
