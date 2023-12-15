package hn.uth.appentrevista;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class ActivityP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p);

        Button btnIngresar = findViewById(R.id.btnIn);
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aquí es donde se realiza el cambio de actividad
                Intent intent = new Intent(ActivityP.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}