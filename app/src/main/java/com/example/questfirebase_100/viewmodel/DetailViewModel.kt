package com.example.questfirebase_100.viewmodel

import com.example.questfirebase_100.modeldata.Siswa
import com.example.questfirebase_100.repositori.RepositorySiswa
import com.example.questfirebase_100.view.route.DestinasiDetail

@file:OptIn(InternalSerializationApi::class)

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.serialization.InternalSerializationApi
import java.io.IOException

sealed interface StatusUIDetail {
    data class Success(val satusiswa: Siswa?) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}

