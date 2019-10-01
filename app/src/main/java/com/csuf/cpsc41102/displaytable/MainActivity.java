package com.csuf.cpsc41102.displaytable;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.view.Gravity;
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

        /* Steps to create Table:
        1. create root as a scrollable layout
        horizontal linear layout (firstLevel)
            2. add vertical linear layout for numbers (grayLayout)
            3. add vertical linear layout next to layout on previous step (secondLevel)
                4. text view object (blackTextView)
                5. add Grid layout 3x3(whiteGrid)
                6. grid layout 3x3 (cyanGrid)
                7. horizontal linear layout (thirdLevel)
                    8. vertical linear layout (whiteLayout)
                    9. grid layout (yellowGrid)
                    10. vertical linear layout (orangeLayout)
        */

        // Create root layout object Scrollview
        HorizontalScrollView scrollableRoot = new HorizontalScrollView(this);

        // Create Horizontal linear layout
        LinearLayout firstLevel = new LinearLayout(this);
        firstLevel.setOrientation(LinearLayout.HORIZONTAL);

        // Create and add grayLayout to firsLevel
        LinearLayout grayLayout = new LinearLayout(this);
        grayLayout.setOrientation(LinearLayout.VERTICAL);
        for (int i = 1; i < 12; i++){
            TextView tv = new TextView(this);
            tv.setText("" + i);
            tv.setTextSize(12);
            tv.setBackgroundColor(Color.LTGRAY);
            grayLayout.addView(tv);
        }
        firstLevel.addView(grayLayout);

        // Create secondLevel as a vertical Linear layout
        LinearLayout secondLevel = new LinearLayout(this);
        secondLevel.setOrientation(LinearLayout.VERTICAL);

        // Create blackTextView and add to secondLevel
        TextView blackTextView = new TextView(this);
        blackTextView.setText("Rules void hello 1(int hour)");
        blackTextView.setTextColor(Color.WHITE);
        blackTextView.setTextSize(12);
        blackTextView.setBackgroundColor(Color.BLACK);
        blackTextView.setPadding(400, 0, 400, 0);
        secondLevel.addView(blackTextView);

        // Create whiteGrid and add it to second level
        GridLayout whiteGrid = new GridLayout(this);
        whiteGrid.setColumnCount(3);
        whiteGrid.setRowCount(2);
        whiteGrid.setBackgroundColor(Color.WHITE);
        createWhiteGrid(whiteGrid, "properties", 0, 0);
        createWhiteGrid(whiteGrid, "name", 1, 0);
        createWhiteGrid(whiteGrid, "category", 1, 1);
        createWhiteGrid(whiteGrid, "Day Hour Classification", 2, 0);
        createWhiteGrid(whiteGrid, "Day and Time", 2, 1);
        secondLevel.addView(whiteGrid);

        // Create cyanGrid ans add it to second level
        GridLayout cyanGrid = new GridLayout(this);
        cyanGrid.setColumnCount(4);
        cyanGrid.setRowCount(3);
        cyanGrid.setBackgroundColor(Color.CYAN);
        createCyanGrid(cyanGrid, "Rule", 0, 0);
        createCyanGrid(cyanGrid, "", 0, 1);
        createCyanGrid(cyanGrid, "", 0, 2);
        createCyanGrid(cyanGrid, "C1", 1, 0);
        createCyanGrid(cyanGrid, "Min <= hour && hour <= max", 1, 1);
        createCyanGrid(cyanGrid, "int min", 1, 2);
        createCyanGrid(cyanGrid, "int max", 2, 2);
        createCyanGrid(cyanGrid, "A1", 3, 0);
        createCyanGrid(cyanGrid, "System.out.println(greeting + \", World!\"", 3, 1);
        createCyanGrid(cyanGrid, "String greeting", 3, 2);
        secondLevel.addView(cyanGrid);





        firstLevel.addView(secondLevel);


        scrollableRoot.addView(firstLevel);
        // Display root object
        setContentView(scrollableRoot);
    }

    @TargetApi(21)
    private void createWhiteGrid(GridLayout l, String s, int col, int row){
        GridLayout.Spec colSpec;
        GridLayout.Spec rowSpec;

        if (col == 0 && row == 0){
            colSpec = GridLayout.spec(col, GridLayout.CENTER,1f);
            rowSpec = GridLayout.spec(row,GridLayout.CENTER, 1f);
        }
        else if (col == 1){
            colSpec = GridLayout.spec(col, GridLayout.CENTER, 1f);
            rowSpec = GridLayout.spec(row);
        }
        else {
            colSpec = GridLayout.spec(col, GridLayout.LEFT, 1f);
            rowSpec = GridLayout.spec(row);
        }

        GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);
        //params.setGravity(Gravity.CENTER_HORIZONTAL);

        // Create text view object
        TextView tv = new TextView(this);
        tv.setText(s);
        tv.setTextSize(12);

        tv.setLayoutParams(params);
        l.addView(tv);
    }

    @TargetApi(21)
    private void createCyanGrid(GridLayout l, String s, int col, int row){
        GridLayout.Spec colSpec;
        GridLayout.Spec rowSpec;

        if (col == 0 || col == 3) {
            colSpec = GridLayout.spec(col, GridLayout.CENTER, 1f);
            rowSpec = GridLayout.spec(row, GridLayout.CENTER);
        }
        else if (col == 1 && (row == 0 || row == 1)){
            colSpec = GridLayout.spec(col, GridLayout.CENTER, 1f);
            rowSpec = GridLayout.spec(row, GridLayout.CENTER);
        }
        else {
            colSpec = GridLayout.spec(col, GridLayout.CENTER);
            rowSpec = GridLayout.spec(row, GridLayout.CENTER);
        }
        GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);

        // Create text view object
        TextView tv = new TextView(this);
        tv.setText(s);
        tv.setTextSize(12);

        tv.setLayoutParams(params);
        l.addView(tv);
    }
}
