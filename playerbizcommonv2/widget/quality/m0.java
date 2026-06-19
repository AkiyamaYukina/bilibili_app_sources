package com.bilibili.playerbizcommonv2.widget.quality;

import android.content.Context;
import com.bilibili.app.gemini.base.resolver.PlayerResolveExtraInfosUtilKt;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.media.resource.PlayIndex;
import java.util.Arrays;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/m0.class */
public final class m0 {
    @NotNull
    public static final String a(int i7, @NotNull Context context) {
        Duration.Companion companion = Duration.Companion;
        long duration = DurationKt.toDuration(i7, DurationUnit.SECONDS);
        long j7 = Duration.getInWholeMinutes-impl(duration);
        long j8 = Duration.getInWholeSeconds-impl(duration) % ((long) 60);
        return (j7 <= 0 || j8 <= 0) ? j7 > 0 ? context.getString(2131855610, String.valueOf(j7)) : context.getString(2131855200, String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j8)}, 1))) : context.getString(2131855199, String.valueOf(j7), String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j8)}, 1)));
    }

    public static final boolean b(@Nullable MediaResource mediaResource) {
        boolean z6 = false;
        if (mediaResource != null) {
            ExtraInfo extraInfo = mediaResource.getExtraInfo();
            z6 = false;
            if (extraInfo != null) {
                vk.e qnTrialInfo = PlayerResolveExtraInfosUtilKt.getQnTrialInfo(extraInfo);
                if (qnTrialInfo == null) {
                    z6 = false;
                } else {
                    z6 = false;
                    if (qnTrialInfo.a) {
                        if (qnTrialInfo.d <= 0) {
                            z6 = false;
                        } else {
                            PlayIndex playIndex = mediaResource.getPlayIndex();
                            z6 = false;
                            if (playIndex != null) {
                                z6 = false;
                                if (playIndex.mNeedVip) {
                                    z6 = false;
                                    if (!BiliAccountInfo.Companion.get().isEffectiveVip()) {
                                        z6 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return z6;
    }
}
