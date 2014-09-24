package com.example.huping;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Gallery;
import android.widget.ImageView;

public class intentActivity extends Activity
{
	private ImageView imageView;
	private Bitmap btm1;
	private Bitmap btm2;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.other);
		imageView = (ImageView) this.findViewById(R.id.iv);
		btm1 = BitmapFactory.decodeResource(
				getResources(), R.drawable.icon1);
		BitmapDrawable bd1 = new BitmapDrawable(btm1);
		imageView.setBackgroundDrawable(bd1);
		imageView.setOnTouchListener(new OnTouchListener()
		{
			

			@Override
			public boolean onTouch(View v, MotionEvent event)
			{
				// TODO Auto-generated method stub
				switch (event.getAction())
				{
				case MotionEvent.ACTION_DOWN:
					btm2 = Bitmap.createScaledBitmap(btm1, imageView.getWidth()-10, imageView.getHeight()-10,
							false);
					BitmapDrawable bd2 = new BitmapDrawable(btm2);
					imageView.setBackgroundDrawable(bd2);
					break;
				case MotionEvent.ACTION_UP:
					btm1 = BitmapFactory.decodeResource(
							getResources(), R.drawable.icon1);
					BitmapDrawable bd1 = new BitmapDrawable(btm1);
					imageView.setBackgroundDrawable(bd1);
					break;
				}
				return true;
			}
		});

	}
}
