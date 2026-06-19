package com.bilibili.ship.theseus.united.utils;

import F3.P0;
import com.bapis.bilibili.playershared.CodeType;
import com.bilibili.lib.foundation.FoundationAlias;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.ijk.media.player.IjkMediaAsset;
import tv.danmaku.videoplayer.core.media.ijk.IjkFnHelper;
import tv.danmaku.videoplayer.core.media.ijk.IjkOptionsHelper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/utils/i.class */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f104861a = LazyKt.lazy(new P0(11));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/utils/i$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f104862a;

        static {
            int[] iArr = new int[IjkMediaAsset.VideoCodecType.values().length];
            try {
                iArr[IjkMediaAsset.VideoCodecType.AV1.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[IjkMediaAsset.VideoCodecType.H265.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f104862a = iArr;
        }
    }

    @NotNull
    public static final CodeType a() {
        IjkFnHelper ijkFnHelper = IjkFnHelper.INSTANCE;
        int i7 = a.f104862a[((!ijkFnHelper.getAv1Support() || ijkFnHelper.getAv1SupportSoft()) ? IjkOptionsHelper.isHevcEnable(FoundationAlias.getFapp()) ? IjkMediaAsset.VideoCodecType.H265 : IjkMediaAsset.VideoCodecType.H264 : IjkMediaAsset.VideoCodecType.AV1).ordinal()];
        return i7 != 1 ? i7 != 2 ? CodeType.CODE264 : CodeType.CODE265 : CodeType.CODEAV1;
    }
}
