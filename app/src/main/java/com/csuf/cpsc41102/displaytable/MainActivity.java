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

@TargetApi(21)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Parent method call
        super.onCreate(savedInstanceState);

        // Create root layout object Scrollview
        HorizontalScrollView scrollableRoot = new HorizontalScrollView(this);

        // Create Horizontal linear layout
        LinearLayout firstLevel = new LinearLayout(this);
        firstLevel.setOrientation(LinearLayout.HORIZONTAL);

        // Create and add grayLayout to firsLevel
        LinearLayout grayLayout = new LinearLayout(this);
        grayLayout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.setMargins(0, 0, 0, 1);
        for (int i = 1; i < 12; i++){
            TextView tv = new TextView(this);
            tv.setLayoutParams(lp);
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
        blackTextView.setGravity(Gravity.CENTER_HORIZONTAL);
        secondLevel.addView(blackTextView);

        // Create grid and add it to second level
        GridLayout bigGrid = new GridLayout(this);
        bigGrid.setColumnCount(4);
        bigGrid.setRowCount(10);
        bigGrid.setBackgroundColor(Color.BLACK);

        // Add content to grid Row 0
        createGrid(bigGrid, Color.WHITE, GridLayout.spec(0, GridLayout.CENTER, 1f),
                GridLayout.spec(0, GridLayout.CENTER, 2f), "properties");
        createGrid(bigGrid, Color.WHITE, GridLayout.spec(1, GridLayout.CENTER, 15f),
                GridLayout.spec(0, 1f), "name");
        createGrid(bigGrid, Color.WHITE, GridLayout.spec(2, GridLayout.CENTER, 1f),
                GridLayout.spec(0, GridLayout.CENTER, 2f), "");
        createGrid(bigGrid, Color.WHITE, GridLayout.spec(3, GridLayout.LEFT, 1f),
                GridLayout.spec(0, 1f), "Day Hour Classification");

        // Add content to grid Row 1
        createGrid(bigGrid, Color.WHITE, GridLayout.spec(0, GridLayout.CENTER, 1f),
                GridLayout.spec(1, GridLayout.CENTER, 2f), "");
        createGrid(bigGrid, Color.WHITE, GridLayout.spec(1, GridLayout.CENTER, 15f),
                GridLayout.spec(1, 1f), "category");
        createGrid(bigGrid, Color.WHITE, GridLayout.spec(2, GridLayout.CENTER, 1f),
                GridLayout.spec(1, GridLayout.CENTER, 2f), "");
        createGrid(bigGrid, Color.WHITE, GridLayout.spec(3, GridLayout.LEFT, 1f),
                GridLayout.spec(1, 1f), "Day and Time");

        // Add content to grid Row 2
        createGrid(bigGrid, Color.CYAN, GridLayout.spec(0, GridLayout.CENTER, 1f),
                GridLayout.spec(2, 1f), "Rule");
        createGrid(bigGrid, Color.CYAN, GridLayout.spec(1, GridLayout.CENTER, 15f),
                GridLayout.spec(2, 1f), "C1");
        createGrid(bigGrid, Color.CYAN, GridLayout.spec(2, GridLayout.CENTER, 1f),
                GridLayout.spec(2, 1f), "");
        createGrid(bigGrid, Color.CYAN, GridLayout.spec(3, GridLayout.CENTER, 1f),
                GridLayout.spec(2, 1f), "A1");

        // Add content to grid Row 3
        createGrid(bigGrid, Color.CYAN, GridLayout.spec(0, GridLayout.CENTER, 1f),
                GridLayout.spec(3, 1f), "");
        createGrid(bigGrid, Color.CYAN, GridLayout.spec(1, GridLayout.CENTER, 15f),
                GridLayout.spec(3, 1f), "min <= hour && hour <= max");
        createGrid(bigGrid, Color.CYAN, GridLayout.spec(2, GridLayout.CENTER, 1f),
                GridLayout.spec(3, 1f), "");
        createGrid(bigGrid, Color.CYAN, GridLayout.spec(3, GridLayout.CENTER, 1f),
                GridLayout.spec(3, 1f), "System.out.println(greeting + \" , World!\")");

        // Add content to grid Row 4
        createGrid(bigGrid, Color.CYAN, GridLayout.spec(0, GridLayout.CENTER, 1f),
                GridLayout.spec(4, 1f), "");
        createGrid(bigGrid, Color.CYAN, GridLayout.spec(1, GridLayout.CENTER, 1f),
                GridLayout.spec(4, 1f), "int min");
        createGrid(bigGrid, Color.CYAN, GridLayout.spec(2, GridLayout.CENTER, 1f),
                GridLayout.spec(4, 1f), "int max");
        createGrid(bigGrid, Color.CYAN, GridLayout.spec(3, GridLayout.CENTER, 1f),
                GridLayout.spec(4, 1f), "String greeting");

        // Add content to grid Row 5
        createGrid(bigGrid, Color.WHITE, GridLayout.spec(0, GridLayout.LEFT, 1f),
                GridLayout.spec(5, 1f), "Rule");
        createGrid(bigGrid, Color.YELLOW, GridLayout.spec(1, GridLayout.LEFT, 1f),
                GridLayout.spec(5, 1f), "From");
        createGrid(bigGrid, Color.YELLOW, GridLayout.spec(2, GridLayout.LEFT, 1f),
                GridLayout.spec(5, 1f), "To");
        createGrid(bigGrid, Color.RED, GridLayout.spec(3, GridLayout.LEFT, 1f),
                GridLayout.spec(5, 1f), "Greeting");

        // Add content to grid Row 6
        createGrid(bigGrid, Color.WHITE, GridLayout.spec(0, GridLayout.LEFT, 1f),
                GridLayout.spec(6, 1f), "R10");
        createGrid(bigGrid, Color.YELLOW, GridLayout.spec(1, GridLayout.RIGHT, 1f),
                GridLayout.spec(6, 1f), "0");
        createGrid(bigGrid, Color.YELLOW, GridLayout.spec(2, GridLayout.RIGHT, 1f),
                GridLayout.spec(6, 1f), "11");
        createGrid(bigGrid, Color.RED, GridLayout.spec(3, GridLayout.LEFT, 1f),
                GridLayout.spec(6, 1f), "Good Morning");

        // Add content to grid Row 7
        createGrid(bigGrid, Color.WHITE, GridLayout.spec(0, GridLayout.LEFT, 1f),
                GridLayout.spec(7, 1f), "R20");
        createGrid(bigGrid, Color.YELLOW, GridLayout.spec(1, GridLayout.RIGHT, 1f),
                GridLayout.spec(7, 1f), "12");
        createGrid(bigGrid, Color.YELLOW, GridLayout.spec(2, GridLayout.RIGHT, 1f),
                GridLayout.spec(7, 1f), "17");
        createGrid(bigGrid, Color.RED, GridLayout.spec(3, GridLayout.LEFT, 1f),
                GridLayout.spec(7, 1f), "Good Afternoon");

        // Add content to grid Row 8
        createGrid(bigGrid, Color.WHITE, GridLayout.spec(0, GridLayout.LEFT, 1f),
                GridLayout.spec(8, 1f), "R30");
        createGrid(bigGrid, Color.YELLOW, GridLayout.spec(1, GridLayout.RIGHT, 1f),
                GridLayout.spec(8, 1f), "18");
        createGrid(bigGrid, Color.YELLOW, GridLayout.spec(2, GridLayout.RIGHT, 1f),
                GridLayout.spec(8, 1f), "21");
        createGrid(bigGrid, Color.RED, GridLayout.spec(3, GridLayout.LEFT, 1f),
                GridLayout.spec(8, 1f), "Good Evening");

        // Add content to grid Row 9
        createGrid(bigGrid, Color.WHITE, GridLayout.spec(0, GridLayout.LEFT, 1f),
                GridLayout.spec(9, 1f), "R40");
        createGrid(bigGrid, Color.YELLOW, GridLayout.spec(1, GridLayout.RIGHT, 1f),
                GridLayout.spec(9, 1f), "22");
        createGrid(bigGrid, Color.YELLOW, GridLayout.spec(2, GridLayout.RIGHT,1f),
                GridLayout.spec(9, 1f), "23");
        createGrid(bigGrid, Color.RED, GridLayout.spec(3, GridLayout.LEFT, 1f),
                GridLayout.spec(9, 1f), "Good Night");

        // Add content view
        secondLevel.addView(bigGrid);
        firstLevel.addView(secondLevel);
        scrollableRoot.addView(firstLevel);
        setContentView(scrollableRoot);
    }

    @TargetApi(21)
    private void createGrid(GridLayout layout, int bgColor, GridLayout.Spec colSpec, GridLayout.Spec rowSpec, String text){
        // create column and row spec object
        GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);
        params.width = 425;

        params.setMargins(0, 0, 1, 1);

        // Create text view object
        TextView tv = new TextView(this);
        tv.setLayoutParams(params);
        tv.setText(text);
        tv.setTextSize(12);
        tv.setBackgroundColor(bgColor);
        layout.addView(tv);
    }
}
