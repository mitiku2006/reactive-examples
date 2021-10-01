package com.example.reactiveexamples;

import com.example.reactiveexamples.domain.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class PersonRepositoryImpl implements PersonRepository {

    Person p1 = new Person(1, "Mit", "Sel");
    Person p2 = new Person(2, "Abebe", "Besso");
    Person p3 = new Person(3, "Lemma", "Jaga");
    Person p4 = new Person(4, "Hir", "Abe");

    @Override
    public Mono<Person> getById(Integer id) {
        return Mono.just(p1);
    }

    @Override
    public Flux<Person> findAll() {
        return Flux.just(p1,p2,p3,p4);
    }
}
