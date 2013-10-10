package com.bbaf.mpos.inventory.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class ClearOnClickListener implements OnClickListener {

	private InventoryActivity activity;
	
	public ClearOnClickListener(InventoryActivity activity) {
		this.activity = activity;
	}
	
	@Override
	public void onClick(View v) {
		clear();
	}
	
	private void clear() {
		EditText[] text = activity.getAllEditText();
		EditText editTextProductId = text[0];
		EditText editTextProductName = text[1];
		EditText editTextPrice = text[2];
		EditText editTextCost = text[3];
		EditText editTextQuantity = text[4];
		editTextProductId.setText("");
		editTextProductName.setText("");
		editTextPrice.setText("");
		editTextCost.setText("");
		editTextQuantity.setText("");
	}
}
