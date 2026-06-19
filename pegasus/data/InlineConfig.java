package com.bilibili.pegasus.data;

import androidx.annotation.Keep;
import androidx.compose.animation.n;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/InlineConfig.class */
@Keep
public final class InlineConfig {

    @SerializedName("play_bottom_ratio")
    private final float playBottomRatio;

    @SerializedName("play_ratio")
    private final float playRatio;

    @SerializedName("play_strategy")
    private final int playStrategy;

    @SerializedName("play_top_ratio")
    private final float playTopRatio;

    public InlineConfig() {
        this(0, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public InlineConfig(int i7, float f7, float f8, float f9) {
        this.playStrategy = i7;
        this.playTopRatio = f7;
        this.playBottomRatio = f8;
        this.playRatio = f9;
    }

    public /* synthetic */ InlineConfig(int i7, float f7, float f8, float f9, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i7, (i8 & 2) != 0 ? 0.5f : f7, (i8 & 4) != 0 ? 0.5f : f8, (i8 & 8) != 0 ? 0.5f : f9);
    }

    public static /* synthetic */ InlineConfig copy$default(InlineConfig inlineConfig, int i7, float f7, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = inlineConfig.playStrategy;
        }
        if ((i8 & 2) != 0) {
            f7 = inlineConfig.playTopRatio;
        }
        if ((i8 & 4) != 0) {
            f8 = inlineConfig.playBottomRatio;
        }
        if ((i8 & 8) != 0) {
            f9 = inlineConfig.playRatio;
        }
        return inlineConfig.copy(i7, f7, f8, f9);
    }

    public final int component1() {
        return this.playStrategy;
    }

    public final float component2() {
        return this.playTopRatio;
    }

    public final float component3() {
        return this.playBottomRatio;
    }

    public final float component4() {
        return this.playRatio;
    }

    @NotNull
    public final InlineConfig copy(int i7, float f7, float f8, float f9) {
        return new InlineConfig(i7, f7, f8, f9);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InlineConfig)) {
            return false;
        }
        InlineConfig inlineConfig = (InlineConfig) obj;
        return this.playStrategy == inlineConfig.playStrategy && Float.compare(this.playTopRatio, inlineConfig.playTopRatio) == 0 && Float.compare(this.playBottomRatio, inlineConfig.playBottomRatio) == 0 && Float.compare(this.playRatio, inlineConfig.playRatio) == 0;
    }

    public final float getPlayBottomRatio() {
        return this.playBottomRatio;
    }

    public final float getPlayRatio() {
        return this.playRatio;
    }

    public final int getPlayStrategy() {
        return this.playStrategy;
    }

    public final float getPlayTopRatio() {
        return this.playTopRatio;
    }

    public int hashCode() {
        return Float.hashCode(this.playRatio) + n.a(this.playBottomRatio, n.a(this.playTopRatio, Integer.hashCode(this.playStrategy) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "InlineConfig(playStrategy=" + this.playStrategy + ", playTopRatio=" + this.playTopRatio + ", playBottomRatio=" + this.playBottomRatio + ", playRatio=" + this.playRatio + ")";
    }
}
