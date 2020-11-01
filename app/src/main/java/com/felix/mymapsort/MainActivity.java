package com.felix.mymapsort;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList <Pair> pairs = new ArrayList();

        pairs.add(new Pair(3, 'C'));
        pairs.add(new Pair(2, 'B'));
        pairs.add(new Pair(1, 'B'));
        pairs.add(new Pair(2, 'A'));
        pairs.add(new Pair(1, 'A'));
        pairs.add(new Pair(1, 'C'));
        pairs.add(new Pair(3, 'A'));

        Pair p;
        for (int i=0; i<pairs.size(); i++) {
            for (int j=i+1; j<pairs.size(); j++) {
                if (pairs.get(i).GetI() > pairs.get(j).GetI()) {
                    p = pairs.get(j);
                    pairs.set(j, pairs.get(i));
                    pairs.set(i, p);
                }
            }
        }

        Toast.makeText(this, "" + pairs.get(0).i + "  " + pairs.get(0).c, Toast.LENGTH_LONG).show();
        Log.i("Result", "" + pairs.get(0).i + "  " + pairs.get(0).c);
        Log.i("Result", "" + pairs.get(1).i + "  " + pairs.get(1).c);
        Log.i("Result", "" + pairs.get(2).i + "  " + pairs.get(2).c);
        Log.i("Result", "" + pairs.get(3).i + "  " + pairs.get(3).c);
        Log.i("Result", "" + pairs.get(4).i + "  " + pairs.get(4).c);
        Log.i("Result", "" + pairs.get(5).i + "  " + pairs.get(5).c);
        Log.i("Result", "" + pairs.get(6).i + "  " + pairs.get(6).c);
        Log.i("Result", "------------------------");

        for (int i=0; i<pairs.size(); i++) {
            for (int j = i + 1; j < pairs.size(); j++) {
                if (pairs.get(i).GetI() == pairs.get(j).GetI()) {
                    if (pairs.get(i).GetC() > pairs.get(j).GetC()) {
                        p = pairs.get(j);
                        pairs.set(j, pairs.get(i));
                        pairs.set(i, p);
                    }
                }
            }
        }
        Log.i("Result", "" + pairs.get(0).i + "  " + pairs.get(0).c);
        Log.i("Result", "" + pairs.get(1).i + "  " + pairs.get(1).c);
        Log.i("Result", "" + pairs.get(2).i + "  " + pairs.get(2).c);
        Log.i("Result", "" + pairs.get(3).i + "  " + pairs.get(3).c);
        Log.i("Result", "" + pairs.get(4).i + "  " + pairs.get(4).c);
        Log.i("Result", "" + pairs.get(5).i + "  " + pairs.get(5).c);
        Log.i("Result", "" + pairs.get(6).i + "  " + pairs.get(6).c);
    }

    static class Pair {
        int i;
        char c;
        Pair (int i, char c) {
            this.i = i;
            this.c = c;
        }
        int GetI() {
            return i;
        }
        char GetC() {
            return c;
        }

    }
}