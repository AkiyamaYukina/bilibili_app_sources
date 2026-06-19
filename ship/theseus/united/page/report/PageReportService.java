package com.bilibili.ship.theseus.united.page.report;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.neuron.api.Neurons;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/report/PageReportService.class */
@StabilityInferred(parameters = 0)
public final class PageReportService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IReporterService f102488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Map<String, String> f102489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ArrayList<Map<String, String>> f102490c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ArrayList<Pair<String, Function0<String>>> f102491d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f102492e = new LinkedHashMap();

    @Inject
    public PageReportService(@NotNull IReporterService iReporterService) {
        this.f102488a = iReporterService;
        new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void g(PageReportService pageReportService, String str, Map map, int i7) {
        if ((i7 & 2) != 0) {
            map = null;
        }
        pageReportService.f(str, map, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void i(PageReportService pageReportService, String str, Map map, int i7) {
        if ((i7 & 2) != 0) {
            map = null;
        }
        pageReportService.h(str, map, false);
    }

    public final Map<String, String> a(Map<String, String> map) {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        Iterator<T> it = this.f102490c.iterator();
        while (it.hasNext()) {
            mapCreateMapBuilder.putAll((Map) it.next());
        }
        Iterator<T> it2 = this.f102491d.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            mapCreateMapBuilder.put(pair.getFirst(), ((Function0) pair.getSecond()).invoke());
        }
        if (map != null) {
            mapCreateMapBuilder.putAll(map);
        }
        return MapsKt.build(mapCreateMapBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull kotlin.Pair r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.report.PageReportService$keepInstantlyObtainedParamsRegistration$1
            if (r0 == 0) goto L26
            r0 = r7
            com.bilibili.ship.theseus.united.page.report.PageReportService$keepInstantlyObtainedParamsRegistration$1 r0 = (com.bilibili.ship.theseus.united.page.report.PageReportService$keepInstantlyObtainedParamsRegistration$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L26
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            goto L31
        L26:
            com.bilibili.ship.theseus.united.page.report.PageReportService$keepInstantlyObtainedParamsRegistration$1 r0 = new com.bilibili.ship.theseus.united.page.report.PageReportService$keepInstantlyObtainedParamsRegistration$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r9 = r0
        L31:
            r0 = r9
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L6d
            r0 = r8
            r1 = 1
            if (r0 == r1) goto L56
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L56:
            r0 = r9
            java.lang.Object r0 = r0.L$0
            kotlin.Pair r0 = (kotlin.Pair) r0
            r6 = r0
            r0 = r6
            r7 = r0
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L69
            goto L9a
        L69:
            r6 = move-exception
            goto Lad
        L6d:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            java.util.ArrayList<kotlin.Pair<java.lang.String, kotlin.jvm.functions.Function0<java.lang.String>>> r0 = r0.f102491d
            r1 = r6
            boolean r0 = r0.add(r1)
            r0 = r6
            r7 = r0
            r0 = r9
            r1 = r6
            r0.L$0 = r1     // Catch: java.lang.Throwable -> L69
            r0 = r6
            r7 = r0
            r0 = r9
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L69
            r0 = r6
            r7 = r0
            r0 = r9
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> L69
            r1 = r11
            if (r0 != r1) goto L9a
            r0 = r11
            return r0
        L9a:
            r0 = r6
            r7 = r0
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L69
            r9 = r0
            r0 = r6
            r7 = r0
            r0 = r9
            r0.<init>()     // Catch: java.lang.Throwable -> L69
            r0 = r6
            r7 = r0
            r0 = r9
            throw r0     // Catch: java.lang.Throwable -> L69
        Lad:
            r0 = r5
            java.util.ArrayList<kotlin.Pair<java.lang.String, kotlin.jvm.functions.Function0<java.lang.String>>> r0 = r0.f102491d
            r1 = r7
            boolean r0 = r0.remove(r1)
            r0 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.report.PageReportService.b(kotlin.Pair, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull java.util.Map r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.report.PageReportService.c(java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v13 */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(@org.jetbrains.annotations.NotNull java.util.Map r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.report.PageReportService.d(java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation, kotlin.coroutines.Continuation<? super kotlin.Unit>] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.report.PageReportService$keepReportParamsMapRegistration$1
            if (r0 == 0) goto L26
            r0 = r7
            com.bilibili.ship.theseus.united.page.report.PageReportService$keepReportParamsMapRegistration$1 r0 = (com.bilibili.ship.theseus.united.page.report.PageReportService$keepReportParamsMapRegistration$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L26
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            goto L31
        L26:
            com.bilibili.ship.theseus.united.page.report.PageReportService$keepReportParamsMapRegistration$1 r0 = new com.bilibili.ship.theseus.united.page.report.PageReportService$keepReportParamsMapRegistration$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r9 = r0
        L31:
            r0 = r9
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L6d
            r0 = r8
            r1 = 1
            if (r0 == r1) goto L56
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L56:
            r0 = r9
            java.lang.Object r0 = r0.L$0
            java.util.Map r0 = (java.util.Map) r0
            r6 = r0
            r0 = r6
            r7 = r0
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L69
            goto L9a
        L69:
            r6 = move-exception
            goto Lad
        L6d:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> r0 = r0.f102490c
            r1 = r6
            boolean r0 = r0.add(r1)
            r0 = r6
            r7 = r0
            r0 = r9
            r1 = r6
            r0.L$0 = r1     // Catch: java.lang.Throwable -> L69
            r0 = r6
            r7 = r0
            r0 = r9
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L69
            r0 = r6
            r7 = r0
            r0 = r9
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> L69
            r1 = r11
            if (r0 != r1) goto L9a
            r0 = r11
            return r0
        L9a:
            r0 = r6
            r7 = r0
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L69
            r9 = r0
            r0 = r6
            r7 = r0
            r0 = r9
            r0.<init>()     // Catch: java.lang.Throwable -> L69
            r0 = r6
            r7 = r0
            r0 = r9
            throw r0     // Catch: java.lang.Throwable -> L69
        Lad:
            r0 = r5
            java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> r0 = r0.f102490c
            r1 = r7
            boolean r0 = r0.remove(r1)
            r0 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.report.PageReportService.e(java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void f(@NotNull String str, @Nullable Map<String, String> map, boolean z6) {
        if (!StringsKt.w(str, ".player")) {
            Neurons.reportClick(z6, str, a(map));
        } else {
            this.f102488a.report(new NeuronsEvents.b(str, map));
        }
    }

    public final void h(@NotNull String str, @Nullable Map<String, String> map, boolean z6) {
        if (!StringsKt.w(str, ".player")) {
            Neurons.reportExposure$default(z6, str, a(map), (List) null, 8, (Object) null);
        } else {
            this.f102488a.report(new NeuronsEvents.b(str, map));
        }
    }
}
