package com.bilibili.ship.theseus.sail.immatureplay;

import android.os.Parcelable;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.playerbizcommon.utils.PlayUrlFlagsManager;
import com.bilibili.playerbizcommon.utils.PlayerSettingHelper;
import com.bilibili.ship.theseus.keel.player.k;
import com.bilibili.ship.theseus.sail.immatureplay.a;
import com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaDescription;
import com.bilibili.ship.theseus.united.player.mediaplay.f;
import com.bilibili.ship.theseus.united.player.mediaplay.i;
import com.bilibili.ship.theseus.united.player.mediaplay.q;
import ev0.j;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import mv0.C8043a;
import mv0.C8044b;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.videoplayer.coreV2.VideoBizType;
import vl0.C8833a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/sail/immatureplay/d.class */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final g f96185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final c f96186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final a f96187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final f f96188d;

    @Inject
    public d(@NotNull g gVar, @NotNull c cVar, @NotNull a aVar, @NotNull f fVar) {
        this.f96185a = gVar;
        this.f96186b = cVar;
        this.f96187c = aVar;
        this.f96188d = fVar;
    }

    @Override // com.bilibili.ship.theseus.united.player.mediaplay.i
    @NotNull
    public final k a(@NotNull j.a aVar, @NotNull f.c cVar) {
        f fVar = this.f96188d;
        fVar.getClass();
        return q.a(fVar.f96200c, fVar.a(cVar.f104516a, cVar.f104517b, cVar.f104518c, cVar.f104519d, aVar), null, cVar.f104516a, null, null, null, aVar.f117668m, 58);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0468  */
    @Override // com.bilibili.ship.theseus.united.player.mediaplay.i
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.ship.theseus.keel.player.k b(@org.jetbrains.annotations.NotNull ev0.h r11, @org.jetbrains.annotations.NotNull ev0.j.a r12) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 1486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.sail.immatureplay.d.b(ev0.h, ev0.j$a):com.bilibili.ship.theseus.keel.player.k");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.bilibili.ship.theseus.united.player.mediaplay.i
    @NotNull
    public final k c(@NotNull ev0.g gVar, @NotNull j.a aVar) throws NoWhenBranchMatchedException {
        Map extraJsonParams;
        a aVar2 = this.f96187c;
        aVar2.getClass();
        Parcelable.Creator<PlayingAreaDescription> creator = PlayingAreaDescription.CREATOR;
        aVar2.f96171d.d(PlayingAreaDescription.a.a(gVar.f117644g));
        C8043a c8043a = aVar2.f96168a;
        C8044b c8044bA = c8043a.a();
        GeminiCommonPlayableParams geminiCommonPlayableParams = new GeminiCommonPlayableParams();
        geminiCommonPlayableParams.setAvid(gVar.f117639b);
        geminiCommonPlayableParams.setPage(gVar.f117642e);
        geminiCommonPlayableParams.setCid(gVar.f117640c);
        geminiCommonPlayableParams.setFnVal(PlayUrlFlagsManager.getFnVal());
        geminiCommonPlayableParams.setFnVer(PlayUrlFlagsManager.getFnVer());
        geminiCommonPlayableParams.setEnableSafeConnection(PlayerSettingHelper.enablePlayUrlHTTPS());
        geminiCommonPlayableParams.setJumpFrom(aVar.h);
        geminiCommonPlayableParams.setSpmid(c8044bA.f123880b);
        geminiCommonPlayableParams.setFromSpmid(aVar.f117663g);
        geminiCommonPlayableParams.setPlayMode(aVar2.f96169b.g());
        geminiCommonPlayableParams.setFromAutoPlay(c8043a.a().f123885g);
        geminiCommonPlayableParams.setTrackId(aVar.f117664i);
        geminiCommonPlayableParams.setDisplayRotate(1 / gVar.f117644g.a());
        geminiCommonPlayableParams.setForceLocalOnly(true);
        geminiCommonPlayableParams.setNeedResolveFromLocalCache(true);
        geminiCommonPlayableParams.setFrom("downloaded");
        geminiCommonPlayableParams.setTitle(gVar.f117641d);
        geminiCommonPlayableParams.setExtraJsonParams(new LinkedHashMap());
        HashMap map = new HashMap();
        int i7 = a.C0806a.f96175a[gVar.f117638a.ordinal()];
        com.bilibili.ship.theseus.united.bean.d dVar = gVar.h;
        if (i7 == 1) {
            geminiCommonPlayableParams.setType(4);
            geminiCommonPlayableParams.setPlayType("2");
            geminiCommonPlayableParams.setPlayStatus("1");
            geminiCommonPlayableParams.setBizType(VideoBizType.PGC);
            int i8 = 1;
            if (dVar != null) {
                com.bilibili.ogv.pub.season.a aVar3 = dVar.f98753b;
                i8 = 1;
                if (aVar3 != null) {
                    i8 = aVar3.f71782a;
                }
            }
            geminiCommonPlayableParams.setSubType(i8);
            Map extraJsonParams2 = geminiCommonPlayableParams.getExtraJsonParams();
            if (extraJsonParams2 != null) {
            }
            Long l7 = dVar != null ? dVar.f98754c : null;
            Long l8 = l7;
            if (l7 == null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Long.class);
                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                    l8 = (Long) Double.valueOf(0.0d);
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                    l8 = (Long) Float.valueOf(0.0f);
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                    l8 = 0L;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                    l8 = (Long) 0;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Character.TYPE))) {
                    l8 = (Long) (char) 0;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Short.TYPE))) {
                    l8 = (Long) (short) 0;
                } else {
                    if (!Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Byte.TYPE))) {
                        throw new RuntimeException("not primitive number type");
                    }
                    l8 = (Long) (byte) 0;
                }
            }
            geminiCommonPlayableParams.setEpIdForReport(l8.longValue());
            Long l9 = dVar != null ? dVar.f98752a : null;
            Long l10 = l9;
            if (l9 == null) {
                KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Long.class);
                if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                    l10 = (Long) Double.valueOf(0.0d);
                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                    l10 = (Long) Float.valueOf(0.0f);
                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                    l10 = 0L;
                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                    l10 = (Long) 0;
                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Character.TYPE))) {
                    l10 = (Long) (char) 0;
                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Short.TYPE))) {
                    l10 = (Long) (short) 0;
                } else {
                    if (!Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Byte.TYPE))) {
                        throw new RuntimeException("not primitive number type");
                    }
                    l10 = (Long) (byte) 0;
                }
            }
            geminiCommonPlayableParams.setSeasonId(l10.longValue());
        } else if (i7 == 2) {
            geminiCommonPlayableParams.setType(3);
            geminiCommonPlayableParams.setPlayType("1");
            geminiCommonPlayableParams.setPlayStatus("0");
            geminiCommonPlayableParams.setBizType(VideoBizType.UGC);
        } else {
            if (i7 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            geminiCommonPlayableParams.setType(10);
            geminiCommonPlayableParams.setPlayType("3");
            geminiCommonPlayableParams.setPlayStatus("1");
            geminiCommonPlayableParams.setBizType(VideoBizType.PUGV);
        }
        String str = aVar.f117665j;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        map.put("report_flow_data", str2);
        String str3 = aVar.f117666k;
        if (str3 != null && (extraJsonParams = geminiCommonPlayableParams.getExtraJsonParams()) != null) {
        }
        map.putAll(aVar2.f96174g.f102492e);
        geminiCommonPlayableParams.setLegacyExtra(map);
        geminiCommonPlayableParams.setFromScene(aVar2.f96173f.f129026b);
        geminiCommonPlayableParams.setAdExtra(aVar2.f96172e.f98943f);
        geminiCommonPlayableParams.setExtraContentForResolve(MapsKt.mapOf(new Pair[]{TuplesKt.to("ep_id", String.valueOf(dVar != null ? dVar.f98754c : null)), TuplesKt.to("season_id", String.valueOf(dVar != null ? dVar.f98752a : null)), TuplesKt.to("is_need_view_info", "true"), TuplesKt.to("is_preview", "0"), TuplesKt.to("security_level", C8833a.a())}));
        return q.a(aVar2.f96170c, geminiCommonPlayableParams, null, null, null, null, gVar, null, 94);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03d5  */
    @Override // com.bilibili.ship.theseus.united.player.mediaplay.i
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.ship.theseus.keel.player.k d(@org.jetbrains.annotations.NotNull ev0.l r11) {
        /*
            Method dump skipped, instruction units count: 1266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.sail.immatureplay.d.d(ev0.l):com.bilibili.ship.theseus.keel.player.k");
    }

    @Override // com.bilibili.ship.theseus.united.player.mediaplay.i
    @NotNull
    public final GeminiCommonPlayableParams e(@NotNull j.a aVar, @NotNull f.c cVar) {
        return this.f96188d.a(cVar.f104516a, cVar.f104517b, cVar.f104518c, cVar.f104519d, aVar);
    }
}
