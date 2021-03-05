package com.eftimoff.compose.features.main

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
import androidx.compose.ui.unit.sp
import com.eftimoff.compose.models.Recipe
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun MainScreen(viewModel: MainViewModel) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Recipes")
                },
                backgroundColor = MaterialTheme.colors.surface
            )
        }
    ) {
        val state = viewModel.state.observeAsState()

        when (val stateValue = state.value) {
            is MainViewModel.State.Loading -> MainLoading()
            is MainViewModel.State.Content -> MainContent(stateValue.recipes)
            is MainViewModel.State.Error -> Text(text = "Error")
        }
    }
}

@Composable
fun MainLoading() {
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
fun MainContent(
    recipes: List<Recipe> = emptyList()
) {
    LazyColumn(
        contentPadding = PaddingValues(top = 16.dp, start = 16.dp, end = 16.dp)
    ) {
        item {
            Text(
                text = "Receipts",
                style = MaterialTheme.typography.body1.copy(
                    fontSize = 20.sp
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            )
        }

        items(recipes) {
            RecipeCard(it)
        }
    }
}

@Preview
@Composable
fun PreviewReceiptCard() {
    val receipt = Recipe(
        0,
        0,
        "Test title2",
        0,
        "https://spoonacular.com/recipeImages/716413-556x370.jpg",
        ""
    )
    RecipeCard(recipe = receipt)
}

@Composable
fun RecipeCard(
    recipe: Recipe,
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
                data = recipe.image,
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
                text = recipe.title,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )
        }
    }
}