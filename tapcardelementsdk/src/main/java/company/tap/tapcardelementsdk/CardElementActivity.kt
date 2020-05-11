package company.tap.tapcardelementsdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import company.tap.tapuilibrary.TapImageView
import company.tap.tapuilibrary.TapTextView

class CardElementActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_element)
        setupHeader()
    }

    private fun setupHeader() {
        val businessName = findViewById<TapTextView>(R.id.businessName)
        businessName.text = getString(R.string.business_name)
        val businessIcon = findViewById<TapImageView>(R.id.businessIcon)
        businessIcon.setImageResource(company.tap.tapuilibrary.R.drawable.tap_logo)
        val cancelIcon = findViewById<TapImageView>(R.id.cancel_icon)
        cancelIcon.setImageResource(company.tap.tapuilibrary.R.drawable.cancel)

        cancelIcon.setOnClickListener {
            Toast.makeText(this, "You have clicked cancel", Toast.LENGTH_SHORT).show()
        }
    }

    }

