package com.liupeinye.interactions;

import com.liupeinye.textviews.TextContent;

import android.content.Context;
import android.widget.EditText;
import android.widget.LinearLayout;

public class InputBox extends LinearLayout{

	public InputBox(Context context , String leftString) {
		super(context);
		// TODO Auto-generated constructor stub
		this.setOrientation(0);
		this.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
		TextContent textContent = new TextContent(context, leftString);
		textContent.setSingleLine();
		textContent.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		EditText editText = new EditText(context);
		editText.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
		editText.setSingleLine();
		this.addView(textContent);
		this.addView(editText);
	}

}
