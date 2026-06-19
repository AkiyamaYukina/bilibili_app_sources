package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bapis.bilibili.app.viewunite.common.Module;
import com.bapis.bilibili.app.viewunite.common.PugvSeasonPrimaryInfo;
import com.bapis.bilibili.app.viewunite.v1.IntroductionTab;
import com.bapis.bilibili.app.viewunite.v1.TabModule;
import com.bapis.bilibili.app.viewunite.v1.ViewReply;
import com.bilibili.ship.theseus.cheese.biz.intro.primary.C6094o;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/U.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class U implements Factory<com.bilibili.ship.theseus.cheese.biz.intro.primary.V> {
    public static com.bilibili.ship.theseus.cheese.biz.intro.primary.V a(ViewReply viewReply) {
        Object next;
        com.bilibili.ship.theseus.cheese.biz.intro.primary.V vA;
        IntroductionTab introduction;
        List<Module> modulesList;
        Iterator it = viewReply.getTab().getTabModuleList().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((TabModule) next).hasIntroduction()) {
                break;
            }
        }
        TabModule tabModule = (TabModule) next;
        if (tabModule == null || (introduction = tabModule.getIntroduction()) == null || (modulesList = introduction.getModulesList()) == null) {
            vA = C6094o.a();
        } else {
            for (Module module : modulesList) {
                if (module.hasPugvSeasonPrimaryInfo()) {
                    PugvSeasonPrimaryInfo pugvSeasonPrimaryInfo = module.getPugvSeasonPrimaryInfo();
                    vA = pugvSeasonPrimaryInfo != null ? C6094o.b(pugvSeasonPrimaryInfo) : C6094o.a();
                }
            }
            vA = C6094o.a();
        }
        return (com.bilibili.ship.theseus.cheese.biz.intro.primary.V) Preconditions.checkNotNullFromProvides(vA);
    }
}
