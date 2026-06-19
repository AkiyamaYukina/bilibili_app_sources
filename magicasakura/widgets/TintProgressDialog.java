package com.bilibili.magicasakura.widgets;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import java.text.NumberFormat;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/magicasakura/widgets/TintProgressDialog.class */
public class TintProgressDialog extends AlertDialog implements Handler.Callback {
    public static final int STYLE_HORIZONTAL = 1;
    public static final int STYLE_SPINNER = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ProgressBar f65539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f65540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f65541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f65542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f65543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f65544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public NumberFormat f65545g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f65546i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f65547j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f65548k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f65549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f65550m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f65551n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f65552o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f65553p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f65554q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Handler f65555r;

    public TintProgressDialog(Context context) {
        this(context, 0);
        this.f65543e = "%1d/%2d";
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        this.f65545g = percentInstance;
        percentInstance.setMaximumFractionDigits(0);
    }

    public TintProgressDialog(Context context, int i7) {
        super(context, i7);
        this.f65541c = 0;
        this.f65543e = "%1d/%2d";
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        this.f65545g = percentInstance;
        percentInstance.setMaximumFractionDigits(0);
    }

    public TintProgressDialog(Context context, boolean z6, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z6, onCancelListener);
        this.f65541c = 0;
        this.f65543e = "%1d/%2d";
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        this.f65545g = percentInstance;
        percentInstance.setMaximumFractionDigits(0);
    }

    public static TintProgressDialog show(Context context, CharSequence charSequence, CharSequence charSequence2) {
        return show(context, charSequence, charSequence2, false);
    }

    public static TintProgressDialog show(Context context, CharSequence charSequence, CharSequence charSequence2, boolean z6) {
        return show(context, charSequence, charSequence2, z6, false, null);
    }

    public static TintProgressDialog show(Context context, CharSequence charSequence, CharSequence charSequence2, boolean z6, boolean z7) {
        return show(context, charSequence, charSequence2, z6, z7, null);
    }

    public static TintProgressDialog show(Context context, CharSequence charSequence, CharSequence charSequence2, boolean z6, boolean z7, DialogInterface.OnCancelListener onCancelListener) {
        TintProgressDialog tintProgressDialog = new TintProgressDialog(context);
        tintProgressDialog.setTitle(charSequence);
        tintProgressDialog.setMessage(charSequence2);
        tintProgressDialog.setIndeterminate(z6);
        tintProgressDialog.setCancelable(z7);
        tintProgressDialog.setOnCancelListener(onCancelListener);
        tintProgressDialog.show();
        return tintProgressDialog;
    }

    public int getMax() {
        ProgressBar progressBar = this.f65539a;
        return progressBar != null ? progressBar.getMax() : this.h;
    }

    public int getProgress() {
        ProgressBar progressBar = this.f65539a;
        return progressBar != null ? progressBar.getProgress() : this.f65546i;
    }

    public int getSecondaryProgress() {
        ProgressBar progressBar = this.f65539a;
        return progressBar != null ? progressBar.getSecondaryProgress() : this.f65547j;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int progress = this.f65539a.getProgress();
        int max = this.f65539a.getMax();
        String str = this.f65543e;
        if (str != null) {
            this.f65542d.setVisibility(0);
            this.f65542d.setText(String.format(str, Integer.valueOf(progress), Integer.valueOf(max)));
        } else {
            this.f65542d.setVisibility(8);
        }
        if (this.f65545g == null) {
            this.f65544f.setVisibility(8);
            return true;
        }
        SpannableString spannableString = new SpannableString(this.f65545g.format(((double) progress) / ((double) max)));
        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
        this.f65544f.setVisibility(0);
        this.f65544f.setText(spannableString);
        return true;
    }

    public void incrementProgressBy(int i7) {
        ProgressBar progressBar = this.f65539a;
        if (progressBar == null) {
            this.f65548k += i7;
        } else {
            progressBar.incrementProgressBy(i7);
            j();
        }
    }

    public void incrementSecondaryProgressBy(int i7) {
        ProgressBar progressBar = this.f65539a;
        if (progressBar == null) {
            this.f65549l += i7;
        } else {
            progressBar.incrementSecondaryProgressBy(i7);
            j();
        }
    }

    public boolean isIndeterminate() {
        ProgressBar progressBar = this.f65539a;
        return progressBar != null ? progressBar.isIndeterminate() : this.f65553p;
    }

    public final void j() {
        Handler handler;
        if (this.f65541c != 1 || (handler = this.f65555r) == null || handler.hasMessages(0)) {
            return;
        }
        this.f65555r.sendEmptyMessage(0);
    }

    @Override // androidx.appcompat.app.AlertDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        if (this.f65541c == 1) {
            this.f65555r = new Handler(this);
            View viewInflate = layoutInflaterFrom.inflate(2131497484, (ViewGroup) null);
            this.f65539a = (ProgressBar) viewInflate.findViewById(2131306078);
            this.f65542d = (TextView) viewInflate.findViewById(2131309349);
            this.f65544f = (TextView) viewInflate.findViewById(2131309350);
            setView(viewInflate);
        } else {
            View viewInflate2 = layoutInflaterFrom.inflate(2131497494, (ViewGroup) null);
            this.f65539a = (ProgressBar) viewInflate2.findViewById(2131306078);
            this.f65540b = (TextView) viewInflate2.findViewById(2131304642);
            setView(viewInflate2);
        }
        int i7 = this.h;
        if (i7 > 0) {
            setMax(i7);
        }
        int i8 = this.f65546i;
        if (i8 > 0) {
            setProgress(i8);
        }
        int i9 = this.f65547j;
        if (i9 > 0) {
            setSecondaryProgress(i9);
        }
        int i10 = this.f65548k;
        if (i10 > 0) {
            incrementProgressBy(i10);
        }
        int i11 = this.f65549l;
        if (i11 > 0) {
            incrementSecondaryProgressBy(i11);
        }
        Drawable drawable = this.f65550m;
        if (drawable != null) {
            setProgressDrawable(drawable);
        }
        Drawable drawable2 = this.f65551n;
        if (drawable2 != null) {
            setIndeterminateDrawable(drawable2);
        }
        CharSequence charSequence = this.f65552o;
        if (charSequence != null) {
            setMessage(charSequence);
        }
        setIndeterminate(this.f65553p);
        j();
        super.onCreate(bundle);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        this.f65554q = true;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onStop() {
        super.onStop();
        this.f65554q = false;
    }

    public void setIndeterminate(boolean z6) {
        ProgressBar progressBar = this.f65539a;
        if (progressBar != null) {
            progressBar.setIndeterminate(z6);
        } else {
            this.f65553p = z6;
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        ProgressBar progressBar = this.f65539a;
        if (progressBar != null) {
            progressBar.setIndeterminateDrawable(drawable);
        } else {
            this.f65551n = drawable;
        }
    }

    public void setMax(int i7) {
        ProgressBar progressBar = this.f65539a;
        if (progressBar == null) {
            this.h = i7;
        } else {
            progressBar.setMax(i7);
            j();
        }
    }

    @Override // androidx.appcompat.app.AlertDialog
    public void setMessage(CharSequence charSequence) {
        if (this.f65539a == null) {
            this.f65552o = charSequence;
        } else if (this.f65541c == 1) {
            super.setMessage(charSequence);
        } else {
            this.f65540b.setText(charSequence);
        }
    }

    public void setProgress(int i7) {
        if (!this.f65554q) {
            this.f65546i = i7;
        } else {
            this.f65539a.setProgress(i7);
            j();
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        ProgressBar progressBar = this.f65539a;
        if (progressBar != null) {
            progressBar.setProgressDrawable(drawable);
        } else {
            this.f65550m = drawable;
        }
    }

    public void setProgressNumberFormat(String str) {
        this.f65543e = str;
        j();
    }

    public void setProgressPercentFormat(NumberFormat numberFormat) {
        this.f65545g = numberFormat;
        j();
    }

    public void setProgressStyle(int i7) {
        this.f65541c = i7;
    }

    public void setSecondaryProgress(int i7) {
        ProgressBar progressBar = this.f65539a;
        if (progressBar == null) {
            this.f65547j = i7;
        } else {
            progressBar.setSecondaryProgress(i7);
            j();
        }
    }
}
