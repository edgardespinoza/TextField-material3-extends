package com.eespinor.textfields

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.MonitorWeight
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.eespinor.textfields.ui.theme.TextFieldsTheme

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextFieldsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        var filledText by remember {
                            mutableStateOf("")
                        }

                        TextField(
                            value = filledText,
                            onValueChange = { filledText=it},
                            textStyle = androidx.compose.material3.LocalTextStyle.current.copy(
                                textAlign = TextAlign.Right
                            ),
//                            label = {
//                                Text(text = "Enter your weight")
//                            },
                            placeholder = {
                                Text(text = "Weight")
                            },
                            leadingIcon = {
                                Icon(imageVector = Icons.Outlined.MonitorWeight,
                                    contentDescription = "Weight")
                            },
//                            trailingIcon = {
//                                Icon(imageVector = Icons.Outlined.Person, contentDescription = "Person")
//                            }
                           // prefix = {
                           //     Text(text = "$")
                           // }
                            suffix = {
                                Text(text = "kg")
                            },
                            supportingText = {
                                Text(text = "* required")
                            },
                            isError = true,
                            //visualTransformation = PasswordVisualTransformation()
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Decimal,
                                imeAction = ImeAction.Next
                            ),
                            keyboardActions = KeyboardActions(
                                onNext = {
                                    println("hello word")
                                }
                            ),

                        )

                        Spacer(modifier = Modifier.height(32.dp))

                        var outlinedTextField by remember {
                            mutableStateOf("")
                        }

                        TextField(
                            value = outlinedTextField,
                            onValueChange = { outlinedTextField=it},
                            textStyle = androidx.compose.material3.LocalTextStyle.current.copy(
                                textAlign = TextAlign.Right
                            ),
//                            label = {
//                                Text(text = "Enter your weight")
//                            },
                            placeholder = {
                                Text(text = "Weight")
                            },
                            leadingIcon = {
                                Icon(imageVector = Icons.Outlined.MonitorWeight,
                                    contentDescription = "Weight")
                            },
//                            trailingIcon = {
//                                Icon(imageVector = Icons.Outlined.Person, contentDescription = "Person")
//                            }
                            // prefix = {
                            //     Text(text = "$")
                            // }
                            suffix = {
                                Text(text = "kg")
                            },
                            supportingText = {
                                Text(text = "* required")
                            },
                            isError = true,
                            //visualTransformation = PasswordVisualTransformation()
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Decimal,
                                imeAction = ImeAction.Next
                            ),
                            keyboardActions = KeyboardActions(
                                onNext = {
                                    println("hello word")
                                }
                            ),



                            )
                    }
                }
            }
        }
    }
}
