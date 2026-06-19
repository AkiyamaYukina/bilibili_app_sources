package com.bilibili.topix.center;

import androidx.lifecycle.ViewModelKt;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/j.class */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopixCenterFragment f112424a;

    public final Object invoke(Object obj) {
        List list;
        int iIntValue = ((Integer) obj).intValue();
        E eMf = this.f112424a.mf();
        Ih.d<List<n>> value = eMf.f112364d.getValue();
        n nVar = (value == null || (list = (List) value.a) == null) ? null : (n) CollectionsKt.getOrNull(list, iIntValue);
        IpTopicItem ipTopicItem = nVar instanceof IpTopicItem ? (IpTopicItem) nVar : null;
        boolean zIsFav = ipTopicItem != null ? ipTopicItem.isFav() : false;
        if (ipTopicItem != null) {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(eMf), (CoroutineContext) null, (CoroutineStart) null, new TopixCenterViewModel$onTopicFavClick$1(eMf, !zIsFav, ipTopicItem.getId(), iIntValue, ipTopicItem, null), 3, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
