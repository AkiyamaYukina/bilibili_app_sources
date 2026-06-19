package com.bilibili.lib.rpc.gaia;

import com.bilibili.lib.rpc.track.model.NetworkEvent;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/gaia/Gaia.class */
public interface Gaia {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/gaia/Gaia$OnGaiaTokenCallback.class */
    public interface OnGaiaTokenCallback {
        void onResponse(@Nullable String str, int i7, @Nullable String str2);
    }

    default void onGaiaParams(@NotNull List<String> list, @NotNull String str) {
    }

    @NotNull
    String onGaiaReq(@NotNull String str, @NotNull String str2);

    default void onGaiaResp(@NotNull NetworkEvent networkEvent) {
    }

    default void onGaiaVoucher(@NotNull String str, @NotNull OnGaiaTokenCallback onGaiaTokenCallback, @NotNull String str2) {
    }
}
