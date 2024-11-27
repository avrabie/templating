package xyz.optimized.greetings.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import xyz.optimized.greetings.model.Tutorial;
import xyz.optimized.greetings.repos.TutorialRepo;
import xyz.optimized.greetings.service.MyEmitter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class Greetings {
    private final TutorialRepo tutorialRepo;
    private final MyEmitter myEmitter;

    public Greetings(TutorialRepo tutorialRepo, MyEmitter myEmitter) {
        this.tutorialRepo = tutorialRepo;
        this.myEmitter = myEmitter;
    }

    @GetMapping("/greetings")
    public Flux<String> greetings() {
        return Flux.just("Hello World!", " by Optimized", " from Spring Boot")
                .delayElements(java.time.Duration.ofSeconds(1));
    }

    @GetMapping("add/tutorial")
    public Mono<Tutorial> addTutorial() {
        Tutorial tutorial = Tutorial.builder()
                .title("Tutorial Title")
                .description("Tutorial Description")
                .publicationDate(LocalDateTime.now())
                .build();

        Mono<Tutorial> save = tutorialRepo.save(tutorial);
        return save;
    }

    @GetMapping("emitter")
    public Flux<String> emitter() {
        return myEmitter.emitter();
    }
}
