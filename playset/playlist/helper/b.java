package com.bilibili.playset.playlist.helper;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.EnvironmentCompat;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/helper/b.class */
@StabilityInferred(parameters = 1)
public final class b {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/helper/b$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public static String f85325b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f85324a = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static HashMap<String, String> f85326c = new HashMap<>(2);

        public static void b() {
            String str = f85325b;
            if (str != null) {
                if (f85326c.size() == 0) {
                    Neurons.reportClick$default(false, str, (Map) null, 4, (Object) null);
                } else {
                    Neurons.reportClick(false, str, f85326c);
                }
            }
        }

        @NotNull
        public final void a(@NotNull String str) {
            f85325b = str;
            f85326c = new HashMap<>(2);
        }

        @NotNull
        public final void c(@NotNull String str, @Nullable String str2) {
            if (str2 != null) {
                f85326c.put(str, str2);
            }
        }
    }

    public static void a(long j7, long j8) {
        if ("1".length() > 0) {
            a aVar = a.f85324a;
            aVar.a("playlist.playlist-detail.PLshare.0.click");
            aVar.c("playlist_id", String.valueOf(j7));
            aVar.c(EditCustomizeSticker.TAG_MID, j8 == 0 ? EnvironmentCompat.MEDIA_UNKNOWN : String.valueOf(j8));
            aVar.c("channel", "1");
            a.b();
        }
    }
}
