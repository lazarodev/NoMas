package com.gt.android.nomas.view.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.gt.android.nomas.R;
import com.gt.android.nomas.adapters.AdapterCategory;
import com.gt.android.nomas.adapters.TestCategory;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.fab)
    FloatingActionButton fab;
    @Bind(R.id.lvList)
    ListView listView;
    private ArrayList<TestCategory> testCategories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ButterKnife.bind(this);

        testCategories = new ArrayList<>();

        testCategories.add(new TestCategory("234333", "Doño Deprecado", "Chikidracula", "A mi carro le puse un sticker android y por eso ahora tengo android auto", R.drawable.juanmateo));
        testCategories.add(new TestCategory("2343249", "A la verch", "Brim", "Donde estan mis ejemplos?", R.drawable.david));
        testCategories.add(new TestCategory("3243", "madafaka", "Chejo jobs", "BaleBergalaBida", R.drawable.sergio));
        testCategories.add(new TestCategory("234", "chin", "Chiva loca cifu", "fluit punch", R.drawable.cifuentes));
        testCategories.add(new TestCategory("345", "puts", "JA2", "Doño le quedo grande el worldskills xD", R.drawable.jorge));
        testCategories.add(new TestCategory("63462", "sote", "ElBuki", "Doño le quedo grande el worldskills xD", R.drawable.alex));
        testCategories.add(new TestCategory("345", "Doño Deprecado", "Chikidracula", "Doño le quedo grande el worldskills xD", R.drawable.juanmateo));
        testCategories.add(new TestCategory("7567567", "Doño Deprecado", "Chikidracula", "Doño le quedo grande el worldskills xD", R.drawable.juanmateo));
        testCategories.add(new TestCategory("234345333", "Doño Deprecado", "Chikidracula", "Doño le quedo grande el worldskills xD", R.drawable.juanmateo));
        testCategories.add(new TestCategory("2345", "Doño Deprecado", "Chikidracula", "Doño le quedo grande el worldskills xD", R.drawable.juanmateo));
        testCategories.add(new TestCategory("33232", "Doño Deprecado", "Chikidracula", "Doño le quedo grande el worldskills xD", R.drawable.juanmateo));
        testCategories.add(new TestCategory("12234", "Doño Deprecado", "Chikidracula", "Doño le quedo grande el worldskills xD", R.drawable.juanmateo));
        testCategories.add(new TestCategory("76341", "Doño Deprecado", "Chikidracula", "Doño le quedo grande el worldskills xD", R.drawable.juanmateo));
        testCategories.add(new TestCategory("123468", "Doño Deprecado", "Chikidracula", "Doño le quedo grande el worldskills xD", R.drawable.juanmateo));

        AdapterCategory adapter = new AdapterCategory(testCategories, MainActivity.this);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TestCategory testCategory = (TestCategory) parent.getItemAtPosition(position);
                Bundle bundle = new Bundle();
                bundle.putString("key", testCategory.getId());
                bundle.putString("key2", testCategory.getTitulo());
                bundle.putString("key3", testCategory.getNickName());
                bundle.putString("key4", testCategory.getDenuncia());
                bundle.putInt("llave", testCategory.getAvatar());
                Intent intent = new Intent(MainActivity.this, DetalleItemActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }

    @OnClick(R.id.fab)
    void fabListener(View view) {
        Snackbar.make(view, "El buki y su rocola xD", Snackbar.LENGTH_SHORT).show();
    }

}
