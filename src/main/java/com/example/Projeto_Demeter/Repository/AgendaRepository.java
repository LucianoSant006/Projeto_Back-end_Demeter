package com.example.Projeto_Demeter.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Projeto_Demeter.entity.Agenda;

public interface AgendaRepository extends JpaRepository <Agenda , Long> {

}
