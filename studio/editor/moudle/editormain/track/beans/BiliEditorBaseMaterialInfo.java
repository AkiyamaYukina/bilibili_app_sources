package com.bilibili.studio.editor.moudle.editormain.track.beans;

import androidx.annotation.Keep;
import java.util.HashMap;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/beans/BiliEditorBaseMaterialInfo.class */
@Keep
public class BiliEditorBaseMaterialInfo {

    @NotNull
    private HashMap<String, Object> attachMap;

    @NotNull
    private String id;

    public BiliEditorBaseMaterialInfo() {
        this(null, null, 3, null);
    }

    public BiliEditorBaseMaterialInfo(@NotNull String str, @NotNull HashMap<String, Object> map) {
        this.id = str;
        this.attachMap = map;
    }

    public /* synthetic */ BiliEditorBaseMaterialInfo(String str, HashMap map, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? UUID.randomUUID().toString() : str, (i7 & 2) != 0 ? new HashMap() : map);
    }

    public final void addAttachObj(@NotNull String str, @Nullable Object obj) {
        this.attachMap.put(str, obj);
    }

    @NotNull
    public final HashMap<String, Object> getAttachMap() {
        return this.attachMap;
    }

    @Nullable
    public final Object getAttachObj(@NotNull String str) {
        return this.attachMap.get(str);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Object removeAttachObj(@NotNull String str) {
        return this.attachMap.remove(str);
    }

    public final void setAttachMap(@NotNull HashMap<String, Object> map) {
        this.attachMap = map;
    }

    public final void setId(@NotNull String str) {
        this.id = str;
    }
}
