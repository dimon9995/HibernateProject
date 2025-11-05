package city;


import country.Country;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "city", schema = "world")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", length = 35, nullable = false)
    private String name;

    @ManyToOne()
    @JoinColumn(name = "country_id")
    private Country countryCode;

    @Column(name = "district", length = 20)
    private String district;

    @Column(name = "population")
    private Integer population;

}
