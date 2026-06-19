package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bapis.bilibili.app.viewunite.pugvanymodel.NetdiskCourseware;
import com.bapis.bilibili.app.viewunite.pugvanymodel.NetdiskCoursewareInfo;
import com.bapis.bilibili.app.viewunite.pugvanymodel.ViewPugvAny;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import eu0.C6999r;
import eu0.C7000s;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/P.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class P implements Factory<C7000s> {
    public static C7000s a(@Nullable ViewPugvAny viewPugvAny) {
        C7000s c7000s;
        NetdiskCoursewareInfo netdiskCoursewareInfo;
        if (viewPugvAny == null || (netdiskCoursewareInfo = viewPugvAny.getNetdiskCoursewareInfo()) == null) {
            c7000s = new C7000s(CollectionsKt.emptyList());
        } else {
            List<NetdiskCourseware> coursewaresList = netdiskCoursewareInfo.getCoursewaresList();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(coursewaresList, 10));
            for (NetdiskCourseware netdiskCourseware : coursewaresList) {
                arrayList.add(new C6999r(netdiskCourseware.getCoursewareId(), netdiskCourseware.getName(), netdiskCourseware.getRemark(), netdiskCourseware.getDesc(), netdiskCourseware.getUrl(), netdiskCourseware.getIcon()));
            }
            c7000s = new C7000s(arrayList);
        }
        return (C7000s) Preconditions.checkNotNullFromProvides(c7000s);
    }
}
