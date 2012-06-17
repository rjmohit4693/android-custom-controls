package com.liupeinye.interactions;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class ChooseBox extends LinearLayout{

	public ChooseBox(Context context , String[] content) {
		super(context);
		// TODO Auto-generated constructor stub
		this.setOrientation(0);
		this.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
		this.setGravity(Gravity.CENTER_HORIZONTAL);
		for(String str:content)
		{
			CheckBox checkBox = new CheckBox(context);
			checkBox.setText(str);
			checkBox.setTextColor(Color.BLACK);
			this.addView(checkBox);
		}
	}
}
