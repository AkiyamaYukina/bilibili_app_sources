package com.bilibili.ship.theseus.cheese.biz.intro.desc;

import androidx.recyclerview.widget.DiffUtil;
import com.bilibili.ship.theseus.cheese.biz.intro.desc.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/b.class */
public final class b extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.a f89388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<j> f89389b;

    public b(c.a aVar, List<j> list) {
        this.f89388a = aVar;
        this.f89389b = list;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i7, int i8) {
        return Intrinsics.areEqual(((ArrayList) this.f89388a.f89393a).get(i7), this.f89389b.get(i8));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i7, int i8) {
        return i7 == i8;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f89389b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return ((ArrayList) this.f89388a.f89393a).size();
    }
}
