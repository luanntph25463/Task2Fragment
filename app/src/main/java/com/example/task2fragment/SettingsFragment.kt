package com.example.task2fragment

import android.os.Bundle
import android.content.SharedPreferences

import androidx.preference.PreferenceFragmentCompat

import androidx.preference.PreferenceManager

class SettingsFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.settings, rootKey)
    }
}