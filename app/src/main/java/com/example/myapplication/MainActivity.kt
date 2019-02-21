package com.example.myapplication


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.EditText



class MainActivity : AppCompatActivity() {

    public final static String EXTRA_MESSAGE = "com.example.myapplication.MESSAGE";

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText =(EditText) fndViewById (R.id.edit_message);
        String message = editText . getText ().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    }


}
