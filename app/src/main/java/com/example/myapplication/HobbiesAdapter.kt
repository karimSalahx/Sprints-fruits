package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater

import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class HobbiesAdapter(val context: Context,val hobbies: List<Fruit>) : RecyclerView.Adapter<HobbiesAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var currentHobby: Fruit? = null
        var currentPosition: Int = 0


//        init {
//            itemView.setOnClickListener {
//                val intent = Intent(context , FruitDetailsActivity::class.java)
//                intent.putExtra("text",currentHobby!!.title)
//                intent.putExtra("image",currentHobby!!.image)
//                context.startActivity(intent)
//
//            }
//        }

        fun setData(fruit: Fruit? , pos : Int) {
            itemView.txvTitle.text  = fruit!!.title
            itemView.fruitImg.setBackgroundResource(fruit.image)
            currentHobby = fruit
            currentPosition = pos
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val view =  LayoutInflater.from(context).inflate(R.layout.list_item , parent , false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val hobby = hobbies[position]
        holder.setData(hobby , position)
        holder.itemView.setOnClickListener {
            val intent = Intent(context , FruitDetailsActivity::class.java)
            intent.putExtra("text",hobby.title)
            intent.putExtra("image",hobby.image)
            Toast.makeText(context , hobby.title , Toast.LENGTH_SHORT).show()
            context.startActivity(intent)
        }
    }



    override fun getItemCount(): Int {
        return hobbies.size
    }
}