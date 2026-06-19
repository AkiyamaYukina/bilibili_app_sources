package com.bilibili.lib.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/K.class */
public final class K implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f64786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f64788c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/K$a.class */
    public final class a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f64789a;

        public a(K k7) {
            this.f64789a = k7;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i7) {
            this.f64789a.f64788c.run();
        }
    }

    public K(Activity activity, int i7, Runnable runnable) {
        this.f64786a = activity;
        this.f64787b = i7;
        this.f64788c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            new AlertDialog.Builder(this.f64786a).setMessage(this.f64787b).setCancelable(false).setPositiveButton(2131825422, new a(this)).show();
        } catch (Exception e7) {
        }
    }
}
