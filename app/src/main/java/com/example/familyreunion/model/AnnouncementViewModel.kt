// AnnouncementViewModel.kt
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class AnnouncementViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: AnnouncementRepository = AnnouncementRepository(application)
    val allAnnouncements: LiveData<List<Announcement>> = repository.getAllAnnouncements()

    fun insert(announcement: Announcement) {
        repository.insert(announcement)
    }
}
