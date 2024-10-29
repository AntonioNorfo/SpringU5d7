package antonio.u5d7.Payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BlogPostPayload {
    private String titolo;
    private String contenuto;
    private String categoria;
    private LocalDate tempoLettura;
}
