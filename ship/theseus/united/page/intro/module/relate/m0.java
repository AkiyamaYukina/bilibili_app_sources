package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.adcommon.data.model.AdRelateItem;
import com.bilibili.adcommon.data.model.SourceContent;
import com.bilibili.adcommon.utils.AdMossHelper;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.ship.theseus.united.page.view.StatData;
import com.bilibili.ship.theseus.united.page.view.StatInfoData;
import com.google.protobuf.Any;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/m0.class */
@StabilityInferred(parameters = 0)
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f101295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Any f101296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StatData f101297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f101298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f101299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f101300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f101301g;

    @NotNull
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final n0 f101302i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f101303j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final AdRelateItem f101304k;

    public m0(long j7, @NotNull Any any, @NotNull StatData statData, long j8, int i7, long j9, @NotNull String str, @NotNull String str2, @Nullable n0 n0Var, @NotNull String str3) {
        this.f101295a = j7;
        this.f101296b = any;
        this.f101297c = statData;
        this.f101298d = j8;
        this.f101299e = i7;
        this.f101300f = j9;
        this.f101301g = str;
        this.h = str2;
        this.f101302i = n0Var;
        this.f101303j = str3;
        AdRelateItem adRelateItem = new AdRelateItem();
        SourceContent sourceContentCreateSourceContent = AdMossHelper.INSTANCE.createSourceContent(any);
        if (sourceContentCreateSourceContent != null) {
            sourceContentCreateSourceContent.setAvId(j7);
            SourceContent.Stat stat = new SourceContent.Stat();
            stat.setAvid(j7);
            stat.setMPlays(statData.b().f104028b);
            stat.setVtIcon(statData.b().f104030d);
            StatInfoData statInfoData = statData.f104020b;
            stat.setMDanmakus(statInfoData.f104028b);
            stat.setDanmakuIcon(statInfoData.f104030d);
            sourceContentCreateSourceContent.setStat(stat);
            adRelateItem.setCm(sourceContentCreateSourceContent);
            adRelateItem.setDuration(j8);
            AdRelateItem.Stat stat2 = new AdRelateItem.Stat();
            stat2.setAvid(j7);
            stat2.setMPlays(String.valueOf(statData.b().f104027a));
            stat2.setMDanmakus(String.valueOf(statInfoData.f104027a));
            adRelateItem.setStat(stat2);
            AdRelateItem.ArchiveStat archiveStat = new AdRelateItem.ArchiveStat();
            AdRelateItem.StatInfo statInfo = new AdRelateItem.StatInfo();
            statInfo.setIcon(statData.b().a() ? 1 : 0);
            statInfo.setText(statData.b().f104028b);
            statInfo.setPureText(statData.b().f104029c);
            archiveStat.setViewVt(statInfo);
            AdRelateItem.StatInfo statInfo2 = new AdRelateItem.StatInfo();
            statInfo2.setIcon(statData.b().a() ? 1 : 0);
            statInfo2.setText(statInfoData.f104028b);
            statInfo2.setPureText(statInfoData.f104029c);
            archiveStat.setDanmakuVt(statInfo2);
            adRelateItem.setStatV2(archiveStat);
            adRelateItem.setNatureAd(i7);
            adRelateItem.setUpperMid(j9);
            adRelateItem.setTrackid(str);
            adRelateItem.setGoTo(str2);
            long j10 = n0Var.f101311c;
            AdRelateItem.StatInfo statInfo3 = new AdRelateItem.StatInfo();
            StatInfoData statInfoData2 = n0Var.f101312d;
            statInfo3.setIcon(statInfoData2.a() ? 1 : 0);
            statInfo3.setText(statInfoData2.f104028b);
            statInfo3.setPureText(statInfoData2.f104029c);
            statInfo3.setIconStr(statInfoData2.f104030d);
            adRelateItem.setLiveBean(new AdRelateItem.AdRelativeLiveBean(n0Var.f101309a, n0Var.f101310b, Long.valueOf(j10), statInfo3, str3));
        } else {
            adRelateItem.setCm(new SourceContent((String) null, 0L, 0L, false, 0L, (String) null, 0L, 0L, (SourceContent.AdContent) null, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_RESULT_ROTATE, (DefaultConstructorMarker) null));
        }
        this.f101304k = adRelateItem;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f101295a == m0Var.f101295a && Intrinsics.areEqual(this.f101296b, m0Var.f101296b) && Intrinsics.areEqual(this.f101297c, m0Var.f101297c) && this.f101298d == m0Var.f101298d && this.f101299e == m0Var.f101299e && this.f101300f == m0Var.f101300f && Intrinsics.areEqual(this.f101301g, m0Var.f101301g) && Intrinsics.areEqual(this.h, m0Var.h) && Intrinsics.areEqual(this.f101302i, m0Var.f101302i) && Intrinsics.areEqual(this.f101303j, m0Var.f101303j);
    }

    public final int hashCode() {
        int iA = I.E.a(I.E.a(C3554n0.a(androidx.compose.animation.core.I.a(this.f101299e, C3554n0.a((this.f101297c.hashCode() + ((this.f101296b.hashCode() + (Long.hashCode(this.f101295a) * 31)) * 31)) * 31, 31, this.f101298d), 31), 31, this.f101300f), 31, this.f101301g), 31, this.h);
        n0 n0Var = this.f101302i;
        return this.f101303j.hashCode() + ((iA + (n0Var == null ? 0 : n0Var.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RelateCMCard(aid=");
        sb.append(this.f101295a);
        sb.append(", sourceContent=");
        sb.append(this.f101296b);
        sb.append(", stat=");
        sb.append(this.f101297c);
        sb.append(", duration=");
        sb.append(this.f101298d);
        sb.append(", natureAd=");
        sb.append(this.f101299e);
        sb.append(", upMid=");
        sb.append(this.f101300f);
        sb.append(", trackid=");
        sb.append(this.f101301g);
        sb.append(", goto=");
        sb.append(this.h);
        sb.append(", cmLive=");
        sb.append(this.f101302i);
        sb.append(", coverRightText=");
        return C8770a.a(sb, this.f101303j, ")");
    }
}
