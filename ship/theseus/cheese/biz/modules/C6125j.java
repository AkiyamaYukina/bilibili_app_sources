package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bapis.bilibili.app.viewunite.common.PugvStudyRecordDetailModel;
import com.bapis.bilibili.app.viewunite.common.PugvStudyRecordModel;
import com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyRecordService;
import com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.StudyRecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.modules.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/j.class */
public final /* synthetic */ class C6125j implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheeseStudyRecordService f90405a;

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        PugvStudyRecordModel pugvStudyRecordModel = mVar.f124400a.getPugvStudyRecordInfo().getPugvStudyRecordModel();
        String detailUrl = pugvStudyRecordModel.getDetailUrl();
        String dataEffectivenessMessage = pugvStudyRecordModel.getDataEffectivenessMessage();
        String userAvatar = pugvStudyRecordModel.getUserAvatar();
        String todayStudyMessage = pugvStudyRecordModel.getTodayStudyMessage();
        String weekStudyMessage = pugvStudyRecordModel.getWeekStudyMessage();
        List pugvStudyRecordDetailModelList = pugvStudyRecordModel.getPugvStudyRecordDetailModelList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(pugvStudyRecordDetailModelList, 10));
        Iterator it = pugvStudyRecordDetailModelList.iterator();
        while (it.hasNext()) {
            arrayList.add(new StudyRecord.StudyRecordDetail(((PugvStudyRecordDetailModel) it.next()).getRecordSeconds()));
        }
        mVar.a(this.f90405a.a(new StudyRecord(detailUrl, dataEffectivenessMessage, userAvatar, todayStudyMessage, weekStudyMessage, arrayList)));
    }
}
