package com.bilibili.ship.theseus.cheese.biz.intro.selection;

import androidx.recyclerview.widget.DiffUtil;
import com.bilibili.ship.theseus.cheese.biz.intro.selection.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/selection/b.class */
public final class b extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.C0634a f90062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a.b> f90063b;

    public b(a.C0634a c0634a, List<a.b> list) {
        this.f90062a = c0634a;
        this.f90063b = list;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i7, int i8) {
        return Intrinsics.areEqual(((a.b) ((ArrayList) this.f90062a.f90050b).get(i7)).f90053a, this.f90063b.get(i8).f90053a);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i7, int i8) {
        a.C0634a c0634a = this.f90062a;
        return ((a.b) ((ArrayList) c0634a.f90050b).get(i7)).f90053a.f117510e == this.f90063b.get(i8).f90053a.f117510e && ((a.b) ((ArrayList) c0634a.f90050b).get(i7)).f90053a.f117511f == this.f90063b.get(i8).f90053a.f117511f;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f90063b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return ((ArrayList) this.f90062a.f90050b).size();
    }
}
