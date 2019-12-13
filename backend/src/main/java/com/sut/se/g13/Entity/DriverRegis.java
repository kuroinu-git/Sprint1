package com.sut.se.g13.Entity;

import lombok.*;
import javax.persistence.*;


@Data
@Entity
@NoArgsConstructor
@Table(name = "DRIVERREGIS")
public class DriverRegis {
    @Id
    @SequenceGenerator(name = "DriverRegis_seq", sequenceName = "DriverRegis_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DriverRegisr_seq")
    @Column(name = "DRIVERREGIS_ID", unique = true, nullable = true)

    private @NonNull Long driverregisid;
    private @NonNull String idcard;
    private @NonNull String driverregisname;
    private @NonNull String address;
    private @NonNull String phonenum;
    private @NonNull String username;
    private @NonNull String password;

}