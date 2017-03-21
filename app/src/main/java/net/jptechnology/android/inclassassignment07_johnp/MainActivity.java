package net.jptechnology.android.inclassassignment07_johnp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference personRef = database.getReference("person");
    private DatabaseReference peopleRef = database.getReference("people");
    private DatabaseReference titleRef = database.getReference("title");
    private DatabaseReference currencyRef = database.getReference("currency");

    private TextView titleTextView;
    private TextView countryTextView;
    private TextView exchangeRateView;
    private CheckBox checkBox;

    private int exchangeRate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titleTextView = (TextView) findViewById(R.id.titleText);
        countryTextView = (TextView) findViewById(R.id.countryText);
        exchangeRateView = (TextView) findViewById(R.id.exchangeRateText);
        checkBox = (CheckBox) findViewById(R.id.check_box);
    }

    // onClick
    public void set(View view) {
        titleRef.setValue(titleTextView.getText().toString());
    }

    public void add(View view) {
        exchangeRate = Integer.parseInt(exchangeRateView.getText().toString());
        currencyRef.push().setValue(new Currency(countryTextView.getText().toString(), exchangeRate, checkBox.isChecked()));
    }
}
