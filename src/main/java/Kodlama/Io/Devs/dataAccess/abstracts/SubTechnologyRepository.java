package Kodlama.Io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlama.Io.Devs.entities.concretes.SubTechnology;

public interface SubTechnologyRepository extends JpaRepository<SubTechnology, Integer>{

}
