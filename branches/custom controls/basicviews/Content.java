package com.liupeinye.basicviews;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;

public class Content extends TextView{

	public Content(Context context , String content) {
		super(context);
		// TODO Auto-generated constructor stub
		this.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
		this.setText(content);
		this.setCursorVisible(false);
		this.setTextColor(Color.BLACK);
//		this.setTextSize(14);
	}

}
