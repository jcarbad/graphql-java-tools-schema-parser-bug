package com.congero.sbgraphql.resolvers

import com.congero.sbgraphql.entities.Pet
import com.coxautodev.graphql.tools.GraphQLMutationResolver
import org.springframework.stereotype.Component

@Component
class Mutation implements GraphQLMutationResolver {

    Pet createPet(Map input) {
        def pet = new Pet(id: new Random().nextInt(1000) ,name: input.name, age: input.age, type: input.type)
        Query.pets << pet
        pet
    }
}
