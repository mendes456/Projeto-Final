
package br.com.creche_pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.creche_pet.model.FrequenciaModel;

@Repository

public interface FrequenciaRepository extends JpaRepository<FrequenciaModel, Long> {
}
