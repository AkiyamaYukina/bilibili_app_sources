package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bapis.bilibili.app.viewunite.pugvanymodel.Courseware;
import com.bapis.bilibili.app.viewunite.pugvanymodel.CoursewareInfo;
import com.bapis.bilibili.app.viewunite.pugvanymodel.ViewPugvAny;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import eu0.C6988g;
import eu0.C6992k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/L.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class L implements Factory<C6992k> {
    public static C6992k a(@Nullable ViewPugvAny viewPugvAny) {
        C6992k c6992k;
        CoursewareInfo coursewareInfo;
        if (viewPugvAny == null || (coursewareInfo = viewPugvAny.getCoursewareInfo()) == null) {
            c6992k = new C6992k(CollectionsKt.emptyList());
        } else {
            List coursewaresList = coursewareInfo.getCoursewaresList();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(coursewaresList, 10));
            Iterator it = coursewaresList.iterator();
            while (it.hasNext()) {
                arrayList.add(C6988g.b((Courseware) it.next()));
            }
            c6992k = new C6992k(arrayList);
        }
        return (C6992k) Preconditions.checkNotNullFromProvides(c6992k);
    }
}
