package ma.enset.projecthospital;

import ma.enset.projecthospital.entities.Patient;
import ma.enset.projecthospital.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Date;

@SpringBootApplication
public class ProjectHospitalApplication  implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {

        SpringApplication.run(ProjectHospitalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        patientRepository.save(new Patient(null,"MOUSSA",new Date(),false,112));
        patientRepository.save(new Patient(null,"OUMAIMA",new Date(),false,300));
        patientRepository.save(new Patient(null,"AMIN",new Date(),false,344));
        patientRepository.save(new Patient(null,"HAJAR",new Date(),false,344));
        patientRepository.save(new Patient(null,"AYOUB",new Date(),false,344));

    }
}
