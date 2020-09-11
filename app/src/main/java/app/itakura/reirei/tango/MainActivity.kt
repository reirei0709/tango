package app.itakura.reirei.tango

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apple = Word(R.drawable.apple_icon,"りんご")
        val banana = Word(R.drawable.banana_icon,"バナナ")
        val orange = Word(R.drawable.orange_icon,"オレンジ")
        val strawberry = Word(R.drawable.strawberry_icon,"いちご")

        //りんご

        val nameTextView = TextView(applicationContext)

        nameTextView.text = apple.name
        //container.addView(nameTextView)

        val layout = LinearLayout(this.applicationContext)
        layout.orientation = LinearLayout.HORIZONTAL

        val imageView = ImageView(this)
        imageView.setImageResource(apple.resID)

        layout.addView(imageView)
        layout.addView(nameTextView)

        container.addView(layout)

        //バナナ
        val nameTextView2 = TextView(applicationContext)
        nameTextView2.text = banana.name
        //container.addView(nameTextView)

        val layout2 = LinearLayout(this.applicationContext)
        layout2.orientation = LinearLayout.HORIZONTAL

        val imageView2 = ImageView(this)
        imageView2.setImageResource(banana.resID)

        layout2.addView(imageView2)
        layout2.addView(nameTextView2)

        container.addView(layout2)

        //オレンジ
        val nameTextView3 = TextView(applicationContext)
        nameTextView3.text = orange.name
        //container.addView(nameTextView)

        val layout3 = LinearLayout(this.applicationContext)
        layout3.orientation = LinearLayout.HORIZONTAL

        val imageView3: ImageView = ImageView(this)
        imageView3.setImageResource(orange.resID)

        layout3.addView(imageView3)
        layout3.addView(nameTextView3)

        container.addView(layout3)

        //いちご
        val nameTextView4 = TextView(applicationContext)
        nameTextView4.text = strawberry.name
        //container.addView(nameTextView)

        val layout4 = LinearLayout(this.applicationContext)
        layout4.orientation = LinearLayout.HORIZONTAL

        val imageView4 = ImageView(this)
        imageView4.setImageResource(strawberry.resID)

        layout4.addView(imageView4)
        layout4.addView(nameTextView4)

        container.addView(layout4)


    }
}