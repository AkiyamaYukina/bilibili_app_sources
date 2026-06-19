package com.bilibili.ship.theseus.sail;

import android.app.Application;
import com.bilibili.app.gemini.base.player.GeminiCommonResolverParams;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import mv0.C8044b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/sail/f.class */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f96156c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Application f96157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.performance.a f96158b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/sail/f$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f96159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f96160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f96161c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f96162d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f96163e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f96164f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final C8044b f96165g;

        @Nullable
        public final Map<String, String> h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final GeminiCommonResolverParams.Scene f96166i;

        public a(long j7, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull C8044b c8044b, @Nullable Map<String, String> map, @NotNull GeminiCommonResolverParams.Scene scene) {
            this.f96159a = j7;
            this.f96160b = str;
            this.f96161c = str2;
            this.f96162d = str3;
            this.f96163e = str4;
            this.f96164f = str5;
            this.f96165g = c8044b;
            this.h = map;
            this.f96166i = scene;
        }
    }

    @Inject
    public f(@NotNull Application application, @NotNull com.bilibili.ship.theseus.united.page.performance.a aVar) {
        this.f96157a = application;
        this.f96158b = aVar;
    }

    public static void b(a aVar, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        HashMap map = new HashMap();
        map.put("from_spmid", aVar.f96165g.f123881c);
        map.put("spmid", aVar.f96165g.f123880b);
        map.put(GameCardButton.extraAvid, String.valueOf(aVar.f96159a));
        map.put("bvid", aVar.f96160b);
        String str8 = str2;
        if (str2 == null) {
            str8 = "";
        }
        map.put("ecode", str8);
        map.put("error_code", str);
        String str9 = str4;
        if (str4 == null) {
            str9 = "";
        }
        map.put("tabs", str9);
        String str10 = str3;
        if (str3 == null) {
            str10 = "";
        }
        map.put("biz", str10);
        String str11 = str7;
        if (str7 == null) {
            str11 = "";
        }
        map.put(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE, str11);
        String str12 = str5;
        if (str5 == null) {
            str12 = "";
        }
        map.put("modules", str12);
        map.put("error_msg", str6);
        Neurons.trackT$default(false, "main.detail.tech.track.view.request", map, 0, new H41.a(5), 8, (Object) null);
    }

    public static /* synthetic */ void c(f fVar, a aVar, String str, String str2, String str3, String str4) {
        fVar.getClass();
        b(aVar, str, str2, str3, null, null, str4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r14, @org.jetbrains.annotations.NotNull java.lang.String r16, @org.jetbrains.annotations.NotNull java.lang.String r17, @org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.NotNull java.lang.String r20, @org.jetbrains.annotations.Nullable java.util.Map r21, @org.jetbrains.annotations.NotNull mv0.C8044b r22, @org.jetbrains.annotations.NotNull com.bilibili.app.gemini.base.player.GeminiCommonResolverParams.Scene r23, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r24) {
        /*
            r13 = this;
            r0 = r24
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.sail.ViewRepository$loadNewViewAndVideo$1
            if (r0 == 0) goto L2f
            r0 = r24
            com.bilibili.ship.theseus.sail.ViewRepository$loadNewViewAndVideo$1 r0 = (com.bilibili.ship.theseus.sail.ViewRepository$loadNewViewAndVideo$1) r0
            r26 = r0
            r0 = r26
            int r0 = r0.label
            r25 = r0
            r0 = r25
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2f
            r0 = r26
            r1 = r25
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r26
            r24 = r0
            goto L3b
        L2f:
            com.bilibili.ship.theseus.sail.ViewRepository$loadNewViewAndVideo$1 r0 = new com.bilibili.ship.theseus.sail.ViewRepository$loadNewViewAndVideo$1
            r1 = r0
            r2 = r13
            r3 = r24
            r1.<init>(r2, r3)
            r24 = r0
        L3b:
            r0 = r24
            java.lang.Object r0 = r0.result
            r27 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r26 = r0
            r0 = r24
            int r0 = r0.label
            r25 = r0
            r0 = r25
            if (r0 == 0) goto L74
            r0 = r25
            r1 = 1
            if (r0 != r1) goto L6a
            r0 = r27
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r27
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.unbox-impl()
            r16 = r0
            goto Lad
        L6a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L74:
            r0 = r27
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.ship.theseus.sail.f$a r0 = new com.bilibili.ship.theseus.sail.f$a
            r1 = r0
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r22
            r9 = r21
            r10 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r16 = r0
            r0 = r24
            r1 = 1
            r0.label = r1
            r0 = r13
            r1 = r16
            r2 = r24
            java.lang.Object r0 = r0.d(r1, r2)
            r17 = r0
            r0 = r17
            r16 = r0
            r0 = r17
            r1 = r26
            if (r0 != r1) goto Lad
            r0 = r26
            return r0
        Lad:
            r0 = r16
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.sail.f.a(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, mv0.b, com.bilibili.app.gemini.base.player.GeminiCommonResolverParams$Scene, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(@org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.sail.f.a r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.sail.f.d(com.bilibili.ship.theseus.sail.f$a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
