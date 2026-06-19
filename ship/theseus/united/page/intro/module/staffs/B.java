package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/B.class */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f101757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f101758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A f101759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f101760d;

    public B(TextView textView, Context context, A a7, RecyclerView recyclerView) {
        this.f101757a = textView;
        this.f101758b = context;
        this.f101759c = a7;
        this.f101760d = recyclerView;
    }

    public final void a() {
        A.m(this.f101757a, this.f101758b, this.f101759c, this.f101760d);
    }
}
