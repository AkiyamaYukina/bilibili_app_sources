package com.bilibili.ogv.kmm.operation.schedule;

import androidx.compose.foundation.lazy.LazyListState;
import com.bilibili.ogv.kmm.operation.schedule.UpcomingScheduleCard;
import com.bilibili.ogv.operation3.module.followable.CreateFollowableSeasonModel$invoke$1;
import it0.C7615a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kntr.common.komponent.KomponentScope;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/i.class */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpcomingScheduleCard.e f68791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LazyListState f68792b = new LazyListState(0, 0, 3, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<a> f68793c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/i$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UpcomingScheduleCard.f f68794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C7615a f68795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CreateFollowableSeasonModel$invoke$1 f68796c;

        public a(UpcomingScheduleCard.f fVar, l lVar, KomponentScope<Object> komponentScope) {
            this.f68794a = fVar;
            this.f68795b = lVar.f68811a.a(komponentScope, fVar, null);
            this.f68796c = lVar.f68812b.a(komponentScope, fVar);
        }
    }

    public i(UpcomingScheduleCard.e eVar, l lVar, KomponentScope<Object> komponentScope) {
        this.f68791a = eVar;
        List<UpcomingScheduleCard.f> list = eVar.f68761b;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new a((UpcomingScheduleCard.f) it.next(), lVar, komponentScope));
        }
        this.f68793c = arrayList;
    }
}
