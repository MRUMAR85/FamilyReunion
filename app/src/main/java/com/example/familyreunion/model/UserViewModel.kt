package com.example.familyreunion.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.familyreunion.repositry.UserRepository
import com.example.familyreunion.roomdb.User
import kotlinx.coroutines.launch

class UserViewModel(private val repository: UserRepository) : ViewModel() {

    fun register(user: User, callback: (Long) -> Unit) {
        viewModelScope.launch {
            val userId = repository.insert(user)
            callback(userId)
        }
    }

    fun login(email: String, password: String, callback: (User?) -> Unit) {
        viewModelScope.launch {
            val user = repository.login(email, password)
            callback(user)
        }
    }
}

class UserViewModelFactory(private val repository: UserRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(UserViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return UserViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
