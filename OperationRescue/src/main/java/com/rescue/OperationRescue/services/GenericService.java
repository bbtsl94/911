package com.rescue.OperationRescue.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rescue.OperationRescue.entity.GenericEntity;

import lombok.Data;

@Data
public abstract class GenericService<E extends GenericEntity, R extends JpaRepository<E, TipoID>, TipoID>
{
    private final R repository;
    private static final Logger logger = LoggerFactory.getLogger(GenericService.class);

    public List<E> findAll()
    {
        logger.info("Recupero di tutti gli elementi");
        List<E> entities = repository.findAll();
        logger.info("Recupero completato con successo");

        return entities;
    }

    public E findByID(TipoID id)
    {
        logger.info("Recupero dell'elemento con ID: {}", id);
        if(id != null ){
        E entity = repository.findById(id).get();
        if (entity == null )
        {
            logger.warn("Elemento non trovato con ID: {}", id);
            return null;
        }
        logger.info("Recupero completato con successo");
        return entity;
        }
        logger.warn("Elemento non valido perche è null");
        return null;
    }

    public E saveInDB(E entity)
    {
        logger.info("Salvataggio completato con successo");
        if(entity != null)
        return repository.save(entity);

        logger.info("Salvataggio negato perche l'oggetto è null ");
        return null;
    }
}