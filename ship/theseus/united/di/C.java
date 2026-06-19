package com.bilibili.ship.theseus.united.di;

import com.bapis.bilibili.app.viewunite.common.Module;
import com.bapis.bilibili.app.viewunite.common.ModuleType;
import com.bapis.bilibili.app.viewunite.v1.IntroductionTab;
import com.bilibili.ship.theseus.united.di.w;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6354p;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/C.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class C implements Factory<w.a> {
    public static w.a a(@Nullable IntroductionTab introductionTab) {
        List modulesList;
        Sequence<Module> sequenceAsSequence;
        ArrayList arrayList = new ArrayList();
        if (introductionTab != null && (modulesList = introductionTab.getModulesList()) != null && (sequenceAsSequence = CollectionsKt.asSequence(modulesList)) != null) {
            for (Module module : sequenceAsSequence) {
                ModuleType type = module.getType();
                if ((type == null ? -1 : w.b.f98784a[type.ordinal()]) == 1) {
                    arrayList.add(C6354p.e(module.getUgcSeason()));
                }
            }
        }
        return (w.a) Preconditions.checkNotNullFromProvides(new w.a(arrayList));
    }
}
