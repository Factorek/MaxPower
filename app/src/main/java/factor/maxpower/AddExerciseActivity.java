package factor.maxpower;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class AddExerciseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_exercise);

        ListView exerciseBuyList = (ListView) findViewById(R.id.exerciseBuyList);

        String[] exercises = { "Przysiady", "Podciaganie", "Pompki", "Deski", "Brzuszki", "Pompki odwrotne", "Squaty", "Rowerek", "Nozyce", "cos tam1", "cos tam2", "cos tam3"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, exercises);

        exerciseBuyList.setAdapter(adapter);

        exerciseBuyList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                finish();
            }
        });

    }

}
