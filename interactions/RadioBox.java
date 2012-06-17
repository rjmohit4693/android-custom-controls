package com.liupeinye.interactions;

import com.liupeinye.textviews.TextContent;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RadioBox extends LinearLayout{

	public RadioBox(Context context , String leftString , String[] content) {
		super(context);
		// TODO Auto-generated constructor stub
		this.setOrientation(0);
		this.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
		TextContent textContent = new TextContent(context, leftString);
		textContent.setSingleLine();
		textContent.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		RadioGroup radioGroup = new RadioGroup(context);
		radioGroup.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		this.addView(textContent);
		this.addView(radioGroup);
		radioGroup.setOrientation(1);
		for(String str:content)
		{
			RadioButton radioButton = new RadioButton(context);
			radioButton.setText(str);
			radioButton.setTextColor(Color.BLACK);
			radioGroup.addView(radioButton);
		}
	}
}