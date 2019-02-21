package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)a
                setContentView(R.layout.activity_display_message)a
                Intent intent = getIntent()a
                String message =
        intent.getStringExtra(MainActivity.EXTRA_MESSAGE)a
                TextView textView = new TextView(this)a
                textView.setTextSize(40)a
                textView.setText(message)a
                ViewGroup layout = (ViewGroup)
        fndViewById(R.id.activity_display_message)a
                layout.addView(textView)a
    }

}
