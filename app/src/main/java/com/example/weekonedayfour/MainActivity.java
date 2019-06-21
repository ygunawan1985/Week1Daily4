package com.example.weekonedayfour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titleDisplay;
    EditText etFirstName, etLastName, etStreetAddress, etCity, etState, etZipCode;
    Button btnSubmit;
    TextView firstNameDisplay, lastNameDisplay, streetAddressDisplay, cityDisplay, stateDisplay, zipCodeDisplay;
    Person aGuest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleDisplay = findViewById(R.id.titleDisplay);
        etFirstName = findViewById(R.id.etFirstName);
        etLastName = findViewById(R.id.etLastName);
        etStreetAddress = findViewById(R.id.etStreetAddress);
        etCity = findViewById(R.id.etCity);
        etState = findViewById(R.id.etState);
        etZipCode = findViewById(R.id.etZipCode);
        btnSubmit = findViewById(R.id.btnSubmit);
        firstNameDisplay = findViewById(R.id.firstNameDisplay);
        lastNameDisplay = findViewById(R.id.lastNameDisplay);
        streetAddressDisplay = findViewById(R.id.streetAddressDisplay);
        cityDisplay = findViewById(R.id.cityDisplay);
        stateDisplay = findViewById(R.id.stateDisplay);
        zipCodeDisplay = findViewById(R.id.zipCodeDisplay);
    }

    public void onClick(View view) {

        switch(view.getId()) {
            case R.id.btnSubmit:
                String firstName = etFirstName.getText().toString();
                String lastName = etLastName.getText().toString();
                String streetAddress = etStreetAddress.getText().toString();
                String city = etCity.getText().toString();
                String state = etState.getText().toString();
                String zipCode = etZipCode.getText().toString();

                if (!firstName.isEmpty() && !lastName.isEmpty() && !streetAddress.isEmpty() && !city.isEmpty() && !state.isEmpty() && !zipCode.isEmpty()) {
                    aGuest = new Person(firstName, lastName, streetAddress, city, state, zipCode);
                    clearEditText();
                    firstNameDisplay.setText(aGuest.getFirstName());
                    lastNameDisplay.setText(aGuest.getLastName());
                    streetAddressDisplay.setText(aGuest.getAddress());
                    cityDisplay.setText(aGuest.getCity());
                    stateDisplay.setText(aGuest.getState());
                    zipCodeDisplay.setText(aGuest.getZipCode());
                }
                break;
        }
    }

    public void clearEditText(){
        etFirstName.setText("");
        etLastName.setText("");
        etStreetAddress.setText("");
        etCity.setText("");
        etState.setText("");
        etZipCode.setText("");
    }
}
