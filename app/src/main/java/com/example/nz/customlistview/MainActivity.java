package com.example.nz.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String []    countryName ;
    int [] flags = {R.drawable.afghanistan, R.drawable.albania, R.drawable.algeria, R.drawable.andorra, R.drawable.angola,
                    R.drawable.bahrain, R.drawable.bangladesh, R.drawable.belarus, R.drawable.belgium, R.drawable.cambodia,
                    R.drawable.cameroon, R.drawable.canada};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            listView = (ListView) findViewById(R.id.listView);
        countryName = getResources().getStringArray(R.array.countryName);
            CustomAdapter customAdapter = new CustomAdapter(this, countryName, flags);
            listView.setAdapter(customAdapter);

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String value = countryName[position];
                        Toast.makeText(MainActivity.this,value,Toast.LENGTH_SHORT).show();
                    }
                });




    }
}
