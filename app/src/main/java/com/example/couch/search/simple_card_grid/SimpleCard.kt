package com.example.couch.search.simple_card_grid

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.couch.R
import com.example.couch.ui.theme.DarkBlue
import com.example.couch.ui.theme.MyShapes
import com.example.couch.ui.theme.Shapes

@Composable
fun SimpleCard(
    modifier: Modifier = Modifier,
    @StringRes text: Int,
    @DrawableRes icon: Int,
    @DrawableRes background: Int,
    textHeight: Modifier = Modifier.height(50.dp)
) {

    Surface(
        modifier = modifier
            .size(150.dp),
        shape = MaterialTheme.shapes.medium,
        elevation = 2.dp
    ){
        Image(
            painter = painterResource(background),
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )
        Column(
            horizontalAlignment = Alignment.End,
            modifier = Modifier
                .padding(end = 10.dp, top = 10.dp)
        ) {
            Icon(
                painter = painterResource(icon),
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier
                    .size(46.dp)
            )
        }
        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .padding(horizontal = 15.dp)
                .padding(bottom = 15.dp)
        ) {
            Text(
                text = stringResource(text),
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                overflow = TextOverflow.Ellipsis,
                modifier = textHeight
            )
        }
    }
}