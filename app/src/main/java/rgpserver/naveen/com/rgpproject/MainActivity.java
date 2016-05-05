package rgpserver.naveen.com.rgpproject;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    Button start_chat_server;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start_chat_server = (Button) findViewById(R.id.start_server);

        start_chat_server.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, chat.rocket.app.ui.splash.SplashActivity.class);
                startActivity(intent);

            }
        });

    }




}
