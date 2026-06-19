package com.bilibili.ship.theseus.united.di;

import com.bapis.bilibili.app.viewunite.v1.ViewReply;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/B.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata({"com.bilibili.ship.theseus.united.report.ViewReportParams"})
public final class B implements Factory<Map<String, String>> {
    public static Map<String, String> a(ViewReply viewReply) {
        return (Map) Preconditions.checkNotNullFromProvides(viewReply.getReportMap());
    }
}
