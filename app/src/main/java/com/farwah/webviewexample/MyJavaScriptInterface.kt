package com.farwah.webviewexample

import android.content.Context
import android.webkit.JavascriptInterface
import android.widget.Toast

class MyJavaScriptInterface(private val context: Context) {

    @JavascriptInterface
    fun showToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()

    }

}