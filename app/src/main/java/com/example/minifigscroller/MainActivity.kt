 package com.example.minifigscroller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.minifigscroller.model.Minifig
import com.example.minifigscroller.ui.theme.MinifigScrollerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MinifigScrollerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MinifigScrollerTheme {
        Greeting("Android")
    }
}

 @Composable
 private fun MinifigList(minifigList: List<Minifig>, modifier: Modifier = Modifier) {
     LazyColumn {
         items(minifigList){
                 minifig -> MinifigCard(minifig)
         }
     }
 }
 @Composable
 fun MinifigCard(minifig: Minifig, modifier: Modifier = Modifier) {

     Card(
         modifier = modifier.padding(8.dp),
         elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
     ){

         Image(
             painter = painterResource(minifig.imageResourceId),
             contentDescription = stringResource(minifig.stringResourceId),
             modifier = Modifier
                 .fillMaxWidth()
                 .height(194.dp),
             contentScale = ContentScale.Crop
         )
         Text(
             text = stringResource(minifig.stringResourceId),
             modifier = Modifier.padding(16.dp),
             style = MaterialTheme.typography.labelLarge
         )
     }
 }

 @Preview(showBackground = true)
 @Composable
 fun MinifigCardPreview() {
     MinifigCard(
         Minifig(R.string.character1, R.drawable.image1)
     )
 }