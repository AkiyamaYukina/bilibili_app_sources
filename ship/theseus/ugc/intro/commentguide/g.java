package com.bilibili.ship.theseus.ugc.intro.commentguide;

import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/commentguide/g.class */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f97003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CommentGuideService f97004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ref.BooleanRef f97005c;

    public g(i iVar, CommentGuideService commentGuideService, Ref.BooleanRef booleanRef) {
        this.f97003a = iVar;
        this.f97004b = commentGuideService;
        this.f97005c = booleanRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a() {
        /*
            r3 = this;
            r0 = r3
            com.bilibili.ship.theseus.ugc.intro.commentguide.i r0 = r0.f97003a
            java.lang.String r0 = r0.f97006a
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L15
            r0 = r5
            r4 = r0
            r0 = r5
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L22
        L15:
            r0 = r3
            com.bilibili.ship.theseus.ugc.intro.commentguide.CommentGuideService r0 = r0.f97004b
            android.content.Context r0 = r0.f96981b
            r1 = 2131848985(0x7f116f19, float:1.9331491E38)
            java.lang.String r0 = r0.getString(r1)
            r4 = r0
        L22:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.commentguide.g.a():java.lang.String");
    }

    public final void b(int i7, String str, boolean z6) {
        i iVar = this.f97003a;
        CommentGuideService commentGuideService = this.f97004b;
        if (!z6) {
            PageReportService pageReportService = commentGuideService.f96986g;
            HashMap map = new HashMap();
            map.put("is_empty", iVar.f97007b.length() == 0 ? "1" : "0");
            map.put("text", str);
            map.put("action_type", i7 == 2 ? "comment" : "close");
            Unit unit = Unit.INSTANCE;
            PageReportService.g(pageReportService, "united.player-video-detail.cmt-guide.0.click", map, 4);
            return;
        }
        Ref.BooleanRef booleanRef = this.f97005c;
        if (booleanRef.element) {
            return;
        }
        booleanRef.element = true;
        PageReportService pageReportService2 = commentGuideService.f96986g;
        HashMap map2 = new HashMap();
        map2.put("is_empty", iVar.f97007b.length() == 0 ? "1" : "0");
        map2.put("text", str);
        Unit unit2 = Unit.INSTANCE;
        PageReportService.i(pageReportService2, "united.player-video-detail.cmt-guide.0.show", map2, 4);
    }
}
