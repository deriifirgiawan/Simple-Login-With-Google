package com.derifdev.loginwithgoogle.viewModel

import androidx.lifecycle.ViewModel
import com.derifdev.loginwithgoogle.models.User
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class AuthViewModel: ViewModel() {
    private val _user: MutableStateFlow<User?> = MutableStateFlow(null)
    val user: StateFlow<User?> = _user

    suspend fun signIn(email: String, displayName: String) {
        delay(2000)
        _user.value = User(email, displayName)
    }
}