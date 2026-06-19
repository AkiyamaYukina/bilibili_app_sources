package com.bilibili.ship.theseus.ogv.intro.coupon;

import androidx.databinding.f;
import com.bilibili.ship.theseus.ogv.intro.coupon.e;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/coupon/c.class */
public final class c extends f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e.a f92341a;

    public c(e.a aVar) {
        this.f92341a = aVar;
    }

    @Override // androidx.databinding.f.a
    public final void onPropertyChanged(androidx.databinding.f fVar, int i7) {
        e.a aVar = this.f92341a;
        g gVar = aVar.f92347c;
        int i8 = aVar.f92346b.f92362a.get();
        int i9 = gVar.f92353c;
        if (i9 != i8) {
            gVar.notifyItemChanged(i9, "isSelect");
            gVar.notifyItemChanged(i8, "isSelect");
            gVar.f92353c = i8;
        }
    }
}
