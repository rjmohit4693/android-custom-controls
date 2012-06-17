package com.liupeinye.interactions;

import com.liupeinye.textviews.TextContent;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

public class ToggleBox extends LinearLayout{

	public ToggleBox(Context context , String leftString) {
		super(context);
		// TODO Auto-generated constructor stub
		this.setOrientation(0);
		this.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
		TextContent textContent = new TextContent(context, leftString);
		textContent.setSingleLine();
		textContent.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		ToggleButton toggleButton = new ToggleButton(context);
		toggleButton.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));
		
		this.addView(textContent);
		this.addView(toggleButton);
	}

}
