package com.xyz.mylibrary

import android.content.Context
import android.widget.Toast

object TestUtils {
    fun showToast2(context: Context) {
        Toast.makeText(context, "调成功！", Toast.LENGTH_SHORT).show()
    }
}