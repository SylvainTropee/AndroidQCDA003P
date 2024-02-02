package com.example.mod6demo3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    //prépare l'action suite au choix de l'utilisateur
    val activityContract =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) {isGranted ->
        //Action menée s'il est d'accord
        if(isGranted){
            Intent(Intent.ACTION_CALL, Uri.parse("tel:0606060606")).also {
                startActivity(it)
            }
        }else{
         //Action ménée pour le refus
            Intent(Intent.ACTION_DIAL, Uri.parse("tel:0606060606")).also {
                startActivity(it)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        activityContract.launch(android.Manifest.permission.CALL_PHONE)




    }
}