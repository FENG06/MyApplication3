package com.example.zhou.myapplication.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

import com.example.zhou.myapplication.R;

/**
 * Created by Zhou on 2017/7/14.
 */

public class ImageViewPlus extends android.support.v7.widget.AppCompatImageView {

    public static final int TYPE_NONE = 0;
    /**
     * 圆形
     */
    public static final int TYPE_CIRCLE = 1;
    /**
     * 圆角矩形
     */
    public static final int TYPE_ROUNDED_RECT = 2;



    private static final int DEFAULT_TYPE = TYPE_NONE;
    private static final int DEFAULT_BORDER_COLOR = Color.TRANSPARENT;
    private static final int DEFAULT_BORDER_WIDTH = 0;
    private static final int DEFAULT_RECT_ROUND_RADIUS = 0;


    private Paint mPaintBitmap = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Bitmap mRawBitmap;
    private BitmapShader mShader;
    private Matrix mMatrix = new Matrix();


    private int mType;
    private int mBorderColor;
    private int mBorderWidth;
    private int mRectRoundRadius;

    public ImageViewPlus(Context context, AttributeSet attrs) {
        super(context, attrs);
        //取xml文件中设定的参数
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.ImageViewPlus);
        mType = ta.getInt(R.styleable.ImageViewPlus_type,DEFAULT_TYPE);
        mBorderColor = ta.getColor(R.styleable.ImageViewPlus_borderColor,DEFAULT_BORDER_COLOR);
        mBorderWidth = ta.getDimensionPixelSize(R.styleable.ImageViewPlus_borderWidth,dip2px(DEFAULT_BORDER_WIDTH));
        mRectRoundRadius = ta.getDimensionPixelSize(R.styleable.ImageViewPlus_rectRoundRadius, dip2px(DEFAULT_RECT_ROUND_RADIUS));
        ta.recycle();
    }

    private int dip2px(int dipVal) {
        float scale = getResources().getDisplayMetrics().density;
        return (int) (dipVal*scale+0.5f);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        Bitmap rawBitmap = getBitmap(getDrawable());
        if (rawBitmap != null){
            int viewWidth = getWidth();
            int viewHeight = getHeight();
            int viewMinSize = Math.min(viewHeight,viewWidth);
            float dstWidth = viewMinSize;
            float dstHeight = viewMinSize;

            if (mShader == null || rawBitmap.equals(mRawBitmap)) {
            mRawBitmap = rawBitmap;
                mShader = new BitmapShader(mRawBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            }

            if (mShader != null){
                mMatrix.setScale(dstWidth/rawBitmap.getWidth(),dstHeight/rawBitmap.getHeight());
                mShader.setLocalMatrix(mMatrix);
            }
            mPaintBitmap.setShader(mShader);
            float radius = viewMinSize/2.0f;
            canvas.drawCircle(radius,radius,radius,mPaintBitmap);
            } else {
            super.onDraw(canvas);
        }
        }

    private Bitmap getBitmap(Drawable drawable) {
        if (drawable instanceof BitmapDrawable){
            return ((BitmapDrawable) drawable).getBitmap();
        } else if ( drawable instanceof ColorDrawable){
            Rect rect = drawable.getBounds();
            int width = rect.right-rect.left;
            int height = rect.bottom-rect.top;
            int color = ((ColorDrawable) drawable).getColor();
            Bitmap bitmap = Bitmap.createBitmap(width,height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            canvas.drawARGB(Color.alpha(color),Color.red(color),Color.green(color),Color.blue(color));
            return bitmap;
        } else {
            return  null;
        }
    }


    public int getType(){
        return this.mType;
    }
    /**
     * 设置类型(自动重绘)
     * @param type TYPE_CIRCLE(圆形) TYPE_ROUNDED_RECT(圆角矩形)
     * @see #setType(int type, boolean fUpdateView)
     */
    public void setType(int type){
        setType(type, true);
    }
    /**
     * 设置类型
     * @param type TYPE_CIRCLE(圆形) TYPE_ROUNDED_RECT(圆角矩形)
     * @param fUpdateView 是否自动重绘
     */
    public void setType(int type, boolean fUpdateView){
        if (type != this.mType
                && (type == TYPE_CIRCLE || type == TYPE_ROUNDED_RECT)){
            this.mType = type;
            if (fUpdateView){
                invalidate();
            }
        }
    }




}
