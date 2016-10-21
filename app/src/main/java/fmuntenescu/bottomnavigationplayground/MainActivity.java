package fmuntenescu.bottomnavigationplayground;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);

        findViewById(R.id.button0).setOnClickListener(
                view -> selectMenuItem(bottomNavigationView.getMenu(), 0));
        findViewById(R.id.button1).setOnClickListener(
                view -> selectMenuItem(bottomNavigationView.getMenu(), 1));
        findViewById(R.id.button2).setOnClickListener(
                view -> selectMenuItem(bottomNavigationView.getMenu(), 2));

    }

    private void selectMenuItem(@NonNull final Menu menu,
                                final int index) {
        for (int i = 0; i < menu.size(); i++) {
            boolean checked = i == index;
            menu.getItem(i).setChecked(checked);
        }
    }
}
