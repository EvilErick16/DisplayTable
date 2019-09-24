package com.csuf.cpsc41102.displaytable;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Parent method call
        super.onCreate(savedInstanceState);

        // Create root layout object Scrollview
        HorizontalScrollView scrollable_root = new HorizontalScrollView(this);

        // Create a grid layout object and set its parameters
        GridLayout grid_obj = new GridLayout(this);
        grid_obj.setColumnCount(5);
        grid_obj.setRowCount(11);
        grid_obj.setBackgroundColor(Color.WHITE);
        grid_obj.setOrientation(GridLayout.VERTICAL);

        // Create Linear view objects for the numbered rows
        //LinearLayout numbered_rows = new LinearLayout(this);
        //numbered_rows.setOrientation(LinearLayout.VERTICAL);
        //LinearLayout.LayoutParams numbered_rows_layout_params = new LinearLayout.LayoutParams(
        //        ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        // numbered_rows_layout_params.setMargins(10, 5, 5,5);

        for (int i = 1; i <= 50; i++){
            TextView tv = new TextView(this);
            //tv.setLayoutParams(numbered_rows_layout_params);
            tv.setTextSize(24);
            tv.setText("String" + i);
            tv.setBackgroundColor(Color.LTGRAY);
            //tv.setPadding(10, 0, 10, 0);
            grid_obj.addView(tv);
        }

        // Add numbered rows to root object
        scrollable_root.addView(grid_obj);

        // Display root object
        setContentView(scrollable_root);
    }
}
