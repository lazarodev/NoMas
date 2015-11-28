package com.gt.android.nomas.view.activities;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.gt.android.nomas.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DetalleItemActivity extends AppCompatActivity {

    private String idBundle;
    private String tituloBundle;
    private String nicknameBundle;
    private String denunciaBundle;
    private int avatarBundle;

    @Bind(R.id.tvIdDetalle)
    TextView idDetalle;
    @Bind(R.id.tvNickNameDetalle)
    TextView nickNameDetalle;
    @Bind(R.id.tvDenunciaDetalle)
    TextView denunciaDetalle;
    @Bind(R.id.toolbar_layout)
    CollapsingToolbarLayout toolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_item);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ButterKnife.bind(this);

        getBundles();
        setResources();
    }

    private void getBundles() {
        Bundle bundle = getIntent().getExtras();
        idBundle = bundle.getString("key");
        tituloBundle = bundle.getString("key2");
        nicknameBundle = bundle.getString("key3");
        denunciaBundle = bundle.getString("key4");
        avatarBundle = bundle.getInt("llave");
    }

    private void setResources() {
        toolbarLayout.setBackgroundResource(avatarBundle);
        toolbarLayout.setTitle(tituloBundle);

        idDetalle.setText(idBundle);
        nickNameDetalle.setText(nicknameBundle);
        denunciaDetalle.setText(denunciaBundle);
    }

    @OnClick(R.id.fab)
    void fabListener(View view) {
        Snackbar.make(view, "comparte item", Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_detalle_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
