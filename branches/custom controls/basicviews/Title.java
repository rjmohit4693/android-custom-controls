package com.liupeinye.basicviews;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextUtils.TruncateAt;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;

public class Title extends TextView{

	public Title(Context context , String content) {
		super(context);
		// TODO Auto-generated constructor stub
		this.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
		this.setText(content);
		this.setCursorVisible(false);
		this.setTextColor(Color.BLACK);
		this.setSingleLine();
		this.setEllipsize(TruncateAt.MARQUEE);
		this.setTypeface(Typeface.DEFAULT_BOLD);
		this.setFocusable(true);
		this.setMarqueeRepeatLimit(-1);
		this.setTextSize(16);
	}

	@Override
	protected void onFocusChanged(boolean focused, int direction,
			Rect previouslyFocusedRect) {
		// TODO Auto-generated method stub
		if(focused)
			super.onFocusChanged(focused, direction, previouslyFocusedRect);
	}

	@Override
	public void onWindowFocusChanged(boolean hasWindowFocus) {
		// TODO Auto-generated method stub
		if(hasWindowFocus)
			super.onWindowFocusChanged(hasWindowFocus);
	}

	@Override
	public boolean isFocused() {
		// TODO Auto-generated method stub
		return true;
	}
}
