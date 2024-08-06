package com.issog.jetheroescompose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.issog.jetheroescompose.data.JetHeroesRepository

@Suppress("UNCHECKED_CAST")
class JetHeroesViewModelFactory(
    private val repository: JetHeroesRepository
): ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(JetHeroesViewModel::class.java)) {
            return JetHeroesViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
    }
}