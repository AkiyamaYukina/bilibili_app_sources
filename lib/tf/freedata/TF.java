package com.bilibili.lib.tf.freedata;

import com.bapis.bilibili.app.wall.v1.RulesReply;
import com.bilibili.lib.tf.TfActivateCallback;
import com.bilibili.lib.tf.TfActivateReq;
import com.bilibili.lib.tf.TfActivateStatus;
import com.bilibili.lib.tf.TfChangeCallback;
import com.bilibili.lib.tf.TfProvider;
import com.bilibili.lib.tf.TfQueryReq;
import com.bilibili.lib.tf.TfQueryResp;
import com.bilibili.lib.tf.TfTransformReq;
import com.bilibili.lib.tf.TfTransformResp;
import com.bilibili.lib.tf.TfTypeExt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/freedata/TF.class */
public interface TF {
    void activate(@NotNull TfActivateReq tfActivateReq, @Nullable TfActivateCallback tfActivateCallback);

    long addTfChangeCallback(@NotNull TfChangeCallback tfChangeCallback);

    void clearActivate();

    void clearCachedActivate(@NotNull TfProvider tfProvider);

    void enable(@NotNull TfTypeExt tfTypeExt, boolean z6);

    @Nullable
    TfActivateStatus getActivate();

    @Nullable
    TfActivateStatus getCachedActivate(@NotNull TfProvider tfProvider);

    @Nullable
    RulesReply getTfRulesConfig();

    boolean isEnabled(@NotNull TfTypeExt tfTypeExt);

    boolean isTfUrl(@NotNull String str);

    void onSyncModels();

    @NotNull
    TfQueryResp query(@NotNull TfQueryReq tfQueryReq);

    void removeTfChangeCallback(long j7);

    void setActivate(@NotNull TfActivateStatus tfActivateStatus);

    void setTfRulesConfig(@NotNull RulesReply rulesReply);

    void shutdown();

    @NotNull
    TfTransformResp transform(@NotNull TfTransformReq tfTransformReq);
}
