package com.tim.WoodshopMC;

import android.app.Dialog;
import android.content.Context;

/**
 * Created by MaHanYong on 14-2-20.
 */
public class UnArchiveDialog extends Dialog {
    Context mContext;
    public UnArchiveDialog(Context context, int layout)
    {
        super(context, layout);
        mContext = context;
        SetView(R.layout.unarchive_confirm_dialog);
    }

    public void SetView(int layoutName)
    {
        super.setContentView(layoutName);
        ResolutionSet._instance.iterateChild(findViewById(R.id.RLArchiveConfirmRoot));
        /*
        Button btnOK = (Button)findViewById(R.id.btnOK);
        btnOK.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                dismiss();
            }

        });

        Button btnCancel = (Button)findViewById(R.id.btnCancel);
        btnCancel.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                dismiss();
            }

        });        */
    }
}