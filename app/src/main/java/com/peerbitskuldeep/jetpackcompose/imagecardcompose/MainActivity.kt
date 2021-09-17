package com.peerbitskuldeep.jetpackcompose.imagecardcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.peerbitskuldeep.jetpackcompose.imagecardcompose.ui.theme.ImageCardComposeTheme
import java.lang.reflect.Modifier
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val painter = painterResource(id = R.drawable.panda)
            val contentDes = "HEY Panda!"
            val title = "Panda"

            Column {


                Box(
                    modifier = androidx.compose.ui.Modifier
                        .fillMaxWidth(0.5f)
                        .padding(16.dp)
                ) {

                    ImageCard(painter = painter, contentDescription = contentDes, title = title)

                }

                //2
                Box(
                    modifier = androidx.compose.ui.Modifier
                        .fillMaxWidth(0.5f)
                        .padding(16.dp)
                ) {

                    ImageCard(painter = painter, contentDescription = contentDes, title = title)

                }

                //3
                Box(
                    modifier = androidx.compose.ui.Modifier
                        .fillMaxWidth(0.5f)
                        .padding(16.dp)
                ) {

                    ImageCard(painter = painter, contentDescription = contentDes, title = title)

                }

                //4
                Box(
                    modifier = androidx.compose.ui.Modifier
                        .fillMaxWidth(0.5f)
                        .padding(16.dp)
                ) {

                    ImageCard(painter = painter, contentDescription = contentDes, title = title)

                }
            }

        }
    }
}

@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: androidx.compose.ui.Modifier = androidx.compose.ui.Modifier
) {

    //card
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = 10.dp
    ) {

        Box(modifier = androidx.compose.ui.Modifier.height(200.dp)) {

            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )

            //color gradient
            Box(
                modifier = androidx.compose.ui.Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent, //top
                                Color.Black //bottom
                            ),
                            startY = 300f
                        )
                    )
            )

            //for the set Text
            Box(
                modifier = androidx.compose.ui.Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ) {

                Text(
                    title, style = androidx.compose.ui.text.TextStyle(
                        color = Color.White,
                        fontSize = 16.sp
                    )
                )


            }
        }

    }


}
