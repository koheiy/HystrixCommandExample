package co.jp.hystrixcommandexample.web;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixThreadPoolKey;

import java.util.function.Supplier;

public class SampleHystrixCommand extends HystrixCommand<Supplier<String>> {

    public SampleHystrixCommand(String name) {
        super(HystrixCommandGroupKey.Factory.asKey("sample"),
                HystrixThreadPoolKey.Factory.asKey(name));
        System.out.println(name);
    }

    @Override
    protected Supplier<String> run() {
        return () -> { return "Hello"; };
    }
}
