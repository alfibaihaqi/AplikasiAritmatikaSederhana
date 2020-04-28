package alfibaihaqi.e.aplikasiaritmatikasederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nilai1, nilai2;
    Button tambah, kurang, kali, bagi, bersih;
    TextView hasil;

    Double n1,n2,h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nilai1 = findViewById(R.id.edtNilai1);
        nilai2 = findViewById(R.id.edtNilai2);

        tambah = findViewById(R.id.btnTambah);
        kurang = findViewById(R.id.btnKurang);
        kali = findViewById(R.id.btnKali);
        bagi = findViewById(R.id.btnBagi);
        bersih = findViewById(R.id.btnBersih);

        hasil = findViewById(R.id.tvHasil);
        hasil.setText("");

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tambah();
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kurang();
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kali();
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bagi();
            }
        });

        bersih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               bersih();
            }
        });
    }

    private void bagi() {
        String angka1 = nilai1.getText().toString().trim();
        String angka2 = nilai2.getText().toString().trim();

        Boolean kosong = false;
        if (TextUtils.isEmpty(angka1)){
            kosong = true;
            nilai1.setError("nilai pertama tidak boleh kosong");
        }
        if (TextUtils.isEmpty(angka2)){
            kosong = true;
            nilai2.setError("nilai kedua tidak boleh kosong");
        }
        if (!kosong){
            n1 = Double.valueOf(nilai1.getText().toString().trim());
            n2 = Double.valueOf(nilai2.getText().toString().trim());
            h = n1 / n2;
            hasil.setText(h.toString());
        }
    }

    private void kali() {
        String angka1 = nilai1.getText().toString().trim();
        String angka2 = nilai2.getText().toString().trim();

        Boolean kosong = false;
        if (TextUtils.isEmpty(angka1)){
            kosong = true;
            nilai1.setError("nilai pertama tidak boleh kosong");
        }
        if (TextUtils.isEmpty(angka2)){
            kosong = true;
            nilai2.setError("nilai kedua tidak boleh kosong");
        }
        if (!kosong){
            n1 = Double.valueOf(nilai1.getText().toString().trim());
            n2 = Double.valueOf(nilai2.getText().toString().trim());
            h = n1 * n2;
            hasil.setText(h.toString());
        }
    }

    private void kurang() {
        String angka1 = nilai1.getText().toString().trim();
        String angka2 = nilai2.getText().toString().trim();

        Boolean kosong = false;
        if (TextUtils.isEmpty(angka1)){
            kosong = true;
            nilai1.setError("nilai pertama tidak boleh kosong");
        }
        if (TextUtils.isEmpty(angka2)){
            kosong = true;
            nilai2.setError("nilai kedua tidak boleh kosong");
        }
        if (!kosong){
            n1 = Double.valueOf(nilai1.getText().toString().trim());
            n2 = Double.valueOf(nilai2.getText().toString().trim());
            h = n1 - n2;
            hasil.setText(h.toString());
        }
    }

    private void bersih() {
        nilai1.setText("");
        nilai2.setText("");
        hasil.setText("");

        nilai1.requestFocus();
    }

    private void tambah() {
        String angka1 = nilai1.getText().toString().trim();
        String angka2 = nilai2.getText().toString().trim();

        Boolean kosong = false;
        if (TextUtils.isEmpty(angka1)){
            kosong = true;
            nilai1.setError("nilai pertama tidak boleh kosong");
        }
        if (TextUtils.isEmpty(angka2)){
            kosong = true;
            nilai2.setError("nilai kedua tidak boleh kosong");
        }
        if (!kosong){
            n1 = Double.valueOf(nilai1.getText().toString().trim());
            n2 = Double.valueOf(nilai2.getText().toString().trim());
            h = n1 + n2;
            hasil.setText(h.toString());
        }
    }
}
