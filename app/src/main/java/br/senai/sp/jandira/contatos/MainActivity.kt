package br.senai.sp.jandira.contatos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.contatos.screens.TelaCadastro
import br.senai.sp.jandira.contatos.screens.TelaHome
import br.senai.sp.jandira.contatos.ui.theme.ContatosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContatosTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TelaCadastro()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column {
        Text(text = stringResource(id = R.string.title))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = {
                Text(
                    text = stringResource(id = R.string.contact_name)
                )
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ContatosTheme {
        Greeting()
    }
}