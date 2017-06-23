package service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import engine.FloatViewManager;

/**
 * Created by gsh on 2017/6/22.
 */

public class MyFloatService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        FloatViewManager manager=FloatViewManager.getInstance(this);
        manager.showFloatCircleView();
        super.onCreate();
    }
}
