package com.example.quiz3; // Kendi uygulama adınıza göre düzenleyin

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.quiz3.R;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private CheckBox chk1;
    private CheckBox chk2;
    private RadioGroup rdbGp;
    private RadioButton rdb1;
    private RadioButton rdb2;
    private Spinner spin1;
    private SeekBar seek1;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // activity_main.xml dosyasını kullanın

        // XML dosyasındaki bileşenleri tanımlayın
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        chk1 = findViewById(R.id.chk1);
        chk2 = findViewById(R.id.chk2);
        rdbGp = findViewById(R.id.rdbGp);
        rdb1 = findViewById(R.id.rdb1);
        rdb2 = findViewById(R.id.rdb2);
        spin1 = findViewById(R.id.spin1);
        seek1 = findViewById(R.id.seek1);
        tv1 = findViewById(R.id.tv1);

        // Düğme 1 tıklama olayını dinleyin
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Düğme 1 tıklandığında yapılacak işlemleri burada belirleyin
                Toast.makeText(MainActivity.this, "Düğme 1 tıklandı", Toast.LENGTH_SHORT).show();
            }
        });

        // Düğme 2 tıklama olayını dinleyin
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Düğme 2 tıklandığında yapılacak işlemleri burada belirleyin
                Toast.makeText(MainActivity.this, "Düğme 2 tıklandı", Toast.LENGTH_SHORT).show();
            }
        });

        // CheckBox tıklama olayını dinleyin
        chk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // CheckBox tıklandığında yapılacak işlemleri burada belirleyin
                boolean isChecked = chk1.isChecked(); // CheckBox'ın durumunu kontrol edin
                if (isChecked) {
                    // CheckBox işaretli ise yapılacak işlemleri burada belirleyin
                } else {
                    // CheckBox işaretli değilse yapılacak işlemleri burada belirleyin
                }
            }
        });

        // RadioButton tıklama olayını dinleyin
        rdbGp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // Seçilen RadioButton'ı belirleyin
                RadioButton selectedRadioButton = findViewById(checkedId);
                if (selectedRadioButton != null) {
                    String selectedText = selectedRadioButton.getText().toString();
                    Toast.makeText(MainActivity.this, "Seçilen RadioButton: " + selectedText, Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Spinner seçim olayını dinleyin
        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Seçilen öğeyi belirleyin
                String selectedCity = spin1.getSelectedItem().toString();
                Toast.makeText(MainActivity.this, "Seçilen Şehir: " + selectedCity, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Hiçbir şey seçilmediğinde yapılacak işlemleri burada belirleyin
            }
        });

        // SeekBar değisim olayını dinleyin
        seek1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // SeekBar değerinin değiştiği her zaman çağrılır
                // progress değişkeni yeni değeri temsil eder
                // fromUser, kullanıcının etkileşime girdiğini gösterir
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Kullanıcı SeekBar'ı dokunmaya başladığında çağrılır
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Kullanıcı SeekBar'dan elini çektiğinde çağrılır
            }
        });

        // Diğer bileşenler için de tıklama olaylarını benzer şekilde dinleyebilirsiniz
    }
}
