package com.github.felipetkr.todolist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.github.felipetkr.todolist.navigation.AppNavigation
import com.github.felipetkr.todolist.viewModel.TarefaViewModel
import com.github.felipetkr.todolist.ui.theme.TodolistTheme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            TodolistTheme {
                val viewModel: TarefaViewModel = viewModel(
                    factory = TarefaViewModel.factory(applicationContext)
                )

                AppNavigation(viewModel = viewModel)
            }
        }
    }
}