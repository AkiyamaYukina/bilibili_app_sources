package com.bilibili.ogv.misc.timeline;

import com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimeline;
import com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimelineDay;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/OgvTimelineFragment$pageViewModel$7.class */
public final /* synthetic */ class OgvTimelineFragment$pageViewModel$7 extends FunctionReferenceImpl implements Function2<BangumiTimelineDay, BangumiTimeline, Boolean> {
    public OgvTimelineFragment$pageViewModel$7(Object obj) {
        super(2, obj, OgvTimelineFragment.class, "checkShowTimelineNightTip", "checkShowTimelineNightTip(Lcom/bilibili/ogv/misc/timeline/ui/entity/BangumiTimelineDay;Lcom/bilibili/ogv/misc/timeline/ui/entity/BangumiTimeline;)Z", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean invoke(com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimelineDay r6, com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimeline r7) {
        /*
            r5 = this;
            com.bilibili.base.SharedPreferencesHelper r0 = new com.bilibili.base.SharedPreferencesHelper
            r1 = r0
            r2 = r5
            java.lang.Object r2 = r2.receiver
            com.bilibili.ogv.misc.timeline.OgvTimelineFragment r2 = (com.bilibili.ogv.misc.timeline.OgvTimelineFragment) r2
            android.content.Context r2 = r2.getContext()
            r1.<init>(r2)
            r12 = r0
            r0 = 0
            r9 = r0
            r0 = r12
            java.lang.String r1 = "pref_bangumi_timeline_guide_text_closed"
            r2 = 0
            boolean r0 = r0.optBoolean(r1, r2)
            if (r0 == 0) goto L27
            r0 = r9
            r8 = r0
            goto L8e
        L27:
            r0 = r7
            if (r0 == 0) goto L4d
            r0 = r7
            long r0 = r0.c()
            r1 = r6
            long r1 = r1.h()
            long r0 = r0 - r1
            r10 = r0
            r0 = r10
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L4d
            r0 = r10
            r1 = 108000000(0x66ff300, double:5.33590898E-316)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4d
        L48:
            r0 = 1
            r8 = r0
            goto L8e
        L4d:
            r0 = r6
            java.util.List r0 = r0.m()
            r7 = r0
            r0 = r9
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L8e
            r0 = r7
            java.lang.Object r0 = kotlin.collections.CollectionsKt.lastOrNull(r0)
            com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimeline r0 = (com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimeline) r0
            r7 = r0
            r0 = r9
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L8e
            r0 = r7
            long r0 = r0.c()
            r1 = r6
            long r1 = r1.h()
            long r0 = r0 - r1
            r10 = r0
            r0 = r9
            r8 = r0
            r0 = r10
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L8e
            r0 = r9
            r8 = r0
            r0 = r10
            r1 = 108000000(0x66ff300, double:5.33590898E-316)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L8e
            goto L48
        L8e:
            r0 = r8
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.misc.timeline.OgvTimelineFragment$pageViewModel$7.invoke(com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimelineDay, com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimeline):java.lang.Boolean");
    }
}
