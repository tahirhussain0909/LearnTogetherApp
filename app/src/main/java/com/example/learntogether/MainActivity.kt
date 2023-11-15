package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BannerImage()
                    ArticleText(
                        articleTitle = stringResource(id = R.string.article_title),
                        articleBrief = stringResource(id = R.string.article_brief),
                        articleParagraph = stringResource(id = R.string.article_paragraph)
                    )
                }
            }
        }
    }
}

@Composable
fun BannerImage() {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Box {
        Image(painter = image, contentDescription = null)
    }
}

@Composable
fun ArticleText(
    articleTitle: String,
    articleBrief: String,
    articleParagraph: String,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = articleTitle,
            fontSize = 24.sp,
            textAlign= TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = articleBrief,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = articleParagraph,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}