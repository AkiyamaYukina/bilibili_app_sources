package com.bilibili.opd.app.bizcommon.imageselector.widget.video;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/widget/video/MallVideoParams.class */
@StabilityInferred(parameters = 0)
@Keep
public final class MallVideoParams {
    public static final int $stable = 8;
    private boolean loop;
    private boolean needReleased;

    @Nullable
    private String playUrl;

    private MallVideoParams(String str, boolean z6, boolean z7) {
        this.playUrl = str;
        this.loop = z6;
        this.needReleased = z7;
    }

    public /* synthetic */ MallVideoParams(String str, boolean z6, boolean z7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? false : z6, (i7 & 4) != 0 ? true : z7);
    }

    public /* synthetic */ MallVideoParams(String str, boolean z6, boolean z7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z6, z7);
    }

    public final boolean getLoop() {
        return this.loop;
    }

    public final boolean getNeedReleased() {
        return this.needReleased;
    }

    @Nullable
    public final String getPlayUrl() {
        return this.playUrl;
    }

    public final void setLoop(boolean z6) {
        this.loop = z6;
    }

    public final void setNeedReleased(boolean z6) {
        this.needReleased = z6;
    }

    public final void setPlayUrl(@Nullable String str) {
        this.playUrl = str;
    }
}
