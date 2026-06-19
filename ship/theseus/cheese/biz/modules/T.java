package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bapis.bilibili.app.viewunite.pugvanymodel.AbTest;
import com.bapis.bilibili.app.viewunite.pugvanymodel.ViewPugvAny;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import eu0.C6982a;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/T.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class T implements Factory<C6982a> {
    public static C6982a a(@Nullable ViewPugvAny viewPugvAny) {
        AbTest abTest;
        return (C6982a) Preconditions.checkNotNullFromProvides((viewPugvAny == null || (abTest = viewPugvAny.getAbTest()) == null) ? new C6982a(0) : new C6982a((Map<String, Integer>) abTest.getExpMap()));
    }
}
