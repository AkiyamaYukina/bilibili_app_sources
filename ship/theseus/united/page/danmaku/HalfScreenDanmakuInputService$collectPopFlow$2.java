package com.bilibili.ship.theseus.united.page.danmaku;

import android.util.Log;
import com.bapis.bilibili.community.service.dm.v1.BubbleV2;
import com.bapis.bilibili.community.service.dm.v1.DmViewReply;
import com.bilibili.app.gemini.player.widget.danmaku.d;
import com.bilibili.app.gemini.player.widget.danmaku.h;
import com.bilibili.bililive.room.ui.commerce.LiveRoomAdBizServiceImpl;
import com.bilibili.gripper.api.ad.biz.following.PositionEvent;
import com.bilibili.gripper.api.ad.core.report.UIExtraParams;
import com.bilibili.lib.laya.telemetry.d;
import com.bilibili.playerbizcommonv2.danmaku.input.widget.PlayerDanmakuExpressionView;
import com.bilibili.playerbizcommonv2.service.DanmakuInputWindowService;
import com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$collectPopFlow$2.class */
final class HalfScreenDanmakuInputService$collectPopFlow$2 extends SuspendLambda implements Function2<HalfScreenDanmakuInputService.a, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final HalfScreenDanmakuInputService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$collectPopFlow$2$a.class */
    public static final class a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HalfScreenDanmakuInputService f99497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BubbleV2 f99498b;

        public a(HalfScreenDanmakuInputService halfScreenDanmakuInputService, BubbleV2 bubbleV2) {
            this.f99497a = halfScreenDanmakuInputService;
            this.f99498b = bubbleV2;
        }

        public final void a() {
            this.f99497a.f99456f.putBoolean("danmaku_recommend_bubble_show", true);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean c() {
            /*
                r4 = this;
                r0 = r4
                com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService r0 = r0.f99497a
                r9 = r0
                r0 = r9
                java.lang.Class r0 = r0.getClass()
                r0 = r4
                com.bapis.bilibili.community.service.dm.v1.BubbleV2 r0 = r0.f99498b
                r10 = r0
                r0 = r10
                boolean r0 = r0.getExposureOnce()
                r8 = r0
                r0 = 0
                r7 = r0
                r0 = r7
                r6 = r0
                r0 = r8
                if (r0 == 0) goto L75
                r0 = r10
                com.bapis.bilibili.community.service.dm.v1.ExposureType r0 = r0.getExposureType()
                r10 = r0
                r0 = r10
                if (r0 != 0) goto L33
                r0 = -1
                r5 = r0
                goto L3d
            L33:
                int[] r0 = com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService.e.f99500a
                r1 = r10
                int r1 = r1.ordinal()
                r0 = r0[r1]
                r5 = r0
            L3d:
                r0 = r9
                tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService r0 = r0.f99456f
                r9 = r0
                r0 = r5
                r1 = 1
                if (r0 != r1) goto L6a
                r0 = r9
                java.lang.String r1 = "danmaku_danmaku_sent"
                r2 = 0
                boolean r0 = r0.getBoolean(r1, r2)
                if (r0 != 0) goto L65
                r0 = r7
                r6 = r0
                r0 = r9
                java.lang.String r1 = "danmaku_recommend_bubble_show"
                r2 = 0
                boolean r0 = r0.getBoolean(r1, r2)
                if (r0 == 0) goto L75
            L65:
                r0 = 1
                r6 = r0
                goto L75
            L6a:
                r0 = r9
                java.lang.String r1 = "danmaku_recommend_bubble_show"
                r2 = 0
                boolean r0 = r0.getBoolean(r1, r2)
                r6 = r0
            L75:
                r0 = r6
                r1 = 1
                r0 = r0 ^ r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$collectPopFlow$2.a.c():boolean");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HalfScreenDanmakuInputService$collectPopFlow$2(HalfScreenDanmakuInputService halfScreenDanmakuInputService, Continuation<? super HalfScreenDanmakuInputService$collectPopFlow$2> continuation) {
        super(2, continuation);
        this.this$0 = halfScreenDanmakuInputService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HalfScreenDanmakuInputService$collectPopFlow$2 halfScreenDanmakuInputService$collectPopFlow$2 = new HalfScreenDanmakuInputService$collectPopFlow$2(this.this$0, continuation);
        halfScreenDanmakuInputService$collectPopFlow$2.L$0 = obj;
        return halfScreenDanmakuInputService$collectPopFlow$2;
    }

    public final Object invoke(HalfScreenDanmakuInputService.a aVar, Continuation<? super Unit> continuation) {
        return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            HalfScreenDanmakuInputService.a aVar = (HalfScreenDanmakuInputService.a) this.L$0;
            if (aVar instanceof HalfScreenDanmakuInputService.a.C0977a) {
                HalfScreenDanmakuInputService.a.C0977a c0977a = (HalfScreenDanmakuInputService.a.C0977a) aVar;
                BubbleV2 bubbleV2 = c0977a.f99484a;
                HalfScreenDanmakuInputService halfScreenDanmakuInputService = this.this$0;
                a aVar2 = new a(halfScreenDanmakuInputService, bubbleV2);
                h.a aVar3 = new h.a();
                aVar3.a = bubbleV2;
                aVar3.b = c0977a.f99485b;
                aVar3.f = ScreenModeType.THUMB;
                aVar3.c = aVar2;
                aVar3.e = 500L;
                aVar3.d = new Pair(Boxing.boxInt((-45) - (Sq0.a.b(bubbleV2.getText()) * 5)), Boxing.boxInt(-33));
                halfScreenDanmakuInputService.f99445G = aVar3.a();
                com.bilibili.app.gemini.player.widget.danmaku.h hVar = this.this$0.f99445G;
                if (hVar != null) {
                    hVar.b();
                }
            } else {
                if (!(aVar instanceof HalfScreenDanmakuInputService.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                final HalfScreenDanmakuInputService halfScreenDanmakuInputService2 = this.this$0;
                HalfScreenDanmakuInputService.a.b bVar = (HalfScreenDanmakuInputService.a.b) aVar;
                this.label = 1;
                DmViewReply dmViewReply = (DmViewReply) halfScreenDanmakuInputService2.f99458i.f99379p.getValue();
                com.bilibili.playerbizcommonv2.danmaku.input.g gVarC = halfScreenDanmakuInputService2.c();
                String str = bVar.f99486a;
                PlayerDanmakuExpressionView.a aVar4 = new PlayerDanmakuExpressionView.a(new E90.c(dmViewReply, 7), new E90.d(halfScreenDanmakuInputService2, 4), new Ax.v(halfScreenDanmakuInputService2, 3), new v(halfScreenDanmakuInputService2, 0));
                int number = bVar.f99488c.getNumber();
                DanmakuInputWindowService danmakuInputWindowService = halfScreenDanmakuInputService2.f99467r;
                gVarC.f80997i = new qr0.d(dmViewReply, str, aVar4, bVar.f99487b, number, danmakuInputWindowService.f81800k, danmakuInputWindowService.f81801l, danmakuInputWindowService.f81802m, danmakuInputWindowService.f81803n, 8);
                IRemoteHandler remoteHandler = halfScreenDanmakuInputService2.f99469t.getRemoteHandler();
                if (remoteHandler != null) {
                    final int i8 = 0;
                    remoteHandler.getChronosCommandDanmakus(new Function1(halfScreenDanmakuInputService2, i8) { // from class: com.bilibili.ship.theseus.united.page.danmaku.w

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f99557a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f99558b;

                        {
                            this.f99557a = i8;
                            this.f99558b = halfScreenDanmakuInputService2;
                        }

                        public final Object invoke(Object obj2) {
                            switch (this.f99557a) {
                                case 0:
                                    ((HalfScreenDanmakuInputService) this.f99558b).c().f81000l = (List) obj2;
                                    break;
                                case 1:
                                    try {
                                        com.bilibili.lib.laya.telemetry.f.c.d((kb0.g) this.f99558b, (d.b) obj2);
                                    } catch (Throwable th) {
                                        Log.w("TelemetryService", "sink dispatch failed: " + th);
                                    }
                                    break;
                                case 2:
                                    ((Integer) obj2).getClass();
                                    LiveRoomAdBizServiceImpl liveRoomAdBizServiceImpl = (LiveRoomAdBizServiceImpl) this.f99558b;
                                    if (((dG.c) liveRoomAdBizServiceImpl).b.a.getLiveStatus() == 0) {
                                        liveRoomAdBizServiceImpl.M(2, liveRoomAdBizServiceImpl.g, false);
                                    }
                                    break;
                                default:
                                    ((UIExtraParams) obj2).SUBSCRIBED_UP_ID(String.valueOf(((PositionEvent) this.f99558b).getBeConcernedUpId()));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                }
                Object objA = com.bilibili.playerbizcommonv2.danmaku.input.h.a(halfScreenDanmakuInputService2.c(), this);
                if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objA = Unit.INSTANCE;
                }
                if (objA == coroutine_suspended) {
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
