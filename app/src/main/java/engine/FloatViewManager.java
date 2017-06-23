package engine;

import android.content.Context;
import android.graphics.PixelFormat;
import android.util.Log;
import android.view.Gravity;
import android.view.WindowManager;

import view.FloatCircleView;

/**
 * Created by gsh on 2017/6/22.
 */

public class FloatViewManager {
    private Context context;
    private WindowManager wm;
    private FloatCircleView CircleView;
    private FloatViewManager(Context context){
        this.context=context;
       wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        CircleView=new FloatCircleView(context);
    }
    private static FloatViewManager instance;
    public  static FloatViewManager getInstance(Context context){
        if (instance ==null){
            synchronized (FloatViewManager.class){
            if (instance ==null){
                instance =new FloatViewManager(context);
            }
            }
        }
        return  instance;
    }
    public void showFloatCircleView(){
        WindowManager.LayoutParams params=new WindowManager.LayoutParams();
        params.width=CircleView.width;
        params.height=CircleView.height;
        params.gravity= Gravity.TOP|Gravity.LEFT;
        params.x=0;
        params.y=0;
        params.type= WindowManager.LayoutParams.TYPE_PHONE;
        params.flags= WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL| WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE;
        params.format= PixelFormat.RGBA_8888;
        Log.i("雷候","dfsrd");
        wm.addView(CircleView,params);
        Log.i("雷候1","dfsrd");
    }


}
