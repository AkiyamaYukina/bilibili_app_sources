package com.bilibili.lib.tf.freedata;

import android.app.Application;
import androidx.annotation.WorkerThread;
import com.bapis.bilibili.app.wall.v1.RuleRequest;
import com.bapis.bilibili.app.wall.v1.RulesReply;
import com.bapis.bilibili.app.wall.v1.WallMoss;
import com.bilibili.base.BiliContext;
import com.bilibili.commons.io.IOUtils;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.fd_service.api.beans.RulesInfoData;
import com.bilibili.lib.moss.api.CallOptions;
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
import com.bilibili.lib.tf.freedata.util.adapt.TfMigrateManagerKt;
import com.bilibili.lib.tf.freedata.util.log.TfLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rY.b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/freedata/TfHolder.class */
public final class TfHolder {

    @NotNull
    public static final TfHolder INSTANCE = new TfHolder();

    @Nullable
    private static TF tf;

    private TfHolder() {
    }

    private final TF getTf() {
        return tf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.lang.Runnable] */
    @JvmStatic
    public static final void init(@NotNull TF tf2) {
        TfLog.Companion.i(TfHolderKt.TAG, "Tf freedata holder init.");
        tf = tf2;
        if (BiliContext.isMainProcess()) {
            HandlerThreads.getHandler(2).postDelayed(new Object(), 1000L);
            TfMigrateManagerKt.maybeMigrateModels();
        }
        HandlerThreads.getHandler(2).post(new Object());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0() {
        INSTANCE.updateTfRules();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1() {
        RulesReply rulesReplyBuild;
        Application application = BiliContext.application();
        Objects.requireNonNull(application);
        File file = new File(application.getFilesDir(), "tf/tf_rule.data");
        if (file.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                rulesReplyBuild = RulesReply.parseFrom(fileInputStream);
                fileInputStream.close();
            } catch (Throwable th) {
                th.printStackTrace();
                file.delete();
                rulesReplyBuild = null;
            }
        } else {
            try {
                RulesInfoData rulesInfoDataB = b.b();
                RulesReply.b bVarNewBuilder = RulesReply.newBuilder();
                if (rulesInfoDataB != null) {
                    b.a("cm", rulesInfoDataB.rulesInfo.cm, bVarNewBuilder);
                    b.a("cu", rulesInfoDataB.rulesInfo.cu, bVarNewBuilder);
                    b.a("ct", rulesInfoDataB.rulesInfo.ct, bVarNewBuilder);
                }
                bVarNewBuilder.setHashValue("22233 from default");
                rulesReplyBuild = bVarNewBuilder.build();
            } catch (Throwable th2) {
                th2.printStackTrace();
                rulesReplyBuild = null;
            }
        }
        if (rulesReplyBuild != null) {
            INSTANCE.getTf().setTfRulesConfig(rulesReplyBuild);
        }
    }

    @WorkerThread
    private final void updateTfRules() {
        try {
            RulesReply rulesReplyExecuteRuleInfo = new WallMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).executeRuleInfo(RuleRequest.getDefaultInstance());
            if (rulesReplyExecuteRuleInfo != null) {
                try {
                    Application application = BiliContext.application();
                    Objects.requireNonNull(application);
                    File file = new File(application.getFilesDir(), "tf/tf_rule.data");
                    if (!file.getParentFile().exists()) {
                        file.getParentFile().mkdir();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    IOUtils.write(rulesReplyExecuteRuleInfo.toByteArray(), fileOutputStream);
                    fileOutputStream.close();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                INSTANCE.setTfRulesConfig(rulesReplyExecuteRuleInfo);
            }
        } catch (Exception e7) {
            TfLog.Companion.e(TfHolderKt.TAG, "updateTfRules via moss exception=" + e7);
        }
    }

    public final void activate(@NotNull TfActivateReq tfActivateReq, @Nullable TfActivateCallback tfActivateCallback) {
        TF tf2 = getTf();
        if (tf2 != null) {
            tf2.activate(tfActivateReq, tfActivateCallback);
        }
    }

    public final long addTfChangeCallback(@NotNull TfChangeCallback tfChangeCallback) {
        TF tf2 = getTf();
        return tf2 != null ? tf2.addTfChangeCallback(tfChangeCallback) : 0L;
    }

    public final void clearActivate() {
        TF tf2 = getTf();
        if (tf2 != null) {
            tf2.clearActivate();
        }
    }

    public final void clearCachedActivate(@NotNull TfProvider tfProvider) {
        TF tf2 = getTf();
        if (tf2 != null) {
            tf2.clearCachedActivate(tfProvider);
        }
    }

    public final void enable(@NotNull TfTypeExt tfTypeExt, boolean z6) {
        TF tf2 = getTf();
        if (tf2 != null) {
            tf2.enable(tfTypeExt, z6);
        }
    }

    @Nullable
    public final TfActivateStatus getActivate() {
        TF tf2 = getTf();
        return tf2 != null ? tf2.getActivate() : null;
    }

    @Nullable
    public final TfActivateStatus getCachedActivate(@NotNull TfProvider tfProvider) {
        TF tf2 = getTf();
        return tf2 != null ? tf2.getCachedActivate(tfProvider) : null;
    }

    @Nullable
    public final RulesReply getTfRulesConfig() {
        TF tf2 = getTf();
        return tf2 != null ? tf2.getTfRulesConfig() : null;
    }

    public final boolean isEnabled(@NotNull TfTypeExt tfTypeExt) {
        TF tf2 = getTf();
        return tf2 != null ? tf2.isEnabled(tfTypeExt) : false;
    }

    @Deprecated(message = "Replaced by transform")
    public final boolean isTfUrl(@NotNull String str) {
        TF tf2 = getTf();
        return tf2 != null ? tf2.isTfUrl(str) : false;
    }

    public final void onSyncModels() {
        TF tf2 = getTf();
        if (tf2 != null) {
            tf2.onSyncModels();
        }
    }

    @NotNull
    public final TfQueryResp query(@NotNull TfQueryReq tfQueryReq) {
        return getTf().query(tfQueryReq);
    }

    public final void removeTfChangeCallback(long j7) {
        TF tf2 = getTf();
        if (tf2 != null) {
            tf2.removeTfChangeCallback(j7);
        }
    }

    public final void setActivate(@NotNull TfActivateStatus tfActivateStatus) {
        TF tf2 = getTf();
        if (tf2 != null) {
            tf2.setActivate(tfActivateStatus);
        }
    }

    public final void setTfRulesConfig(@NotNull RulesReply rulesReply) {
        TF tf2 = getTf();
        if (tf2 != null) {
            tf2.setTfRulesConfig(rulesReply);
        }
    }

    public final void shutdown() {
        TF tf2 = getTf();
        if (tf2 != null) {
            tf2.shutdown();
        }
    }

    @NotNull
    public final TfTransformResp transform(@NotNull TfTransformReq tfTransformReq) {
        return getTf().transform(tfTransformReq);
    }
}
