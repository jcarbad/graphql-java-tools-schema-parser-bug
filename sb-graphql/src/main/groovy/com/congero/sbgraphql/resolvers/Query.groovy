package com.congero.sbgraphql.resolvers


import com.congero.sbgraphql.entities.Pet
import org.springframework.stereotype.Component

import static com.congero.sbgraphql.enums.Animal.MAMMOTH
import com.coxautodev.graphql.tools.GraphQLQueryResolver

@Component
class Query implements GraphQLQueryResolver {

    static List<Pet> pets = []

    List<Pet> pets() {
//        Pet pet = new Pet(id: new Random().nextInt(1000), name: 'Bill', age: 9, type: MAMMOTH)
//        pets << pet
        pets
    }
}
