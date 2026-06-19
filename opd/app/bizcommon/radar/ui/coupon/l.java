package com.bilibili.opd.app.bizcommon.radar.ui.coupon;

import android.widget.TextView;
import io.reactivex.rxjava3.functions.Consumer;
import qn0.C8463i;
import qn0.C8464j;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/coupon/l.class */
public final class l<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f74288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f74289b;

    public l(m mVar, TextView textView) {
        this.f74288a = mVar;
        this.f74289b = textView;
    }

    public final void accept(Object obj) {
        C8463i c8463iA = C8464j.a(((Long) obj).longValue() * ((long) 1000));
        TextView textView = this.f74289b;
        TextView textView2 = (TextView) this.f74288a.f74297n.getValue();
        String str = c8463iA.f126200a;
        textView2.setText(str == null ? textView.getContext().getString(2131833847, c8463iA.f126201b, c8463iA.f126202c, c8463iA.f126203d) : textView.getContext().getString(2131833846, str));
    }
}
