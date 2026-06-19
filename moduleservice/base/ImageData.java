package com.bilibili.moduleservice.base;

import androidx.annotation.Keep;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/base/ImageData.class */
@Keep
public class ImageData {

    @JvmField
    public int height;

    @JvmField
    public int originWidth;

    @JvmField
    public int originheight;

    @JvmField
    public long size;

    @JvmField
    @Nullable
    public String url;

    @JvmField
    public int width;
}
