package com.bilibili.lib.sharewrapper.report;

import android.os.Bundle;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/report/ShareTrack.class */
public interface ShareTrack {
    @Nullable
    String appendTrackParams(@Nullable String str, @Nullable String str2);

    void appendTrackParams(@Nullable String str, @Nullable Bundle bundle);

    @Nullable
    ShareTrackParams decodeTrackParamsFrom(@Nullable String str);
}
