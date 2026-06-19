package com.bilibili.player.tangram.playercore;

import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.media.resource.PlayIndex;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/y.class */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final tb0.h f79468a = tb0.j.c();

    @Nullable
    public static final com.bilibili.player.tangram.basic.a a(@NotNull MediaResource mediaResource, int i7, int i8) {
        ArrayList arrayList;
        ArrayList arrayList2 = mediaResource.mVodIndex.mVodList;
        if (arrayList2 != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                com.bilibili.player.tangram.basic.a aVarA = C5774b.a((PlayIndex) it.next());
                if (aVarA != null) {
                    arrayList3.add(aVarA);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (true) {
                arrayList = arrayList4;
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (b(((com.bilibili.player.tangram.basic.a) next).f79320a, mediaResource)) {
                    arrayList4.add(next);
                }
            }
        } else {
            arrayList = null;
        }
        Object objEmptyList = arrayList;
        if (arrayList == null) {
            objEmptyList = CollectionsKt.emptyList();
        }
        Iterable iterable = (Iterable) objEmptyList;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj : iterable) {
            if (Intrinsics.compare(((com.bilibili.player.tangram.basic.a) obj).f79320a, ((com.bilibili.player.tangram.basic.a) ComparisonsKt.minOf(new com.bilibili.player.tangram.basic.a(i7), new com.bilibili.player.tangram.basic.a(i8))).f79320a) <= 0) {
                arrayList5.add(obj);
            }
        }
        com.bilibili.player.tangram.basic.a aVar = (com.bilibili.player.tangram.basic.a) CollectionsKt.maxOrNull(arrayList5);
        return aVar != null ? aVar : (com.bilibili.player.tangram.basic.a) CollectionsKt.minOrNull(iterable);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[LOOP:1: B:32:0x00b9->B:60:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean b(int r3, @org.jetbrains.annotations.NotNull com.bilibili.lib.media.resource.MediaResource r4) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.y.b(int, com.bilibili.lib.media.resource.MediaResource):boolean");
    }

    public static final void c(int i7, @NotNull MediaResource mediaResource) {
        if (!b(i7, mediaResource)) {
            com.bilibili.bangumi.logic.page.detail.service.f.a("[tangram-player-core-PCSPlayableImplKt-updatePlayIndex-odkAKWg] ", "Quality " + String.valueOf(i7) + " is not playable from " + mediaResource + "!", "PCSPlayableImplKt-updatePlayIndex-odkAKWg", (Throwable) null);
            return;
        }
        ArrayList arrayList = mediaResource.mVodIndex.mVodList;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        int i8 = 0;
        while (true) {
            if (!it.hasNext()) {
                i8 = -1;
                break;
            }
            com.bilibili.player.tangram.basic.a aVarA = C5774b.a((PlayIndex) it.next());
            if (aVarA == null ? false : com.bilibili.player.tangram.basic.a.b(aVarA.f79320a, i7)) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 >= 0) {
            mediaResource.setResolvedIndex(i8);
        }
    }
}
