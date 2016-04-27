package com.example.thesamespace.statisticalservice.calendar;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.LineBackgroundSpan;

/**
 * Created by thesamespace on 2016/4/24.
 */
public class TextSpan implements LineBackgroundSpan {
    private String text;
    private int color;

    public TextSpan(String text, int color) {
        this.text = text;
        this.color = color;
    }

    public TextSpan(String text) {
        this.text = text;
        this.color = 0;
    }

    @Override
    public void drawBackground(Canvas canvas, Paint paint,
                               int left, int right, int top, int baseline, int bottom,
                               CharSequence charSequence,
                               int start, int end, int lineNum) {
        int oldColor = paint.getColor();
        if (color != 0) {
            paint.setColor(color);
        }
        canvas.drawText(this.text, left + 5, top, paint);
//        canvas.drawCircle((left + right) / 2, bottom + 5, 5, paint);
        paint.setColor(oldColor);
    }
}
