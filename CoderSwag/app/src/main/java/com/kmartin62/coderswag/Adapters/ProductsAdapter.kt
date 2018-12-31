package com.kmartin62.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.kmartin62.coderswag.Model.Product
import com.kmartin62.coderswag.R
import kotlinx.android.synthetic.main.product_list_item.view.*

class ProductsAdapter(val context: Context, val products: List<Product>) : RecyclerView.Adapter<ProductsAdapter.Holder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Holder {
        val view = LayoutInflater.from(p0.context)
            .inflate(R.layout.product_list_item, p0, false)

        return Holder(view)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(p0: Holder, p1: Int) {
        p0.bindFunction(products[p1], context)
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val productImage = itemView.findViewById<ImageView>(R.id.productImage)
        val productName = itemView.findViewById<TextView>(R.id.productName)
        val productPrice = itemView.findViewById<TextView>(R.id.productPrice)

        fun bindFunction(product: Product, context: Context){
            val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)

            productImage.setImageResource(resourceId)
            productName.text = product.title
            productPrice.text = product.price
        }
    }
}