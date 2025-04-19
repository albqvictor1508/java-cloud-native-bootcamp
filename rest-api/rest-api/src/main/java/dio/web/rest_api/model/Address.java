package dio.web.rest_api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @Column(nullable = false, unique = true)
    private String cep;
    private String street;
    private String complement;
    private String district;
    private String locale;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;
}
