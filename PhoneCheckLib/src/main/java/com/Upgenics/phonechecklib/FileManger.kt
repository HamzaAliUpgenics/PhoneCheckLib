package com.Upgenics.phonechecklib

import android.content.Context
import android.util.Log
import android.widget.Toast

class FileManger() {
   @JvmField
   var fileName = "PhoneCheckUpgenics_SampleLib"
   companion object {
       fun helloUpgenics(context: Context) {
           Log.d("PhoneChekTag", "Lib implimented")
           Toast.makeText(context, "dev from PhoneCheck Upgenics int.", Toast.LENGTH_SHORT).show()
       }
   }

}