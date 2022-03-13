package com.example.retrofitrxjavatestproject.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Context;
import android.os.Bundle;
import android.os.TransactionTooLargeException;
import android.text.Layout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.retrofitrxjavatestproject.R;
import com.example.retrofitrxjavatestproject.model.Condition;
import com.example.retrofitrxjavatestproject.model.Current;
import com.example.retrofitrxjavatestproject.model.WeatherData;
import com.example.retrofitrxjavatestproject.network.RetrofitClient;
import com.example.retrofitrxjavatestproject.network.WeatherAPI;

import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.Retrofit.Builder;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView txtCity, txtCountry, txtCelsius, txtCityError;
    ImageView imgWeather;

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;

        txtCity = findViewById(R.id.txtCity);
        txtCountry = findViewById(R.id.txtCountry);
        txtCelsius = findViewById(R.id.txtCelsius);
        txtCityError = findViewById(R.id.txtCityNotFound);
        imgWeather = findViewById(R.id.imgWeather);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem menuItem = menu.findItem(R.id.search_item);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Type your city here");
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                getCurrentWeather(query);
                searchView.setIconified(true);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    public void getCurrentWeather(String query) {
        String API_KEY = "7d92df1e3e90422e96c121314221203";

        Call<WeatherData> call = RetrofitClient
                .getInstance()
                .getWeatherAPI()
                .getCurrentWeather(API_KEY, query, "no");

            call.enqueue(new Callback<WeatherData>() {
                @Override
                public void onResponse(Call<WeatherData> call, Response<WeatherData> response) {
                    int codeResult = response.code();
                    WeatherData weatherDataResult = response.body();

                    if (codeResult == 200) {
                        txtCityError.setVisibility(View.INVISIBLE);
                        String city = weatherDataResult.getLocation().getName();
                        String country = weatherDataResult.getLocation().getCountry();
                        String celsius = weatherDataResult.getCurrent().getTempC().toString();

                        txtCity.setText(city);
                        txtCountry.setText(country);
                        txtCelsius.setText(celsius);

                        Log.i("Info", weatherDataResult.getLocation().getCountry());

                        Condition conditionIcon = weatherDataResult.getCurrent().getCondition();
                        String url = convertIconURL(conditionIcon.getIcon());

                        Glide.with(MainActivity.this)
                                .load(url)
                                .into(imgWeather);
                    } else if (codeResult == 400) {
                        txtCityError.setVisibility(View.VISIBLE);
                    }
                }

                @Override
                public void onFailure(Call<WeatherData> call, Throwable t) {
                    Toast.makeText(context, "Failure", Toast.LENGTH_SHORT).show();
                    Log.e("ERROR", t.toString());
                }
            });
     }

    private String convertIconURL(String url) {
        String result = "https:";
        result += url;
        Log.i("Glide", result);
        return result;
    }
}