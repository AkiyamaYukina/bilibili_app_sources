package com.bilibili.ship.theseus.cheese.player.play;

import androidx.compose.runtime.internal.StabilityInferred;
import au0.C4911a;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.PlayArc;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.united.bean.b;
import com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.view.d;
import com.bilibili.ship.theseus.united.page.view.t;
import com.bilibili.ship.theseus.united.player.mediaplay.f;
import com.bilibili.ship.theseus.united.player.mediaplay.l;
import com.bilibili.ship.theseus.united.player.mediaplay.m;
import eu0.C6985d;
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
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.Video;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/play/CheeseSupplementService.class */
@StabilityInferred(parameters = 0)
public final class CheeseSupplementService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Flow<l> f90707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final t f90708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final d f90709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<C6985d> f90710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C4911a f90711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final PageBackgroundPlayRepository f90712g;

    @NotNull
    public final wv0.a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final PageReportService f90713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final b f90714j;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.play.CheeseSupplementService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/play/CheeseSupplementService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseSupplementService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.play.CheeseSupplementService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/play/CheeseSupplementService$1$1.class */
        public static final class C06661 extends SuspendLambda implements Function2<l, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final CheeseSupplementService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06661(CheeseSupplementService cheeseSupplementService, Continuation<? super C06661> continuation) {
                super(2, continuation);
                this.this$0 = cheeseSupplementService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06661 c06661 = new C06661(this.this$0, continuation);
                c06661.L$0 = obj;
                return c06661;
            }

            public final Object invoke(l lVar, Continuation<? super Unit> continuation) {
                return create(lVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Map extraJsonParams;
                Map extraJsonParams2;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                l lVar = (l) this.L$0;
                String str = null;
                f fVar = lVar != null ? lVar.f104530d : null;
                if (lVar != null && fVar != null && m.a(fVar)) {
                    Iterator<C6985d> it = this.this$0.f90710e.iterator();
                    int i7 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i7 = -1;
                            break;
                        }
                        if (it.next().f117511f == lVar.f104528b) {
                            break;
                        }
                        i7++;
                    }
                    if (i7 == -1) {
                        return Unit.INSTANCE;
                    }
                    C6985d c6985d = this.this$0.f90710e.get(i7);
                    j jVar = lVar.f104529c;
                    int fromAutoPlay = jVar.f().getFromAutoPlay();
                    String playMode = jVar.f().getPlayMode();
                    String strG = playMode;
                    if (playMode == null) {
                        strG = this.this$0.f90712g.g();
                    }
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    if (!(fVar instanceof f.b)) {
                        boolean z6 = fVar instanceof f.c;
                        if (z6) {
                            PlayViewUniteReply playViewUniteReply = z6 ? ((f.c) fVar).f104516a : null;
                            PlayArc playArc = playViewUniteReply != null ? playViewUniteReply.getPlayArc() : null;
                            if (playArc != null && playArc.hasInteraction()) {
                                Video.b bVar = new Video.b();
                                bVar.a = c6985d.f117510e;
                                bVar.c = playArc.getInteraction().getHistoryNode().getCid();
                                bVar.b = playArc.getInteraction().getHistoryNode().getNodeId();
                                bVar.d = c6985d.f117511f;
                                bVar.e = playArc.getInteraction().getGraphVersion();
                                objectRef.element = bVar;
                            }
                        } else if (!(fVar instanceof f.e)) {
                            BLog.w("CheeseSupplementService$1$1-invokeSuspend", "[theseus-cheese-CheeseSupplementService$1$1-invokeSuspend] cheese suppleService unknown playInitial type", (Throwable) null);
                        }
                    }
                    Map extraJsonParams3 = jVar.f().getExtraJsonParams();
                    String str2 = extraJsonParams3 != null ? (String) extraJsonParams3.get("current_material_no") : null;
                    Map extraJsonParams4 = jVar.f().getExtraJsonParams();
                    if (extraJsonParams4 != null) {
                        str = (String) extraJsonParams4.get("player_report_json");
                    }
                    long j7 = c6985d.f117510e;
                    CheeseSupplementService cheeseSupplementService = this.this$0;
                    GeminiCommonPlayableParams geminiCommonPlayableParamsA = a.a(j7, c6985d.f117511f, i7, c6985d.f117512g, c6985d.f117524t, fromAutoPlay, strG, cheeseSupplementService.f90708c.f104126b.f104087b, (Video.b) objectRef.element, cheeseSupplementService.f90709d, cheeseSupplementService.f90711f, c6985d.f117521q, c6985d.f117523s, cheeseSupplementService.h.f129026b, cheeseSupplementService.f90713i.f102492e, fVar instanceof f.a, cheeseSupplementService.f90714j.f98750l);
                    if (geminiCommonPlayableParamsA.getExtraJsonParams() == null) {
                        geminiCommonPlayableParamsA.setExtraJsonParams(new LinkedHashMap());
                    }
                    if (str2 != null && (extraJsonParams2 = geminiCommonPlayableParamsA.getExtraJsonParams()) != null) {
                    }
                    if (str != null && (extraJsonParams = geminiCommonPlayableParamsA.getExtraJsonParams()) != null) {
                    }
                    jVar.j(geminiCommonPlayableParamsA);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseSupplementService cheeseSupplementService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseSupplementService;
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
                CheeseSupplementService cheeseSupplementService = this.this$0;
                Flow<l> flow = cheeseSupplementService.f90707b;
                C06661 c06661 = new C06661(cheeseSupplementService, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c06661, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/play/CheeseSupplementService$a.class */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:15:0x00e4  */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams a(long r5, long r7, int r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.Nullable java.lang.String r11, int r12, @org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.Nullable com.bilibili.ship.theseus.united.page.view.p r14, @org.jetbrains.annotations.Nullable tv.danmaku.biliplayerv2.service.Video.b r15, @org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.page.view.d r16, @org.jetbrains.annotations.NotNull au0.C4911a r17, long r18, @org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.bean.VideoDimension r20, @org.jetbrains.annotations.NotNull com.bilibili.app.gemini.base.player.GeminiCommonResolverParams.Scene r21, @org.jetbrains.annotations.NotNull java.util.Map r22, boolean r23, @org.jetbrains.annotations.Nullable com.bilibili.ship.theseus.united.bean.a r24) {
            /*
                Method dump skipped, instruction units count: 558
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.player.play.CheeseSupplementService.a.a(long, long, int, java.lang.String, java.lang.String, int, java.lang.String, com.bilibili.ship.theseus.united.page.view.p, tv.danmaku.biliplayerv2.service.Video$b, com.bilibili.ship.theseus.united.page.view.d, au0.a, long, com.bilibili.ship.theseus.united.bean.VideoDimension, com.bilibili.app.gemini.base.player.GeminiCommonResolverParams$Scene, java.util.Map, boolean, com.bilibili.ship.theseus.united.bean.a):com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams");
        }
    }

    @Inject
    public CheeseSupplementService(@NotNull CoroutineScope coroutineScope, @NotNull Flow<l> flow, @NotNull t tVar, @NotNull d dVar, @NotNull List<C6985d> list, @NotNull C4911a c4911a, @NotNull PageBackgroundPlayRepository pageBackgroundPlayRepository, @NotNull wv0.a aVar, @NotNull PageReportService pageReportService, @NotNull b bVar) {
        this.f90706a = coroutineScope;
        this.f90707b = flow;
        this.f90708c = tVar;
        this.f90709d = dVar;
        this.f90710e = list;
        this.f90711f = c4911a;
        this.f90712g = pageBackgroundPlayRepository;
        this.h = aVar;
        this.f90713i = pageReportService;
        this.f90714j = bVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
