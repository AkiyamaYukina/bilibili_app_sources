package com.bilibili.qrcode;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.IntRange;
import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/qrcode/HuaweiScanService.class */
public interface HuaweiScanService {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/qrcode/HuaweiScanService$CallBack.class */
    public interface CallBack {
        void onFail(@NotNull Exception exc);

        void onSuccess(@NotNull List<QrScanResult> list);
    }

    @Nullable
    QrScanResult decode(@NotNull Context context, @NotNull Bitmap bitmap, @NotNull Pair<Integer, int[]> pair);

    void decodeMultiAsync(@NotNull Context context, @NotNull Bitmap bitmap, @NotNull CallBack callBack, @NotNull Pair<Integer, int[]> pair);

    int getHmsScanTypeValue(@IntRange(from = 0, to = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS) int i7);
}
