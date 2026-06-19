package com.bilibili.ship.theseus.united.page.intro.module.merchandise;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import com.bilibili.adcommon.data.model.SourceContent;
import com.bilibili.gripper.api.ad.biz.GAdBizKt;
import com.bilibili.gripper.api.ad.biz.videodetail.IAdPanelListener;
import com.bilibili.gripper.api.ad.biz.videodetail.IPanelData;
import com.bilibili.gripper.api.ad.biz.videodetail.merchandise.AdMerchandiseBridge;
import com.bilibili.gripper.api.ad.biz.videodetail.merchandise.AdMerchandisePanelState;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import dv0.Y;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/merchandise/f.class */
@StabilityInferred(parameters = 0)
public final class f extends com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c<Y> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final h f100580l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f100581m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f100582n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<AdMerchandisePanelState> f100583o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final a f100584p;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/merchandise/f$a.class */
    public final class a implements AdMerchandiseBridge.IMerchandisePanelCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f100585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f100586b;

        public a(@NotNull f fVar, h hVar) {
            this.f100586b = fVar;
            this.f100585a = hVar;
        }

        @Nullable
        public final Object closeMerchandisePanel(@NotNull Continuation<? super Unit> continuation) {
            f fVar = this.f100586b;
            fVar.c();
            MerchandiseService merchandiseService = fVar.f100580l.f100589b;
            PageReportService.g(merchandiseService.f100552b, "united.player-video-detail.mall-float.close.click", MapsKt.plus(merchandiseService.c(), merchandiseService.d()), 4);
            Unit unit = Unit.INSTANCE;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return unit;
        }

        public final void dismissPanel() {
            this.f100585a.dismissPanel();
        }

        @Nullable
        public final SourceContent getMerchandiseAdInfo() {
            return this.f100585a.f100588a;
        }

        public final boolean isPanelShowing() {
            return this.f100585a.f100589b.isPanelShowing();
        }

        @Nullable
        public final Object onMerchandisePanelButtonClick(@NotNull Map<String, String> map, @NotNull Continuation<? super Unit> continuation) {
            return this.f100585a.onMerchandisePanelButtonClick(map, continuation);
        }

        @Nullable
        public final Object onMerchandisePanelCardClick(@NotNull Map<String, String> map, @NotNull Continuation<? super Unit> continuation) {
            return this.f100585a.onMerchandisePanelCardClick(map, continuation);
        }

        @Nullable
        public final Object onMerchandisePanelCardShow(@NotNull Map<String, String> map, @NotNull Continuation<? super Unit> continuation) {
            return this.f100585a.onMerchandisePanelCardShow(map, continuation);
        }

        @Nullable
        public final Object onMerchandisePanelWindowClick(@NotNull Continuation<? super Unit> continuation) {
            return this.f100585a.onMerchandisePanelWindowClick(continuation);
        }

        public final void releasePanel() {
            this.f100585a.releasePanel();
        }

        public final <T extends IPanelData> void showPanel(int i7, @Nullable T t7, @Nullable IAdPanelListener iAdPanelListener) {
            this.f100585a.showPanel(i7, t7, iAdPanelListener);
        }
    }

    public f(@NotNull h hVar) {
        this.f100580l = hVar;
        l(0.5625f);
        this.f100581m = true;
        this.f100582n = true;
        this.f100583o = StateFlowKt.MutableStateFlow(AdMerchandisePanelState.Loading.INSTANCE);
        this.f100584p = new a(this, hVar);
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final /* bridge */ /* synthetic */ Object d(ViewBinding viewBinding, Continuation continuation) {
        return m((ContinuationImpl) continuation);
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final ViewBinding e(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Y yInflate = Y.inflate(layoutInflater, viewGroup, false);
        yInflate.f116870a.addView(GAdBizKt.getGAdVideoDetail().getMerchandise().getAdMerchandisePanelView(yInflate.f116870a, this.f100583o, this.f100584p));
        return yInflate;
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final boolean g() {
        return false;
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final boolean h() {
        return this.f100582n;
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final boolean i() {
        return this.f100581m;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandisePanelComponent$bindContent$1
            if (r0 == 0) goto L25
            r0 = r6
            com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandisePanelComponent$bindContent$1 r0 = (com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandisePanelComponent$bindContent$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L2f
        L25:
            com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandisePanelComponent$bindContent$1 r0 = new com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandisePanelComponent$bindContent$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L2f:
            r0 = r6
            java.lang.Object r0 = r0.result
            r8 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            r0 = r5
            kotlinx.coroutines.flow.MutableStateFlow<com.bilibili.gripper.api.ad.biz.videodetail.merchandise.AdMerchandisePanelState> r0 = r0.f100583o
            r10 = r0
            r0 = r7
            if (r0 == 0) goto L6e
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L67
            r0 = r7
            r1 = 2
            if (r0 == r1) goto L5c
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5c:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L63
            goto Lb1
        L63:
            r6 = move-exception
            goto Lbb
        L67:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            goto L95
        L6e:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandisePanelComponent$bindContent$result$1 r0 = new com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandisePanelComponent$bindContent$result$1
            r1 = r0
            r2 = r5
            r3 = 0
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r8
            r1 = r6
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r0, r1)
            r9 = r0
            r0 = r9
            r8 = r0
            r0 = r9
            r1 = r11
            if (r0 != r1) goto L95
            r0 = r11
            return r0
        L95:
            r0 = r10
            r1 = r8
            com.bilibili.gripper.api.ad.biz.videodetail.merchandise.AdMerchandisePanelState r1 = (com.bilibili.gripper.api.ad.biz.videodetail.merchandise.AdMerchandisePanelState) r1
            r0.setValue(r1)
            r0 = r6
            r1 = 2
            r0.label = r1     // Catch: java.lang.Throwable -> L63
            r0 = r6
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> L63
            r1 = r11
            if (r0 != r1) goto Lb1
            r0 = r11
            return r0
        Lb1:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L63
            r6 = r0
            r0 = r6
            r0.<init>()     // Catch: java.lang.Throwable -> L63
            r0 = r6
            throw r0     // Catch: java.lang.Throwable -> L63
        Lbb:
            r0 = r10
            com.bilibili.gripper.api.ad.biz.videodetail.merchandise.AdMerchandisePanelState$Loading r1 = com.bilibili.gripper.api.ad.biz.videodetail.merchandise.AdMerchandisePanelState.Loading.INSTANCE
            r0.setValue(r1)
            r0 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.merchandise.f.m(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
