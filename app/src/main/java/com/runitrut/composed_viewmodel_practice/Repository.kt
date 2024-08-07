package com.runitrut.composed_viewmodel_practice

class Repository {

    private var _counter = CounterModel(0)

    fun getCounter() = _counter

    fun increment() {
        _counter.count++
    }

    fun decrement() {
        _counter.count--
    }

}