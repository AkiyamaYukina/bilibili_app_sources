package com.bilibili.playset.editor;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.bilibili.boxing.loader.IBoxingCrop;
import com.bilibili.boxing.model.config.CropConfig;
import com.yalantis.ucrop.UCrop;

/* JADX INFO: renamed from: com.bilibili.playset.editor.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/a.class */
public final class C5934a implements IBoxingCrop {
    public final Uri onCropFinish(int i7, Intent intent) {
        if (intent != null && UCrop.getError(intent) == null) {
            return UCrop.getOutput(intent);
        }
        return null;
    }

    public final void startCrop(Context context, Fragment fragment, @NonNull CropConfig cropConfig, @NonNull String str, int i7) {
        Uri uriBuild = new Uri.Builder().scheme("file").appendPath(str).build();
        UCrop.Options options = new UCrop.Options();
        options.setCompressionFormat(Bitmap.CompressFormat.PNG);
        options.withMaxResultSize(cropConfig.d, cropConfig.e);
        options.withAspectRatio(cropConfig.b, cropConfig.c);
        UCrop.of(uriBuild, cropConfig.a).withOptions(options).start(context, fragment, i7);
    }
}
