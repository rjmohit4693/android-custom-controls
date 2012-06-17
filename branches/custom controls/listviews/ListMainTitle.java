package com.liupeinye.listviews;


import android.content.Context;
import android.graphics.Color;

public class ListMainTitle extends ListSubTitle{

	public ListMainTitle(Context context, String content) {
		super(context, content);
		// TODO Auto-generated constructor stub
		this.setTextSize(16);
		this.setShadowLayer(2, 2, 2, Color.GRAY);
	}

}
