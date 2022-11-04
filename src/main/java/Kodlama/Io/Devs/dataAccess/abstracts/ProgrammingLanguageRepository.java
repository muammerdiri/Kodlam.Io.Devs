package Kodlama.Io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlama.Io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Integer> {

}
