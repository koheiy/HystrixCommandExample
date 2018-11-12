package co.jp.hystrixcommandexample.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/index/{name}")
    public String index(@PathVariable("name") String name) {
        return new SampleHystrixCommand(name).run().get();
    }
}
