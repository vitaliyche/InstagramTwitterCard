package com.codeliner.instagramtwittercard.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codeliner.instagramtwittercard.R

@Composable
fun CardScreen() {

    Row(
        modifier = Modifier.fillMaxSize(),
        verticalAlignment = BiasAlignment.Vertical(0.324f)
    ) {

        Card(
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(25.dp))
        ) {

            Column() {

                val gradientWhiteBlack = Brush.verticalGradient(
                    0f to Color.White, 0.536f to Color.White, 1f to Color.Black
                )
                Column(
                    Modifier
                        .fillMaxWidth()
                        .padding(top = 14.dp, start = 14.dp, end = 14.dp)
                        .clip(RoundedCornerShape(13.dp))
                        .background(gradientWhiteBlack),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {

                    ProfileImage()

                    ProfileInfo()

                }

                RejectAndLikeButtonsRow()

            }
        }
    }
}

@Composable
fun ProfileImage() {
    Image(
        painter = painterResource(R.drawable.image_photo),
        contentDescription = "profile image",
        modifier = Modifier
            .padding(top = 100.dp, bottom = 78.dp)
            .size(200.dp)
            .fillMaxWidth()
    )
}

@Composable
fun ProfileInfo() {

    Row() {

        Column(
            modifier = Modifier
                .padding(start = 18.dp, end = 20.dp, bottom = 20.dp)
        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    text = "@willsmith ·",
                    style = TextStyle(fontSize = 20.sp),
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold
                )

                Text(
                    text = "55,4 млн",
                    modifier = Modifier.padding(start = 4.dp),
                    style = TextStyle(fontSize = 16.sp),
                    color = Color.White
                )

            }

            Row(
                modifier = Modifier.padding(top = 6.dp)
            ) {

                Text(
                    text = "Will Smith\n" +
                            "I wrote a book...",
                    style = TextStyle(fontSize = 12.sp),
                    color = Color.White.copy(alpha = 0.6f),
                )

                Spacer(modifier = Modifier.weight(1f))

                Icon(
                    painter = painterResource(id = R.drawable.ic_info),
                    contentDescription = "info",
                    tint = Color.White
                )

            }
        }
    }
}

@Composable
fun RejectAndLikeButtonsRow() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 18.dp, bottom = 20.dp),
        horizontalArrangement = Arrangement.Center
    ) {

        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.size(52.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.ic_reject),
                contentDescription = "reject"
            )

        }

        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(start = 48.dp)
                .size(52.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.ic_like),
                contentDescription = "like",
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardScreenPreview() {
    CardScreen()
}

/*
@Composable
fun BackgroundBlurredImage(image: Any) {
    Image(
        rememberAsyncImagePainter(
            model = ImageRequest.Builder(LocalContext.current)
                .data(image)
                .crossfade(true)
                .transformations(BlurTransformation(LocalContext.current, 20f, 3f))
                .scale(Scale.FILL).build(),
        ), null, modifier = Modifier.fillMaxSize()
    )
}*/
