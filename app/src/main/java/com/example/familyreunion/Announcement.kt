// Announcement.kt
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "announcements")
data class Announcement(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val title: String,
    val description: String,
    val author: String,
    val date: String
)
