
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.familyreunion.Adapter.RecyclerView.AnnouncementAdapter
import com.example.familyreunion.R


class AnnouncementsActivity : AppCompatActivity() {
    private lateinit var viewModel: AnnouncementViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_announcements)

        viewModel = ViewModelProvider(this)[AnnouncementViewModel::class.java]

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        viewModel.allAnnouncements.observe(this, Observer { announcements ->
            announcements?.let {
                recyclerView.adapter = AnnouncementAdapter(it)
            }
        })

        // Insert sample announcements for testing
        insertSampleAnnouncements()
    }

    private fun insertSampleAnnouncements() {
        val sampleAnnouncements = listOf(
            Announcement(0, "Family Reunion Announcement at Restaurant", "Lorem ipsum dolor sit amet consectetur.", "Livia Donin", "9/18/16"),
            Announcement(1, "Family Reunion Announcement at Restaurant", "Lorem ipsum dolor sit amet consectetur.", "Livia Donin", "8/2/19"),
            Announcement(2, "Family Reunion Announcement at Restaurant", "Lorem ipsum dolor sit amet consectetur.", "Livia Donin", "7/11/19")
        )

        for (announcement in sampleAnnouncements) {
            viewModel.insert(announcement)
        }
    }
}
