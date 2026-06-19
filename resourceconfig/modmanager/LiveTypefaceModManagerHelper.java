package com.bilibili.resourceconfig.modmanager;

import Js0.j;
import android.graphics.Typeface;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.mod.ModResource;
import com.bilibili.lib.mod.ModResourceClient;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.C8397q;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/resourceconfig/modmanager/LiveTypefaceModManagerHelper.class */
public final class LiveTypefaceModManagerHelper {

    @NotNull
    public static final LiveTypefaceModManagerHelper INSTANCE = new LiveTypefaceModManagerHelper();

    public final void checkTypefaceMod() {
        LiveFileModManagerHelper.INSTANCE.checkModResource("bili_typeface", new j(0));
    }

    @Nullable
    public final Typeface getTypeface() {
        String typefacePath = getTypefacePath();
        Typeface typefaceCreateFromFile = null;
        if (typefacePath != null) {
            try {
                typefaceCreateFromFile = Typeface.createFromFile(typefacePath);
            } catch (Exception e7) {
                C8397q.a("createFromFile failed: ", "LiveTypefaceModManagerHelper", e7);
                typefaceCreateFromFile = null;
            }
        }
        return typefaceCreateFromFile;
    }

    @Nullable
    public final File getTypefaceFile() {
        try {
            ModResource modResource = ModResourceClient.getInstance().get(BiliContext.application(), "live", "bili_typeface");
            if (modResource.isAvailable()) {
                return modResource.retrieveFile("song_typeface.ttf");
            }
            return null;
        } catch (Exception e7) {
            BLog.e("LiveTypefaceModManagerHelper", e7.getMessage());
            return null;
        }
    }

    @Nullable
    public final String getTypefacePath() {
        File typefaceFile = getTypefaceFile();
        return typefaceFile != null ? typefaceFile.getPath() : null;
    }
}
