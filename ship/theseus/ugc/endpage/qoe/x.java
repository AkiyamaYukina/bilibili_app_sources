package com.bilibili.ship.theseus.ugc.endpage.qoe;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeComponent;
import com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeInfo;
import com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Query;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/x.class */
@StabilityInferred(parameters = 0)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DanmakuCompoundRepository f96773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f96774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.t f96775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f96776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f96777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f96778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f96779g;

    @NotNull
    public final IReporterService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f96780i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<UgcDmQoeComponent.State> f96781j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f96782k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f96784m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f96785n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f96786o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public UgcDmQoeInfo.Info f96787p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f96788q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public Job f96791t;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f96783l = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f96789r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public String f96790s = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/x$a.class */
    @BaseUrl("https://api.bilibili.com")
    public interface a {
        @GET("/x/v2/dm/qoe/show")
        @Nullable
        Object getDmQoeInfo(@Query(Tm0.a.f24206c) @Nullable String str, @Query("aid") long j7, @Query("cid") long j8, @NotNull Continuation<? super BiliApiResponse<UgcDmQoeInfo>> continuation);
    }

    @Inject
    public x(@NotNull DanmakuCompoundRepository danmakuCompoundRepository, @NotNull BiliAccounts biliAccounts, @NotNull com.bilibili.ship.theseus.united.page.view.t tVar, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull IReporterService iReporterService, @NotNull IPlayerCoreService iPlayerCoreService) {
        this.f96773a = danmakuCompoundRepository;
        this.f96774b = biliAccounts;
        this.f96775c = tVar;
        this.f96776d = aVar;
        this.f96777e = theseusFloatLayerService;
        this.f96778f = cVar;
        this.f96779g = iPlayerSettingService;
        this.h = iReporterService;
        this.f96780i = iPlayerCoreService;
        this.f96781j = StateFlowKt.MutableStateFlow(new UgcDmQoeComponent.State("", 0L, 0L, -1, cVar.h(), CollectionsKt.emptyList(), UgcDmQoeComponent.State.AnimType.NONE, 0L, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.bilibili.ship.theseus.ugc.endpage.qoe.x r11, boolean r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.endpage.qoe.x.a(com.bilibili.ship.theseus.ugc.endpage.qoe.x, boolean, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(com.bilibili.ship.theseus.ugc.endpage.qoe.x r9, int r10) {
        /*
            r0 = r9
            com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeInfo$Info r0 = r0.f96787p
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L1b
            r0 = r11
            long r0 = r0.f96668a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L18
            goto L1b
        L18:
            goto L1e
        L1b:
            java.lang.String r0 = ""
            r11 = r0
        L1e:
            r0 = r9
            com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeInfo$Info r0 = r0.f96787p
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L39
            r0 = r12
            int r0 = r0.f96671d
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L36
            goto L39
        L36:
            goto L3c
        L39:
            java.lang.String r0 = ""
            r12 = r0
        L3c:
            tv.danmaku.biliplayerv2.service.report.NeuronsEvents$NormalEvent r0 = new tv.danmaku.biliplayerv2.service.report.NeuronsEvents$NormalEvent
            r1 = r0
            java.lang.String r2 = "player.player.dm-qoe.show.player"
            r3 = 10
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "oid"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = r9
            com.bilibili.ship.theseus.united.page.view.a r6 = r6.f96776d
            long r6 = r6.a()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "launch_id"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            r6 = r11
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "qoe_level"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            r6 = r10
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 6
            java.lang.String r6 = "qoe_type"
            r4[r5] = r6
            r4 = r3
            r5 = 7
            r6 = r12
            r4[r5] = r6
            r4 = r3
            r5 = 8
            java.lang.String r6 = "qoe_scene"
            r4[r5] = r6
            r4 = r3
            r5 = 9
            java.lang.String r6 = "1"
            r4[r5] = r6
            r1.<init>(r2, r3)
            r11 = r0
            r0 = r9
            tv.danmaku.biliplayerv2.service.report.IReporterService r0 = r0.h
            r1 = r11
            r0.report(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.endpage.qoe.x.b(com.bilibili.ship.theseus.ugc.endpage.qoe.x, int):void");
    }

    public static Object c(x xVar, Continuation continuation) {
        Object objCoroutineScope;
        UgcDmQoeComponent.State.AnimType animType = UgcDmQoeComponent.State.AnimType.ENTER;
        if (xVar.f96787p == null) {
            objCoroutineScope = Unit.INSTANCE;
        } else {
            BLog.i("UgcDmQoeService-showQoeWidget", "[theseus-ugc-UgcDmQoeService-showQoeWidget] show QOE widget.");
            UgcDmQoeInfo.Info.LayerMask layerMask = xVar.f96787p.f96674g;
            long jA = layerMask != null ? layerMask.a() : 0L;
            long j7 = jA > 0 ? jA * ((long) 1000) : 7000L;
            long jCurrentTimeMillis = xVar.f96786o != 0 ? j7 - (System.currentTimeMillis() - xVar.f96786o) : j7;
            if (jCurrentTimeMillis < 100) {
                xVar.f96787p = null;
                objCoroutineScope = Unit.INSTANCE;
            } else {
                MutableStateFlow<UgcDmQoeComponent.State> mutableStateFlow = xVar.f96781j;
                UgcDmQoeComponent.State state = (UgcDmQoeComponent.State) mutableStateFlow.getValue();
                UgcDmQoeInfo.Info info = xVar.f96787p;
                String str = info.f96669b;
                List<UgcDmQoeInfo.Info.QoeOption> list = info.h.f96676b;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (UgcDmQoeInfo.Info.QoeOption qoeOption : list) {
                    arrayList.add(new UgcDmQoeComponent.State.a(xVar.f96787p.f96671d, qoeOption.f96678a, qoeOption.f96680c, qoeOption.f96679b, qoeOption.f96681d));
                }
                com.bilibili.ship.theseus.united.page.screenstate.c cVar = xVar.f96778f;
                mutableStateFlow.tryEmit(UgcDmQoeComponent.State.a(state, str, j7, jCurrentTimeMillis, 0, cVar.h(), arrayList, animType, 0L, xVar.f96787p.f96671d, 136));
                objCoroutineScope = CoroutineScopeKt.coroutineScope(new UgcDmQoeService$showQoeWidget$3(new UgcDmQoeComponent(FlowKt.asStateFlow(mutableStateFlow), cVar.h()), xVar, j7, null), continuation);
                if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCoroutineScope = Unit.INSTANCE;
                }
            }
        }
        return objCoroutineScope;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02c8 A[Catch: Exception -> 0x01d1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x01d1, blocks: (B:60:0x0164, B:62:0x0173, B:65:0x01d5, B:67:0x01dd, B:68:0x022c, B:70:0x0234, B:73:0x0249, B:75:0x0255, B:77:0x025d, B:79:0x0266, B:81:0x0273, B:83:0x027f, B:85:0x028b, B:93:0x02a4, B:97:0x02c8, B:98:0x02d0, B:99:0x02d9, B:55:0x0148), top: B:106:0x0148 }] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.endpage.qoe.x.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
