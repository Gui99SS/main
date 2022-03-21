package br.com.guilhermeS.agendadecontatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.guilhermeS.agendadecontatos.databinding.ActivityMainBinding
import br.com.guilhermeS.agendadecontatos.model.Contact
import br.com.guilhermeS.agendadecontatos.model.ContactAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val contacts = listOf(
            Contact(name = "Guilherme S", phone = "1234"),
            Contact(name = "Guilherme C", phone = "9876"),
            Contact(name = "Gabriel M", phone = "5678"),
            Contact(name = "Evandro C", phone = "3489")
        )

        binding.rcContacts.adapter = ContactAdapter(contacts)
        binding.rcContacts.layoutManager = LinearLayoutManager(applicationContext)
        binding.rcContacts.setHasFixedSize(true)
    }
}