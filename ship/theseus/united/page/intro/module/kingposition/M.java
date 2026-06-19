package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/M.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class M implements Factory<KingPositionService.b> {
    public static KingPositionService.b a(@Nullable p pVar) {
        C6289c c6289c;
        if (pVar != null) {
            c6289c = (C6289c) ((LinkedHashMap) pVar.f100470a).get(KingPositionType.LIKE);
        } else {
            c6289c = null;
        }
        return (KingPositionService.b) Preconditions.checkNotNullFromProvides(new L(c6289c));
    }
}
