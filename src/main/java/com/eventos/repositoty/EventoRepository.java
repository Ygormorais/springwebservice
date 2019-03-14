package com.eventos.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eventos.models.*;

public interface EventoRepository extends JpaRepository<Evento, String>{

}
