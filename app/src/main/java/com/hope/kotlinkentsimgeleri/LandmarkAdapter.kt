import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hope.kotlinkentsimgeleri.DetailsActivity
import com.hope.kotlinkentsimgeleri.Landmark
import com.hope.kotlinkentsimgeleri.databinding.RecyclerRowBinding

class LandmarkAdapter(val landmarklist: ArrayList<Landmark>) : RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>() {

    class LandmarkHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
        val binding =  RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LandmarkHolder(binding)
    }

    override fun getItemCount(): Int {
        return landmarklist.size
    }

    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {
        holder.binding.recyclerViewTextView.text = landmarklist[position].name
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailsActivity::class.java)
            intent.putExtra("landmark",landmarklist.get(position))// veri yolamın farklı yoları da vidfeo da anlatıyor, 326 nını sonu(singleton)
            holder.itemView.context.startActivity(intent)
        }
    }
}