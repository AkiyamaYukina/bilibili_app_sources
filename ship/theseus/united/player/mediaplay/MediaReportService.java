package com.bilibili.ship.theseus.united.player.mediaplay;

import Li1.c;
import Li1.d;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.media.resource.PlayIndex;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.player.tangram.playercore.A;
import com.bilibili.playerbizcommonv2.widget.quality.l0;
import com.bilibili.ship.theseus.keel.player.c;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.DisplayOrientation;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreServiceKtxKt;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaReportService.class */
@StabilityInferred(parameters = 0)
public final class MediaReportService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f104494a;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.MediaReportService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaReportService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final com.bilibili.ship.theseus.united.page.videopiece.b $pieceRepository;
        final com.bilibili.ship.theseus.keel.player.j $playable;
        final IPlayerCoreService $playerCoreService;
        final IReporterService $reportService;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.MediaReportService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaReportService$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IReporterService f104495a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final com.bilibili.ship.theseus.united.page.videopiece.b f104496b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final IPlayerCoreService f104497c;

            public a(IReporterService iReporterService, com.bilibili.ship.theseus.united.page.videopiece.b bVar, IPlayerCoreService iPlayerCoreService) {
                this.f104495a = iReporterService;
                this.f104496b = bVar;
                this.f104497c = iPlayerCoreService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Li1.b bVar;
                GeminiCommonPlayableParams geminiCommonPlayableParams = (GeminiCommonPlayableParams) obj;
                Video.ReportCommonParams reportCommonParams = geminiCommonPlayableParams.getReportCommonParams();
                if (reportCommonParams != null) {
                    long avid = reportCommonParams.getAvid();
                    long cid = !Intrinsics.areEqual(geminiCommonPlayableParams.getFrom(), "live") ? reportCommonParams.getCid() : reportCommonParams.getRoomId();
                    long seasonId = reportCommonParams.getSeasonId();
                    String epId = reportCommonParams.getEpId();
                    String fromSpmid = reportCommonParams.getFromSpmid();
                    String spmid = reportCommonParams.getSpmid();
                    int type = reportCommonParams.getType();
                    int subType = reportCommonParams.getSubType();
                    String trackId = reportCommonParams.getTrackId();
                    boolean z6 = geminiCommonPlayableParams.getDisplayParams().getDisplayOrientation() == DisplayOrientation.VERTICAL;
                    Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                    c.a aVar = c.a.a;
                    final com.bilibili.ship.theseus.united.page.videopiece.b bVar2 = this.f104496b;
                    final IPlayerCoreService iPlayerCoreService = this.f104497c;
                    bVar = new Li1.b(avid, cid, seasonId, epId, fromSpmid, spmid, type, subType, trackId, z6, (Li1.d) null, boolBoxBoolean, aVar, new Function0(bVar2, iPlayerCoreService) { // from class: com.bilibili.ship.theseus.united.player.mediaplay.k

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final com.bilibili.ship.theseus.united.page.videopiece.b f104525a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final IPlayerCoreService f104526b;

                        {
                            this.f104525a = bVar2;
                            this.f104526b = iPlayerCoreService;
                        }

                        public final Object invoke() {
                            com.bilibili.ship.theseus.keel.player.q qVar = (com.bilibili.ship.theseus.keel.player.q) this.f104525a.f103682a.getValue();
                            return Long.valueOf((qVar == null || !qVar.f91143d || (qVar.f91146g instanceof c.C0674c)) ? this.f104526b.getRealCurrentPosition() : 0L);
                        }
                    });
                } else {
                    bVar = null;
                }
                this.f104495a.notifyVideoChanged(bVar);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.bilibili.ship.theseus.keel.player.j jVar, IReporterService iReporterService, com.bilibili.ship.theseus.united.page.videopiece.b bVar, IPlayerCoreService iPlayerCoreService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$playable = jVar;
            this.$reportService = iReporterService;
            this.$pieceRepository = bVar;
            this.$playerCoreService = iPlayerCoreService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$playable, this.$reportService, this.$pieceRepository, this.$playerCoreService, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<GeminiCommonPlayableParams> stateFlowL = this.$playable.l();
                a aVar = new a(this.$reportService, this.$pieceRepository, this.$playerCoreService);
                this.label = 1;
                if (stateFlowL.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.MediaReportService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaReportService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final IPlayerCoreService $playerCoreService;
        final IReporterService $reportService;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.MediaReportService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaReportService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final IReporterService $reportService;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(IReporterService iReporterService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$reportService = iReporterService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$reportService, continuation);
                anonymousClass1.I$0 = ((Number) obj).intValue();
                return anonymousClass1;
            }

            public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i7 = this.I$0;
                if (i7 == 4) {
                    l0.a("player.player.resume.all.player", null, this.$reportService);
                } else if (i7 == 5) {
                    l0.a("player.player.pause.all.player", null, this.$reportService);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(IPlayerCoreService iPlayerCoreService, IReporterService iReporterService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$playerCoreService = iPlayerCoreService;
            this.$reportService = iReporterService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$playerCoreService, this.$reportService, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowE = IPlayerCoreServiceKtxKt.e(this.$playerCoreService);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$reportService, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowE, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.MediaReportService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaReportService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final com.bilibili.ship.theseus.keel.player.j $playable;
        final IReporterService $reportService;
        int label;
        final MediaReportService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.MediaReportService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaReportService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<A, Continuation<? super Unit>, Object> {
            final IReporterService $reportService;
            Object L$0;
            int label;
            final MediaReportService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MediaReportService mediaReportService, IReporterService iReporterService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = mediaReportService;
                this.$reportService = iReporterService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$reportService, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(A a7, Continuation<? super Unit> continuation) {
                return create(a7, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                A a7 = (A) this.L$0;
                String str = null;
                if (a7 instanceof A.d) {
                    if (!this.this$0.f104494a) {
                        l0.a("player.player.start.all.player", null, this.$reportService);
                        this.this$0.f104494a = true;
                    }
                } else if (a7 instanceof A.a) {
                    MediaResource mediaResource = ((A.a) a7).f79324a.f79460c;
                    IReporterService iReporterService = this.$reportService;
                    d.a aVar = mediaResource.getDashResource() != null ? d.a.a : d.b.a;
                    PlayIndex playIndex = mediaResource.getPlayIndex();
                    if (playIndex != null) {
                        str = playIndex.mFrom;
                    }
                    iReporterService.updateVideoInfo(aVar, Intrinsics.areEqual(str, "downloaded"));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(com.bilibili.ship.theseus.keel.player.j jVar, MediaReportService mediaReportService, IReporterService iReporterService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$playable = jVar;
            this.this$0 = mediaReportService;
            this.$reportService = iReporterService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$playable, this.this$0, this.$reportService, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<A> flowV = this.$playable.v();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$reportService, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowV, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.MediaReportService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaReportService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final com.bilibili.ship.theseus.keel.player.h $player;
        final IReporterService $reportService;
        int label;
        final MediaReportService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.MediaReportService$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaReportService$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Unit>, Object> {
            final IReporterService $reportService;
            Object L$0;
            int label;
            final MediaReportService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.MediaReportService$4$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaReportService$4$1$a.class */
            public static final /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final int[] f104498a;

                static {
                    int[] iArr = new int[PlayerAvailability.values().length];
                    try {
                        iArr[PlayerAvailability.COMPLETED.ordinal()] = 1;
                    } catch (NoSuchFieldError e7) {
                    }
                    f104498a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MediaReportService mediaReportService, IReporterService iReporterService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = mediaReportService;
                this.$reportService = iReporterService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$reportService, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(PlayerAvailability playerAvailability, Continuation<? super Unit> continuation) {
                return create(playerAvailability, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (a.f104498a[((PlayerAvailability) this.L$0).ordinal()] == 1 && this.this$0.f104494a) {
                    this.$reportService.report(new NeuronsEvents.b("player.player.end.all.player", MapsKt.mapOf(TuplesKt.to("end_type", String.valueOf(NeuronsEvents.End.Type.NORMAL.getTypeCode())))));
                    this.this$0.f104494a = false;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(com.bilibili.ship.theseus.keel.player.h hVar, MediaReportService mediaReportService, IReporterService iReporterService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$player = hVar;
            this.this$0 = mediaReportService;
            this.$reportService = iReporterService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$player, this.this$0, this.$reportService, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<PlayerAvailability> mutableStateFlow = this.$player.f91107a.f79286c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$reportService, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.MediaReportService$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaReportService$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final IPlayerCoreService $playerCoreService;
        final IReporterService $reportService;
        int label;
        final MediaReportService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.MediaReportService$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaReportService$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final IReporterService $reportService;
            boolean Z$0;
            int label;
            final MediaReportService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(IReporterService iReporterService, MediaReportService mediaReportService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$reportService = iReporterService;
                this.this$0 = mediaReportService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$reportService, this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.Z$0) {
                    this.$reportService.report(new NeuronsEvents.b("player.player.seek.all.player", MapsKt.mapOf(TuplesKt.to("seek_type", "1"))));
                } else {
                    this.$reportService.report(new NeuronsEvents.b("player.player.seek.all.player", MapsKt.mapOf(TuplesKt.to("seek_type", "2"))));
                    if (!this.this$0.f104494a) {
                        l0.a("player.player.start.all.player", null, this.$reportService);
                        this.this$0.f104494a = true;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(IPlayerCoreService iPlayerCoreService, IReporterService iReporterService, MediaReportService mediaReportService, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.$playerCoreService = iPlayerCoreService;
            this.$reportService = iReporterService;
            this.this$0 = mediaReportService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.$playerCoreService, this.$reportService, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowF = IPlayerCoreServiceKtxKt.f(this.$playerCoreService);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$reportService, this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowF, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.MediaReportService$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaReportService$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final com.bilibili.ship.theseus.keel.player.h $player;
        final IReporterService $reportService;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.MediaReportService$6$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaReportService$6$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Float, Continuation<? super Unit>, Object> {
            final IReporterService $reportService;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(IReporterService iReporterService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$reportService = iReporterService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$reportService, continuation);
            }

            public final Object invoke(float f7, Continuation<? super Unit> continuation) {
                return create(Float.valueOf(f7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).floatValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                l0.a("player.player.switch-speed.0.player", null, this.$reportService);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(com.bilibili.ship.theseus.keel.player.h hVar, IReporterService iReporterService, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.$player = hVar;
            this.$reportService = iReporterService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.$player, this.$reportService, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Float> flowF = this.$player.f91108b.f();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$reportService, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowF, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.MediaReportService$7, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaReportService$7.class */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final IReporterService $reportService;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(IReporterService iReporterService, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.$reportService = iReporterService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass7(this.$reportService, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                this.$reportService.report(new NeuronsEvents.b("player.player.end.all.player", MapsKt.mapOf(TuplesKt.to("end_type", String.valueOf(NeuronsEvents.End.Type.NORMAL.getTypeCode())))));
                throw th;
            }
        }
    }

    @Inject
    public MediaReportService(@NotNull com.bilibili.ship.theseus.keel.player.j jVar, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull IReporterService iReporterService, @NotNull com.bilibili.ship.theseus.united.page.videopiece.b bVar, @NotNull CoroutineScope coroutineScope) {
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(jVar, iReporterService, bVar, iPlayerCoreService, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(iPlayerCoreService, iReporterService, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(jVar, this, iReporterService, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(hVar, this, iReporterService, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(iPlayerCoreService, iReporterService, this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(hVar, iReporterService, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass7(iReporterService, null), 3, (Object) null);
    }
}
