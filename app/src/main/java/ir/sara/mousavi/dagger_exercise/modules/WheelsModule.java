package ir.sara.mousavi.dagger_exercise.modules;

import dagger.Module;
import dagger.Provides;
import ir.sara.mousavi.dagger_exercise.holder.Rims;
import ir.sara.mousavi.dagger_exercise.holder.Tires;
import ir.sara.mousavi.dagger_exercise.holder.Wheels;

@Module
public class WheelsModule {

    @Provides
    static Rims provideRims(){
        return new Rims();
    }

    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims, tires);
    }
}
