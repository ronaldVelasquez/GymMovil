package riverasgroup.gymmovil;

import android.app.Application;

/**
 * Created by Cr-Diego on 01/04/2015.
 */
public class GymMovilApplication extends Application {
    private static final String TAG = GymMovilApplication.class.getSimpleName();
    private static GymMovilApplication gymMovilApplication;

    public static GymMovilApplication getInstance(){
        return gymMovilApplication;
    }
}
