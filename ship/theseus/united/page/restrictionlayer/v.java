package com.bilibili.ship.theseus.united.page.restrictionlayer;

import com.google.common.collect.ImmutableSet;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/v.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class v implements Factory<InterfaceC6388m> {
    public static InterfaceC6388m a(ImmutableSet immutableSet) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(immutableSet, 10)), 16));
        for (Object obj : immutableSet) {
            linkedHashMap.put(((t) obj).b(), obj);
        }
        return (InterfaceC6388m) Preconditions.checkNotNullFromProvides(new InterfaceC6388m(linkedHashMap) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.u

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Map f102758a;

            {
                this.f102758a = linkedHashMap;
            }

            @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.InterfaceC6388m
            public final void a(s sVar) {
                t tVar = (t) ((LinkedHashMap) this.f102758a).get(sVar.getClass());
                t tVar2 = tVar;
                if (tVar == null) {
                    tVar2 = null;
                }
                if (tVar2 != null) {
                    tVar2.a(sVar);
                }
            }
        });
    }
}
