package com.example.questnavigasimvvm.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import com.example.questnavigasimvvm.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun formIsian(
    jenisK:List<string> = listOf("Laki-Laki","perempuan"),
    OnSubmitBtnClick : () -> Unit
){
    Scaffold(modifier = Modifier,
        {
            TopAppBar(
                title = {Text(stringResource(id=R.string.home), color = color.White)},
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                colorResource(id = R.color.teal_700))
            )
        }) {isiruang ->
        Column(modifier = Modifier.padding(isiRuang),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally){
            OutlinedTextField(
                value = "",
                sin

            )
        }
    }
}