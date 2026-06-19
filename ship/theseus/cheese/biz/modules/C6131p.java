package com.bilibili.ship.theseus.cheese.biz.modules;

import androidx.compose.foundation.text.input.internal.U0;
import com.bapis.bilibili.app.viewunite.common.PugvShoppingNotice;
import com.bapis.bilibili.app.viewunite.common.PugvShoppingNoticeContent;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.ship.theseus.cheese.biz.intro.shoppingnotice.b;
import eu0.C6984c;
import eu0.C7004w;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.modules.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/p.class */
public final /* synthetic */ class C6131p implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.ship.theseus.cheese.biz.intro.shoppingnotice.f f90411a;

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        PugvShoppingNotice pugvShoppingNotice = mVar.f124400a.getPugvShoppingNotice();
        C7004w c7004wA = C6984c.a(pugvShoppingNotice.getNav());
        List<PugvShoppingNoticeContent> contentsList = pugvShoppingNotice.getContentsList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contentsList, 10));
        for (PugvShoppingNoticeContent pugvShoppingNoticeContent : contentsList) {
            arrayList.add(new com.bilibili.ship.theseus.cheese.biz.intro.shoppingnotice.e(pugvShoppingNoticeContent.getNumber(), pugvShoppingNoticeContent.getContent(), pugvShoppingNoticeContent.getIsBold()));
        }
        com.bilibili.ship.theseus.cheese.biz.intro.shoppingnotice.a aVar = new com.bilibili.ship.theseus.cheese.biz.intro.shoppingnotice.a(c7004wA, arrayList, pugvShoppingNotice.getLink());
        com.bilibili.ship.theseus.cheese.biz.intro.shoppingnotice.f fVar = this.f90411a;
        fVar.getClass();
        mVar.a(new RunningUIComponent(new com.bilibili.ship.theseus.cheese.biz.intro.shoppingnotice.b(new b.c(StateFlowKt.MutableStateFlow(new com.bilibili.ship.theseus.cheese.biz.intro.shoppingnotice.h(aVar, new U0(fVar, 1))), fVar.f90128b.f100021b)), 0, (Function1) null, 6));
    }
}
