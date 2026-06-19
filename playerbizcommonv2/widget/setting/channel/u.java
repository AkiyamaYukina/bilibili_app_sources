package com.bilibili.playerbizcommonv2.widget.setting.channel;

import androidx.recyclerview.widget.DiffUtil;
import com.bilibili.playerbizcommonv2.widget.setting.channel.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/u.class */
public final class u extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<t.a.C0555a> f83311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t.a f83312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<t.a.C0555a> f83313c;

    public u(ArrayList<t.a.C0555a> arrayList, t.a aVar, List<t.a.C0555a> list) {
        this.f83311a = arrayList;
        this.f83312b = aVar;
        this.f83313c = list;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i7, int i8) {
        t.a.C0555a c0555a;
        t.a.C0555a c0555a2 = (t.a.C0555a) CollectionsKt.getOrNull(this.f83311a, i7);
        boolean z6 = false;
        if (c0555a2 == null || (c0555a = (t.a.C0555a) CollectionsKt.getOrNull(this.f83312b.f83283a, i8)) == null) {
            return false;
        }
        if (c0555a2.f83290b == c0555a.f83290b) {
            z6 = true;
        }
        return z6;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i7, int i8) {
        t.a.C0555a c0555a;
        t.a.C0555a c0555a2 = (t.a.C0555a) CollectionsKt.getOrNull(this.f83311a, i7);
        if (c0555a2 == null || (c0555a = (t.a.C0555a) CollectionsKt.getOrNull(this.f83312b.f83283a, i8)) == null) {
            return false;
        }
        return Intrinsics.areEqual(c0555a2.f83289a, c0555a.f83289a);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f83313c.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f83311a.size();
    }
}
