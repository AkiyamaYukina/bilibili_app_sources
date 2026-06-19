package com.bilibili.ship.theseus.ogv.ep;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.bean.OgvClipParams;
import com.bilibili.ship.theseus.united.page.ad.PageAdRepository;
import com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.view.t;
import com.bilibili.ship.theseus.united.player.mediaplay.f;
import com.bilibili.ship.theseus.united.player.mediaplay.l;
import com.bilibili.ship.theseus.united.player.mediaplay.m;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/OgvSupplementService.class */
@StabilityInferred(parameters = 0)
public final class OgvSupplementService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f92142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f92143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Flow<l> f92144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final OgvSeason f92145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final t f92146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PageAdRepository f92147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C8043a f92148g;

    @NotNull
    public final PageBackgroundPlayRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f92149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Gu0.a f92150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final wv0.a f92151k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final PageReportService f92152l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final String f92153m;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.ep.OgvSupplementService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/OgvSupplementService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvSupplementService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.ep.OgvSupplementService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/OgvSupplementService$1$1.class */
        public static final class C06851 extends SuspendLambda implements Function2<l, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final OgvSupplementService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06851(OgvSupplementService ogvSupplementService, Continuation<? super C06851> continuation) {
                super(2, continuation);
                this.this$0 = ogvSupplementService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06851 c06851 = new C06851(this.this$0, continuation);
                c06851.L$0 = obj;
                return c06851;
            }

            public final Object invoke(l lVar, Continuation<? super Unit> continuation) {
                return create(lVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                Map extraJsonParams;
                Map extraJsonParams2;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                l lVar = (l) this.L$0;
                if (lVar != null) {
                    f fVar = lVar.f104530d;
                    if (m.a(fVar)) {
                        com.bilibili.ship.theseus.united.bean.d dVarA = d.a(fVar);
                        OgvClipParams ogvClipParams = null;
                        Long l7 = dVarA != null ? dVarA.f98754c : null;
                        long j7 = lVar.f104528b;
                        OgvEpisode ogvEpisodeH = (l7 == null || l7.longValue() <= 0) ? j7 > 0 ? this.this$0.f92150j.h(j7) : null : this.this$0.f92150j.i(l7.longValue());
                        if (ogvEpisodeH == null) {
                            StringBuilder sb = new StringBuilder("ogv video need supplement playable params, but can't find episode, avid:");
                            sb.append(lVar.f104527a);
                            com.bilibili.bangumi.logic.page.detail.service.f.a("[theseus-ogv-OgvSupplementService$1$1-invokeSuspend] ", Ld.c.a(sb, j7, ", media cid:"), "OgvSupplementService$1$1-invokeSuspend", (Throwable) null);
                            return Unit.INSTANCE;
                        }
                        j jVar = lVar.f104529c;
                        int fromAutoPlay = jVar.f().getFromAutoPlay();
                        String playMode = jVar.f().getPlayMode();
                        String strG = playMode;
                        if (playMode == null) {
                            strG = this.this$0.h.g();
                        }
                        Map extraJsonParams3 = jVar.f().getExtraJsonParams();
                        String str = extraJsonParams3 != null ? (String) extraJsonParams3.get("current_material_no") : null;
                        Map extraJsonParams4 = jVar.f().getExtraJsonParams();
                        String str2 = extraJsonParams4 != null ? (String) extraJsonParams4.get("player_report_json") : null;
                        OgvSupplementService ogvSupplementService = this.this$0;
                        Context context = ogvSupplementService.f92142a;
                        com.bilibili.ship.theseus.united.bean.d dVarA2 = d.a(fVar);
                        if (dVarA2 != null) {
                            ogvClipParams = dVarA2.f98755d;
                        }
                        OgvSupplementService ogvSupplementService2 = this.this$0;
                        GeminiCommonPlayableParams geminiCommonPlayableParamsA = a.a(context, ogvSupplementService.f92145d, ogvEpisodeH, ogvSupplementService.f92146e, ogvClipParams, strG, fromAutoPlay, ogvSupplementService2.f92148g, ogvSupplementService2.f92149i, ogvSupplementService2.f92147f, false, ogvSupplementService2.f92151k.f129026b, ogvSupplementService2.f92152l.f102492e, fVar instanceof f.a, ogvSupplementService2.f92153m, 1024);
                        if (geminiCommonPlayableParamsA.getExtraJsonParams() == null) {
                            geminiCommonPlayableParamsA.setExtraJsonParams(new LinkedHashMap());
                        }
                        if (str != null && (extraJsonParams2 = geminiCommonPlayableParamsA.getExtraJsonParams()) != null) {
                        }
                        if (str2 != null && (extraJsonParams = geminiCommonPlayableParamsA.getExtraJsonParams()) != null) {
                        }
                        jVar.j(geminiCommonPlayableParamsA);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvSupplementService ogvSupplementService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvSupplementService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OgvSupplementService ogvSupplementService = this.this$0;
                Flow<l> flow = ogvSupplementService.f92144c;
                C06851 c06851 = new C06851(ogvSupplementService, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c06851, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/OgvSupplementService$a.class */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:46:0x0213  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams a(android.content.Context r8, com.bilibili.ship.theseus.ogv.season.OgvSeason r9, com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode r10, com.bilibili.ship.theseus.united.page.view.t r11, com.bilibili.ship.theseus.united.bean.OgvClipParams r12, java.lang.String r13, int r14, mv0.C8043a r15, com.bilibili.ship.theseus.united.page.view.d r16, com.bilibili.ship.theseus.united.page.ad.PageAdRepository r17, boolean r18, com.bilibili.app.gemini.base.player.GeminiCommonResolverParams.Scene r19, java.util.Map r20, boolean r21, java.lang.String r22, int r23) {
            /*
                Method dump skipped, instruction units count: 1195
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.ep.OgvSupplementService.a.a(android.content.Context, com.bilibili.ship.theseus.ogv.season.OgvSeason, com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode, com.bilibili.ship.theseus.united.page.view.t, com.bilibili.ship.theseus.united.bean.OgvClipParams, java.lang.String, int, mv0.a, com.bilibili.ship.theseus.united.page.view.d, com.bilibili.ship.theseus.united.page.ad.PageAdRepository, boolean, com.bilibili.app.gemini.base.player.GeminiCommonResolverParams$Scene, java.util.Map, boolean, java.lang.String, int):com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams");
        }
    }

    @Inject
    public OgvSupplementService(@NotNull Context context, @NotNull CoroutineScope coroutineScope, @NotNull Flow<l> flow, @NotNull OgvSeason ogvSeason, @NotNull t tVar, @NotNull PageAdRepository pageAdRepository, @NotNull C8043a c8043a, @NotNull PageBackgroundPlayRepository pageBackgroundPlayRepository, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull Gu0.a aVar, @NotNull wv0.a aVar2, @NotNull PageReportService pageReportService, @Nullable String str) {
        this.f92142a = context;
        this.f92143b = coroutineScope;
        this.f92144c = flow;
        this.f92145d = ogvSeason;
        this.f92146e = tVar;
        this.f92147f = pageAdRepository;
        this.f92148g = c8043a;
        this.h = pageBackgroundPlayRepository;
        this.f92149i = dVar;
        this.f92150j = aVar;
        this.f92151k = aVar2;
        this.f92152l = pageReportService;
        this.f92153m = str;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
