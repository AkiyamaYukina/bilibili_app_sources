package com.bilibili.studio.editor.moudle.musicv3.logic;

import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.bgm.BgmPointEntry;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/logic/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static String f107937a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Map<Long, Long> f107938b = new LinkedHashMap();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(@org.jetbrains.annotations.Nullable com.bilibili.studio.videoeditor.bean.BMusic r8) {
        /*
            java.util.Map<java.lang.Long, java.lang.Long> r0 = com.bilibili.studio.editor.moudle.musicv3.logic.a.f107938b
            r15 = r0
            r0 = r8
            long r0 = r0.bgmSid
            r9 = r0
            r0 = r15
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            r1 = r9
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L29
            r0 = r15
            long r0 = r0.longValue()
            r9 = r0
            goto L85
        L29:
            r0 = r8
            com.bilibili.studio.videoeditor.bgm.Bgm r0 = r0.bgm
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L43
            r0 = r15
            java.util.ArrayList<com.bilibili.studio.videoeditor.bgm.BgmPointEntry> r0 = r0.timeline
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L43
            goto L48
        L43:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r15 = r0
        L48:
            r0 = r15
            java.util.Iterator r0 = r0.iterator()
            r16 = r0
        L51:
            r0 = r16
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L83
            r0 = r16
            java.lang.Object r0 = r0.next()
            com.bilibili.studio.videoeditor.bgm.BgmPointEntry r0 = (com.bilibili.studio.videoeditor.bgm.BgmPointEntry) r0
            r15 = r0
            r0 = r15
            java.lang.String r0 = r0.comment
            java.lang.String r1 = com.bilibili.studio.editor.moudle.musicv3.logic.a.f107937a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L51
            r0 = r15
            long r0 = r0.point
            r1 = 1000(0x3e8, float:1.401E-42)
            long r1 = (long) r1
            long r0 = r0 * r1
            r9 = r0
            goto L85
        L83:
            r0 = 0
            r9 = r0
        L85:
            r0 = r8
            long r0 = r0.trimOut
            r13 = r0
            r0 = r8
            long r0 = r0.trimIn
            r11 = r0
            r0 = r8
            r1 = r9
            r0.trimIn = r1
            r0 = r8
            r1 = r9
            r2 = r13
            r3 = r11
            long r2 = r2 - r3
            long r1 = r1 + r2
            r2 = r8
            long r2 = r2.totalTime
            long r1 = java.lang.Math.min(r1, r2)
            r0.trimOut = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.musicv3.logic.a.a(com.bilibili.studio.videoeditor.bean.BMusic):void");
    }

    public static void b(@Nullable Bgm bgm) {
        if (bgm == null) {
            return;
        }
        long startTime = bgm.getStartTime();
        List<BgmPointEntry> listEmptyList = bgm.timeline;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        String str = "";
        long j7 = startTime;
        for (BgmPointEntry bgmPointEntry : listEmptyList) {
            long j8 = startTime - (bgmPointEntry.point * ((long) 1000));
            if (j8 >= 0 && j8 <= j7) {
                str = bgmPointEntry.comment;
                j7 = j8;
            }
        }
        f107937a = str;
        f107938b.put(Long.valueOf(bgm.sid), Long.valueOf(bgm.getStartTime()));
    }
}
