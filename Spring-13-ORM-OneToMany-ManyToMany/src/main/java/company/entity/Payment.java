package company.entity;

import company.enums.Status;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "payments")
@Data
@NoArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "DATE")
    private LocalDate createdDate;

    private BigDecimal amount;

    private Status paymentStatus;

    @OneToOne(cascade = CascadeType.ALL)
    private PaymentDetails paymentDetails;

    @ManyToOne
    private Merchant merchant;

    @ManyToOne
    private Customer customer;

//    @OneToOne(cascade = CascadeType.ALL)
//    private Cart cart;

    public Payment(LocalDate createdDate, BigDecimal amount, Status paymentStatus) {
        this.createdDate = createdDate;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }
}
