package com.bilibili.search2.result.holder.author;

import android.graphics.Point;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.image2.bean.IThumbnailSizeController;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/author/t.class */
@StabilityInferred(parameters = 1)
public final class t implements IThumbnailSizeController {
    @NotNull
    public final Point adjust(@NotNull IThumbnailSizeController.a aVar) {
        return new Point(aVar.b, aVar.c);
    }

    @NotNull
    public final String tag() {
        return "SearchThumbnailSizeController";
    }
}
