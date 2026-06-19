package com.bilibili.ship.theseus.united.page.restrictionlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ugc.playlimited.UgcMediaRestrictionLayerService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/B.class */
@StabilityInferred(parameters = 0)
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<RestrictionLayerVo.Style, a> f102501a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public UgcMediaRestrictionLayerService.AnonymousClass1.C09171.a f102502b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/B$a.class */
    public interface a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.B$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/B$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C1106a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final com.bilibili.ship.theseus.ugc.playlimited.c f102503a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final com.bilibili.ship.theseus.ugc.playlimited.d f102504b;

            public C1106a(@NotNull com.bilibili.ship.theseus.ugc.playlimited.c cVar, @NotNull com.bilibili.ship.theseus.ugc.playlimited.d dVar) {
                this.f102503a = cVar;
                this.f102504b = dVar;
            }
        }
    }

    @Inject
    public B() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.restrictionlayer.PageRestrictionLayerService$processRestrictionLayer$1
            if (r0 == 0) goto L29
            r0 = r7
            com.bilibili.ship.theseus.united.page.restrictionlayer.PageRestrictionLayerService$processRestrictionLayer$1 r0 = (com.bilibili.ship.theseus.united.page.restrictionlayer.PageRestrictionLayerService$processRestrictionLayer$1) r0
            r10 = r0
            r0 = r10
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r10
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r10
            r7 = r0
            goto L33
        L29:
            com.bilibili.ship.theseus.united.page.restrictionlayer.PageRestrictionLayerService$processRestrictionLayer$1 r0 = new com.bilibili.ship.theseus.united.page.restrictionlayer.PageRestrictionLayerService$processRestrictionLayer$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L33:
            r0 = r7
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L61
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L57
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r10
            r7 = r0
            goto La5
        L57:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L61:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            com.bilibili.ship.theseus.ugc.playlimited.UgcMediaRestrictionLayerService$1$1$a r0 = r0.f102502b
            r10 = r0
            r0 = 0
            r9 = r0
            r0 = r10
            if (r0 == 0) goto Lae
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r6
            com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo$Style r0 = r0.h()
            com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo$Style r1 = com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo.Style.UNIVERSAL_INTERCEPT
            if (r0 != r1) goto L92
            java.lang.String r0 = "UgcMediaRestrictionLayerService$1$1$1-processRestrictionLayer"
            java.lang.String r1 = "[theseus-ugc-UgcMediaRestrictionLayerService$1$1$1-processRestrictionLayer] RestrictionLayerVo style is UNIVERSAL_INTERCEPT, skipping."
            tv.danmaku.android.log.BLog.i(r0, r1)
            r0 = 0
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            r6 = r0
        L8f:
            goto L9a
        L92:
            r0 = 1
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            r6 = r0
            goto L8f
        L9a:
            r0 = r6
            r7 = r0
            r0 = r6
            r1 = r11
            if (r0 != r1) goto La5
            r0 = r11
            return r0
        La5:
            r0 = r7
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r9 = r0
        Lae:
            r0 = r9
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.restrictionlayer.B.a(com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo.Style r6, @org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.page.restrictionlayer.B.a.C1106a r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.restrictionlayer.PageRestrictionLayerService$providerExtraInfo$1
            if (r0 == 0) goto L29
            r0 = r8
            com.bilibili.ship.theseus.united.page.restrictionlayer.PageRestrictionLayerService$providerExtraInfo$1 r0 = (com.bilibili.ship.theseus.united.page.restrictionlayer.PageRestrictionLayerService$providerExtraInfo$1) r0
            r10 = r0
            r0 = r10
            int r0 = r0.label
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r10
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            goto L34
        L29:
            com.bilibili.ship.theseus.united.page.restrictionlayer.PageRestrictionLayerService$providerExtraInfo$1 r0 = new com.bilibili.ship.theseus.united.page.restrictionlayer.PageRestrictionLayerService$providerExtraInfo$1
            r1 = r0
            r2 = r5
            r3 = r8
            r1.<init>(r2, r3)
            r10 = r0
        L34:
            r0 = r10
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r12 = r0
            r0 = r10
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L73
            r0 = r9
            r1 = 1
            if (r0 == r1) goto L5c
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5c:
            r0 = r10
            java.lang.Object r0 = r0.L$0
            com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo$Style r0 = (com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo.Style) r0
            r6 = r0
            r0 = r6
            r8 = r0
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L6f
            goto La5
        L6f:
            r6 = move-exception
            goto Lb5
        L73:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r6
            r8 = r0
            r0 = r5
            java.util.Map<com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo$Style, com.bilibili.ship.theseus.united.page.restrictionlayer.B$a> r0 = r0.f102501a     // Catch: java.lang.Throwable -> L6f
            r1 = r6
            r2 = r7
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> L6f
            r0 = r6
            r8 = r0
            r0 = r10
            r1 = r6
            r0.L$0 = r1     // Catch: java.lang.Throwable -> L6f
            r0 = r6
            r8 = r0
            r0 = r10
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L6f
            r0 = r6
            r8 = r0
            r0 = r10
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> L6f
            r1 = r12
            if (r0 != r1) goto La5
            r0 = r12
            return r0
        La5:
            r0 = r6
            r8 = r0
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L6f
            r7 = r0
            r0 = r6
            r8 = r0
            r0 = r7
            r0.<init>()     // Catch: java.lang.Throwable -> L6f
            r0 = r6
            r8 = r0
            r0 = r7
            throw r0     // Catch: java.lang.Throwable -> L6f
        Lb5:
            r0 = r5
            java.util.Map<com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo$Style, com.bilibili.ship.theseus.united.page.restrictionlayer.B$a> r0 = r0.f102501a
            r1 = r8
            java.lang.Object r0 = r0.remove(r1)
            r0 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.restrictionlayer.B.b(com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo$Style, com.bilibili.ship.theseus.united.page.restrictionlayer.B$a$a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.ugc.playlimited.UgcMediaRestrictionLayerService.AnonymousClass1.C09171.a r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.restrictionlayer.PageRestrictionLayerService$providerRestrictionLayerProcessor$1
            if (r0 == 0) goto L29
            r0 = r7
            com.bilibili.ship.theseus.united.page.restrictionlayer.PageRestrictionLayerService$providerRestrictionLayerProcessor$1 r0 = (com.bilibili.ship.theseus.united.page.restrictionlayer.PageRestrictionLayerService$providerRestrictionLayerProcessor$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L33
        L29:
            com.bilibili.ship.theseus.united.page.restrictionlayer.PageRestrictionLayerService$providerRestrictionLayerProcessor$1 r0 = new com.bilibili.ship.theseus.united.page.restrictionlayer.PageRestrictionLayerService$providerRestrictionLayerProcessor$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L33:
            r0 = r7
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L62
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
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L5e
            goto L7d
        L5e:
            r6 = move-exception
            goto L87
        L62:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            r1 = r6
            r0.f102502b = r1     // Catch: java.lang.Throwable -> L5e
            r0 = r7
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L5e
            r0 = r7
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> L5e
            r1 = r10
            if (r0 != r1) goto L7d
            r0 = r10
            return r0
        L7d:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L5e
            r6 = r0
            r0 = r6
            r0.<init>()     // Catch: java.lang.Throwable -> L5e
            r0 = r6
            throw r0     // Catch: java.lang.Throwable -> L5e
        L87:
            r0 = r5
            r1 = 0
            r0.f102502b = r1
            r0 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.restrictionlayer.B.c(com.bilibili.ship.theseus.ugc.playlimited.UgcMediaRestrictionLayerService$1$1$a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
