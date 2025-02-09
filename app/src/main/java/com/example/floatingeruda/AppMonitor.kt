package com.example.floatingeruda

import android.app.ActivityManager
import android.content.Context

object AppMonitor {
    fun isChromeRunning(context: Context): Boolean {
        val activityManager = context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        val runningApps = activityManager.runningAppProcesses ?: return false

        return runningApps.any { it.processName.contains("chrome", ignoreCase = true) }
    }
}
