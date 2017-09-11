package me.anna.demo.repositories;


import me.anna.demo.models.Skills;
import org.springframework.data.repository.CrudRepository;

public interface SkillsRepository extends CrudRepository<Skills,Long> {

    Skills findBySkillTitle(String SkillTitle);

    Iterable<Skills> findAllByJobsIsNotNull();

//    Iterable<Skills> findAllByPersonOrderById(Long id);



//    Iterable<Skills> findAll;

//    Iterable<Skills> findBy
//    Iterable<Skills> findAllByPersonIdOrderBySkillId(Long id);
//    findAllByOrderByIdAsc();
}
