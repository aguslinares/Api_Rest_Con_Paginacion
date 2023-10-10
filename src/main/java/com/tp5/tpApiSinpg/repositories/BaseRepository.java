package com.tp5.tpApiSinpg.repositories;


import com.tp5.tpApiSinpg.entities.Base;
import com.tp5.tpApiSinpg.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.yaml.snakeyaml.events.Event;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface BaseRepository<E extends Base, ID extends Serializable> extends JpaRepository<E, ID> {



}
