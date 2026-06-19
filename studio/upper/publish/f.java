package com.bilibili.studio.upper.publish;

import android.text.TextUtils;
import androidx.compose.ui.graphics.O;
import com.bilibili.studio.upper.publish.model.ArchiveCheckStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/upper/publish/f.class */
public final class f<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f108679a;

    public f(g gVar) {
        this.f108679a = gVar;
    }

    public final Object emit(Object obj, Continuation continuation) {
        Unit unit;
        IA0.a aVarA;
        com.bilibili.studio.upper.broadcast.a aVar = (com.bilibili.studio.upper.broadcast.a) obj;
        String str = aVar.f108666b;
        int i7 = aVar.f108665a;
        g gVar = this.f108679a;
        if (i7 == 1) {
            Object obj2 = aVar.f108667c;
            if (obj2 instanceof Long) {
                long jLongValue = ((Long) obj2).longValue();
                if (jLongValue > 0) {
                    IA0.a aVarA2 = gVar.f108680a.a(str);
                    if (aVarA2 != null) {
                        aVarA2.f10085b = jLongValue;
                    }
                } else {
                    gVar.f108680a.e(str, ArchiveCheckStatus.publishError);
                }
                BLog.d("PublishDynamicObserverCallback", androidx.core.content.c.b(jLongValue, "PUBLISH_DEBUG, onAidResult, taskId: ", str, ", aid: "));
                unit = Unit.INSTANCE;
            } else {
                unit = Unit.INSTANCE;
            }
        } else if (i7 == 2) {
            Object obj3 = aVar.f108667c;
            if (obj3 instanceof String) {
                String str2 = (String) obj3;
                if (!TextUtils.isEmpty(str2) && (aVarA = gVar.f108680a.a(str)) != null) {
                    aVarA.f10089f = str2;
                }
                O.a("PUBLISH_DEBUG, onCoverResult, taskId: ", str, ", coverUrl: ", str2, "PublishDynamicObserverCallback");
                unit = Unit.INSTANCE;
            } else {
                unit = Unit.INSTANCE;
            }
        } else if (i7 != 3) {
            unit = Unit.INSTANCE;
        } else {
            Object obj4 = aVar.f108667c;
            if (obj4 instanceof Long) {
                long jLongValue2 = ((Long) obj4).longValue();
                IA0.a aVarB = gVar.f108680a.b(jLongValue2);
                if (aVarB != null) {
                    String str3 = aVarB.f10084a;
                    IA0.b bVar = gVar.f108680a;
                    bVar.f10090a.remove(IA0.b.c(str3));
                    bVar.d();
                }
                com.bilibili.ad.comm.applist.b.b(jLongValue2, "PUBLISH_DEBUG, onArchiveDeleted, aid: ", "PublishDynamicObserverCallback");
                unit = Unit.INSTANCE;
            } else {
                unit = Unit.INSTANCE;
            }
        }
        return unit;
    }
}
