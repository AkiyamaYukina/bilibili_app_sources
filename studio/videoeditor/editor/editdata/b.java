package com.bilibili.studio.videoeditor.editor.editdata;

import android.net.Uri;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/editdata/b.class */
public final class b {
    @NotNull
    public static final Uri a(@NotNull Uri uri, @NotNull Map<String, String> map) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        HashSet<String> hashSet = new HashSet(map.keySet());
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null) {
            for (String str : queryParameterNames) {
                if (hashSet.contains(str)) {
                    hashSet.remove(str);
                }
            }
        }
        for (String str2 : hashSet) {
            String str3 = map.get(str2);
            String str4 = str3;
            if (str3 == null) {
                str4 = "";
            }
            builderBuildUpon.appendQueryParameter(str2, str4);
        }
        return builderBuildUpon.build();
    }

    @NotNull
    public static final Uri b(@NotNull Uri uri, @NotNull Map<String, String> map) {
        Uri.Builder builderPath = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath());
        HashSet<String> hashSet = new HashSet(map.keySet());
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null) {
            for (String str : queryParameterNames) {
                if (hashSet.contains(str)) {
                    String str2 = map.get(str);
                    String str3 = str2;
                    if (str2 == null) {
                        str3 = "";
                    }
                    builderPath.appendQueryParameter(str, str3);
                    hashSet.remove(str);
                } else {
                    builderPath.appendQueryParameter(str, uri.getQueryParameter(str));
                }
            }
        }
        for (String str4 : hashSet) {
            String str5 = map.get(str4);
            String str6 = str5;
            if (str5 == null) {
                str6 = "";
            }
            builderPath.appendQueryParameter(str4, str6);
        }
        return builderPath.build();
    }

    @Nullable
    public static final Uri c(@Nullable String str) {
        Uri uri = null;
        if (str != null) {
            Uri uri2 = Uri.parse(str);
            uri = null;
            if (uri2 != null) {
                uri = null;
                if (uri2.isHierarchical()) {
                    uri = uri2;
                }
            }
        }
        return uri;
    }
}
