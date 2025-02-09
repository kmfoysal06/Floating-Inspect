package com.example.floatingeruda

import android.content.Context
import android.widget.Toast

object ErudaInjector {
    fun injectEruda(context: Context) {
        val command = "input text 'javascript:(function(){var script=document.createElement(\"script\");script.src=\"https://cdn.jsdelivr.net/npm/eruda\";document.body.appendChild(script);script.onload=function(){eruda.init()};})();'"
        try {
            Runtime.getRuntime().exec(arrayOf("sh", "-c", command))
            Toast.makeText(context, "Eruda Injected!", Toast.LENGTH_SHORT).show()
        } catch (e: Exception) {
            Toast.makeText(context, "Failed to inject Eruda", Toast.LENGTH_SHORT).show()
            e.printStackTrace()
        }
    }
}
