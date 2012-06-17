package com.liupeinye.textviews;

import android.content.Context;
import android.graphics.Color;

public class TextMainTitle extends TextSubTitle{

	public TextMainTitle(Context context, String content) {
		super(context, content);
		// TODO Auto-generated constructor stub
		this.setTextSize(20);
		this.setShadowLayer(2, 2, 2, Color.GRAY);
	}

}
