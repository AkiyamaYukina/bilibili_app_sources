package com.bilibili.studio.kaleidoscope.adapter;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/adapter/EditorManager.class */
public final class EditorManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Manager f108360a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/adapter/EditorManager$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EditorManager f108361a = new EditorManager();
    }

    public static EditorManager getInstance() {
        return a.f108361a;
    }

    @Nullable
    public Manager getManager() {
        return this.f108360a;
    }
}
