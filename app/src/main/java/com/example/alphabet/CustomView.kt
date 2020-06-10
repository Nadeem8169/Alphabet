package com.example.alphabet

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.PointF
import android.util.AttributeSet
import android.view.View

class CustomView : View {

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

   var paint= Paint(Paint.ANTI_ALIAS_FLAG)



    override fun onDrawForeground(canvas: Canvas?) {
        super.onDrawForeground(canvas)

        paint.color=Color.LTGRAY
        paint.strokeWidth=10f
        canvas?.drawLine(250f,200f,140f,500f,paint)
        canvas?.drawLine(250f,200f,360f,500f,paint)
        canvas?.drawLine(185f,350f,305f,350f,paint)

        //canvas?.drawLine(pointStar12.x,pointStar12.y,pointEnd2.x,pointEnd2.y,paint)


    }

    fun draw(){
        invalidate()
        requestLayout()
    }
}