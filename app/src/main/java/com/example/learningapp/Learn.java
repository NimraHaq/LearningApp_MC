package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Learn extends AppCompatActivity implements View.OnClickListener
{
    Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        a = findViewById(R.id.A);
        b = findViewById(R.id.B);
        c = findViewById(R.id.C);
        d = findViewById(R.id.D);
        e = findViewById(R.id.E);
        f = findViewById(R.id.F);
        g = findViewById(R.id.G);
        h = findViewById(R.id.H);
        i = findViewById(R.id.I);
        j = findViewById(R.id.J);
        k = findViewById(R.id.K);
        l = findViewById(R.id.L);
        m = findViewById(R.id.M);
        n = findViewById(R.id.N);
        o = findViewById(R.id.O);
        p = findViewById(R.id.P);
        q = findViewById(R.id.Q);
        r = findViewById(R.id.R);
        s = findViewById(R.id.S);
        t = findViewById(R.id.T);
        u = findViewById(R.id.U);
        v = findViewById(R.id.V);
        w = findViewById(R.id.W);
        x = findViewById(R.id.X);
        y = findViewById(R.id.Y);
        z = findViewById(R.id.Z);

        //

        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        o.setOnClickListener(this);
        p.setOnClickListener(this);
        q.setOnClickListener(this);
        r.setOnClickListener(this);
        s.setOnClickListener(this);
        t.setOnClickListener(this);
        u.setOnClickListener(this);
        v.setOnClickListener(this);
        w.setOnClickListener(this);
        x.setOnClickListener(this);
        y.setOnClickListener(this);
        z.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(Learn.this, AlphabetImages.class);

        switch (view.getId())
        {
            case R.id.A:
                intent.putExtra("image", "a");
                startActivity(intent);
                break;
            case R.id.B:
                intent.putExtra("image", "b");
                startActivity(intent);
                break;
            case R.id.C:
                intent.putExtra("image", "c");
                startActivity(intent);
                break;
            case R.id.D:
                intent.putExtra("image", "d");
                startActivity(intent);
                break;
            case R.id.E:
                intent.putExtra("image", "e");
                startActivity(intent);
                break;
            case R.id.F:
                intent.putExtra("image", "f");
                startActivity(intent);
                break;
            case R.id.G:
                intent.putExtra("image", "g");
                startActivity(intent);
                break;
            case R.id.H:
                intent.putExtra("image", "h");
                startActivity(intent);
                break;
            case R.id.I:
                intent.putExtra("image", "i");
                startActivity(intent);
                break;
            case R.id.J:
                intent.putExtra("image", "j");
                startActivity(intent);
                break;
            case R.id.K:
                intent.putExtra("image", "k");
                startActivity(intent);
                break;
            case R.id.L:
                intent.putExtra("image", "l");
                startActivity(intent);
                break;
            case R.id.M:
                intent.putExtra("image", "m");
                startActivity(intent);
                break;
            case R.id.N:
                intent.putExtra("image", "n");
                startActivity(intent);
                break;
            case R.id.O:
                intent.putExtra("image", "o");
                startActivity(intent);
                break;
            case R.id.P:
                intent.putExtra("image", "p");
                startActivity(intent);
                break;
            case R.id.Q:
                intent.putExtra("image", "q");
                startActivity(intent);
                break;
            case R.id.R:
                intent.putExtra("image", "r");
                startActivity(intent);
                break;
            case R.id.S:
                intent.putExtra("image", "s");
                startActivity(intent);
                break;
            case R.id.T:
                intent.putExtra("image", "t");
                startActivity(intent);
                break;
            case R.id.U:
                intent.putExtra("image", "u");
                startActivity(intent);
                break;
            case R.id.V:
                intent.putExtra("image", "v");
                startActivity(intent);
                break;
            case R.id.W:
                intent.putExtra("image", "w");
                startActivity(intent);
                break;
            case R.id.X:
                intent.putExtra("image", "x");
                startActivity(intent);
                break;
            case R.id.Y:
                intent.putExtra("image", "y");
                startActivity(intent);
                break;
            case R.id.Z:
                intent.putExtra("image", "z");
                startActivity(intent);
                break;

        }

    }
}