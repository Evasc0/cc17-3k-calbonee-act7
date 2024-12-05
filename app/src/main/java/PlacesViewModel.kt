import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mycityapp.R

class PlacesViewModel : ViewModel() {

    // LiveData to store the list of places
    private val _places = MutableLiveData<List<Place>>()
    val places: LiveData<List<Place>> get() = _places

    // Function to load places based on the selected category
    fun loadPlaces(category: String) {
        _places.value = when (category) {
            "Coffee Shops" -> listOf(
                Place("Cafe by the Ruins", "Iconic Baguio café", R.drawable.cafe_ruins),
                Place("Arca’s Yard", "Cozy café with a view", R.drawable.arcas_yard)
            )
            "Parks" -> listOf(
                Place("Burnham Park", "Central park with boat rides", R.drawable.burnham_park),
                Place("Wright Park", "Known for horseback riding", R.drawable.wright_park)
            )
            "Restaurants" -> listOf(
                Place("Good Taste", "Affordable Filipino dishes", R.drawable.good_taste),
                Place("Hill Station", "Fusion of Asian and European cuisine", R.drawable.hill_station)
            )
            else -> emptyList() // Return an empty list if the category is unknown
        }
    }
}
