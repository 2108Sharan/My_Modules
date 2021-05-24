package sg.edu.rp.c346.id20011066.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnM1;
    Button btnM2;
    Button btnM3;
    Button btnM4;
    Button btnM5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnM1 = findViewById(R.id.buttonM1);
        btnM2 = findViewById(R.id.buttonM2);
        btnM3 = findViewById(R.id.buttonM3);
        btnM4 = findViewById(R.id.buttonM4);
        btnM5 = findViewById(R.id.buttonM5);

        btnM1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "C203");
                intent.putExtra("Module Name", "Web App Development in PHP");
                intent.putExtra("Academic Year", 2021);
                intent.putExtra("Semester", 1);
                intent.putExtra("Module Credit", 4);
                intent.putExtra("Venue", "W67L");
                startActivity(intent);
            }
        });
        btnM2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "C331");
                intent.putExtra("Module Name", "Digital Security & Forensics");
                intent.putExtra("Academic Year", 2021);
                intent.putExtra("Semester", 1);
                intent.putExtra("Module Credit", 4);
                intent.putExtra("Venue", "E61J");
                startActivity(intent);
            }
        });
        btnM3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "C228");
                intent.putExtra("Module Name", "Operating System Security");
                intent.putExtra("Academic Year", 2021);
                intent.putExtra("Semester", 1);
                intent.putExtra("Module Credit", 4);
                intent.putExtra("Venue", "E62L");
                startActivity(intent);
            }
        });
        btnM4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "C346");
                intent.putExtra("Module Name", "Android Programming");
                intent.putExtra("Academic Year", 2021);
                intent.putExtra("Semester", 1);
                intent.putExtra("Module Credit", 4);
                intent.putExtra("Venue", "E62E");
                startActivity(intent);
            }
        });
        btnM5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "C328");
                intent.putExtra("Module Name", "Intelligent Networks");
                intent.putExtra("Academic Year", 2021);
                intent.putExtra("Semester", 1);
                intent.putExtra("Module Credit", 4);
                intent.putExtra("Venue", "E62C");
                startActivity(intent);
            }
        });
    }
}