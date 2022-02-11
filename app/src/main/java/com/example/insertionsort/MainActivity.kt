package com.example.insertionsort

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var x = InsertionSort(arrayListOf(7,3,5,8,2,9,4,15,6))
        println(arrayListOf(7,3,5,8,2,9,4,15,6))
        println(x.Sort())
    }
}

class InsertionSort(var insertList : ArrayList<Int>)
{
    fun Sort() : ArrayList<Int>
    {
        var temp : Int = 0
        var position: Int = 0

        for (i in 1 until insertList.size)
        {
            position = i
            temp = insertList[i]

            for ( j in i  downTo 0)
            {
                if (temp < insertList[j])
                {
                    insertList[position] = insertList[j]
                    insertList[j] = temp
                    position--
                }
            }

        }
        return insertList
    }
}
