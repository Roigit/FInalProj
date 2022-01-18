package RoisGarage.myapplication_2;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class DataPersistencyHelper {

    public static Context Context;

    public static void StoreData(List<Car> cars)
    {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(Context);
        SharedPreferences.Editor editor = sp.edit();
        String json = new Gson().toJson(cars );
        editor.putString("cars", json);
        editor.commit();
    }

    public static List<Car> LoadData()
    {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(Context);
        String json = sp.getString("cars",null);
        if (json != null)
        {
            Type type = new TypeToken<List<Car>>(){}.getType();
            return new Gson().fromJson(json,type);
        }
        else
        {
            List<Car> cars = new ArrayList<Car>();
            cars.add(new Car(R.drawable.car1,"WonderCar","1","2099","99"));
            cars.add(new Car(R.drawable.car2,"CoolCar","2","1964","60000"));
            cars.add(new Car(R.drawable.car3,"CreepyCar","3","2000","4242"));
            cars.add(new Car(R.drawable.car4,"SpeedyCar","4","1961","12313"));
            cars.add(new Car(R.drawable.car5,"CrazyCar","5","999","200000"));
            cars.add(new Car(R.drawable.car6,"CombatCar","6","1971","12341"));
            cars.add(new Car(R.drawable.car7,"WildCar","7","2022","13000"));
            cars.add(new Car(R.drawable.car8,"SuperCar","8","2019","643432"));
            return cars;
        }
    }

}
