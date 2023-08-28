package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Agenda;

public interface AgendaRepository extends JpaRepository <Agenda , Long> {

}