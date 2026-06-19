package com.bilibili.ship.theseus.playlist.selector;

import androidx.recyclerview.widget.DiffUtil;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.playlist.selector.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/a.class */
public final class a extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f95852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<k.d.b> f95853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<k.d.b> f95854d;

    public a(int i7, int i8, ArrayList<k.d.b> arrayList, List<k.d.b> list) {
        this.f95851a = i7;
        this.f95852b = i8;
        this.f95853c = arrayList;
        this.f95854d = list;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i7, int i8) {
        k.d.b bVar;
        k.d.b bVar2 = (k.d.b) CollectionsKt.getOrNull(this.f95853c, i7);
        boolean zV = false;
        if (bVar2 == null || (bVar = (k.d.b) CollectionsKt.getOrNull(this.f95854d, i8)) == null) {
            return false;
        }
        MultiTypeMedia multiTypeMedia = null;
        Object obj = bVar2.f95897a;
        Object obj2 = bVar.f95897a;
        int i9 = bVar2.f95898b;
        if (i9 == 1) {
            MultiTypeMedia multiTypeMedia2 = obj instanceof MultiTypeMedia ? (MultiTypeMedia) obj : null;
            if (multiTypeMedia2 == null) {
                return false;
            }
            if (obj2 instanceof MultiTypeMedia) {
                multiTypeMedia = (MultiTypeMedia) obj2;
            }
            if (multiTypeMedia == null) {
                return false;
            }
            k.d.b bVar3 = (k.d.b) CollectionsKt.getOrNull(this.f95853c, i7 - 1);
            if (bVar3 != null && bVar3.f95898b == 2) {
                return false;
            }
            k.d.b bVar4 = (k.d.b) CollectionsKt.getOrNull(this.f95854d, i8 - 1);
            if (bVar4 != null && bVar4.f95898b == 2) {
                return false;
            }
            zV = multiTypeMedia2.v(multiTypeMedia);
        } else if (i9 == 2) {
            Ou0.c cVar = obj instanceof Ou0.c ? (Ou0.c) obj : null;
            if (cVar == null) {
                return false;
            }
            Ou0.c cVar2 = obj2 instanceof Ou0.c ? (Ou0.c) obj2 : null;
            if (cVar2 == null) {
                return false;
            }
            k.d.b bVar5 = (k.d.b) CollectionsKt.getOrNull(this.f95853c, i7 - cVar.f18102p);
            Object obj3 = bVar5 != null ? bVar5.f95897a : null;
            MultiTypeMedia multiTypeMedia3 = obj3 instanceof MultiTypeMedia ? (MultiTypeMedia) obj3 : null;
            if (multiTypeMedia3 == null) {
                return false;
            }
            Ou0.c cVar3 = (Ou0.c) CollectionsKt.getOrNull(multiTypeMedia3.f95225M, multiTypeMedia3.f95252z);
            long j7 = cVar.f18089b;
            if (cVar3 != null && j7 == cVar3.f18089b) {
                return false;
            }
            k.d.b bVar6 = (k.d.b) CollectionsKt.getOrNull(this.f95854d, i8 - cVar2.f18102p);
            Object obj4 = bVar6 != null ? bVar6.f95897a : null;
            MultiTypeMedia multiTypeMedia4 = null;
            if (obj4 instanceof MultiTypeMedia) {
                multiTypeMedia4 = (MultiTypeMedia) obj4;
            }
            if (multiTypeMedia4 == null) {
                return false;
            }
            Ou0.c cVar4 = (Ou0.c) CollectionsKt.getOrNull(multiTypeMedia4.f95225M, multiTypeMedia4.f95252z);
            long j8 = cVar2.f18089b;
            if (cVar4 != null && j8 == cVar4.f18089b) {
                return false;
            }
            if (j7 == j8) {
                zV = true;
            }
        }
        return zV;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i7, int i8) {
        k.d.b bVar;
        k.d.b bVar2 = (k.d.b) CollectionsKt.getOrNull(this.f95853c, i7);
        boolean z6 = false;
        if (bVar2 == null || (bVar = (k.d.b) CollectionsKt.getOrNull(this.f95854d, i8)) == null) {
            return false;
        }
        if (bVar2.f95899c == bVar.f95899c) {
            z6 = true;
        }
        return z6;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f95852b;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f95851a;
    }
}
