package com.bilibili.ship.theseus.united.page.intro.module.merchandise;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.framework.exposure.core.ExposureEntryV;
import com.bilibili.gripper.api.ad.biz.videodetail.merchandise.IAdMerchandiseViewEntry;
import com.bilibili.gripper.api.ad.core.GAdCoreKt;
import com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandiseService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/merchandise/MerchandiseComponent.class */
@StabilityInferred(parameters = 0)
public final class MerchandiseComponent implements UIComponent<a<IAdMerchandiseViewEntry>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MerchandiseService.a f100544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final d f100545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f100546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f100547d = LazyKt.lazy(LazyThreadSafetyMode.NONE, new HY0.c(this, 5));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f100548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f100549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ExposureEntryV f100550g;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandiseComponent$bindToView$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/merchandise/MerchandiseComponent$bindToView$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        Object result;
        final MerchandiseComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MerchandiseComponent merchandiseComponent, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = merchandiseComponent;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.bindToView(null, this);
        }
    }

    public MerchandiseComponent(@NotNull MerchandiseService.a aVar, @NotNull d dVar, @NotNull CoroutineScope coroutineScope) {
        this.f100544a = aVar;
        this.f100545b = dVar;
        this.f100546c = coroutineScope;
        this.f100550g = GAdCoreKt.getGAdExposure().newExposureEntry(coroutineScope, new EK0.a(10), new com.bilibili.bililive.room.ui.roomv3.hybrid.h(this, 2), new EK0.d(11), new Sf.b(this, 4), 0.8f);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARN: Type inference failed for: r0v10, types: [V extends com.bilibili.gripper.api.ad.biz.videodetail.merchandise.IAdMerchandiseViewEntry, com.bilibili.gripper.api.ad.biz.videodetail.merchandise.IAdMerchandiseViewEntry] */
    /* JADX WARN: Type inference failed for: r0v14, types: [V extends com.bilibili.gripper.api.ad.biz.videodetail.merchandise.IAdMerchandiseViewEntry, com.bilibili.adcommon.basic.IAdViewEntry] */
    /* JADX WARN: Type inference failed for: r0v16, types: [V extends com.bilibili.gripper.api.ad.biz.videodetail.merchandise.IAdMerchandiseViewEntry, com.bilibili.adcommon.basic.IAdViewEntry] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.bilibili.ship.theseus.united.page.intro.module.merchandise.a] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation, kotlin.coroutines.Continuation<? super kotlin.Unit>] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object bindToView(@org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.page.intro.module.merchandise.a<com.bilibili.gripper.api.ad.biz.videodetail.merchandise.IAdMerchandiseViewEntry> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandiseComponent.bindToView(com.bilibili.ship.theseus.united.page.intro.module.merchandise.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.app.gemini.ui.UIComponent.ViewEntry createViewEntry(android.content.Context r7, android.view.ViewGroup r8) {
        /*
            r6 = this;
            r0 = r8
            if (r0 == 0) goto L57
            com.bilibili.gripper.api.ad.biz.GAdVideoDetail r0 = com.bilibili.gripper.api.ad.biz.GAdBizKt.getGAdVideoDetail()
            com.bilibili.gripper.api.ad.biz.videodetail.merchandise.IAdMerchandise r0 = r0.getMerchandise()
            r10 = r0
            r0 = r6
            com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandiseService$a r0 = r0.f100544a
            com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandiseService r0 = r0.f100566a
            r9 = r0
            r0 = r10
            r1 = r8
            r2 = r9
            com.bilibili.gripper.api.ad.biz.videodetail.merchandise.IAdMerchandiseViewEntry r0 = r0.getAdMerchandiseView(r1, r2)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L57
            r0 = r9
            com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandiseComponent$createViewEntry$adView$2$1 r1 = new com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandiseComponent$createViewEntry$adView$2$1
            r2 = r1
            r3 = r8
            r2.<init>(r3)
            r0.f100562m = r1
            r0 = r9
            com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandiseComponent$createViewEntry$adView$2$2 r1 = new com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandiseComponent$createViewEntry$adView$2$2
            r2 = r1
            r3 = r8
            r2.<init>(r3)
            r0.f100563n = r1
            r0 = r6
            com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandiseComponent$createViewEntry$adView$2$3 r1 = new com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandiseComponent$createViewEntry$adView$2$3
            r2 = r1
            r3 = r8
            r2.<init>(r3)
            r0.f100548e = r1
            r0 = r6
            com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandiseComponent$createViewEntry$adView$2$4 r1 = new com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandiseComponent$createViewEntry$adView$2$4
            r2 = r1
            r3 = r8
            r2.<init>(r3)
            r0.f100549f = r1
            goto L59
        L57:
            r0 = 0
            r8 = r0
        L59:
            r0 = r8
            r9 = r0
            r0 = r8
            if (r0 != 0) goto L6f
            iZ.a r0 = new iZ.a
            r1 = r0
            android.widget.Space r2 = new android.widget.Space
            r3 = r2
            r4 = r7
            r3.<init>(r4)
            r1.<init>(r2)
            r9 = r0
        L6f:
            com.bilibili.ship.theseus.united.page.intro.module.merchandise.a r0 = new com.bilibili.ship.theseus.united.page.intro.module.merchandise.a
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandiseComponent.createViewEntry(android.content.Context, android.view.ViewGroup):com.bilibili.app.gemini.ui.UIComponent$ViewEntry");
    }
}
