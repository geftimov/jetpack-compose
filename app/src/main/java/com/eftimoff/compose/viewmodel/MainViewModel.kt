package com.eftimoff.compose.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.eftimoff.compose.api.Receipt
import com.eftimoff.compose.api.ReceiptApi
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val api: ReceiptApi
) : ViewModel() {

    sealed class State {
        object Loading : State()
        data class Content(val receipts: List<Receipt>) : State()
        object Error : State()
    }

    private val _state = MutableLiveData<State>(State.Loading)

    val state: LiveData<State>
        get() = _state

    init {
        viewModelScope.launch {
            delay(2000)
            val receipts = api.getReceipts().recipes
            _state.value = State.Content(receipts)
        }
    }

}