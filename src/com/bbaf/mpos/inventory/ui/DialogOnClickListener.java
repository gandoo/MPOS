package com.bbaf.mpos.inventory.ui;

import com.bbaf.mpos.inventory.InventoryDBHelper;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TableLayout;

public class DialogOnClickListener implements OnClickListener {

	private TableLayout tableLayout;
	private InventoryDBHelper dbDAO;
	private Activity activity;
	
	public DialogOnClickListener(TableLayout tableLayout,InventoryDBHelper dbDAO,Activity activity) {
		this.tableLayout = tableLayout;
		this.dbDAO = dbDAO;
		this.activity = activity;
	}
	
	@Override
	public void onClick(DialogInterface dialog, int which) {
		for (int i = 1; i < tableLayout.getChildCount(); i++) {
			try {
				InventoryTableRow row = (InventoryTableRow) tableLayout
						.getChildAt(i);

				dbDAO.removeProduct(row.getProduct());
			} catch (ClassCastException e) {
				// prevent casting TableHead
			}
		}
		// tabHost.invalidate();
		// tabHost.refreshDrawableState();
		((InventoryActivity)activity).refreshTable();
	}

}
