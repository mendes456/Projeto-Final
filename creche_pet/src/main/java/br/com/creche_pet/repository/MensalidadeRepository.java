
package br.com.creche_pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.creche_pet.model.MensalidadeModel;

@Repository

public interface MensalidadeRepository extends JpaRepository<MensalidadeModel, Long> {
}
