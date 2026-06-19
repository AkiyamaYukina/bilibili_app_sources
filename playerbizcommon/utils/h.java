package com.bilibili.playerbizcommon.utils;

import android.content.Context;
import android.text.TextUtils;
import com.opensource.svgaplayer.SVGAParser;
import com.opensource.svgaplayer.SVGAVideoEntity;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/h.class */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final HashSet<String> f80288a = new HashSet<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/h$a.class */
    public static final class a implements SVGAParser.ParseCompletion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f80289a;

        public a(@NotNull String str) {
            this.f80289a = str;
        }

        public final void onCacheExist() {
            BLog.i("svga cache exist");
        }

        public final void onComplete(@NotNull SVGAVideoEntity sVGAVideoEntity) {
        }

        public final void onError() {
            StringBuilder sb = new StringBuilder("svga download error : ");
            String str = this.f80289a;
            sb.append(str);
            BLog.i(sb.toString());
            h.f80288a.remove(str);
        }
    }

    @JvmStatic
    public static final void a(@Nullable Context context, @Nullable String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        HashSet<String> hashSet = f80288a;
        if (CollectionsKt.contains(hashSet, str)) {
            return;
        }
        BLog.i("svga startDownload: " + str);
        try {
            new SVGAParser(context).parseOnlyCache(new URL(str), new a(str));
            hashSet.add(str);
        } catch (MalformedURLException e7) {
            f80288a.remove(str);
        }
    }
}
