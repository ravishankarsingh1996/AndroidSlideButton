package splashscreen.acer.example.com.androidslidebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.shitij.goyal.slidebutton.SwipeButton;

public class MainActivity extends AppCompatActivity {

    SwipeButton swipeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipeButton = (SwipeButton)findViewById(R.id.slide);
        swipeButton.addOnSwipeCallback(new SwipeButton.Swipe(){
            @Override
            public void onButtonPress() {

            }

            @Override
            public void onSwipeCancel() {

            }

            @Override
            public void onSwipeConfirm() {
                Toast.makeText(getApplicationContext(),"Swipe Done..", Toast.LENGTH_LONG).show();
            }
        });
    }
}
