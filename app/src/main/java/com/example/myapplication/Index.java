package com.example.myapplication;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class Index extends AppCompatActivity {

ListView listView;
ArrayList<String> list;
ArrayAdapter adapter;
String[] version = {
        "1   All the Way Savior Leads Me",
        "2   Higher Ground",
        "3   His Eye Is On the Sparrow",
        "4   Is it for Me",
        "5   Living For Jesus",
        "6   On Jordan's Stormy Banks",
        "7   Nearer,My God,to Thee",
        "8   O How I Love Jesus",
        "9   A Beautiful Life",
        "10  Abide With Me",
        "11  My Hope Is Built on Nothing Less",
        "12  Come, Thou Almighty King",
        "13  Come, Thou Fount of Every Blessing",
        "14  All the Way Savoir Leads Me",
        "15  Fairst Lord Jesus",
        "16  Halleluyah! We Shall Rise",
        "17  Happy Am I Along the Way",
        "18  Hiding in Thee",
        "19  His Grace Now Reaches Me***",
        "20  Holy,Holy,Holy",
        "21  I Am Resolved",
        "22  I Come to the Garden Alone",


        "23  I Need Thee Every Hour",
        "24  In the Garden",
        "25  I Sing the Almighty of God",
        "26  Is My Name Written There?",
        "27  I Stand Amazed",
        "28  I Surrender All",
        "29  It Is Well with My Soul",
        "30  The Christian Life*",
        "31  Jesus Loves Me",
        "32  Jesus, Rose Of Sharon",
        "33  Jesus Paid It All***",
        "34  Jesus, Savior, Pilot Me",
        "35  When the Roll Is Called Up Yonder",
        "36  The Lord's My Shepherd",
        "37  Up from the Grave He Arose",
        "38  There Is a Fountain",
        "39  Just As I Am",
        "40  Precious Memories",
        "41  Savior, like a shepherd Lead Us",
        "42  Redeemed, How I Love to Procliam it",
        "43  Seeking the Lost",
        };

    SearchView inputSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

listView = findViewById(R.id.list_view);
listView.setDividerHeight(20);


list = new ArrayList<>();

for (int i = 0;i<version.length;i++){

list.add(version[i]);

}

adapter = new ArrayAdapter(Index.this,android.R.layout.simple_list_item_1,list);
listView.setAdapter(adapter);

listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
@Override
public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

    if (position == 0) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M1.class);
        startActivityForResult(myIntent, 0);
        view.setBackgroundColor(getResources().getColor(R.color.colorAccent));
    }
    if (position == 1) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M2.class);
        startActivityForResult(myIntent, 0);
        view.setBackgroundColor(getResources().getColor(R.color.colorAccent));
    }
    if (position == 2) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M3.class);
        startActivityForResult(myIntent, 0);
        view.setBackgroundColor(getResources().getColor(R.color.colorAccent));
    }
    if (position == 3) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M4.class);
        startActivityForResult(myIntent, 0);
        view.setBackgroundColor(getResources().getColor(R.color.colorAccent));
    }
    if (position == 4) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M5.class);
        startActivityForResult(myIntent, 0);
        view.setBackgroundColor(getResources().getColor(R.color.colorAccent));
    }
    if (position == 5) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M6.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 6) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M7.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 7) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M8.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 8) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M9.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 9) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M10.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 10) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M11.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 11) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M12.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 12) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M13.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 13) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M14.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 14) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M15.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 15) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M16.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 16) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M17.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 17) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M18.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 18) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M19.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 19) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M20.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 20) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M21.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 21) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M22.class);
        startActivityForResult(myIntent, 0);
    }



    if (position == 22) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M23.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 23) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M24.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 24) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M25.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 25) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M26.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 26) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M27.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 27) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M28.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 28) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M29.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 29) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M30.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 30) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M31.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 31) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M32.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 32) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M33.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 33) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M34.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 34) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M35.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 35) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M36.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 36) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M37.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 37) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M38.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 38) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M39.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 39) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M40.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 40) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M41.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 41) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M42.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 42) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M43.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 43) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M44.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 44) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M45.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 45) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M46.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 46) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M47.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 47) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M48.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 48) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M49.class);
        startActivityForResult(myIntent, 0);
    }
    if (position == 49) {
        //code specific to first list item
        Intent myIntent = new Intent(view.getContext(), M50.class);
        startActivityForResult(myIntent, 0);
    }
}
});
/*inputSearch.setOnSearchClickListener(new TextWatcher() {
    @Override
    public void beforeTextChanged(CharSequence cs, int start, int count, int after) {
        Index.this.adapter.getFilter().filter(cs);
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {

    }
});*/
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       MenuInflater inflater= getMenuInflater();
       inflater.inflate(R.menu.search_file,menu);
        MenuItem item =menu.findItem(R.id.search_food);
        SearchView searchView = (SearchView)item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}
    /*
    Toast.makeText(Index.this, "Selected -> " + version[position], Toast.LENGTH_SHORT).show(); }
});
searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
@Override
public boolean onQueryTextSubmit(String s) {
return false;
}
        @Override
public boolean onQueryTextChange(String s) {
if(list.contains(s)) {
    adapter.getFilter().filter(s);
}
return true;
}
     */




