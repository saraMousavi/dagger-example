package ir.sara.mousavi.dagger_exercise.components;

import dagger.Component;
import ir.sara.mousavi.dagger_exercise.MainActivity;
import ir.sara.mousavi.dagger_exercise.modules.WheelsModule;

@Component (modules = WheelsModule.class)
public interface CarComponent {
    void inject(MainActivity mainActivity);
}
