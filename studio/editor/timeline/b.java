package com.bilibili.studio.editor.timeline;

import com.bilibili.lib.foundation.FoundationAlias;
import java.io.File;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/timeline/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final File f108266a = new File(FoundationAlias.getFapp().getApplicationContext().getFilesDir(), "upper_editor");

    @NotNull
    public static File a() {
        try {
            File file = f108266a;
            if (!file.exists()) {
                file.mkdirs();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return f108266a;
    }
}
