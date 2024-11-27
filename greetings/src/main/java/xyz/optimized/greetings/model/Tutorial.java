package xyz.optimized.greetings.model;


import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
public class Tutorial {
    @Id
    private int id;
    private String title;
    private String description;
    private LocalDateTime publicationDate;

}
