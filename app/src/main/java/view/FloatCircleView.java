package view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by gsh on 2017/6/22.
 */

public class FloatCircleView extends View {
    public int width=150;
    public int height=150;
    private Paint CirclePaint;
    private Paint TextPaint;
    public  String text="50";
    public FloatCircleView(Context context) {
        //通过new关键字调用
        super(context);
        initPaint();
    }

    public FloatCircleView(Context context, AttributeSet attrs) {
        //布局文件里调用 有自定义属性
        super(context, attrs);
        initPaint();
    }

    public FloatCircleView(Context context, AttributeSet attrs, int defStyleAttr) {
        //布局文件里调用 有自定义样式
        super(context, attrs, defStyleAttr);
        initPaint();

    }

    private void initPaint() {
        CirclePaint=new Paint();
        CirclePaint.setColor(Color.GRAY);
        CirclePaint.setAntiAlias(true);

        TextPaint=new Paint();
        TextPaint.setTextSize(25);
        TextPaint.setAntiAlias(true);
        TextPaint.setColor(Color.WHITE);
        TextPaint.setFakeBoldText(true);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(width, height);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(width/2,height/2,width/2,CirclePaint);
        float textWidth=TextPaint.measureText(text);
        float x=width/2-textWidth/2;
        Paint.FontMetrics metrics= TextPaint.getFontMetrics();
        float dy=-(metrics.ascent+metrics.descent)/2;
        float y=height/2+dy;
        canvas.drawText(text,x,y,TextPaint);
    }
}
