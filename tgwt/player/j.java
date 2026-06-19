package com.bilibili.tgwt.player;

import tv.danmaku.biliplayerv2.service.LifecycleObserver;
import tv.danmaku.biliplayerv2.service.LifecycleState;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/j.class */
public final class j implements LifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f111552a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/j$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f111553a;

        static {
            int[] iArr = new int[LifecycleState.values().length];
            try {
                iArr[LifecycleState.ACTIVITY_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[LifecycleState.ACTIVITY_START.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f111553a = iArr;
        }
    }

    public j(k kVar) {
        this.f111552a = kVar;
    }

    public final void onLifecycleChanged(LifecycleState lifecycleState) {
        int i7 = a.f111553a[lifecycleState.ordinal()];
        k kVar = this.f111552a;
        if (i7 == 1) {
            kVar.f111556c.saveEpisodeProgress();
        } else {
            if (i7 != 2) {
                return;
            }
            kVar.f111556c.resetHistoryReportFlag();
        }
    }
}
