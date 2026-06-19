package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bapis.bilibili.app.viewunite.pugvanymodel.OperationArea;
import com.bapis.bilibili.app.viewunite.pugvanymodel.OperationAreaButton;
import com.bapis.bilibili.app.viewunite.pugvanymodel.ViewPugvAny;
import com.bapis.bilibili.app.viewunite.v1.ReqUser;
import com.bapis.bilibili.app.viewunite.v1.ViewReply;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import eu0.C6989h;
import eu0.C7001t;
import eu0.C7002u;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/H.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class H implements Factory<C7001t> {
    public static C7001t a(@Nullable ViewPugvAny viewPugvAny, ViewReply viewReply) {
        C7001t c7001t;
        OperationArea operationArea;
        if (viewPugvAny == null || (operationArea = viewPugvAny.getOperationArea()) == null) {
            c7001t = new C7001t(CollectionsKt.listOf(new C7002u[]{new C7002u(1, "收藏", false, "", null, 48), new C7002u(4, "购买", false, "", null, 48)}));
        } else {
            List<OperationAreaButton> buttonsList = operationArea.getButtonsList();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(buttonsList, 10));
            for (OperationAreaButton operationAreaButton : buttonsList) {
                arrayList.add(new C7002u(operationAreaButton.getTypeValue(), operationAreaButton.getText(), operationAreaButton.getDisabled(), operationAreaButton.getLink(), operationAreaButton.hasConsultBubble() ? new C6989h(operationAreaButton.getConsultBubble().getHomeToast(), operationAreaButton.getConsultBubble().getSlideToast(), operationAreaButton.getConsultBubble().getWxIcon()) : null, 16));
            }
            C7001t c7001t2 = new C7001t(arrayList);
            C7002u c7002u = c7001t2.f117577b;
            c7001t = c7001t2;
            if (c7002u != null) {
                ReqUser reqUser = viewReply.getReqUser();
                boolean z6 = false;
                if (reqUser != null) {
                    z6 = false;
                    if (reqUser.getFavorite() == 1) {
                        z6 = true;
                    }
                }
                c7002u.f117585e = z6;
                c7001t = c7001t2;
            }
        }
        return (C7001t) Preconditions.checkNotNullFromProvides(c7001t);
    }
}
