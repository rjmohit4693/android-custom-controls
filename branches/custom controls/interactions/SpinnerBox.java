package com.liupeinye.interactions;

import com.liupeinye.textviews.TextContent;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class SpinnerBox extends LinearLayout{

	public SpinnerBox(Context context , String leftString ,String[] content) {
		super(context);
		// TODO Auto-generated constructor stub
		this.setOrientation(0);
		this.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
		TextContent textContent = new TextContent(context, leftString);
		textContent.setSingleLine();
		textContent.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		Spinner spinner = new Spinner(context);
		spinner.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item, content);
		arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter(arrayAdapter);
		this.addView(textContent);
		this.addView(spinner);
	}

}
