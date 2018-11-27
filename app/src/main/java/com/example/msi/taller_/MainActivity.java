package com.example.msi.taller_;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.zetterstrom.com.forecast.ForecastClient;
import android.zetterstrom.com.forecast.ForecastConfiguration;
import android.zetterstrom.com.forecast.models.Language;
import android.zetterstrom.com.forecast.models.Unit;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {
    public final String DarkSkyApiKey = "37e2f9270b32e55cafa67c8587477dc1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ForecastConfiguration configuration =
                new ForecastConfiguration.Builder(DarkSkyApiKey).setDefaultLanguage(Language.SPANISH)
                .setDefaultUnit(Unit.SI).setCacheDirectory(getCacheDir()).build();
        ForecastClient.create(configuration);


    }


    public void Guardar(View view){

        Toast.makeText(this,"Bitacora guardada correctamente",Toast.LENGTH_SHORT).show();

    }
}
