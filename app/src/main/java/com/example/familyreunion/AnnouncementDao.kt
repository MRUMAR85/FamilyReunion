// AnnouncementDao.kt
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface AnnouncementDao {
    @Query("SELECT * FROM announcements")
    fun getAllAnnouncements(): LiveData<List<Announcement>>

    @Insert
    fun insert(announcement: Announcement)
}
