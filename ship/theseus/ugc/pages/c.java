package com.bilibili.ship.theseus.ugc.pages;

import Av0.b;
import com.bapis.bilibili.app.viewunite.v1.ViewReply;
import com.bilibili.ship.theseus.united.page.unitedepisode.PageCategory;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/c.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class c implements Factory<PageCategory> {
    public static PageCategory a(ViewReply viewReply) {
        int i7 = b.a.f601a[viewReply.getViewBase().getPageType().ordinal()];
        return (PageCategory) Preconditions.checkNotNullFromProvides(i7 != 1 ? i7 != 2 ? PageCategory.UNKNOWN : PageCategory.COMMON_PAGE : PageCategory.ACTIVITY_PAGE);
    }
}
