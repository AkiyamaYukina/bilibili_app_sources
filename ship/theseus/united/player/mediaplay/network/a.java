package com.bilibili.ship.theseus.united.player.mediaplay.network;

import E2.C1612a;
import android.content.Context;
import androidx.appcompat.widget.C3259x;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.fd_service.FreeDataManager;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.VipUserInfo;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.tf.TfTypeExt;
import com.bilibili.ship.theseus.united.di.BusinessType;
import java.util.Map;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.MapsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.network.PlayerFreeDataHelper;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/network/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f104533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BiliAccountInfo f104534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final BusinessType f104535c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.network.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/network/a$a.class */
    public static final /* synthetic */ class C1168a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f104536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f104537b;

        static {
            int[] iArr = new int[TfTypeExt.values().length];
            try {
                iArr[TfTypeExt.C_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[TfTypeExt.U_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[TfTypeExt.T_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[TfTypeExt.C_PKG.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[TfTypeExt.U_PKG.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[TfTypeExt.T_PKG.ordinal()] = 6;
            } catch (NoSuchFieldError e12) {
            }
            f104536a = iArr;
            int[] iArr2 = new int[BusinessType.values().length];
            try {
                iArr2[BusinessType.UGC.ordinal()] = 1;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr2[BusinessType.OGV.ordinal()] = 2;
            } catch (NoSuchFieldError e14) {
            }
            try {
                iArr2[BusinessType.CHEESE.ordinal()] = 3;
            } catch (NoSuchFieldError e15) {
            }
            f104537b = iArr2;
        }
    }

    @Inject
    public a(@NotNull Context context, @NotNull BiliAccountInfo biliAccountInfo, @NotNull BusinessType businessType) {
        this.f104533a = context;
        this.f104534b = biliAccountInfo;
        this.f104535c = businessType;
    }

    public static void c() {
        Object obj;
        int freeDataResultCode = PlayerFreeDataHelper.INSTANCE.getFreeDataResultCode();
        BLog.i("MediaNetworkRepository-reportFreeDataPlayFailed", "[theseus-united-MediaNetworkRepository-reportFreeDataPlayFailed] " + C3259x.a(freeDataResultCode, "report free data play failed with code "));
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        TfTypeExt typeExt = FreeDataManager.getInstance().getFreeDataCondition().getTypeExt();
        switch (typeExt == null ? -1 : C1168a.f104536a[typeExt.ordinal()]) {
            case 1:
                obj = "1";
                break;
            case 2:
                obj = "2";
                break;
            case 3:
                obj = "3";
                break;
            case 4:
                obj = "4";
                break;
            case 5:
                obj = "5";
                break;
            case 6:
                obj = "6";
                break;
            default:
                obj = "";
                break;
        }
        mapCreateMapBuilder.put("free", obj);
        C1612a.c(freeDataResultCode, "resource", "1", "errorcode", mapCreateMapBuilder);
        Neurons.report$default(false, 4, "main.freeflow.quality.sys", MapsKt.build(mapCreateMapBuilder), (String) null, 0, 48, (Object) null);
    }

    @Nullable
    public static Object d(@NotNull ContinuationImpl continuationImpl) {
        return BuildersKt.withContext(Dispatchers.getIO(), new MediaNetworkRepository$requestTFInfo$2(null), continuationImpl);
    }

    public static void e() {
        BLog.i("MediaNetworkRepository-setAutoPlayOnCellularEnv", "[theseus-united-MediaNetworkRepository-setAutoPlayOnCellularEnv] change user setting mobile data auto play to true");
        IPlayerSettingService.Companion.putBoolean("pref_key_mobile_data_auto_play", true);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public final Map<String, String> a(long j7) throws NoWhenBranchMatchedException {
        Object obj;
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        int i7 = C1168a.f104537b[this.f104535c.ordinal()];
        if (i7 == 1) {
            obj = "ugc";
        } else if (i7 == 2) {
            obj = "ogv";
        } else {
            if (i7 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            obj = "pugv";
        }
        mapCreateMapBuilder.put("player_type", obj);
        mapCreateMapBuilder.put("tips_id", String.valueOf(j7));
        BiliAccountInfo biliAccountInfo = this.f104534b;
        VipUserInfo vipInfo = biliAccountInfo.getVipInfo();
        mapCreateMapBuilder.put("vip_type", String.valueOf(vipInfo != null ? Integer.valueOf(vipInfo.getVipType()) : null));
        VipUserInfo vipInfo2 = biliAccountInfo.getVipInfo();
        Integer numValueOf = null;
        if (vipInfo2 != null) {
            numValueOf = Integer.valueOf(vipInfo2.getVipStatus());
        }
        mapCreateMapBuilder.put("vip_status", String.valueOf(numValueOf));
        return MapsKt.build(mapCreateMapBuilder);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(@org.jetbrains.annotations.Nullable java.lang.Long r10, @org.jetbrains.annotations.Nullable java.lang.String r11) {
        /*
            r9 = this;
            r0 = r11
            if (r0 == 0) goto Ld
            r0 = r11
            r12 = r0
            r0 = r11
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L10
        Ld:
            java.lang.String r0 = "https://www.bilibili.com/blackboard/activity-new-freedata.html"
            r12 = r0
        L10:
            r0 = r10
            if (r0 == 0) goto L29
            r0 = 0
            r1 = 9
            java.lang.String r2 = "player.player.network-layer-freeflow.click.player"
            r3 = r9
            r4 = r10
            long r4 = r4.longValue()
            java.util.Map r3 = r3.a(r4)
            r4 = 0
            r5 = 0
            r6 = 48
            r7 = 0
            com.bilibili.lib.neuron.api.Neurons.report$default(r0, r1, r2, r3, r4, r5, r6, r7)
        L29:
            r0 = r10
            java.lang.String r1 = "go to free cellular, tf id:"
            java.lang.String r0 = com.bilibili.app.comment3.ui.i.a(r0, r1)
            r11 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "[theseus-united-MediaNetworkRepository-goToFreeCellular] "
            r1.<init>(r2)
            r10 = r0
            r0 = r10
            r1 = r11
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = "MediaNetworkRepository-goToFreeCellular"
            r1 = r10
            java.lang.String r1 = r1.toString()
            tv.danmaku.android.log.BLog.i(r0, r1)
            r0 = r12
            com.bilibili.lib.blrouter.RouteRequest r0 = com.bilibili.lib.blrouter.RouteRequestKt.toRouteRequest(r0)
            r1 = r9
            android.content.Context r1 = r1.f104533a
            com.bilibili.lib.blrouter.RouteResponse r0 = com.bilibili.lib.blrouter.BLRouter.routeTo(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.mediaplay.network.a.b(java.lang.Long, java.lang.String):void");
    }
}
