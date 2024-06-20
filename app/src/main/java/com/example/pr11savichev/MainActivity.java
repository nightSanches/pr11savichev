package com.example.pr11savichev;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }
    public void AlertDialog(String title, String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title).setMessage(message).setCancelable(false).setNegativeButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) { dialog.cancel(); }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
    public void OpenWallet(View view){AlertDialog("Уведомление","");}

    public void OpenProfile(View view){AlertDialog("Уведомление","");}

    public void OpenStore(View view){AlertDialog("Уведомление","");}

    public void OpenMenu(View view){AlertDialog("Уведомление","");}

    public void OpenHidden(View view){AlertDialog("Уведомление","");}

    public void OpenDots(View view){AlertDialog("Уведомление","");}

    public void OpenQR(View view){AlertDialog("Уведомление","");}

    public void OpenShield(View view){AlertDialog("Уведомление","");}

    public void OpenCard(View view){AlertDialog("Уведомление",")");}

    public void OpenAdvert(View view){AlertDialog("Уведомление","");}

    public void OpenCreateTrans(View view){AlertDialog("Уведомление","");}

    public void OpenUser(View view){AlertDialog("Уведомление","");}

    public void OpenAllExpenses(View view){AlertDialog("Уведомление","");}

    public void OpenAuto(View view){AlertDialog("Уведомление","");}

    public void OpenCafe(View view){AlertDialog("Уведомление","");}

    public void OpenTrans(View view){AlertDialog("Уведомление","");}

    public void OpenExpenses(View view){AlertDialog("Уведомление","");}

    public void OpenCredits(View view){AlertDialog("Уведомление","");}

    public void OpenServices(View view){AlertDialog("Уведомление","");}

    public void CreateCredits(View view){AlertDialog("Уведомление","");}

    public void OpenRecommend(View view){AlertDialog("Уведомление","");}

    public void OpenReclama(View view){AlertDialog("Уведомление","");}

    public void OpenCourse(View view){AlertDialog("Уведомление","");}

    public void OpenCNY(View view){AlertDialog("Уведомление","");}

    public void OpenMain(View view){AlertDialog("Уведомление","");}

    public void OpenSafe(View view){AlertDialog("Уведомление","");}

    public void OpenAssistent(View view){AlertDialog("Уведомление","");}

    public void OpenMenuTrans(View view){AlertDialog("Уведомление","");}

    public void OpenHistory(View view){AlertDialog("Уведомление","");}
}