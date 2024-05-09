package br.senai.sp.jandira.contatos.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaHome() {
    Scaffold(
        topBar = {
             TopAppBar(
                 title = {
                    Text(
                        text = "Meu contatos",
                        fontWeight = FontWeight.Bold
                    )
                 },
                 colors = TopAppBarDefaults.topAppBarColors(
                     containerColor = Color(0xFF2D0F63),
                     titleContentColor = Color.White
                 )
             )
        },
        floatingActionButton = {
           FloatingActionButton(
               onClick = { /*TODO*/ },
               containerColor = Color(0xFF2D0F63),
               contentColor = Color.White,
               shape = CircleShape
           ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Botão adicionar"
                )
           }
        },
        content = {
            LazyColumn(
                modifier = Modifier
                    .padding(it)
            ){
                items(10){
                    Card (
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp)
                            .padding(horizontal = 16.dp, vertical = 16.dp)
                    ) {
                        Row (
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(horizontal = 16.dp)
                        ) {
                            Card (
                                modifier = Modifier
                                    .size(
                                        50.dp
                                    ),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color(0xFF2D0F63),
                                    contentColor = Color.White
                                ),
                                shape = CircleShape
                            ) {
                                Box (
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = "R",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 24.sp
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.width(12.dp))
                            Column{
                                Text(
                                    text = "Ryan Alves de Carvalho",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 16.sp
                                )
                                Text(text = "ryan@email.com")
                            }
                        }
                    }
                }
            }
        }
    )
}

@Preview (showSystemUi = true, showBackground = true)
@Composable
fun TelaHomePreview() {
    TelaHome()
}