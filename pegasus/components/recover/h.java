package com.bilibili.pegasus.components.recover;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.ColorFilter;
import kntr.base.imageloader.ImageRequest;
import kntr.base.imageloader.ImmutableImageRequest;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/h.class */
public final /* synthetic */ class h {
    public static ImmutableImageRequest a(ImageRequest imageRequest, ColorFilter colorFilter, Composer composer) {
        imageRequest.colorFilter(colorFilter);
        ImmutableImageRequest immutableImageRequestBuild = imageRequest.build();
        composer.endReplaceGroup();
        return immutableImageRequestBuild;
    }
}
