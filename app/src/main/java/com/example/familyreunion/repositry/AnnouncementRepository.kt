// AnnouncementRepository.kt
import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.Room

class AnnouncementRepository(context: Context) {
    private val db = Room.databaseBuilder(
        context.applicationContext,
        AppDatabase::class.java,
        "app_database"
    ).build()

    private val announcementDao = db.announcementDao()

    fun getAllAnnouncements(): LiveData<List<Announcement>> = announcementDao.getAllAnnouncements()

    fun insert(announcement: Announcement) {
        Thread {
            announcementDao.insert(announcement)
        }.start()
    }
}
