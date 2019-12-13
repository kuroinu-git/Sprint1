package com.sut.se.g13.Entity;

import lombok.*;
import javax.persistence.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Data
@Entity
@ToString
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "AMBULANCE")
public class Ambulance {
  @Id
  @SequenceGenerator(name = "AMBULANCE_SEQ", sequenceName = "AMBULANCE_SEQ")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AMBULANCE_SEQ")
  @Column(name = "AMBULANCE_ID", unique = true, nullable = true)
  private @NonNull Long ambulanceid; // ไอดีรถ
  private @NonNull String ambulancemodel; // รุ่นรถ
  private @NonNull String ambulancenum; // เลขตัวรถ
  private @NonNull String licenseplate; // เลขทะเบียน (ไม่มีจังหวัด)
  private @NonNull String enginenum; // เลขเครื่องยนตร์

  @ManyToOne(fetch = FetchType.EAGER, targetEntity = Province.class)
  @JoinColumn(name = "PROVINCE_ID", insertable = true)
  private Province provinceid; // จังหวัดในป้ายทะเบียน (province)

}