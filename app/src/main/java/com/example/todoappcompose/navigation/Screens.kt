package com.example.todoappcompose.navigation

import androidx.navigation.NavHostController
import com.example.todoappcompose.utils.Action
import com.example.todoappcompose.utils.Constant.LIST_SCREEN


class Screens(navController: NavHostController) {
    val list: (Int) -> Unit = { taskId ->
        navController.navigate(route = "task/$taskId")
    }
    val task: (Action) -> Unit = { action ->
        navController.navigate(route = "list/${action}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }
}