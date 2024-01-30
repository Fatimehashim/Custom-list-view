package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myListdata = mutableListOf<MyData>()

        myListdata.add(MyData(R.drawable.facebook,"Facebook","C programming is considered as the base for other programming languages"))
        myListdata.add(MyData(R.drawable.cnn,"cnn","C programming is considered as the base for other programming languages"))
        myListdata.add(MyData(R.drawable.fox,"fox","C programming is considered as the base for other programming languages"))
        myListdata.add(MyData(R.drawable.instagram,"instagram","C programming is considered as the base for other programming languages"))
        myListdata.add(MyData(R.drawable.linkedin,"linkedin","C programming is considered as the base for other programming languages"))
        myListdata.add(MyData(R.drawable.messenger,"messenger","C programming is considered as the base for other programming languages"))
        myListdata.add(MyData(R.drawable.pinterest,"pintrest","C programming is considered as the base for other programming languages"))
        myListdata.add(MyData(R.drawable.reddit,"reddit","C programming is considered as the base for other programming languages"))

        myListdata.add(MyData(R.drawable.snapchat,"reddit","C programming is considered as the base for other programming languages"))
        myListdata.add(MyData(R.drawable.tiktok,"reddit","C programming is considered as the base for other programming languages"))
        myListdata.add(MyData(R.drawable.tumblr,"reddit","C programming is considered as the base for other programming languages"))
        myListdata.add(MyData(R.drawable.twitter,"reddit","C programming is considered as the base for other programming languages"))
        myListdata.add(MyData(R.drawable.wechat,"reddit","C programming is considered as the base for other programming languages"))
        myListdata.add(MyData(R.drawable.weibo,"reddit","C programming is considered as the base for other programming languages"))
        myListdata.add(MyData(R.drawable.whatsapp,"reddit","C programming is considered as the base for other programming languages"))
        myListdata.add(MyData(R.drawable.youtube,"reddit","C programming is considered as the base for other programming languages"))

        val myListView = findViewById<ListView>(R.id.mylistview)
        myListView.adapter = CustomAdapter(this,myListdata)

    }
}