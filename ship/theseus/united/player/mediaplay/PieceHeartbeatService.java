package com.bilibili.ship.theseus.united.player.mediaplay;

import J1.z;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.keel.player.c;
import java.util.Map;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.report.heartbeat.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/PieceHeartbeatService.class */
@StabilityInferred(parameters = 0)
public final class PieceHeartbeatService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.videopiece.b f104501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Mi1.a f104502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.j f104503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public com.bilibili.ship.theseus.keel.player.q<?> f104504d;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.PieceHeartbeatService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/PieceHeartbeatService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PieceHeartbeatService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.PieceHeartbeatService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/PieceHeartbeatService$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PieceHeartbeatService f104505a;

            public a(PieceHeartbeatService pieceHeartbeatService) {
                this.f104505a = pieceHeartbeatService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Unit unit;
                com.bilibili.ship.theseus.keel.player.q<?> qVar = (com.bilibili.ship.theseus.keel.player.q) obj;
                if (qVar == null) {
                    unit = Unit.INSTANCE;
                } else {
                    PieceHeartbeatService pieceHeartbeatService = this.f104505a;
                    pieceHeartbeatService.getClass();
                    StringBuilder sb = new StringBuilder("new piece avid: ");
                    long j7 = qVar.f91141b;
                    sb.append(j7);
                    sb.append(", cid: ");
                    long j8 = qVar.f91142c;
                    sb.append(j8);
                    sb.append(" hasStickerPieces:");
                    boolean z6 = qVar.f91143d;
                    sb.append(z6);
                    defpackage.a.b("[theseus-united-PieceHeartbeatService-onNewPiece] ", sb.toString(), "PieceHeartbeatService-onNewPiece");
                    if (z6) {
                        com.bilibili.ship.theseus.keel.player.q<?> qVar2 = pieceHeartbeatService.f104504d;
                        Mi1.a aVar = pieceHeartbeatService.f104502b;
                        if (qVar2 != null && qVar2.f91141b != j7) {
                            aVar.m0();
                        }
                        Video.ReportCommonParams reportCommonParams = pieceHeartbeatService.f104503c.f().getReportCommonParams();
                        if (reportCommonParams == null) {
                            BLog.e("PieceHeartbeatService-onNewPiece", "[theseus-united-PieceHeartbeatService-onNewPiece] piece report error", (Throwable) null);
                        } else {
                            long avid = reportCommonParams.getAvid();
                            reportCommonParams.setReportStrategy(a.b.a);
                            if (!(qVar.f91146g instanceof c.C0674c)) {
                                com.bilibili.ship.theseus.keel.player.d dVar = qVar.f91145f;
                                if (dVar != null) {
                                    reportCommonParams.setType(dVar.f91092a);
                                    reportCommonParams.setPlayType(String.valueOf(dVar.f91093b));
                                    reportCommonParams.setSubType(dVar.f91094c);
                                    reportCommonParams.setEpStatus(String.valueOf(dVar.f91095d));
                                    reportCommonParams.setSeasonId(dVar.f91096e);
                                    reportCommonParams.setEpId(String.valueOf(dVar.f91097f));
                                }
                                reportCommonParams.setAvid(j7);
                                reportCommonParams.setCid(j8);
                            }
                            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                            mapCreateMapBuilder.put("attached_avid", String.valueOf(avid));
                            Map legacyExtra = reportCommonParams.getLegacyExtra();
                            if (legacyExtra != null) {
                                mapCreateMapBuilder.putAll(legacyExtra);
                            }
                            reportCommonParams.setLegacyExtra(MapsKt.build(mapCreateMapBuilder));
                            aVar.c0(reportCommonParams);
                            StringBuilder sb2 = new StringBuilder("piece report avid: ");
                            sb2.append(j7);
                            z.a(j8, ", cid: ", " attachAvid:", sb2);
                            sb2.append(avid);
                            defpackage.a.b("[theseus-united-PieceHeartbeatService-onNewPiece] ", sb2.toString(), "PieceHeartbeatService-onNewPiece");
                        }
                    }
                    pieceHeartbeatService.f104504d = qVar;
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PieceHeartbeatService pieceHeartbeatService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = pieceHeartbeatService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
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
                PieceHeartbeatService pieceHeartbeatService = this.this$0;
                MutableStateFlow<com.bilibili.ship.theseus.keel.player.q<?>> mutableStateFlow = pieceHeartbeatService.f104501a.f103682a;
                a aVar = new a(pieceHeartbeatService);
                this.label = 1;
                if (mutableStateFlow.collect(aVar, this) == coroutine_suspended) {
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

    @Inject
    public PieceHeartbeatService(@NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.united.page.videopiece.b bVar, @NotNull Mi1.a aVar, @NotNull com.bilibili.ship.theseus.keel.player.j jVar) {
        this.f104501a = bVar;
        this.f104502b = aVar;
        this.f104503c = jVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
