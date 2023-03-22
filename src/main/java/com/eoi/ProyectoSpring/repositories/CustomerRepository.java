package com.eoi.ProyectoSpring.repositories;

import com.eoi.ProyectoSpring.entities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    /**
     *
     * tenemos la entidad Customer, y queremos generar un repositorio CRUD en la url /customer
     * Para ello informamos el collectionResourceRel = "customer", path = "customer"
     * y le decimos que nuestro repositorio extiende de un CrudRepository<T,Int>
     * CrudRepository<Customer, Integer>
     *
     * Esto crea un mapeo de servicios REST en la url /customer
     *
     * /customer para listar todos los customer
     * /customer/${id} para consultar detalle de un costumer
     *
     */

    /**
     *
     * Spring buscará los métodos findBy y los asociará al parámetro del mismo nombre
     *
     */

    List<Customer> findByName(@Param("name") String name);
    List<Customer> findBysecondName(@Param("secondName") String name);
    List<Customer> findBythirdName(@Param("thirdName") String name);

}
