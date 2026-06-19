package com.bilibili.ship.theseus.united.page.intro.module.liveorder;

import Se.p;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.bus.Violet;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.playerbizcommon.live.VideoLiveStateMessage;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.send.VideoDetailStateChange;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;
import y11.A;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/liveorder/DetailReserveService.class */
@StabilityInferred(parameters = 0)
public final class DetailReserveService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f100493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final rW0.a<IntroRecycleViewService> f100494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PageReportService f100495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f100496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f100497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f100498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f100499g;

    @Inject
    public DetailReserveService(@NotNull FragmentActivity fragmentActivity, @NotNull rW0.a<IntroRecycleViewService> aVar, @NotNull PageReportService pageReportService, @NotNull IInteractLayerService iInteractLayerService, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull BiliAccounts biliAccounts) {
        this.f100493a = fragmentActivity;
        this.f100494b = aVar;
        this.f100495c = pageReportService;
        this.f100496d = iInteractLayerService;
        this.f100497e = dVar;
        this.f100498f = introContentSizeRepository;
        this.f100499g = biliAccounts;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.united.page.intro.module.liveorder.l r6, com.bilibili.ship.theseus.united.page.intro.module.liveorder.DetailReserveService r7, kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.liveorder.DetailReserveService.a(com.bilibili.ship.theseus.united.page.intro.module.liveorder.l, com.bilibili.ship.theseus.united.page.intro.module.liveorder.DetailReserveService, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void b(f fVar, DetailReserveService detailReserveService, boolean z6) {
        VideoDetailStateChange.ReserveState reserveState = new VideoDetailStateChange.ReserveState();
        reserveState.setId(String.valueOf(fVar.f100516a));
        reserveState.setState(Boolean.valueOf(fVar.f100519d));
        reserveState.setType(2);
        VideoDetailStateChange.Request request = new VideoDetailStateChange.Request();
        request.setReserveState(reserveState);
        IRemoteHandler remoteHandler = detailReserveService.f100496d.getRemoteHandler();
        if (remoteHandler != null) {
            remoteHandler.onVideoDetailStateChanged(request);
        }
        if (z6) {
            Violet.INSTANCE.sendMsg(new VideoLiveStateMessage(fVar.f100516a, fVar.f100519d));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.bilibili.ship.theseus.united.page.intro.module.liveorder.l r6, com.bilibili.ship.theseus.united.page.intro.module.liveorder.DetailReserveService r7, kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.liveorder.DetailReserveService.c(com.bilibili.ship.theseus.united.page.intro.module.liveorder.l, com.bilibili.ship.theseus.united.page.intro.module.liveorder.DetailReserveService, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void d(DetailReserveService detailReserveService, boolean z6) {
        detailReserveService.getClass();
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("spmid", "player.player.dm-order.0");
        mapCreateMapBuilder.put("action_type", z6 ? "order" : "cancel_order");
        Unit unit = Unit.INSTANCE;
        PageReportService.g(detailReserveService.f100495c, " community.public-community.appoint-calendar.add.click", MapsKt.build(mapCreateMapBuilder), 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(androidx.fragment.app.FragmentActivity r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.liveorder.DetailReserveService.e(androidx.fragment.app.FragmentActivity, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.bilibili.ship.theseus.united.page.intro.module.liveorder.h] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.bilibili.ship.theseus.united.page.intro.module.liveorder.g] */
    @NotNull
    public final RunningUIComponent f(@NotNull f fVar) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.valueOf(fVar.f100519d));
        return new RunningUIComponent(new e(fVar.f100517b, MutableStateFlow, this.f100498f.f100020a, new Function0(booleanRef2, 0, this, fVar) { // from class: com.bilibili.ship.theseus.united.page.intro.module.liveorder.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f100521a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f100522b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f100523c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Object f100524d;

            {
                this.f100521a = i;
                this.f100522b = booleanRef2;
                this.f100523c = this;
                this.f100524d = fVar;
            }

            public final Object invoke() {
                Unit unit;
                Object obj = this.f100524d;
                Object obj2 = this.f100523c;
                Object obj3 = this.f100522b;
                switch (this.f100521a) {
                    case 0:
                        Ref.BooleanRef booleanRef3 = (Ref.BooleanRef) obj3;
                        if (booleanRef3.element) {
                            unit = Unit.INSTANCE;
                        } else {
                            booleanRef3.element = true;
                            PageReportService pageReportService = ((DetailReserveService) obj2).f100495c;
                            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                            f fVar2 = (f) obj;
                            mapCreateMapBuilder.put("button_type", fVar2.f100519d ? "1" : "0");
                            mapCreateMapBuilder.put("reserve_id", String.valueOf(fVar2.f100516a));
                            mapCreateMapBuilder.put("business", fVar2.f100518c);
                            Unit unit2 = Unit.INSTANCE;
                            PageReportService.i(pageReportService, "united.player-video-detail.reserve-bar.0.show", MapsKt.build(mapCreateMapBuilder), 4);
                            unit = Unit.INSTANCE;
                        }
                        return unit;
                    default:
                        ((Function0) obj3).invoke();
                        ((Function1) obj2).invoke((A) obj);
                        return Unit.INSTANCE;
                }
            }
        }, new p(2, this, fVar), new Function0(fVar, this, booleanRef, MutableStateFlow) { // from class: com.bilibili.ship.theseus.united.page.intro.module.liveorder.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DetailReserveService f100525a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Ref.BooleanRef f100526b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final f f100527c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final MutableStateFlow f100528d;

            {
                this.f100525a = this;
                this.f100526b = booleanRef;
                this.f100527c = fVar;
                this.f100528d = MutableStateFlow;
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x0114  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instruction units count: 418
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.liveorder.h.invoke():java.lang.Object");
            }
        }), 0, new DetailReserveService$create$4(fVar, MutableStateFlow, this, null), 2);
    }
}
