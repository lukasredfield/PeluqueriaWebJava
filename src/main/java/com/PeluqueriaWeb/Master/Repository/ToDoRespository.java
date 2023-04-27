package com.PeluqueriaWeb.Master.Repository;

import com.PeluqueriaWeb.Master.Model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRespository extends JpaRepository<Clientes, Long> {
}
