package com.bilibili.biligame.api.cloudgame;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.biligame.api.BiligameMainGame;
import com.bilibili.biligame.api.CloudGameInfo;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/cloudgame/CloudGameUtils.class */
@StabilityInferred(parameters = 1)
public final class CloudGameUtils {
    public static final int $stable = 0;

    @NotNull
    public static final CloudGameUtils INSTANCE = new CloudGameUtils();

    @JvmStatic
    public static final boolean isMicroGame(@Nullable BiligameMainGame biligameMainGame) {
        boolean z6 = false;
        if (biligameMainGame != null) {
            CloudGameInfo cloudGameInfo = biligameMainGame.cloudGameInfoV2;
            z6 = false;
            if (cloudGameInfo != null) {
                z6 = false;
                if (cloudGameInfo.supportMicroClient) {
                    z6 = false;
                    if (cloudGameInfo.cooperationMode == 4) {
                        z6 = true;
                    }
                }
            }
        }
        return z6;
    }
}
