package xyz.optimized.greetings.service;

import org.springframework.stereotype.Service;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import reactor.core.publisher.Flux;

import java.util.concurrent.Executors;

@Service
public class MyEmitter {
    private final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

    public Flux<String> emitter() {
        Flux<String> result = Flux.create(stringFluxSink -> {
            singleThreadExecutor.submit(() -> {
                for (int i = 0; i < 10; i++) {
                    stringFluxSink.next("Hello " + i);
                }
                stringFluxSink.complete();
            });
        });
        return result;
    }
}
