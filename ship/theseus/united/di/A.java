package com.bilibili.ship.theseus.united.di;

import com.bapis.bilibili.app.viewunite.v1.IntroductionTab;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/A.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata({"com.bilibili.ship.theseus.united.page.intro.IntroModules"})
public final class A implements Factory<List<RunningUIComponent>> {
    public static List<RunningUIComponent> a(@Nullable IntroductionTab introductionTab, nv0.g gVar) {
        List<RunningUIComponent> listA;
        if (introductionTab == null) {
            listA = CollectionsKt.emptyList();
        } else {
            System.currentTimeMillis();
            try {
                listA = gVar.a(introductionTab);
                System.currentTimeMillis();
            } catch (Throwable th) {
                System.currentTimeMillis();
                throw th;
            }
        }
        return (List) Preconditions.checkNotNullFromProvides(listA);
    }
}
