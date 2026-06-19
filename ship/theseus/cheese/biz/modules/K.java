package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bapis.bilibili.app.viewunite.pugvanymodel.CourseCoach;
import com.bapis.bilibili.app.viewunite.pugvanymodel.ViewPugvAny;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import eu0.C6990i;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/K.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class K implements Factory<C6990i> {
    public static C6990i a(@Nullable ViewPugvAny viewPugvAny) {
        CourseCoach courseCoach;
        return (C6990i) Preconditions.checkNotNullFromProvides((viewPugvAny == null || (courseCoach = viewPugvAny.getCourseCoach()) == null) ? new C6990i("", "") : new C6990i(courseCoach.getDetailUrl(), courseCoach.getDirectoryUrl()));
    }
}
