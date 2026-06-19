package com.bilibili.pegasus.components.topview;

import Pb.E;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.adcommon.data.AdInfo;
import com.bilibili.adcommon.data.model.CreativeContent;
import com.bilibili.adcommon.data.model.FeedExtra;
import com.bilibili.adcommon.utils.GsonKtKt;
import com.bilibili.app.comm.list.common.feed.PegasusStyle;
import com.bilibili.gripper.api.ad.biz.pegasus.banner.AdBannerData;
import com.bilibili.gripper.api.ad.biz.pegasus.banner.BannerItemDataMirror;
import com.bilibili.gripper.api.ad.biz.pegasus.banner.LiveBannerData;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.pegasus.HolderExtra;
import com.bilibili.pegasus.holders.bannerv8.v;
import fp0.o;
import gp0.b;
import gp0.c;
import gp0.e;
import gp0.f;
import gp0.g;
import gp0.h;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pp0.C8340D;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/topview/a.class */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:142:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04d5 A[EDGE_INSN: B:152:0x04d5->B:146:0x04d5 BREAK  A[LOOP:1: B:140:0x0499->B:145:0x04b5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull com.bilibili.pegasus.data.request.PegasusResponseWrapper r8, @org.jetbrains.annotations.Nullable java.lang.String r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 1266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.topview.a.a(com.bilibili.pegasus.data.request.PegasusResponseWrapper, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @NotNull
    public static final c b(@NotNull b bVar, @Nullable String str) {
        String str2 = PegasusStyle.INSTANCE.getCurrentStyle().isDoubleColumn() ? "banner_v8" : "banner_single_v8";
        if (str == null) {
            str = "";
        }
        return new c(str2, "banner", str, new HolderExtra(1, false, false, false, false, 0L, 0L, 0L, true, 254, (DefaultConstructorMarker) null), "", CollectionsKt.listOf(bVar), 67108220);
    }

    public static final boolean c(@NotNull b bVar, @NotNull c cVar) {
        AdBannerData adBannerDataA = bVar.a();
        List<b> listE = bVar.e();
        if (adBannerDataA == null && listE == null) {
            Neurons.trackT$default(true, "ad.topview.mixin_banner.invalid", MapsKt.mapOf(new Pair[]{TuplesKt.to(Constant.IN_KEY_REASON, "2"), TuplesKt.to("banner", GsonKtKt.getJsonString(bVar))}), 0, new AT0.c(8), 8, (Object) null);
            E.a("fillParams: type:", bVar.getType(), ", ad_banner && ad_banners is null, skip filling", "[Pegasus]TopViewCardInjectLogic");
            return false;
        }
        String jsonString = GsonKtKt.getJsonString(bVar);
        cVar.f120535A.setInsertCardFlush(true);
        String type = bVar.getType();
        AdBannerData adBannerData = adBannerDataA == null ? new AdBannerData((String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (AdInfo) null, 255, (DefaultConstructorMarker) null) : adBannerDataA;
        e eVarK = bVar.k();
        LiveBannerData liveBannerDataC = eVarK != null ? v.c(eVarK) : null;
        h hVarH = bVar.h();
        bVar.f120534m = new BannerItemDataMirror(type, adBannerData, liveBannerDataC, hVarH != null ? v.b(hVarH) : null, C8340D.c(cVar, null, null, null, null, null, 31), jsonString);
        o oVarE = null;
        if (adBannerDataA != null) {
            oVarE = e(adBannerDataA, cVar);
        }
        bVar.f120533l = oVarE;
        return true;
    }

    @Nullable
    public static final String d(@NotNull b bVar) {
        String title;
        if (bVar.p()) {
            AdBannerData adBannerDataA = bVar.a();
            title = null;
            if (adBannerDataA != null) {
                title = adBannerDataA.getTitle();
            }
        } else if (bVar.n() != null) {
            g gVarN = bVar.n();
            title = null;
            if (gVarN != null) {
                title = gVarN.getTitle();
            }
        } else if (bVar.h() != null) {
            h hVarH = bVar.h();
            title = null;
            if (hVarH != null) {
                title = hVarH.getTitle();
            }
        } else if (bVar.l() != null) {
            f fVarL = bVar.l();
            title = null;
            if (fVarL != null) {
                title = fVarL.getTitle();
            }
        } else {
            title = null;
            if (bVar.k() != null) {
                e eVarK = bVar.k();
                title = null;
                if (eVarK != null) {
                    title = eVarK.getTitle();
                }
            }
        }
        return title;
    }

    @NotNull
    public static final o e(@NotNull AdBannerData adBannerData, @NotNull c cVar) {
        HolderExtra holderExtra;
        HolderExtra holderExtra2;
        HolderExtra holderExtra3;
        HolderExtra holderExtra4;
        AdInfo adInfo = adBannerData.getAdInfo();
        long id = adInfo != null ? adInfo.getId() : 0L;
        String title = adBannerData.getTitle();
        String uri = adBannerData.getUri();
        String param = adBannerData.getParam();
        AdInfo adInfo2 = adBannerData.getAdInfo();
        o oVar = new o(cVar.getCardType(), title, uri, cVar.getCardGoto(), cVar.getTrackId(), cVar.getPosRecUniqueId(), cVar.getMaterialId(), adInfo2 != null ? AdInfo.copy$default(adInfo2, false, 0L, 0L, (String) null, 0L, (String) null, 0L, 0L, 0L, false, 0L, 0L, 0, (CreativeContent) null, (String) null, (String) null, 0, (FeedExtra) null, 0L, 0, 1048575, (Object) null) : null, id, param, null, 257683801);
        HolderExtra holderExtra5 = cVar.f120535A;
        oVar.f118900B.setInsertCardFlush(holderExtra5.isInsertCardFlush());
        List<b> listK = cVar.k();
        if (listK != null) {
            for (b bVar : listK) {
                e eVarK = bVar.k();
                if (eVarK != null && (holderExtra4 = eVarK.f120594b) != null) {
                    holderExtra4.setInsertCardFlush(holderExtra5.isInsertCardFlush());
                }
                f fVarL = bVar.l();
                if (fVarL != null && (holderExtra3 = fVarL.f120648b) != null) {
                    holderExtra3.setInsertCardFlush(holderExtra5.isInsertCardFlush());
                }
                g gVarN = bVar.n();
                if (gVarN != null && (holderExtra2 = gVarN.f120673A) != null) {
                    holderExtra2.setInsertCardFlush(holderExtra5.isInsertCardFlush());
                }
                h hVarH = bVar.h();
                if (hVarH != null && (holderExtra = hVarH.f120739b) != null) {
                    holderExtra.setInsertCardFlush(holderExtra5.isInsertCardFlush());
                }
            }
        }
        return oVar;
    }
}
