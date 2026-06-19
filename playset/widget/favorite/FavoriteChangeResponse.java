package com.bilibili.playset.widget.favorite;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavoriteChangeResponse.class */
@StabilityInferred(parameters = 1)
@Bson
@Keep
public final class FavoriteChangeResponse {
    public static final int $stable = 0;

    @SerializedName("prompt")
    private final boolean prompt;

    @SerializedName("toast_msg")
    @NotNull
    private final String toastMsg;

    public FavoriteChangeResponse(boolean z6, @NotNull String str) {
        this.prompt = z6;
        this.toastMsg = str;
    }

    public static /* synthetic */ FavoriteChangeResponse copy$default(FavoriteChangeResponse favoriteChangeResponse, boolean z6, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = favoriteChangeResponse.prompt;
        }
        if ((i7 & 2) != 0) {
            str = favoriteChangeResponse.toastMsg;
        }
        return favoriteChangeResponse.copy(z6, str);
    }

    public final boolean component1() {
        return this.prompt;
    }

    @NotNull
    public final String component2() {
        return this.toastMsg;
    }

    @NotNull
    public final FavoriteChangeResponse copy(boolean z6, @NotNull String str) {
        return new FavoriteChangeResponse(z6, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteChangeResponse)) {
            return false;
        }
        FavoriteChangeResponse favoriteChangeResponse = (FavoriteChangeResponse) obj;
        return this.prompt == favoriteChangeResponse.prompt && Intrinsics.areEqual(this.toastMsg, favoriteChangeResponse.toastMsg);
    }

    public final boolean getPrompt() {
        return this.prompt;
    }

    @NotNull
    public final String getToastMsg() {
        return this.toastMsg;
    }

    public int hashCode() {
        return this.toastMsg.hashCode() + (Boolean.hashCode(this.prompt) * 31);
    }

    @NotNull
    public String toString() {
        return androidx.fragment.app.n.b("FavoriteChangeResponse(prompt=", ", toastMsg=", this.toastMsg, ")", this.prompt);
    }
}
