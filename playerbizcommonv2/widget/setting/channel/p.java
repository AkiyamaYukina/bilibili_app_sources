package com.bilibili.playerbizcommonv2.widget.setting.channel;

import androidx.recyclerview.widget.DiffUtil;
import com.bilibili.playerbizcommonv2.widget.setting.channel.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/p.class */
public final class p extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<o.a.C0554a> f83274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o.a f83275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<o.a.C0554a> f83276c;

    public p(ArrayList<o.a.C0554a> arrayList, o.a aVar, List<o.a.C0554a> list) {
        this.f83274a = arrayList;
        this.f83275b = aVar;
        this.f83276c = list;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i7, int i8) {
        o.a.C0554a c0554a;
        o.a.C0554a c0554a2 = (o.a.C0554a) CollectionsKt.getOrNull(this.f83274a, i7);
        boolean z6 = false;
        if (c0554a2 == null || (c0554a = (o.a.C0554a) CollectionsKt.getOrNull(this.f83275b.f83262a, i8)) == null) {
            return false;
        }
        if (c0554a2.f83270b == c0554a.f83270b) {
            z6 = true;
        }
        return z6;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i7, int i8) {
        o.a.C0554a c0554a;
        o.a.C0554a c0554a2 = (o.a.C0554a) CollectionsKt.getOrNull(this.f83274a, i7);
        if (c0554a2 == null || (c0554a = (o.a.C0554a) CollectionsKt.getOrNull(this.f83275b.f83262a, i8)) == null) {
            return false;
        }
        return Intrinsics.areEqual(c0554a2.f83269a, c0554a.f83269a);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f83276c.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f83274a.size();
    }
}
