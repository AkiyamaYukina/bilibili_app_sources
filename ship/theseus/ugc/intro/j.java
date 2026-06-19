package com.bilibili.ship.theseus.ugc.intro;

import com.bapis.bilibili.app.viewunite.common.ExtTab;
import com.bapis.bilibili.app.viewunite.common.UpDataModule;
import com.bilibili.ship.theseus.ugc.intro.upcenter.ExtType;
import com.bilibili.ship.theseus.ugc.intro.upcenter.UgcUpCenterService;
import com.bilibili.ship.theseus.ugc.intro.upcenter.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/j.class */
public final /* synthetic */ class j implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UgcUpCenterService f97040a;

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        UpDataModule upDataModule = mVar.f124400a.getUpDataModule();
        List<ExtTab> extTabsList = upDataModule.getExtTabsList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(extTabsList, 10));
        for (ExtTab extTab : extTabsList) {
            String data = extTab.getData();
            int i7 = b.a.f97550a[extTab.getExtType().ordinal()];
            arrayList.add(new com.bilibili.ship.theseus.ugc.intro.upcenter.e(data, i7 != 1 ? i7 != 2 ? i7 != 3 ? ExtType.UNRECOGNIZED : ExtType.ExtDataEarnings : ExtType.ExtDataCenter : ExtType.ExtNone));
        }
        mVar.a(this.f97040a.a(new com.bilibili.ship.theseus.ugc.intro.upcenter.a(arrayList, upDataModule.getProtocolUrl(), upDataModule.getIdx(), NewPlayerUtilsKt.toPx(upDataModule.getHeight()))));
    }
}
