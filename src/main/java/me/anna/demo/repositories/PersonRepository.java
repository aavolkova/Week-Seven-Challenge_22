package me.anna.demo.repositories;


import me.anna.demo.models.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,Long> {

    Person findByUsername(String username);

    Person findByEmailAddress(String emailAddress);

    Long countByEmailAddress(String emailAddress);

    Long countByUsername(String username);

    Person findById(Long id);

//    Iterable<Person> findAllByByEducationalAchievements_EducationalInstitution(String university);
//    Iterable<Person> findAllByEducationalAchievements_
    Iterable<Person> findAllByFirstNameAndLastName (String firstName, String lastName);

}
