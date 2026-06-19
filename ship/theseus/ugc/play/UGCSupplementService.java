package com.bilibili.ship.theseus.ugc.play;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.Interaction;
import com.bapis.bilibili.playershared.PlayArc;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.united.bean.f;
import com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.view.t;
import com.bilibili.ship.theseus.united.player.mediaplay.f;
import com.bilibili.ship.theseus.united.player.mediaplay.l;
import com.bilibili.ship.theseus.united.player.mediaplay.m;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
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
import tv.danmaku.biliplayerv2.service.Video;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/UGCSupplementService.class */
@StabilityInferred(parameters = 0)
public final class UGCSupplementService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Flow<l> f98089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f98090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C8043a f98091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PageBackgroundPlayRepository f98092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final t f98093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f98094g;

    @NotNull
    public final List<Av0.a> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final wv0.a f98095i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final PageReportService f98096j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final f f98097k;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.UGCSupplementService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/UGCSupplementService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCSupplementService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.UGCSupplementService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/UGCSupplementService$1$1.class */
        public static final class C09051 extends SuspendLambda implements Function2<l, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final UGCSupplementService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09051(UGCSupplementService uGCSupplementService, Continuation<? super C09051> continuation) {
                super(2, continuation);
                this.this$0 = uGCSupplementService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09051 c09051 = new C09051(this.this$0, continuation);
                c09051.L$0 = obj;
                return c09051;
            }

            public final Object invoke(l lVar, Continuation<? super Unit> continuation) {
                return create(lVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                long j7;
                Video.b bVar;
                Map extraJsonParams;
                Map extraJsonParams2;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                l lVar = (l) this.L$0;
                if (lVar != null) {
                    com.bilibili.ship.theseus.united.player.mediaplay.f fVar = lVar.f104530d;
                    if (m.a(fVar)) {
                        Iterator<Av0.a> it = this.this$0.h.iterator();
                        boolean z6 = false;
                        int i7 = 0;
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            j7 = lVar.f104528b;
                            if (!zHasNext) {
                                i7 = -1;
                                break;
                            }
                            if (it.next().f591b == j7) {
                                break;
                            }
                            i7++;
                        }
                        String str = null;
                        if (i7 == -1) {
                            StringBuilder sb = new StringBuilder("ugc video need supplement playable params, but can't find episode, avid:");
                            sb.append(lVar.f104527a);
                            com.bilibili.bangumi.logic.page.detail.service.f.a("[theseus-ugc-UGCSupplementService$1$1-invokeSuspend] ", Ld.c.a(sb, j7, ", media cid:"), "UGCSupplementService$1$1-invokeSuspend", (Throwable) null);
                            return Unit.INSTANCE;
                        }
                        PlayViewUniteReply playViewUniteReply = fVar instanceof f.c ? ((f.c) fVar).f104516a : null;
                        PlayArc playArc = playViewUniteReply != null ? playViewUniteReply.getPlayArc() : null;
                        if (playArc == null || !playArc.hasInteraction()) {
                            bVar = null;
                        } else {
                            Interaction interaction = playArc.getInteraction();
                            UGCSupplementService uGCSupplementService = this.this$0;
                            bVar = new Video.b();
                            bVar.a = uGCSupplementService.f98090c.a();
                            bVar.c = interaction.getHistoryNode().getCid();
                            bVar.b = interaction.getHistoryNode().getNodeId();
                            bVar.d = uGCSupplementService.f98090c.c();
                            bVar.e = interaction.getGraphVersion();
                        }
                        com.bilibili.ship.theseus.united.page.view.a aVar = this.this$0.f98090c;
                        if (bVar != null) {
                            z6 = true;
                        }
                        aVar.f104050p = z6;
                        j jVar = lVar.f104529c;
                        int fromAutoPlay = jVar.f().getFromAutoPlay();
                        String playMode = jVar.f().getPlayMode();
                        String strG = playMode;
                        if (playMode == null) {
                            strG = this.this$0.f98092e.g();
                        }
                        Av0.a aVar2 = this.this$0.h.get(i7);
                        boolean z7 = fVar instanceof f.a;
                        if (z7) {
                            i7 = ((f.a) fVar).f104514a.f117642e;
                        }
                        Map extraJsonParams3 = jVar.f().getExtraJsonParams();
                        String str2 = extraJsonParams3 != null ? (String) extraJsonParams3.get("current_material_no") : null;
                        Map extraJsonParams4 = jVar.f().getExtraJsonParams();
                        if (extraJsonParams4 != null) {
                            str = (String) extraJsonParams4.get("player_report_json");
                        }
                        long jA = this.this$0.f98090c.a();
                        long j8 = aVar2.f591b;
                        String str3 = this.this$0.h.size() > 1 ? aVar2.f593d : aVar2.f598j;
                        UGCSupplementService uGCSupplementService2 = this.this$0;
                        GeminiCommonPlayableParams geminiCommonPlayableParamsA = a.a(jA, j8, i7, str3, uGCSupplementService2.f98090c.f104046l, fromAutoPlay, strG, aVar2.f596g, uGCSupplementService2.f98093f.f104126b.f104087b, bVar, uGCSupplementService2.f98095i.f129026b, uGCSupplementService2.f98094g, uGCSupplementService2.f98091d, uGCSupplementService2.f98096j.f102492e, z7, uGCSupplementService2.f98097k);
                        if (geminiCommonPlayableParamsA.getExtraJsonParams() == null) {
                            geminiCommonPlayableParamsA.setExtraJsonParams(new LinkedHashMap());
                        }
                        if (str2 != null && (extraJsonParams2 = geminiCommonPlayableParamsA.getExtraJsonParams()) != null) {
                        }
                        if (str != null && (extraJsonParams = geminiCommonPlayableParamsA.getExtraJsonParams()) != null) {
                        }
                        jVar.j(geminiCommonPlayableParamsA);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UGCSupplementService uGCSupplementService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = uGCSupplementService;
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
                UGCSupplementService uGCSupplementService = this.this$0;
                Flow<l> flow = uGCSupplementService.f98089b;
                C09051 c09051 = new C09051(uGCSupplementService, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c09051, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/UGCSupplementService$a.class */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:28:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x015b  */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams a(long r5, long r7, int r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.Nullable java.lang.String r11, int r12, @org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.bean.VideoDimension r14, @org.jetbrains.annotations.Nullable com.bilibili.ship.theseus.united.page.view.p r15, @org.jetbrains.annotations.Nullable tv.danmaku.biliplayerv2.service.Video.b r16, @org.jetbrains.annotations.NotNull com.bilibili.app.gemini.base.player.GeminiCommonResolverParams.Scene r17, @org.jetbrains.annotations.Nullable com.bilibili.ship.theseus.united.page.view.d r18, @org.jetbrains.annotations.NotNull mv0.C8043a r19, @org.jetbrains.annotations.NotNull java.util.Map r20, boolean r21, @org.jetbrains.annotations.Nullable com.bilibili.ship.theseus.united.bean.f r22) {
            /*
                Method dump skipped, instruction units count: 640
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.play.UGCSupplementService.a.a(long, long, int, java.lang.String, java.lang.String, int, java.lang.String, com.bilibili.ship.theseus.united.bean.VideoDimension, com.bilibili.ship.theseus.united.page.view.p, tv.danmaku.biliplayerv2.service.Video$b, com.bilibili.app.gemini.base.player.GeminiCommonResolverParams$Scene, com.bilibili.ship.theseus.united.page.view.d, mv0.a, java.util.Map, boolean, com.bilibili.ship.theseus.united.bean.f):com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams");
        }
    }

    @Inject
    public UGCSupplementService(@NotNull CoroutineScope coroutineScope, @NotNull Flow<l> flow, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull C8043a c8043a, @NotNull PageBackgroundPlayRepository pageBackgroundPlayRepository, @NotNull t tVar, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull List<Av0.a> list, @NotNull wv0.a aVar2, @NotNull PageReportService pageReportService, @Nullable com.bilibili.ship.theseus.united.bean.f fVar) {
        this.f98088a = coroutineScope;
        this.f98089b = flow;
        this.f98090c = aVar;
        this.f98091d = c8043a;
        this.f98092e = pageBackgroundPlayRepository;
        this.f98093f = tVar;
        this.f98094g = dVar;
        this.h = list;
        this.f98095i = aVar2;
        this.f98096j = pageReportService;
        this.f98097k = fVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
