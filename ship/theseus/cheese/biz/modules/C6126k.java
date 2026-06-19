package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bapis.bilibili.app.viewunite.common.PugvFaq;
import com.bapis.bilibili.app.viewunite.common.PugvFaqContent;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.ship.theseus.cheese.biz.intro.faq.b;
import eu0.C6984c;
import eu0.C7004w;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.modules.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/k.class */
public final /* synthetic */ class C6126k implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.ship.theseus.cheese.biz.intro.faq.f f90406a;

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        PugvFaq pugvFaq = mVar.f124400a.getPugvFaq();
        C7004w c7004wA = C6984c.a(pugvFaq.getNav());
        List<PugvFaqContent> contentsList = pugvFaq.getContentsList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contentsList, 10));
        for (PugvFaqContent pugvFaqContent : contentsList) {
            arrayList.add(new com.bilibili.ship.theseus.cheese.biz.intro.faq.d(pugvFaqContent.getQuestion(), pugvFaqContent.getAnswer(), pugvFaqContent.getLink()));
        }
        com.bilibili.ship.theseus.cheese.biz.intro.faq.a aVar = new com.bilibili.ship.theseus.cheese.biz.intro.faq.a(c7004wA, arrayList);
        com.bilibili.ship.theseus.cheese.biz.intro.faq.f fVar = this.f90406a;
        fVar.getClass();
        mVar.a(new RunningUIComponent(new com.bilibili.ship.theseus.cheese.biz.intro.faq.b(new b.c(StateFlowKt.MutableStateFlow(new com.bilibili.ship.theseus.cheese.biz.intro.faq.h(aVar, new com.bilibili.ship.theseus.cheese.biz.intro.faq.e(fVar, aVar))), fVar.f89436b.f100021b)), 0, (Function1) null, 6));
    }
}
