package com.bilibili.ship.theseus.united.page.weblayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import java.util.ArrayList;
import javax.inject.Inject;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/WebFloatLayerService.class */
@StabilityInferred(parameters = 0)
public final class WebFloatLayerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f104239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f104240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f104241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f104242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ArrayList<Pair<String, com.bilibili.ogv.infra.jsb.f>> f104243e = new ArrayList<>();

    @Inject
    public WebFloatLayerService(@NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull BackActionRepository backActionRepository) {
        this.f104239a = theseusFloatLayerService;
        this.f104240b = aVar;
        this.f104241c = gVar;
        this.f104242d = backActionRepository;
    }

    public static TheseusWebUIComponent b(WebFloatLayerService webFloatLayerService, String str, TheseusWebUIComponent.a aVar) {
        webFloatLayerService.getClass();
        return new TheseusWebUIComponent(str, webFloatLayerService.a(), aVar, null, null, "", null, 72);
    }

    public static Object f(WebFloatLayerService webFloatLayerService, String str, SuspendLambda suspendLambda) {
        return webFloatLayerService.d(str, new TheseusWebUIComponent.a(false, null, 0, 0, 0, false, 0, false, 0, DimenUtilsKt.dpToPx(KScreenAdjustUtilsKt.contentWebViewMaxWith$default(webFloatLayerService.f104240b.b(), 0, 1, (Object) null)), false, true, webFloatLayerService.f104240b.f102941e, 360447), suspendLambda);
    }

    @NotNull
    public final com.bilibili.ogv.infra.jsb.d a() {
        com.bilibili.ogv.infra.jsb.d dVar = new com.bilibili.ogv.infra.jsb.d();
        for (Pair<String, com.bilibili.ogv.infra.jsb.f> pair : this.f104243e) {
            dVar.a((com.bilibili.ogv.infra.jsb.f) pair.component2(), (String) pair.component1());
        }
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull com.bilibili.ogv.infra.jsb.f r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.weblayer.WebFloatLayerService$registerJsBridge$1
            if (r0 == 0) goto L2c
            r0 = r8
            com.bilibili.ship.theseus.united.page.weblayer.WebFloatLayerService$registerJsBridge$1 r0 = (com.bilibili.ship.theseus.united.page.weblayer.WebFloatLayerService$registerJsBridge$1) r0
            r10 = r0
            r0 = r10
            int r0 = r0.label
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2c
            r0 = r10
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r10
            r8 = r0
            goto L36
        L2c:
            com.bilibili.ship.theseus.united.page.weblayer.WebFloatLayerService$registerJsBridge$1 r0 = new com.bilibili.ship.theseus.united.page.weblayer.WebFloatLayerService$registerJsBridge$1
            r1 = r0
            r2 = r5
            r3 = r8
            r1.<init>(r2, r3)
            r8 = r0
        L36:
            r0 = r8
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r8
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L72
            r0 = r9
            r1 = 1
            if (r0 == r1) goto L5c
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5c:
            r0 = r8
            java.lang.Object r0 = r0.L$0
            kotlin.Pair r0 = (kotlin.Pair) r0
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L6e
            goto La2
        L6e:
            r7 = move-exception
            goto Lb2
        L72:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r6
            r1 = r7
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r7 = r0
            r0 = r5
            java.util.ArrayList<kotlin.Pair<java.lang.String, com.bilibili.ogv.infra.jsb.f>> r0 = r0.f104243e
            r1 = r7
            boolean r0 = r0.add(r1)
            r0 = r7
            r6 = r0
            r0 = r8
            r1 = r7
            r0.L$0 = r1     // Catch: java.lang.Throwable -> L6e
            r0 = r7
            r6 = r0
            r0 = r8
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L6e
            r0 = r7
            r6 = r0
            r0 = r8
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> L6e
            r1 = r10
            if (r0 != r1) goto La2
            r0 = r10
            return r0
        La2:
            r0 = r7
            r6 = r0
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L6e
            r8 = r0
            r0 = r7
            r6 = r0
            r0 = r8
            r0.<init>()     // Catch: java.lang.Throwable -> L6e
            r0 = r7
            r6 = r0
            r0 = r8
            throw r0     // Catch: java.lang.Throwable -> L6e
        Lb2:
            r0 = r5
            java.util.ArrayList<kotlin.Pair<java.lang.String, com.bilibili.ogv.infra.jsb.f>> r0 = r0.f104243e
            r1 = r6
            boolean r0 = r0.remove(r1)
            r0 = r7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.weblayer.WebFloatLayerService.c(java.lang.String, com.bilibili.ogv.infra.jsb.f, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Nullable
    public final Object d(@NotNull String str, @NotNull TheseusWebUIComponent.a aVar, @NotNull Continuation<? super Unit> continuation) {
        TheseusWebUIComponent theseusWebUIComponent = new TheseusWebUIComponent(str, a(), aVar, null, null, null, null, 120);
        ArrayList arrayList = new ArrayList();
        SelectKt$selectCancellingUnselected$scope$1 selectKt$selectCancellingUnselected$scope$1 = new SelectKt$selectCancellingUnselected$scope$1(arrayList);
        TheseusFloatLayerService.a aVar2 = new TheseusFloatLayerService.a(0, 0, 0, 0, new Mu0.f(this, 2));
        selectKt$selectCancellingUnselected$scope$1.b(new WebFloatLayerService$showTabPagerAreaWebFloatLayer$3$1(this, theseusWebUIComponent, aVar2, null));
        selectKt$selectCancellingUnselected$scope$1.b(new WebFloatLayerService$showTabPagerAreaWebFloatLayer$3$2(this, theseusWebUIComponent, aVar2, null));
        selectKt$selectCancellingUnselected$scope$1.a(theseusWebUIComponent.f104195o);
        Unit unit = Unit.INSTANCE;
        Object objFirst = FlowKt.first(FlowKt.merge(arrayList), continuation);
        return objFirst == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objFirst : Unit.INSTANCE;
    }

    @Nullable
    public final Object e(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation) {
        com.bilibili.ship.theseus.united.page.screensize.a aVar = this.f104240b;
        Object objD = d(str, new TheseusWebUIComponent.a(false, str2, 0, 0, 0, false, 0, false, 0, DimenUtilsKt.dpToPx(KScreenAdjustUtilsKt.contentWebViewMaxWith$default(aVar.b(), 0, 1, (Object) null)), false, true, aVar.f102941e, 360445), continuation);
        return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : Unit.INSTANCE;
    }
}
