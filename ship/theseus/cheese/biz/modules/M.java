package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bapis.bilibili.app.viewunite.pugvanymodel.CredentialInfo;
import com.bapis.bilibili.app.viewunite.pugvanymodel.ViewPugvAny;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import eu0.C6993l;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/M.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class M implements Factory<C6993l> {
    public static C6993l a(@Nullable ViewPugvAny viewPugvAny) {
        C6993l c6993l;
        CredentialInfo credentialInfo;
        if (viewPugvAny == null || (credentialInfo = viewPugvAny.getCredentialInfo()) == null) {
            c6993l = new C6993l(0);
        } else {
            c6993l = new C6993l(credentialInfo.getRequireEp(), credentialInfo.getTabUrl(), credentialInfo.getCredentialUrl(), credentialInfo.getTabShow(), credentialInfo.getTabBadgeShow());
        }
        return (C6993l) Preconditions.checkNotNullFromProvides(c6993l);
    }
}
