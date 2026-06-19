package com.bilibili.pegasus.page;

import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.pegasus.page.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/j.class */
@StabilityInferred(parameters = 0)
public final class C5721j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f78400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final View f78401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TextView f78402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final RecyclerView f78403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final E11.k f78404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final US0.z f78405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public RunnableC5717f f78406g;

    @Nullable
    public C5720i h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f78407i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f78408j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f78409k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f78410l;

    public C5721j(@NotNull View view, @NotNull View view2, @NotNull TextView textView, @NotNull RecyclerView recyclerView, int i7, boolean z6, @NotNull E11.k kVar, @NotNull US0.z zVar) {
        this.f78400a = view;
        this.f78401b = view2;
        this.f78402c = textView;
        this.f78403d = recyclerView;
        this.f78404e = kVar;
        this.f78405f = zVar;
        this.f78409k = z6;
        d(i7);
    }

    public final void a(final float f7, final float f8) {
        if (this.f78401b.getWidth() == 0) {
            this.f78401b.post(new Runnable(this, f7, f8) { // from class: com.bilibili.pegasus.page.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C5721j f78396a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final float f78397b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final float f78398c;

                {
                    this.f78396a = this;
                    this.f78397b = f7;
                    this.f78398c = f8;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f78396a.a(this.f78397b, this.f78398c);
                }
            });
        } else {
            this.f78401b.animate().cancel();
            this.f78401b.animate().translationX(this.f78401b.getWidth() * f7).rotation(f8).setDuration(160L).start();
        }
    }

    public final void b() {
        RunnableC5717f runnableC5717f = this.f78406g;
        if (runnableC5717f == null) {
            return;
        }
        this.f78401b.removeCallbacks(runnableC5717f);
        this.f78406g = null;
    }

    public final void c() {
        this.f78408j = false;
        if (!this.f78409k) {
            this.f78401b.setVisibility(8);
            return;
        }
        this.f78401b.setVisibility(0);
        if (!this.f78410l) {
            this.f78410l = true;
            this.f78404e.invoke();
        }
        a(0.0f, 0.0f);
    }

    public final void d(int i7) {
        SpannableString spannableString;
        if (i7 <= 0) {
            spannableString = null;
        } else if (i7 == 2008) {
            spannableString = new SpannableString("2009前");
            int iZ = StringsKt.z("2009前", (char) 21069, 0, 6);
            if (iZ > 0) {
                spannableString.setSpan(new AbsoluteSizeSpan(7, true), 0, iZ, 33);
                spannableString.setSpan(new AbsoluteSizeSpan(6, true), iZ, 5, 33);
            }
        } else {
            spannableString = new SpannableString(String.valueOf(i7));
            spannableString.setSpan(new AbsoluteSizeSpan(8, true), 0, spannableString.length(), 33);
        }
        this.f78402c.setText(spannableString == null ? "" : spannableString);
        TextView textView = this.f78402c;
        int i8 = 0;
        if (spannableString == null) {
            i8 = 8;
        }
        textView.setVisibility(i8);
    }

    public final void e(boolean z6) {
        this.f78409k = z6;
        if (z6) {
            if (this.f78408j) {
                return;
            }
            c();
        } else {
            b();
            this.f78401b.animate().cancel();
            this.f78401b.setVisibility(8);
        }
    }
}
