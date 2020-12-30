package ir.sara.mousavi.dagger_exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import ir.sara.mousavi.dagger_exercise.components.CarComponent;
import ir.sara.mousavi.dagger_exercise.components.DaggerCarComponent;
import ir.sara.mousavi.dagger_exercise.holder.Car;

public class MainActivity extends AppCompatActivity {

    @Inject Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent component = DaggerCarComponent.create();
        component.inject(this);
        car.drive();
    }
}