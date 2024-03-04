package guru.springframework.spring6reactivemongo.domain;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    @Id
    private Integer id;

    @Size(max = 255)
    private String customerName;

    @CreatedDate
    private LocalDateTime createDate;

    @CreatedDate
    private LocalDateTime lastModifiedDate;
}
