package com.sut.se.g13;

import com.sut.se.g13.Entity.*;
import com.sut.se.g13.Repository.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class SpringBootVueApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootVueApplication.class, args);
	}

	@Bean
	ApplicationRunner init(AmbulanceRepository ambulanceRepository, NurseRepository nurseRepository,
			SymptomRepository symptomRepository, DriverRegisRepository driverRegisRepository) {
		return args -> {

			Stream.of("วบ66", "ภน78", "กต567", "ธก200", "ญภ9998").forEach(licenseplate -> {
				Ambulance ambulance = new Ambulance(); // สร้าง Object Ambulance
				ambulance.setLicenseplate(licenseplate); // set ชื่อ (licenseplate) ให้ Object ชื่อ Ambulance
				ambulanceRepository.save(ambulance); // บันทึก Objcet ชื่อ Ambulance
			});

			Stream.of("Ren Nanase", "Remi Shinjyo", "Ako Fujisawa", "Hikaru Kodama", "Mayumi Shinozaki", "Ayako Makino",
					"Chitose Hiyama", "Akira Osaki", "Yoshino Fukakawa").forEach(nursename -> {
						Nurse nurse = new Nurse(); // สร้าง Object Nurse
						nurse.setNursename(nursename); // set ชื่อ (nursename) ให้ Object ชื่อ Nurse
						nurseRepository.save(nurse); // บันทึก Objcet ชื่อ Nurse
					});

			Stream.of("หัวใจหยุดเต้น", "อวัยวะฉีกขาด ", "สติเปลี่ยนไป", "ไม่สามารถหายใจได้ปกติ",
					"ระบบไหลเวียนเลือดวิกฤต", "อาการอื่นๆ ").forEach(type -> {
						Symptom symptom = new Symptom(); // สร้าง Object Symptom
						symptom.setType(type); // set ชื่อ (type) ให้ Object ชื่อ Symptom
						symptomRepository.save(symptom); // บันทึก Objcet ชื่อ Symptom
					});
			Stream.of("Takumi", "Yuta", "Masaru", "Naoya", "Daniel Garcia").forEach(driverregisname -> {
				DriverRegis driverRegis = new DriverRegis(); // สร้าง Object DriverRegis
				driverRegis.setDriverregisname(driverregisname); // set ชื่อ (name) ให้ Object ชื่อ DriverRegis
				driverRegisRepository.save(driverRegis); // บันทึก Objcet ชื่อ DriverRegis
			});

			ambulanceRepository.findAll().forEach(System.out::println); // แสดง ข้อมูลทั้งหมดใน Entity Ambulance บน Terminal
			nurseRepository.findAll().forEach(System.out::println); // แสดง ข้อมูลทั้งหมดใน Entity Nurse บน Terminal
			symptomRepository.findAll().forEach(System.out::println); // แสดง ข้อมูลทั้งหมดใน Entity Symptom บน Terminal
			driverRegisRepository.findAll().forEach(System.out::println); // แสดง ข้อมูลทั้งหมดใน Entity Driver บน Terminal
		};
	}

}