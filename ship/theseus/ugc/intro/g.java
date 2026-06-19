package com.bilibili.ship.theseus.ugc.intro;

import com.bapis.bilibili.app.viewunite.common.Questionaire;
import com.bilibili.ship.theseus.ugc.intro.questionaire.QuestionnaireService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/g.class */
public final /* synthetic */ class g implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QuestionnaireService f97011a;

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        Questionaire questionaire = mVar.f124400a.getQuestionaire();
        long qid = questionaire.getQid();
        long qshowtype = questionaire.getQshowtype();
        long qshowtime = questionaire.getQshowtime();
        String qtype = questionaire.getQtype();
        String title = questionaire.getTitle();
        List qoptionsList = questionaire.getQoptionsList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(qoptionsList, 10));
        Iterator it = qoptionsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        mVar.a(this.f97011a.a(new com.bilibili.ship.theseus.ugc.intro.questionaire.d(qid, qshowtype, qshowtime, qtype, title, arrayList)));
    }
}
