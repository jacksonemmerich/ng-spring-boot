package br.gov.ro.portovelho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.ro.portovelho.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
