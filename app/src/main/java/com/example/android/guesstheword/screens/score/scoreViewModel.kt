package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int) :ViewModel(){

    private var _eventplayagain = MutableLiveData<Boolean>()
    val eventplayagain : LiveData<Boolean>
    get() = _eventplayagain

    private var _score = MutableLiveData<Int>()
    val Score: LiveData<Int>
    get() = _score

    init {
        _score.value = finalScore
    }

    fun onPlayAgain(){
        _eventplayagain.value = true
    }

    fun onPlayAgainComplete(){
        _eventplayagain.value = false
    }
}