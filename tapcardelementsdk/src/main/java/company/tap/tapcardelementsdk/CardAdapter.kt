package company.tap.tapcardelementsdk

import android.text.InputType
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import company.tap.tapuilibrary.TapImageView
import company.tap.tapuilibrary.TapTextView

/**
 * Created by AhlaamK on 5/14/20.

Copyright (c) 2020    Tap Payments.
All rights reserved.
 **/
class CardAdapter(private val arrayList: ArrayList<Int>)  : RecyclerView.Adapter<CardAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.cardelement_list, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(aray: Int) {
            val textViewcard = itemView.findViewById<TapTextView>(R.id.textView_card)
            val imageViewmaster = itemView.findViewById<TapImageView>(R.id.imageView_master)
            val imageViewvisa = itemView.findViewById<TapImageView>(R.id.imageView_visa)
            val imageViewamex = itemView.findViewById<TapImageView>(R.id.imageView_amex)
            itemView.setOnClickListener {
                textViewcard.visibility= View.GONE
                imageViewamex.visibility = View.VISIBLE
            }
            textViewcard.setOnClickListener { view ->
                var inputText = ""
                val builder: android.app.AlertDialog.Builder = android.app.AlertDialog.Builder(itemView.context)
                builder.setTitle("Chip Content")
                builder.setMessage("Enter a string value")
                // Set up the input
                val input = EditText(itemView.context)
                // Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
                input.inputType = InputType.TYPE_CLASS_TEXT
                builder.setView(input)
                // Set up the buttons
                builder.setPositiveButton(
                    "Submit"
                ) { dialog, _ ->
                    inputText = input.text.toString()
                    textViewcard.text = inputText

                }
                builder.setNegativeButton(
                    "Cancel"
                ) { dialog, _ -> dialog.cancel() }
                builder.show()
            }
            }
            //textView.text = version.name

           // Glide.with(itemView.context).load(version.url).into(imageView)
        }


    }
