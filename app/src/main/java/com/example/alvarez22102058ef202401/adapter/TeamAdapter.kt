package com.example.alvarez22102058ef202401.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.alvarez22102058ef202401.R
import com.example.alvarez22102058ef202401.model.TeamModel

class TeamAdapter {
    /*class TeamAdapter (private var listTeam: List<TeamModel>):
     RecyclerView.Adapter<TeamAdapter.ViewHolder>(){

            class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
                val etNombreTeam: TextView = itemView.findViewById(R.id.etNombreTeam)
                val etUrlEscudo: TextView = itemView.findViewById(R.id.etUrlEscudo)
                val tvDorsal: TextView = itemView.findViewById(R.id.tvPdorsal)
                val tvTeam: TextView = itemView.findViewById(R.id.tvPteam)
                val tvType: TextView = itemView.findViewById(R.id.tvPtype)
                val tvApodo: TextView = itemView.findViewById(R.id.tvPapodo)
                val ivPlayer: ImageView = itemView.findViewById(R.id.ivPimagen)
            }

            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
                var layoutInflater = LayoutInflater.from(parent.context)
                return ViewHolder(layoutInflater.inflate(R.layout.item_players, parent, false))
            }

            override fun getItemCount(): Int {
                return lstPlayers.size

            }

            override fun onBindViewHolder(holder: ViewHolder, position: Int) {
                val itemPlayer = lstPlayers[position]
                holder.tvName.text = lstPlayers[position].pname
                holder.tvCountry.text = lstPlayers[position].pcountry
                holder.tvDorsal.text = lstPlayers[position].pdorsal.toString()
                //Importar a Picasso
                //comprobar si pimagen es null
                if (itemPlayer.pimagen != null){
                    Picasso.get()
                        .load(itemPlayer.pimagen)
                        .resize(300, 350)
                        .into(holder.ivPlayer)
                } else {
                    holder.ivPlayer.setImageResource(R.drawable.logo_player_final)
                    Toast.makeText(holder.itemView.context, "URL de imagen caído: ${holder.tvName}", Toast.LENGTH_LONG).show()
                }
                holder.tvTeam.text = lstPlayers[position].pteam
                holder.tvType.text = lstPlayers[position].ptype
                holder.tvApodo.text = lstPlayers[position].papodo

            }*/
}