package com.example.taskmanagementapp.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.taskmanagementapp.repository.NoteRepository

class NoteViewModelFactory(val app: Application,private val noyteRepository: NoteRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NoteViewModel(app, noyteRepository) as T
    }
}