package com.bilibili.ship.theseus.ugc.charge;

import K3.o;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.z;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.BizType;
import com.bilibili.ship.theseus.ugc.play.schedule.PlaybackMode;
import com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository;
import com.bilibili.ship.theseus.united.page.background.e;
import com.bilibili.ship.theseus.united.page.charge.ChargeRepository;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.k;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ChargeMediaService.class */
@StabilityInferred(parameters = 0)
public final class ChargeMediaService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f96403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ChargeRepository f96404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Flow<PlayViewUniteReply> f96405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PageBackgroundPlayRepository f96406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final k f96407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f96408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final e f96409g;

    @NotNull
    public final Lazy h = LazyKt.lazy(new o(6));

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.charge.ChargeMediaService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ChargeMediaService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ChargeMediaService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.charge.ChargeMediaService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ChargeMediaService$1$1.class */
        public static final class C08181 extends SuspendLambda implements Function2<PlayViewUniteReply, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final ChargeMediaService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08181(ChargeMediaService chargeMediaService, Continuation<? super C08181> continuation) {
                super(2, continuation);
                this.this$0 = chargeMediaService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C08181 c08181 = new C08181(this.this$0, continuation);
                c08181.L$0 = obj;
                return c08181;
            }

            public final Object invoke(PlayViewUniteReply playViewUniteReply, Continuation<? super Unit> continuation) {
                return create(playViewUniteReply, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                com.bilibili.ship.theseus.united.page.background.a next;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PlayViewUniteReply playViewUniteReply = (PlayViewUniteReply) this.L$0;
                if (playViewUniteReply == null) {
                    return Unit.INSTANCE;
                }
                ChargeRepository chargeRepository = this.this$0.f96404b;
                boolean isPreview = playViewUniteReply.getPlayArc().getIsPreview();
                chargeRepository.getClass();
                BLog.i("[ChargeBloc]", "charge is preview " + isPreview);
                chargeRepository.f99160n.setValue(Integer.valueOf(isPreview ? 1 : 0));
                ChargeMediaService chargeMediaService = this.this$0;
                if (((Boolean) chargeMediaService.h.getValue()).booleanValue() && playViewUniteReply.getPlayArc().getVideoType() == BizType.BIZ_TYPE_UGC) {
                    PlaybackMode.a aVar = PlaybackMode.Companion;
                    int i7 = chargeMediaService.f96408f.getInt(com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
                    aVar.getClass();
                    boolean z6 = PlaybackMode.a.a(i7) != PlaybackMode.PAUSE_WHEN_ENDED;
                    boolean z7 = false;
                    if (!playViewUniteReply.getPlayArc().getIsPreview()) {
                        z7 = false;
                        if (!playViewUniteReply.getVodInfo().getStreamListList().isEmpty()) {
                            z7 = true;
                        }
                    }
                    long aid = playViewUniteReply.getPlayArc().getAid();
                    long cid = playViewUniteReply.getPlayArc().getCid();
                    boolean isPreview2 = playViewUniteReply.getPlayArc().getIsPreview();
                    boolean zIsEmpty = playViewUniteReply.getVodInfo().getStreamListList().isEmpty();
                    StringBuilder sbA = z.a(aid, "autoPlayNextIfNeed UGC  aid: ", " cid: ");
                    com.bilibili.bplus.followingpublish.fragments.publish.c.a(cid, "  enable: ", sbA, z7);
                    sbA.append(" isPreview: ");
                    sbA.append(isPreview2);
                    sbA.append(" streamListList empty: ");
                    sbA.append(zIsEmpty);
                    BLog.i("ChargeMediaService-skipUnChargedVideoIfNeed", "[theseus-ugc-ChargeMediaService-skipUnChargedVideoIfNeed] " + sbA.toString());
                    long aid2 = playViewUniteReply.getPlayArc().getAid();
                    long cid2 = playViewUniteReply.getPlayArc().getCid();
                    PageBackgroundPlayRepository pageBackgroundPlayRepository = chargeMediaService.f96406d;
                    Iterator<com.bilibili.ship.theseus.united.page.background.a> it = pageBackgroundPlayRepository.f98999i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        com.bilibili.ship.theseus.united.page.background.a aVar2 = next;
                        if (aVar2.f99036a == aid2 && aVar2.f99037b == cid2) {
                            break;
                        }
                    }
                    com.bilibili.ship.theseus.united.page.background.a aVar3 = next;
                    if (aVar3 != null) {
                        aVar3.f99039d = z7;
                    }
                    if (playViewUniteReply.getPlayArc().getIsPreview() && pageBackgroundPlayRepository.d()) {
                        boolean z8 = chargeMediaService.f96409g.f99044d;
                        k kVar = chargeMediaService.f96407e;
                        if (z8) {
                            if (kVar.hasNext(z6)) {
                                kVar.switchToNext(z6);
                            }
                        } else if (kVar.hasPrevious(z6)) {
                            kVar.switchToPrevious(z6);
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChargeMediaService chargeMediaService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = chargeMediaService;
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
                ChargeMediaService chargeMediaService = this.this$0;
                Flow<PlayViewUniteReply> flow = chargeMediaService.f96405c;
                C08181 c08181 = new C08181(chargeMediaService, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c08181, this) == coroutine_suspended) {
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
    public ChargeMediaService(@NotNull CoroutineScope coroutineScope, @NotNull ChargeRepository chargeRepository, @NotNull Flow<PlayViewUniteReply> flow, @NotNull PageBackgroundPlayRepository pageBackgroundPlayRepository, @NotNull k kVar, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull e eVar) {
        this.f96403a = coroutineScope;
        this.f96404b = chargeRepository;
        this.f96405c = flow;
        this.f96406d = pageBackgroundPlayRepository;
        this.f96407e = kVar;
        this.f96408f = iPlayerSettingService;
        this.f96409g = eVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
