package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bapis.bilibili.app.viewunite.common.PugvPackage;
import com.bapis.bilibili.app.viewunite.common.PugvPackageItem;
import com.bapis.bilibili.app.viewunite.common.PugvPackageSaleInfo;
import com.bilibili.ship.theseus.cheese.biz.intro.pack.CheesePackageService;
import eu0.C6984c;
import eu0.C7004w;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.modules.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/h.class */
public final /* synthetic */ class C6123h implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheesePackageService f90403a;

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        PugvPackage pugvPackage = mVar.f124400a.getPugvPackage();
        C7004w c7004wA = C6984c.a(pugvPackage.getNav());
        List<PugvPackageItem> contentsList = pugvPackage.getContentsList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contentsList, 10));
        for (PugvPackageItem pugvPackageItem : contentsList) {
            long productId = pugvPackageItem.getProductId();
            String cover = pugvPackageItem.getCover();
            String title = pugvPackageItem.getTitle();
            String discountPriceDesc = pugvPackageItem.getDiscountPriceDesc();
            String originalPriceDesc = pugvPackageItem.getOriginalPriceDesc();
            String desc = pugvPackageItem.getDesc();
            String link = pugvPackageItem.getLink();
            PugvPackageSaleInfo saleInfo = pugvPackageItem.getSaleInfo();
            String icon = saleInfo.getIcon();
            String str = icon;
            if (icon == null) {
                str = "";
            }
            String iconDark = saleInfo.getIconDark();
            String str2 = iconDark;
            if (iconDark == null) {
                str2 = "";
            }
            arrayList.add(new com.bilibili.ship.theseus.cheese.biz.intro.pack.t(productId, cover, title, discountPriceDesc, originalPriceDesc, desc, link, new com.bilibili.ship.theseus.cheese.biz.intro.pack.u(str, str2)));
        }
        mVar.a(this.f90403a.a(new com.bilibili.ship.theseus.cheese.biz.intro.pack.s(c7004wA, arrayList)));
    }
}
