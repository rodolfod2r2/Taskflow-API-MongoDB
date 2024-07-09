package org.framework.rodolfo.freire.git.taskflow.document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Gamification")
@Getter
@Setter
public class Gamification extends AuditMetadata {

    private String name;
    private String description;
    private int points;
    private Archive archive;
}
