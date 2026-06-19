package com.bilibili.ship.theseus.ugc.charge;

import N1.p;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.playerunite.ugcanymodel.UGCAnyModel;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.moss.util.any.AnyKt;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.united.page.ad.PageAdRepository;
import com.bilibili.ship.theseus.united.page.ad.i;
import com.bilibili.ship.theseus.united.page.charge.ChargeRepository;
import com.google.protobuf.InvalidProtocolBufferException;
import ev0.InterfaceC7008a;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ChargeIAAService.class */
@StabilityInferred(parameters = 0)
public final class ChargeIAAService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f96392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ChargeRepository f96393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Flow<PlayViewUniteReply> f96394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PageAdRepository f96395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IReporterService f96396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final j f96397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C8043a f96398g;

    @NotNull
    public final rW0.a<InterfaceC7008a> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final h f96399i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.comm.charge.api.c f96400j = new com.bilibili.comm.charge.api.c();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<com.bilibili.comm.charge.api.b> f96401k = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f96402l;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.charge.ChargeIAAService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ChargeIAAService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ChargeIAAService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.charge.ChargeIAAService$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ChargeIAAService$1$3.class */
        public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<i, PlayViewUniteReply, Continuation<? super Pair<? extends i, ? extends PlayViewUniteReply>>, Object>, SuspendFunction {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            public AnonymousClass3() {
                super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object invoke(i iVar, PlayViewUniteReply playViewUniteReply, Continuation<? super Pair<i, PlayViewUniteReply>> continuation) {
                return AnonymousClass1.invokeSuspend$lambda$0(iVar, playViewUniteReply, continuation);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.charge.ChargeIAAService$1$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ChargeIAAService$1$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends i, ? extends PlayViewUniteReply>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final ChargeIAAService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(ChargeIAAService chargeIAAService, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = chargeIAAService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            public final Object invoke(Pair<i, PlayViewUniteReply> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                UGCAnyModel defaultInstance;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Pair pair = (Pair) this.L$0;
                    PlayViewUniteReply playViewUniteReply = (PlayViewUniteReply) pair.getSecond();
                    if (playViewUniteReply == null) {
                        ChargeIAAService.c(this.this$0, null, null, null, "reply_null", 30);
                        return Unit.INSTANCE;
                    }
                    i iVar = (i) pair.getFirst();
                    long j7 = iVar.f98966b;
                    long aid = playViewUniteReply.getPlayArc().getAid();
                    long j8 = iVar.f98966b;
                    long j9 = iVar.f98965a;
                    if (j7 != aid) {
                        ChargeIAAService.c(this.this$0, Boxing.boxLong(j8), Boxing.boxLong(playViewUniteReply.getPlayArc().getAid()), Boxing.boxLong(j9), "avid_mismatch", 16);
                        return Unit.INSTANCE;
                    }
                    ChargeIAAService chargeIAAService = this.this$0;
                    chargeIAAService.f96402l = j9;
                    if (j9 == 0) {
                        ChargeIAAService.c(chargeIAAService, Boxing.boxLong(j8), Boxing.boxLong(playViewUniteReply.getPlayArc().getAid()), Boxing.boxLong(j9), "up_mid_zero", 16);
                        return Unit.INSTANCE;
                    }
                    try {
                        defaultInstance = (UGCAnyModel) AnyKt.unpack(playViewUniteReply.getSupplement(), UGCAnyModel.class);
                    } catch (InvalidProtocolBufferException e7) {
                        defaultInstance = UGCAnyModel.getDefaultInstance();
                    }
                    boolean isIaa = defaultInstance.getCharigingExtend().getIsIaa();
                    ChargeIAAService chargeIAAService2 = this.this$0;
                    String str = isIaa ? "load" : "skip";
                    Long lBoxLong = Boxing.boxLong(j8);
                    Long lBoxLong2 = Boxing.boxLong(playViewUniteReply.getPlayArc().getAid());
                    Long lBoxLong3 = Boxing.boxLong(j9);
                    Boolean boolBoxBoolean = Boxing.boxBoolean(isIaa);
                    String str2 = isIaa ? null : "not_iaa";
                    chargeIAAService2.getClass();
                    ChargeIAAService.b(str, lBoxLong, lBoxLong2, lBoxLong3, boolBoxBoolean, str2);
                    if (isIaa) {
                        this.this$0.f96401k.setValue(new com.bilibili.comm.charge.api.b(playViewUniteReply.getPlayArc().getIsPreview(), DurationKt.toDuration(defaultInstance.getCharigingExtend().getAdUnlockTimeOnce(), DurationUnit.SECONDS), defaultInstance.getCharigingExtend().getFullScreenPanelLink(), (String) null, DurationKt.toDuration(playViewUniteReply.getPlayArc().getWatchTimeLength(), DurationUnit.MILLISECONDS)));
                        ChargeIAAService chargeIAAService3 = this.this$0;
                        com.bilibili.comm.charge.api.c cVar = chargeIAAService3.f96400j;
                        String session = chargeIAAService3.f96396e.getSession();
                        long avid = this.this$0.f96397f.f().getAvid();
                        ChargeIAAService chargeIAAService4 = this.this$0;
                        long j10 = chargeIAAService4.f96402l;
                        String str3 = chargeIAAService4.f96398g.a().f123880b;
                        String str4 = this.this$0.f96398g.a().f123881c;
                        PageAdRepository pageAdRepository = this.this$0.f96395d;
                        String str5 = pageAdRepository.f98946j;
                        String str6 = pageAdRepository.f98947k;
                        this.label = 1;
                        if (cVar.a(session, avid, j10, str3, str4, str5, str6, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ((Result) obj).unbox-impl();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChargeIAAService chargeIAAService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = chargeIAAService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(i iVar, PlayViewUniteReply playViewUniteReply, Continuation continuation) {
            return new Pair(iVar, playViewUniteReply);
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
                ChargeIAAService chargeIAAService = this.this$0;
                Flow flowCombine = FlowKt.combine(chargeIAAService.f96395d.f98950n, chargeIAAService.f96394c, AnonymousClass3.INSTANCE);
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass4, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.charge.ChargeIAAService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ChargeIAAService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ChargeIAAService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.charge.ChargeIAAService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ChargeIAAService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final ChargeIAAService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ChargeIAAService chargeIAAService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = chargeIAAService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    com.bilibili.comm.charge.api.b bVar = (com.bilibili.comm.charge.api.b) this.this$0.f96401k.getValue();
                    if (bVar != null) {
                        ChargeIAAService chargeIAAService = this.this$0;
                        ChargeRepository chargeRepository = chargeIAAService.f96393b;
                        ChargeIAAService$2$1$1$1 chargeIAAService$2$1$1$1 = new ChargeIAAService$2$1$1$1(chargeIAAService, bVar, null);
                        this.label = 1;
                        if (chargeRepository.a(chargeIAAService$2$1$1$1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ChargeIAAService chargeIAAService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = chargeIAAService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ChargeIAAService chargeIAAService = this.this$0;
                SharedFlow<Unit> sharedFlow = chargeIAAService.f96393b.f99154g;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(chargeIAAService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

    @Inject
    public ChargeIAAService(@NotNull CoroutineScope coroutineScope, @NotNull ChargeRepository chargeRepository, @NotNull Flow<PlayViewUniteReply> flow, @NotNull PageAdRepository pageAdRepository, @NotNull IReporterService iReporterService, @NotNull j jVar, @NotNull C8043a c8043a, @NotNull rW0.a<InterfaceC7008a> aVar, @NotNull h hVar) {
        this.f96392a = coroutineScope;
        this.f96393b = chargeRepository;
        this.f96394c = flow;
        this.f96395d = pageAdRepository;
        this.f96396e = iReporterService;
        this.f96397f = jVar;
        this.f96398g = c8043a;
        this.h = aVar;
        this.f96399i = hVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }

    public static final void a(ChargeIAAService chargeIAAService) {
        j jVar = chargeIAAService.f96397f;
        Map extraJsonParams = jVar.f().getExtraJsonParams();
        String str = extraJsonParams != null ? (String) extraJsonParams.get("player_report_json") : null;
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("spm_id", chargeIAAService.f96398g.a().f123880b);
        mapCreateMapBuilder.put(GameCardButton.extraAvid, String.valueOf(jVar.f().getAvid()));
        mapCreateMapBuilder.put("up_mid", String.valueOf(chargeIAAService.f96402l));
        if (str != null) {
            mapCreateMapBuilder.put("player_report_json", str);
        }
        String str2 = chargeIAAService.f96395d.f98946j;
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        mapCreateMapBuilder.put("ad_track_id", str3);
        chargeIAAService.f96396e.report(new NeuronsEvents.b("player.player.charge-unlock-success.click.player", MapsKt.build(mapCreateMapBuilder)));
    }

    public static void b(String str, Long l7, Long l8, Long l9, Boolean bool, String str2) {
        StringBuilder sbB = p.b("IAA_DECISION | action=", str);
        if (l7 != null) {
            long jLongValue = l7.longValue();
            sbB.append(" view_avid=");
            sbB.append(jLongValue);
        }
        if (l8 != null) {
            long jLongValue2 = l8.longValue();
            sbB.append(" play_aid=");
            sbB.append(jLongValue2);
        }
        if (l9 != null) {
            long jLongValue3 = l9.longValue();
            sbB.append(" upper_mid=");
            sbB.append(jLongValue3);
        }
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            sbB.append(" is_iaa=");
            sbB.append(zBooleanValue);
        }
        if (str2 != null) {
            sbB.append(" reason=");
            sbB.append(str2);
        }
        BLog.i("ChargeIAAService", sbB.toString());
    }

    public static /* synthetic */ void c(ChargeIAAService chargeIAAService, Long l7, Long l8, Long l9, String str, int i7) {
        if ((i7 & 2) != 0) {
            l7 = null;
        }
        if ((i7 & 4) != 0) {
            l8 = null;
        }
        if ((i7 & 8) != 0) {
            l9 = null;
        }
        chargeIAAService.getClass();
        b("skip", l7, l8, l9, null, str);
    }
}
