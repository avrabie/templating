package xyz.optimized.greetings.repos;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import xyz.optimized.greetings.model.Tutorial;

public interface TutorialRepo extends R2dbcRepository<Tutorial, Integer> {

}
