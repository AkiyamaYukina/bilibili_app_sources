package com.bilibili.moduleservice.main;

import android.content.Context;
import android.content.Intent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/main/ImagePickService.class */
public interface ImagePickService {
    @NotNull
    Class<?> getImagePickActivityClass();

    @Nullable
    Intent getPickImageIntent(@Nullable Context context, @Nullable Mode mode);
}
