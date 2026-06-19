package com.bilibili.studio.videoeditor.loader;

import android.os.Build;
import androidx.annotation.NonNull;
import com.bilibili.lib.dd.DeviceDecision;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/loader/f.class */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f109795a = {"mp4", "flv", "wmv", "mov", "webm", "mpeg4", "ts", "mpg", "rm", "rmvb", "mkv", "png", "jpg", "jpeg", "bmp", "webp", "heic", "avi", "3gp", "f4v", "m2t", "3g2", "m4v", "vob", "swf", "m2v", "m2ts", "asf"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f109796b = {"png", "jpg", "jpeg", "bmp", "webp"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f109797c = {"mp4", "flv", "avi", "wmv", "mov", "webm", "mpeg4", "ts", "mpg", "rm", "rmvb", "mkv", "3gp", "f4v", "m2t", "3g2", "m4v", "vob", "swf", "m2v", "m2ts", "asf"};

    @NonNull
    public static List<String> a() {
        ArrayList arrayList = new ArrayList(Arrays.asList(f109796b));
        if (Build.VERSION.SDK_INT >= 29) {
            arrayList.add("heic");
        }
        if (b()) {
            arrayList.add("gif");
        }
        return arrayList;
    }

    public static boolean b() {
        Lazy lazy = zw0.b.f130950a;
        return DeviceDecision.INSTANCE.getBoolean("uper.enable_album_gif", true);
    }
}
