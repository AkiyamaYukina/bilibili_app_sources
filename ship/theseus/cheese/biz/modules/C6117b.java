package com.bilibili.ship.theseus.cheese.biz.modules;

import au0.C4911a;
import com.bilibili.lib.projection.internal.projectionitem.ProjectionItemData;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonDetailRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import eu0.C6985d;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import mv0.C8043a;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.modules.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/b.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata({"com.bilibili.ship.theseus.united.page.castscreen.CastScreenItems", "com.bilibili.ship.theseus.united.di.DetailBizCoroutineScope"})
public final class C6117b implements Factory<List<ProjectionItemData>> {
    public static List<ProjectionItemData> a(List<C6985d> list, C4911a c4911a, C8043a c8043a, UnitedSeasonDetailRepository unitedSeasonDetailRepository, CoroutineScope coroutineScope) {
        ArrayList arrayList = new ArrayList();
        if (unitedSeasonDetailRepository.d()) {
            arrayList.addAll(C6116a.b(unitedSeasonDetailRepository.b(), c8043a));
        } else {
            arrayList.addAll(C6116a.a(list, c4911a));
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CheeseCastScreenItemsProvider$provideCastScreenItems$1(unitedSeasonDetailRepository, arrayList, c8043a, list, c4911a, null), 3, (Object) null);
        return (List) Preconditions.checkNotNullFromProvides(arrayList);
    }
}
