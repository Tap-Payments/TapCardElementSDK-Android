package company.tap.tapcardelementsdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import company.tap.tapanimationkit.AnimateView

import company.tap.tapuilibrary.TapImageView
import company.tap.tapuilibrary.TapTextView

class CardElementActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AnimateView.animateSlideUp(this)
        setContentView(R.layout.activity_card_element)
        setupHeader()
        setupGroupChip()
    }

    private fun setupGroupChip() {
        val groupName = findViewById<TapTextView>(R.id.group_name)
        groupName.text = "Recent"
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

    override fun onBackPressed() {
        super.onBackPressed()
        AnimateView.animateSlideDown(this)
    }
}

