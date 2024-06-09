// AppDatabase.kt
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Announcement::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun announcementDao(): AnnouncementDao
}
