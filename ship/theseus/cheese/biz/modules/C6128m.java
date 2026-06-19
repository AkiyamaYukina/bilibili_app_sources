package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bapis.bilibili.app.viewunite.common.Module;
import com.bapis.bilibili.app.viewunite.common.PugvZoneItem;
import com.bilibili.ship.theseus.cheese.biz.intro.zone.CheeseZoneService;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.modules.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/m.class */
public final /* synthetic */ class C6128m implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheeseZoneService f90408a;

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        Module module = mVar.f124400a;
        List<PugvZoneItem> contentsList = module.getPugvZone().getContentsList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contentsList, 10));
        for (PugvZoneItem pugvZoneItem : contentsList) {
            arrayList.add(new com.bilibili.ship.theseus.cheese.biz.intro.zone.d(pugvZoneItem.getIcon(), pugvZoneItem.getLink(), pugvZoneItem.getTitle(), pugvZoneItem.getSubtitle(), pugvZoneItem.getTypeValue()));
        }
        com.bilibili.ship.theseus.cheese.biz.intro.zone.c cVar = new com.bilibili.ship.theseus.cheese.biz.intro.zone.c(arrayList);
        int size = module.getPugvZone().getContentsList().size();
        CheeseZoneService cheeseZoneService = this.f90408a;
        if (size == 1) {
            mVar.a(cheeseZoneService.b(cVar));
        } else if (module.getPugvZone().getContentsList().size() >= 2) {
            mVar.a(cheeseZoneService.a(cVar));
        }
    }
}
