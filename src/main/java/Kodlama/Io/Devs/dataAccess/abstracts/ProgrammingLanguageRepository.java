package Kodlama.Io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Kodlama.Io.Devs.entities.concretes.ProgrammingLanguage;
@Repository
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Integer> {

}
