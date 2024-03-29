package org.yuni.chemicalnote;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

public class DetailInfo extends AppCompatActivity {
    TextView desc, namee, appearancee, masss, categoryy, densityy, discoveredd, meltt, heatt, namedd, numberr, periodd, phasee, numb, symboll, electronn, semanticc, affinity, paulingg, nama_unsur, kategori;
    public static final String Key_TabelActivity = "Key_TabelActivity";
    UnsurwApi unsurwApi;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_unsur);

        namee = findViewById(R.id.namee);
        desc = findViewById(R.id.desc);
        appearancee = findViewById(R.id.appearancee);
        masss = findViewById(R.id.masss);
        categoryy = findViewById(R.id.categoryy);
        densityy = findViewById(R.id.densityy);
        discoveredd = findViewById(R.id.discoveredd);
        meltt = findViewById(R.id.meltt);
        heatt = findViewById(R.id.heatt);
        namedd = findViewById(R.id.namedd);
        numberr = findViewById(R.id.numberr);
        periodd = findViewById(R.id.periodd);
        phasee = findViewById(R.id.phasee);
        symboll = findViewById(R.id.symboll);
        electronn = findViewById(R.id.electronn);
        semanticc = findViewById(R.id.semanticc);
        affinity = findViewById(R.id.affinity);
        paulingg = findViewById(R.id.paulingg);
        nama_unsur = findViewById(R.id.nama_unsur);
        kategori = findViewById(R.id.kategori);
        numb = findViewById(R.id.numb);

        unsurwApi = getIntent().getParcelableExtra(Key_TabelActivity);

        nama_unsur.setText(unsurwApi.getName());
        namee.setText(unsurwApi.getName());
        kategori.setText(unsurwApi.getCategory());
        categoryy.setText(unsurwApi.getCategory());
        desc.setText(unsurwApi.getSummary());
        appearancee.setText(unsurwApi.getAppearance());
        masss.setText(unsurwApi.getAtomic_mass());
        densityy.setText(unsurwApi.getDensity());
        discoveredd.setText(unsurwApi.getDiscovered_by());
        meltt.setText(unsurwApi.getMelt());
        heatt.setText(unsurwApi.getMolar_heat());
        namedd.setText(unsurwApi.getNamed_by());
        numberr.setText(unsurwApi.getNumber());
        numb.setText(unsurwApi.getNumber());
        periodd.setText(unsurwApi.getPeriod());
        phasee.setText(unsurwApi.getPhase());
        symboll.setText(unsurwApi.getSymbol());
        electronn.setText(unsurwApi.getElectron_configuration());
        semanticc.setText(unsurwApi.getElectron_configuration_semantic());
        affinity.setText(unsurwApi.getElectron_affinity());
        paulingg.setText(unsurwApi.getElectronegativity_pauling());

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(ContextCompat.getColor(this, R.color.menu));
        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailInfo.this, TabelPeriodik.class);
                startActivity(intent);
            }
        });
    }
}
