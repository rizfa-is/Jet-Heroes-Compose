package com.issog.jetheroescompose.data

import com.issog.jetheroescompose.model.Hero
import com.issog.jetheroescompose.model.HeroesData

class JetHeroesRepository {
    fun getHeroes(): List<Hero> =
        HeroesData.heroes

    fun searchHeroes(query: String): List<Hero> {
        return HeroesData.heroes.filter {
            it.name.contains(query, ignoreCase = true)
        }
    }
}