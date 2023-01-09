package com.task.onetaskapp.utils.viewstate

import com.task.onetaskapp.model.task.Task


sealed class ViewState {
    // Represents different states for the All Task screen
    object Empty : ViewState()
    object Loading : ViewState()
    object Loaded : ViewState()
    object Idle : ViewState()
    data class Success(val task: List<Task>) : ViewState()
    data class Error(val exception: Throwable) : ViewState()
}
