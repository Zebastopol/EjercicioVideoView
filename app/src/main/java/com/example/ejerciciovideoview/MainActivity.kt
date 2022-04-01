package com.example.ejerciciovideoview

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnVideo1: Button = findViewById(R.id.btnVideo1)
        val btnVideo2: Button = findViewById(R.id.btnVideo2)
        val btnVideo3: Button = findViewById(R.id.btnVideo3)
        val btnVideo4: Button = findViewById(R.id.btnVideo4)

        val myVideoView: VideoView = findViewById(R.id.myVideoView)
        val ruta: String = "android.resource://${packageName}/${R.raw.kine_uno}"
        val videoUri: Uri = Uri.parse(ruta)
        myVideoView.setVideoURI(videoUri)

        val ruta2:String = "android.resource://${packageName}/${R.raw.kine_dos}"
        val videoUri2: Uri= Uri.parse(ruta2)
        val ruta3:String = "android.resource://${packageName}/${R.raw.kine_tres}"
        val videoUri3: Uri= Uri.parse(ruta3)
        val ruta4:String = "android.resource://${packageName}/${R.raw.kine_cuatro}"
        val videoUri4: Uri= Uri.parse(ruta4)

        val mediaController = MediaController(this)
        myVideoView.setMediaController(mediaController)
        mediaController.setAnchorView(myVideoView)
        myVideoView.setOnPreparedListener {  myVideoView.start() }

        myVideoView.setOnCompletionListener { myVideoView.setVideoURI(videoUri2)

                myVideoView.setOnCompletionListener { myVideoView.setVideoURI(videoUri3)

                    myVideoView.setOnCompletionListener { myVideoView.setVideoURI(videoUri4)
                            myVideoView.setOnCompletionListener { Toast.makeText(this,"Se han visto todos los Videos", Toast.LENGTH_SHORT).show() }
                    }
                }
            }


        btnVideo1.setOnClickListener() {
            /*val ruta: String = "android.resource://${packageName}/${R.raw.kine_uno}"
            val videoUri: Uri = Uri.parse(ruta)*/
            myVideoView.setVideoURI(videoUri)
            myVideoView.setOnCompletionListener {
                            myVideoView.setVideoURI(videoUri2)
            myVideoView.setOnCompletionListener { myVideoView.setVideoURI(videoUri3)
            myVideoView.setOnCompletionListener { myVideoView.setVideoURI(videoUri4)
            myVideoView.setOnCompletionListener { Toast.makeText(this,"Se han visto todos los Videos", Toast.LENGTH_SHORT).show() }
                    }
                }
            }
        }
        btnVideo2.setOnClickListener() {
            /*val ruta2:String = "android.resource://${packageName}/${R.raw.kine_dos}"
            val videoUri2: Uri= Uri.parse(ruta2)*/
            myVideoView.setVideoURI(videoUri2)
            myVideoView.setOnCompletionListener {
                            myVideoView.setVideoURI(videoUri3)
                myVideoView.setOnCompletionListener { myVideoView.setVideoURI(videoUri4)
                myVideoView.setOnCompletionListener { myVideoView.setVideoURI(videoUri)
                myVideoView.setOnCompletionListener { Toast.makeText(this,"Se han visto todos los Videos", Toast.LENGTH_SHORT).show() }
                    }
                }
            }
        }
        btnVideo3.setOnClickListener() {
            /*val ruta3:String = "android.resource://${packageName}/${R.raw.kine_tres}"
            val videoUri3: Uri= Uri.parse(ruta3)*/
            myVideoView.setVideoURI(videoUri3)
            myVideoView.setOnCompletionListener {
                            myVideoView.setVideoURI(videoUri4)
                myVideoView.setOnCompletionListener { myVideoView.setVideoURI(videoUri)
                myVideoView.setOnCompletionListener { myVideoView.setVideoURI(videoUri2)
                myVideoView.setOnCompletionListener { Toast.makeText(this,"Se han visto todos los Videos", Toast.LENGTH_SHORT).show() }
                    }
                }
            }
        }
        btnVideo4.setOnClickListener() {
            /*val ruta4:String = "android.resource://${packageName}/${R.raw.kine_cuatro}"
            val videoUri4: Uri= Uri.parse(ruta4)*/
            myVideoView.setVideoURI(videoUri4)
            myVideoView.setOnCompletionListener {
                            myVideoView.setVideoURI(videoUri)
                myVideoView.setOnCompletionListener { myVideoView.setVideoURI(videoUri2)
                myVideoView.setOnCompletionListener { myVideoView.setVideoURI(videoUri3)
                myVideoView.setOnCompletionListener { Toast.makeText(this,"Se han visto todos los Videos", Toast.LENGTH_SHORT).show() }
                    }
                }
            }

        }


        /* */



    }
}



