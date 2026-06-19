package com.bilibili.ogv.pub.payment.paycenter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/payment/paycenter/a.class */
public final class a extends AlertDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f71588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f71589b;

    @Override // androidx.appcompat.app.AlertDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(2131500298, (ViewGroup) null);
        this.f71588a = (TextView) viewInflate.findViewById(2131304642);
        setView(viewInflate);
        this.f71588a.setText(this.f71589b);
        super.onCreate(bundle);
    }
}
