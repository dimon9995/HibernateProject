package country;

import city.City;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "country", schema = "world")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "code", length = 3, nullable = false)
    private String code;

    @Column(name = "code_2", length = 2, nullable = false)
    private String alternateCode;

    @Column(name = "name", length = 52, nullable = false)
    private String name;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "continent", length = 0, nullable = false)
    private Continent continent;

    @Column(name = "region", length = 26, nullable = false)
    private String region;

    @Column(name = "surface_area", precision = 10, scale = 2)
    private BigDecimal surfaceArea;

    @Column(name = "indep_year")
    private Short independenceYear;

    @Column(name = "population")
    private Integer population;

    @Column(name = "life_expectancy", precision = 3, scale = 1)
    private BigDecimal lifeExpectancy;

    @Column(name = "gnp", precision = 10, scale = 2)
    private BigDecimal GNP;

    @Column(name = "gnpo_id", precision = 10, scale = 2)
    private BigDecimal gnpID;

    @Column(name = "local_name", length = 45)
    private String localName;

    @Column(name = "government_form", length = 45)
    private String governmentForm;

    @Column(name = "head_of_state", length = 60)
    private String headOfState;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "capital")
    private City city;

    @OneToMany(mappedBy = "country", fetch = FetchType.LAZY)
    private List<CountryLanguage> languages = new ArrayList<>();
}

