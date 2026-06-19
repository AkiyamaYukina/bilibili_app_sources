package com.bilibili.ship.theseus.ogv.activity;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.ship.theseus.ogv.viewingduration.ViewingDurationService;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f91502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ViewingDurationService f91503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final BiliAccountInfo f91504c;

    @Inject
    public a(long j7, @NotNull ViewingDurationService viewingDurationService, @NotNull BiliAccountInfo biliAccountInfo) {
        this.f91502a = j7;
        this.f91503b = viewingDurationService;
        this.f91504c = biliAccountInfo;
    }
}
