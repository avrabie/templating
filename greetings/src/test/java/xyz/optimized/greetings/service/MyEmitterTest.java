package xyz.optimized.greetings.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

@SpringBootTest
class MyEmitterTest {

    @Autowired
    private MyEmitter myEmitter;

    @Test
    void testEmitter() {
        Flux<String> result = myEmitter.emitter();

        StepVerifier.create(result)
                .expectNext("Hello 0", "Hello 1", "Hello 2", "Hello 3", "Hello 4", "Hello 5", "Hello 6", "Hello 7", "Hello 8", "Hello 9")
                .verifyComplete();
    }
}