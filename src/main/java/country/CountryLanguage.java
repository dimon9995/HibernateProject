package country;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import java.math.BigDecimal;

@Entity
@Table(name = "country_language", schema = "world")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountryLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    private Country country;

    private String language;
    @Column(name = "is_official", columnDefinition = "BIT")
    private Boolean isOfficial;

    @Column(name = "percentage", precision = 4, scale = 1)
    private BigDecimal percentage;
}
