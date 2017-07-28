package com.framgia.fsalon;

import android.app.Application;
import com.crashlytics.android.Crashlytics;
import com.crashlytics.android.ndk.CrashlyticsNdk;
import com.framgia.fsalon.data.source.api.FSalonServiceClient;
import io.fabric.sdk.android.Fabric;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MyPC on 20/07/2017.
 */
public class FSalonApplication extends Application {

    private static FSalonApplication sInstant;
    private final static int a = 10;

    @Override
    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Crashlytics(), new CrashlyticsNdk());
        FSalonServiceClient.initialize(this);
        sInstant = this;
        List<String> a = new ArrayList<>();
        a.add("ABC");
        a.add("ABC");
        a.add("ABCccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        a.add("ABCccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        a.add("ABCccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
    }

    public static FSalonApplication getInstant() {
        return sInstant;
    }
}
