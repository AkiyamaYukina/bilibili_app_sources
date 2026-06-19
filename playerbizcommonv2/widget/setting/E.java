package com.bilibili.playerbizcommonv2.widget.setting;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Stable;
import com.bilibili.playerbizcommonv2.widget.quality.C5821s;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/E.class */
public interface E {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/E$a.class */
    @Stable
    public static final class a implements E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f83083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f83084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final MutableState f83085c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final C5821s f83086d;

        public a(@NotNull String str, @NotNull String str2, @NotNull MutableState mutableState, @NotNull C5821s c5821s) {
            this.f83083a = str;
            this.f83084b = str2;
            this.f83085c = mutableState;
            this.f83086d = c5821s;
        }
    }
}
