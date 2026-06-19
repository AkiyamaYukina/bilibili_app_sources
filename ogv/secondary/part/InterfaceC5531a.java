package com.bilibili.ogv.secondary.part;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/a.class */
public interface InterfaceC5531a {

    /* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/a$a.class */
    @StabilityInferred(parameters = 1)
    public static final class C0459a implements InterfaceC5531a {
        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0459a)) {
                return false;
            }
            ((C0459a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        @NotNull
        public final String toString() {
            return "Failure(isNetworkError=false)";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.a$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/a$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b implements InterfaceC5531a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f72805a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 882512776;
        }

        @NotNull
        public final String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.a$c */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/a$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c implements InterfaceC5531a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.ogv.secondary.api.c f72806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final MutableState f72807b = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

        public c(@NotNull com.bilibili.ogv.secondary.api.c cVar) {
            this.f72806a = cVar;
        }
    }
}
