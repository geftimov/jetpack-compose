package com.eftimoff.compose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.eftimoff.compose.api.Receipt
import com.eftimoff.compose.ui.theme.ComposeTheme
import com.eftimoff.compose.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import dev.chrisbanes.accompanist.coil.CoilImage

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                MainScreen()
            }
        }
    }

    @Composable
    fun MainScreen() {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text(text = "Recipes")
                    },
                    backgroundColor = MaterialTheme.colors.surface
                )
            }
        ) { innerPadding ->
            val state = viewModel.state.observeAsState()

            when (val stateValue = state.value) {
                is MainViewModel.State.Loading -> Loading()
                is MainViewModel.State.Content -> BodyContent(stateValue.receipts)
                is MainViewModel.State.Error -> Text(text = "Error")
            }
        }
    }

}

@Composable
fun Loading() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CircularProgressIndicator()
    }
}

@Composable
fun BodyContent(
    receipts: List<Receipt> = emptyList()
) {
    LazyColumn(
        contentPadding = PaddingValues(top = 16.dp, start = 16.dp, end = 16.dp)
    ) {
        item {
            Text(
                text = "Receipts",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, bottom = 16.dp)
            )
        }

        items(receipts) {
            RecipeCard(it)
        }
    }
}

@Preview
@Composable
fun PreviewReceiptCard() {
    val receipt = Receipt(
        0,
        0,
        "Test title2",
        0,
        "https://spoonacular.com/recipeImages/716413-556x370.jpg",
        ""
    )
    RecipeCard(receipt = receipt)
}

@Composable
fun RecipeCard(
    receipt: Receipt,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp),
        elevation = 8.dp
    ) {

        Column {

            CoilImage(
                data = receipt.image,
                contentDescription = "My content description",
                contentScale = ContentScale.Crop,
                error = {
                    Box(
                        modifier = Modifier.background(Color.Gray)
                    )
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
            )

            Text(
                text = receipt.title,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )
        }
    }
}