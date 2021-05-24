package sg.edu.rp.c346.id20011066.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView tvDisplay;
    Button btnreturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvDisplay = findViewById(R.id.textView);
        btnreturn = findViewById(R.id.buttonReturn);

        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("Module Code");
        String name = intentReceived.getStringExtra("Module Name");
        int year = intentReceived.getIntExtra("Academic Year", 2020);
        int sem = intentReceived.getIntExtra("Semester", 0);
        int credit = intentReceived.getIntExtra("Module Credit", 0);
        String venue = intentReceived.getStringExtra("Venue");

        tvDisplay.setText("Module Code: " + code + "\nModule Name: " + name + "\nAcademic Year: " + year + "\nSemester: " + sem + "\nModule Credit: " + credit + "\nVenue: " + venue);

        btnreturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}