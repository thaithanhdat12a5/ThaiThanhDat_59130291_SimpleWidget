package vn.edu.ntu.thanhdat.thaithanhdat_59130291_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtTen,edtNgaySinh,edtSoThich;
    RadioGroup rdgGioiTinh;
    CheckBox ckb1,ckb2,ckb3,ckb4,ckb5;
    Button btnXacNhan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvents();
        }
    //----------------------------Tìm biến---------------------------------
    private void addViews() //gan id
    {
        edtTen = findViewById(R.id.edtTen);
        edtNgaySinh = findViewById(R.id.edtNgaySinh);
        edtSoThich = findViewById(R.id.edtSoThich);
        rdgGioiTinh = findViewById(R.id.rdgGioiTinh);
        ckb1 = findViewById(R.id.ckb1);
        ckb2 = findViewById(R.id.ckb2);
        ckb3 = findViewById(R.id.ckb3);
        ckb4 = findViewById(R.id.ckb4);
        ckb5 = findViewById(R.id.ckb5);
        btnXacNhan= findViewById(R.id.btnXacNhan);
    }
    //---------------------------thêm sự kiện----------------------------------
    private void addEvents()
    {
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hientoast();
            }
        });
    }

    private void Hientoast()
    {
        String check1="";
        String check2="";
        String check3="";
        String check4="";
        String check5="";
        String ten = edtTen.getText().toString();
        String ngaysinh = edtNgaySinh.getText().toString();

        if(ckb1.isChecked()) {
            check1= ckb1.getText().toString();
        }
        if(ckb2.isChecked()) {
            check2= ckb2.getText().toString();
        }
        if(ckb3.isChecked()) {
            check3= ckb3.getText().toString();
        }
        if(ckb4.isChecked()) {
            check4= ckb4.getText().toString();
        }
        if(ckb5.isChecked()) {
            check5= ckb5.getText().toString();
        }
        String sothich = edtSoThich.getText().toString();
        String gioitinh="";
        switch (rdgGioiTinh.getCheckedRadioButtonId())
        {
            case R.id.rdbNam:
                gioitinh= "Nam";
                break;
            case R.id.rdbNu:
                gioitinh="Nữ";
                break;
        }
        if(check1!="")
        {
            check1= check1 + "; ";
        }
        if(check2!="")
        {
            check2= check2 + "; ";
        }
        if(check3!="")
        {
            check3= check3 + "; ";
        }
        if(check4!="")
        {
            check4= check4 + "; ";
        }
        if(check5!="")
        {
            check5= check5 + "; ";
        }

        String hientext = ten+
                "\nNgày Sinh: " + ngaysinh +
                "\nGiới tính: "+gioitinh+
                "\nSở thích: "+check1+check2+check3+check4+check5+sothich;
        Toast.makeText(getApplicationContext(),hientext, Toast.LENGTH_SHORT).show();


    }


}
