package com.example.estimacioncalculadora;

import android.R.integer;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void calcular(View vista){
    	EditText pldc = (EditText) findViewById(R.id.editText1);
    	EditText pmldc = (EditText) findViewById(R.id.editText2);
    	EditText pe = (EditText) findViewById(R.id.editText3);
    	EditText ptd = (EditText) findViewById(R.id.editText4);
    	EditText ppn = (EditText) findViewById(R.id.editText5);
    	EditText pp = (EditText) findViewById(R.id.editText6);
    	EditText pc = (EditText) findViewById(R.id.editText7);
    	
    	String sldc = pldc.getText().toString();
    	int vldc = Integer.parseInt(sldc);
    	double vmldc = vldc/1000;
    	
    	double ve = Math.pow(vmldc, 1.05);
    	double vet = 3.2* ve;
    	double ret = Math.round(vet);
    	
    	double vtd = Math.pow(vet, 0.38);
    	double vtdt = 2.5* vtd;
    	double rtdt = Math.round(vtdt);
    	
    	double vpn = vet/vtdt;
    	double rpn = Math.round(vpn);
    	
    	double vpp = vldc/vet;
    	double rpp = Math.ceil(vpp);
    	
    	double vc = Math.ceil(vet*2164);
    	    	   	    	
    	pmldc.setText(vmldc+"");
    	pe.setText(ret+"  al mes");
    	ptd.setText(rtdt+"   mes");
    	ppn.setText(rpn+"");
    	pp.setText(rpp+"");
    	pc.setText(vc+" Bs.");
    }
    
    public void borrar (View vista){
    	
    	EditText pldc = (EditText) findViewById(R.id.editText1);
    	EditText pmldc = (EditText) findViewById(R.id.editText2);
    	EditText pe = (EditText) findViewById(R.id.editText3);
    	EditText ptd = (EditText) findViewById(R.id.editText4);
    	EditText ppn = (EditText) findViewById(R.id.editText5);
    	EditText pp = (EditText) findViewById(R.id.editText6);
    	EditText pc = (EditText) findViewById(R.id.editText7);
    	
    	pldc.setText("");
    	pmldc.setText("");
    	pe.setText("");
    	ptd.setText("");
    	ppn.setText("");
    	pp.setText("");
    	pc.setText("");
    	
    	
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
