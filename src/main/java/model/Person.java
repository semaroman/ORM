package model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @EmbeddedId
    private PersonFirstKey personFirstKey;
    private String phoneNumber;
    private String cityOfLiving;
}
