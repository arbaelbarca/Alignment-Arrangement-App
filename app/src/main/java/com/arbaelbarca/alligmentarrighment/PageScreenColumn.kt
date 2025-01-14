package com.arbaelbarca.alligmentarrighment

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PageScreenHome() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        PageScreenColumn()
        Spacer(modifier = Modifier.padding(20.dp))
        PageScreenRowHome()
    }


}

@Composable
fun PageScreenColumn() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Column Alignment Start")

        Button(onClick = {

        }) {
            Text("Button 1")
        }

        Button(onClick = {

        }) {
            Text("Button 2")
        }

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.End,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Column Alignment End")

            Button(onClick = {

            }) {
                Text("Button 1")
            }

            Button(onClick = {

            }) {
                Text("Button 2")
            }
        }

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Column Alignment CenterHorizontal")

            Button(onClick = {

            }) {
                Text("Button 1")
            }

            Button(onClick = {

            }) {
                Text("Button 2")
            }
        }
    }
}

@Composable
fun PageScreenRowHome() {
    Column {
        Text("Column Alignment Start")
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = {

            }) {
                Text("Button 1")
            }

            Button(onClick = {

            }) {
                Text("Button 2")
            }
        }

        Column(
            horizontalAlignment = Alignment.End
        ) {
            Text("Column Alignment End")
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.Bottom
            ) {
                Button(onClick = {

                }) {
                    Text("Button 1")
                }

                Button(onClick = {

                }) {
                    Text("Button 2")
                }
            }
        }


        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Column Alignment End")
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(onClick = {

                }) {
                    Text("Button 1")
                }

                Button(onClick = {

                }) {
                    Text("Button 2")
                }
            }
        }

    }

}