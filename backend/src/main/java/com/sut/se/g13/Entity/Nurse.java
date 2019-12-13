package com.sut.se.g13.Entity;

import lombok.*;
import javax.persistence.*;
import java.util.*;

@Data
@Entity
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Table(name = "NURSE")
public class Nurse {
    //
    @Id
    @SequenceGenerator(name = "Nurse_seq", sequenceName = "Nurse_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Nurse_seq")
    @Column(name = "NURSE_ID", unique = true, nullable = true)
    private @NonNull Long nurseid;
    private @NonNull String nursename;
    
    /*@OneToMany(fetch = FetchType.EAGER)
    private Collection<Emergency> Emergency;*/
}