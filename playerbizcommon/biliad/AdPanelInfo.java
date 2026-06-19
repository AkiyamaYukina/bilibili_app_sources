package com.bilibili.playerbizcommon.biliad;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.interact.biz.model.AdDanmakuBean;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/biliad/AdPanelInfo.class */
public final class AdPanelInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final AdDanmakuBean f79551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f79552b;

    public AdPanelInfo() {
        this(null, 0, 3, null);
    }

    public AdPanelInfo(@Nullable AdDanmakuBean adDanmakuBean, int i7) {
        this.f79551a = adDanmakuBean;
        this.f79552b = i7;
    }

    public /* synthetic */ AdPanelInfo(AdDanmakuBean adDanmakuBean, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? null : adDanmakuBean, (i8 & 2) != 0 ? 0 : i7);
    }

    @Nullable
    public final AdDanmakuBean getAdDanmaku() {
        return this.f79551a;
    }

    public final int getFrom() {
        return this.f79552b;
    }
}
