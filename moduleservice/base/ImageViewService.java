package com.bilibili.moduleservice.base;

import android.content.Context;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/base/ImageViewService.class */
public interface ImageViewService {
    void showImageViewer(@Nullable Context context, @NotNull List<? extends ImageData> list, int i7);
}
