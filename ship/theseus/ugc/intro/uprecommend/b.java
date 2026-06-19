package com.bilibili.ship.theseus.ugc.intro.uprecommend;

import androidx.recyclerview.widget.DiffUtil;
import com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/b.class */
public final class b extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<RecommendUpComponent.e> f97814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<RecommendUpComponent.e> f97815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f97816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f97817d;

    public b(int i7, int i8, ArrayList arrayList, List list) {
        this.f97814a = arrayList;
        this.f97815b = list;
        this.f97816c = i7;
        this.f97817d = i8;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i7, int i8) {
        RecommendUpComponent.e eVar;
        RecommendUpDescRelation recommendUpDescRelationB;
        RecommendUpComponent.e eVar2 = (RecommendUpComponent.e) CollectionsKt.getOrNull(this.f97814a, i7);
        if (eVar2 == null || (eVar = (RecommendUpComponent.e) CollectionsKt.getOrNull(this.f97815b, i8)) == null) {
            return false;
        }
        RecommendUp recommendUp = eVar2.f97780a;
        RecommendUpDescButton recommendUpDescButtonD = recommendUp.d();
        Boolean boolValueOf = (recommendUpDescButtonD == null || (recommendUpDescRelationB = recommendUpDescButtonD.b()) == null) ? null : Boolean.valueOf(recommendUpDescRelationB.e());
        RecommendUp recommendUp2 = eVar.f97780a;
        RecommendUpDescButton recommendUpDescButtonD2 = recommendUp2.d();
        Boolean boolValueOf2 = null;
        if (recommendUpDescButtonD2 != null) {
            RecommendUpDescRelation recommendUpDescRelationB2 = recommendUpDescButtonD2.b();
            boolValueOf2 = null;
            if (recommendUpDescRelationB2 != null) {
                boolValueOf2 = Boolean.valueOf(recommendUpDescRelationB2.e());
            }
        }
        boolean z6 = false;
        if (Intrinsics.areEqual(boolValueOf, boolValueOf2)) {
            z6 = false;
            if (Intrinsics.areEqual(recommendUp.e(), recommendUp2.e())) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i7, int i8) {
        RecommendUpComponent.e eVar;
        RecommendUpComponent.e eVar2 = (RecommendUpComponent.e) CollectionsKt.getOrNull(this.f97814a, i7);
        if (eVar2 == null || (eVar = (RecommendUpComponent.e) CollectionsKt.getOrNull(this.f97815b, i8)) == null) {
            return false;
        }
        return Intrinsics.areEqual(eVar2.f97780a.g(), eVar.f97780a.g());
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f97816c;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f97817d;
    }
}
