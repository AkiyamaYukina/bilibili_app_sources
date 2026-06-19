package com.bilibili.lib.projection.internal.search.searchv2;

import De0.C1572e;
import De0.F;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.projection.internal.api.model.ListUiBean;
import com.bilibili.lib.projection.internal.api.model.LiveInfoBean;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.search.q;
import he0.e;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.collection.Collections;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/searchv2/SearchPanelContainer.class */
public final class SearchPanelContainer extends FrameLayout {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f63755z = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f63756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f63757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public a f63758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile long f63759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public RecyclerView f63760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final SearchTitleBar f63761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public F f63762g;

    @Nullable
    public SearchBottomArea h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Job f63763i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Job f63764j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public ListUiBean f63765k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public q f63766l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public LiveInfoBean f63767m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f63768n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile int f63769o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f63770p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile boolean f63771q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public Function0<Unit> f63772r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile boolean f63773s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public e.a f63774t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public volatile List<? extends ProjectionDeviceInternal> f63775u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public volatile List<? extends ProjectionDeviceInternal> f63776v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public volatile List<? extends ProjectionDeviceInternal> f63777w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public volatile List<? extends ProjectionDeviceInternal> f63778x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public Function0<Unit> f63779y;

    @JvmOverloads
    public SearchPanelContainer(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public SearchPanelContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0297  */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.bilibili.lib.projection.internal.search.searchv2.a, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SearchPanelContainer(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            Method dump skipped, instruction units count: 822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.search.searchv2.SearchPanelContainer.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getSearchDuration() {
        return ((Number) this.f63756a.getValue()).longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(boolean r11) {
        /*
            r10 = this;
            r0 = r10
            boolean r0 = r0.f63771q
            if (r0 == 0) goto L8
            return
        L8:
            r0 = r10
            r1 = r10
            int r1 = r1.f63769o
            r2 = 1
            int r1 = r1 + r2
            r0.f63769o = r1
            r0 = r10
            androidx.lifecycle.LifecycleOwner r0 = androidx.lifecycle.ViewTreeLifecycleOwner.get(r0)
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L32
            r0 = r12
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L32
            r0 = r12
            androidx.lifecycle.LifecycleCoroutineScope r0 = androidx.lifecycle.LifecycleKt.getCoroutineScope(r0)
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L32
        L2f:
            goto L3f
        L32:
            r0 = 0
            r1 = 1
            r2 = 0
            kotlinx.coroutines.CompletableJob r0 = kotlinx.coroutines.SupervisorKt.SupervisorJob$default(r0, r1, r2)
            kotlinx.coroutines.CoroutineScope r0 = com.bilibili.adcommon.utils.ext.c.a(r0)
            r12 = r0
            goto L2f
        L3f:
            r0 = r10
            kotlinx.coroutines.Job r0 = r0.f63763i
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L4f
            r0 = r13
            r1 = 0
            r2 = 1
            r3 = 0
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(r0, r1, r2, r3)
        L4f:
            r0 = r10
            r1 = r12
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getIO()
            r3 = 0
            com.bilibili.lib.projection.internal.search.searchv2.SearchPanelContainer$manuallySearch$1 r4 = new com.bilibili.lib.projection.internal.search.searchv2.SearchPanelContainer$manuallySearch$1
            r5 = r4
            r6 = r11
            r7 = r10
            r8 = 0
            r5.<init>(r6, r7, r8)
            r5 = 2
            r6 = 0
            kotlinx.coroutines.Job r1 = kotlinx.coroutines.BuildersKt.launch$default(r1, r2, r3, r4, r5, r6)
            r0.f63763i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.search.searchv2.SearchPanelContainer.b(boolean):void");
    }

    @Nullable
    public final e.a getActDataListener() {
        return this.f63774t;
    }

    @Nullable
    public final Job getAutoRefreshJob() {
        return this.f63764j;
    }

    @NotNull
    public final List<ProjectionDeviceInternal> getBiliTVDevices$biliscreencast_release() {
        return this.f63775u;
    }

    @Nullable
    public final SearchBottomArea getBottomArea() {
        return this.h;
    }

    @Nullable
    public final LiveInfoBean getCompanionLiveInfo() {
        return this.f63767m;
    }

    public final boolean getHasOperationClosed() {
        return this.f63770p;
    }

    public final long getLastRefreshTime() {
        return this.f63759d;
    }

    @Nullable
    public final ListUiBean getListUiBean() {
        return this.f63765k;
    }

    public final boolean getManuallySearching() {
        return this.f63771q;
    }

    @NotNull
    public final a getPanelInfo() {
        return this.f63758c;
    }

    @NotNull
    public final List<ProjectionDeviceInternal> getPartnerDevices$biliscreencast_release() {
        return this.f63777w;
    }

    @NotNull
    public final Function0<Unit> getRefreshCallback() {
        return this.f63772r;
    }

    public final int getRefreshCount() {
        return this.f63769o;
    }

    @Nullable
    public final F getRvAdapter$biliscreencast_release() {
        return this.f63762g;
    }

    @Nullable
    public final RecyclerView getRvList() {
        return this.f63760e;
    }

    @Nullable
    public final q getSearchCallback$biliscreencast_release() {
        return this.f63766l;
    }

    public final boolean getSearchTipInList() {
        return this.f63773s;
    }

    @NotNull
    public final List<ProjectionDeviceInternal> getThirdPartyDevices$biliscreencast_release() {
        return this.f63778x;
    }

    @NotNull
    public final List<ProjectionDeviceInternal> getVehicleDevices$biliscreencast_release() {
        return this.f63776v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1572e.f2836a.getClass();
        C1572e.f2837b = 0;
        Job job = this.f63763i;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f63763i = null;
        Job job2 = this.f63764j;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.f63764j = null;
        e.a aVar = this.f63774t;
        if (aVar != null) {
            Lazy lazy = he0.e.f120842a;
            Collections.SafeIteratorList<e.a> safeIteratorList = he0.e.f120845d;
            if (safeIteratorList.contains(aVar)) {
                safeIteratorList.remove(aVar);
            }
            this.f63774t = null;
        }
        super.onDetachedFromWindow();
    }

    public final void setActDataListener(@Nullable e.a aVar) {
        this.f63774t = aVar;
    }

    public final void setAutoRefreshJob(@Nullable Job job) {
        this.f63764j = job;
    }

    public final void setBackCallback(@NotNull Function0<Unit> function0) {
        this.f63779y = function0;
    }

    public final void setBiliTVDevices$biliscreencast_release(@NotNull List<? extends ProjectionDeviceInternal> list) {
        this.f63775u = list;
    }

    public final void setBottomArea(@Nullable SearchBottomArea searchBottomArea) {
        this.h = searchBottomArea;
    }

    public final void setCompanionLiveInfo(@Nullable LiveInfoBean liveInfoBean) {
        this.f63767m = liveInfoBean;
    }

    public final void setHasOperationClosed(boolean z6) {
        this.f63770p = z6;
    }

    public final void setLastRefreshTime(long j7) {
        this.f63759d = j7;
    }

    public final void setListUiBean(@Nullable ListUiBean listUiBean) {
        this.f63765k = listUiBean;
    }

    public final void setManuallySearching(boolean z6) {
        this.f63771q = z6;
    }

    public final void setPanelInfo(@NotNull a aVar) {
        this.f63758c = aVar;
    }

    public final void setPartnerDevices$biliscreencast_release(@NotNull List<? extends ProjectionDeviceInternal> list) {
        this.f63777w = list;
    }

    public final void setRefreshCallback(@NotNull Function0<Unit> function0) {
        this.f63772r = function0;
    }

    public final void setRefreshCount(int i7) {
        this.f63769o = i7;
    }

    public final void setRvAdapter$biliscreencast_release(@Nullable F f7) {
        this.f63762g = f7;
    }

    public final void setRvList(@Nullable RecyclerView recyclerView) {
        this.f63760e = recyclerView;
    }

    public final void setSearchCallback$biliscreencast_release(@Nullable q qVar) {
        this.f63766l = qVar;
    }

    public final void setSearchPageFullscreen(boolean z6) {
        this.f63768n = z6;
    }

    public final void setSearchTipInList(boolean z6) {
        this.f63773s = z6;
    }

    public final void setThirdPartyDevices$biliscreencast_release(@NotNull List<? extends ProjectionDeviceInternal> list) {
        this.f63778x = list;
    }

    public final void setVehicleDevices$biliscreencast_release(@NotNull List<? extends ProjectionDeviceInternal> list) {
        this.f63776v = list;
    }
}
