package com.runitrut.composed_viewmodel_practice

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel() : ViewModel() {

    private val _repository: Repository = Repository()
    private val _counter = mutableStateOf(_repository.getCounter().count)

    // Expose the count as a an immutable state
    val count: MutableState<Int> = _counter

    fun increment() {
        _repository.increment()
        _counter.value = _repository.getCounter().count
    }
    fun decrement() {
        _repository.decrement()
        _counter.value = _repository.getCounter().count
    }
}