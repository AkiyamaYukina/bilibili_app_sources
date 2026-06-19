package com.bilibili.tgwt.search;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.tgwt.filmselection.MovieCardListFragment;
import com.bilibili.tgwt.filmselection.l;
import com.bilibili.tgwt.filmselection.m;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/search/TogetherWatchSearchResultFragment.class */
@StabilityInferred(parameters = 0)
public final class TogetherWatchSearchResultFragment extends MovieCardListFragment {

    @NotNull
    public String h = "";

    @Override // com.bilibili.tgwt.filmselection.MovieCardListFragment
    public final void kf(int i7, @NotNull l lVar, @NotNull m mVar) {
        if (StringsKt.trim(this.h).toString().length() == 0) {
            return;
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchSearchResultFragment$loadDataImpl$1(this, i7, lVar, mVar, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    @Override // com.bilibili.tgwt.filmselection.MovieCardListFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void lf(@org.jetbrains.annotations.NotNull com.bilibili.tgwt.api.MovieCardListVo.Item r8) {
        /*
            r7 = this;
            r0 = r7
            boolean r0 = r0.isAdded()
            if (r0 != 0) goto L8
            return
        L8:
            r0 = r7
            android.os.Bundle r0 = r0.getArguments()
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L1f
            r0 = r9
            java.lang.String r1 = "type"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9 = r0
            goto L21
        L1f:
            r0 = 0
            r9 = r0
        L21:
            r0 = r9
            if (r0 != 0) goto L28
            goto L94
        L28:
            r0 = r9
            int r0 = r0.intValue()
            r1 = 2
            if (r0 != r1) goto L94
            android.content.Intent r0 = new android.content.Intent
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r10
            java.lang.String r1 = "season_id"
            r2 = r8
            int r2 = r2.c()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            android.content.Intent r0 = r0.putExtra(r1, r2)
            r0 = r8
            java.util.List<com.bilibili.tgwt.api.MovieCardListVo$Item$EP> r0 = r0.h
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L69
            r0 = r8
            java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r0)
            com.bilibili.tgwt.api.MovieCardListVo$Item$EP r0 = (com.bilibili.tgwt.api.MovieCardListVo.Item.EP) r0
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L69
            r0 = r8
            int r0 = r0.a()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9 = r0
            r0 = r9
            r8 = r0
            r0 = r9
            if (r0 != 0) goto L6c
        L69:
            java.lang.String r0 = "0"
            r8 = r0
        L6c:
            r0 = r10
            java.lang.String r1 = "epid"
            r2 = r8
            android.content.Intent r0 = r0.putExtra(r1, r2)
            r0 = r7
            androidx.fragment.app.FragmentActivity r0 = r0.p3()
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L84
            r0 = r8
            r1 = 18
            r2 = r10
            r0.setResult(r1, r2)
        L84:
            r0 = r7
            androidx.fragment.app.FragmentActivity r0 = r0.p3()
            r8 = r0
            r0 = r8
            if (r0 == 0) goto Lb4
            r0 = r8
            r0.finish()
            goto Lb4
        L94:
            com.bilibili.lib.blrouter.RouteRequest$Builder r0 = new com.bilibili.lib.blrouter.RouteRequest$Builder
            r1 = r0
            java.lang.String r2 = "bilibili://pgc/theater/match"
            r1.<init>(r2)
            com.bilibili.tgwt.search.b r1 = new com.bilibili.tgwt.search.b
            r2 = r1
            r3 = 0
            r4 = r8
            r5 = r9
            r2.<init>(r3, r4, r5)
            com.bilibili.lib.blrouter.RouteRequest$Builder r0 = r0.extras(r1)
            com.bilibili.lib.blrouter.RouteRequest r0 = r0.build()
            r1 = 0
            r2 = 2
            r3 = 0
            com.bilibili.lib.blrouter.RouteResponse r0 = com.bilibili.lib.blrouter.BLRouter.routeTo$default(r0, r1, r2, r3)
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.search.TogetherWatchSearchResultFragment.lf(com.bilibili.tgwt.api.MovieCardListVo$Item):void");
    }
}
