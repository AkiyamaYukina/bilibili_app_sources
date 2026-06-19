package com.bilibili.ship.theseus.ugc.intro.mhy;

import androidx.recyclerview.widget.DiffUtil;
import com.bilibili.ship.theseus.ugc.intro.mhy.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/mhy/c.class */
public final class c extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<d.c> f97093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<d.c> f97094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f97095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f97096d;

    public c(int i7, int i8, ArrayList arrayList, List list) {
        this.f97093a = arrayList;
        this.f97094b = list;
        this.f97095c = i7;
        this.f97096d = i8;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i7, int i8) {
        d.c cVar;
        d.c cVar2 = (d.c) CollectionsKt.getOrNull(this.f97093a, i7);
        if (cVar2 == null || (cVar = (d.c) CollectionsKt.getOrNull(this.f97094b, i8)) == null) {
            return false;
        }
        boolean z6 = false;
        if (cVar2.f97105a == cVar.f97105a) {
            z6 = false;
            if (Intrinsics.areEqual(cVar2.f97106b, cVar.f97106b)) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i7, int i8) {
        d.c cVar;
        d.c cVar2 = (d.c) CollectionsKt.getOrNull(this.f97093a, i7);
        if (cVar2 == null || (cVar = (d.c) CollectionsKt.getOrNull(this.f97094b, i8)) == null) {
            return false;
        }
        boolean z6 = false;
        if (cVar2.f97105a == cVar.f97105a) {
            z6 = false;
            if (Intrinsics.areEqual(cVar2.f97106b, cVar.f97106b)) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f97095c;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f97096d;
    }
}
