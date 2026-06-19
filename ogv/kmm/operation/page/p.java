package com.bilibili.ogv.kmm.operation.page;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/p.class */
public interface p {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/p$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f68642a;

        public a(@NotNull String str) {
            this.f68642a = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f68642a, ((a) obj).f68642a);
        }

        public final int hashCode() {
            return this.f68642a.hashCode();
        }

        @NotNull
        public final String toString() {
            return C8770a.a(new StringBuilder("Empty(message="), this.f68642a, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/p$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f68643a;

        public b(boolean z6) {
            this.f68643a = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f68643a == ((b) obj).f68643a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f68643a);
        }

        @NotNull
        public final String toString() {
            return androidx.appcompat.app.i.a(new StringBuilder("Failure(isNetworkError="), this.f68643a, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/p$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f68644a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1718617180;
        }

        @NotNull
        public final String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/p$d.class */
    @StabilityInferred(parameters = 0)
    public static final class d implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.ogv.kmm.operation.api.f f68645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final q91.i f68646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final MutableState f68647c = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

        public d(@NotNull com.bilibili.ogv.kmm.operation.api.f fVar, @NotNull q91.i iVar) {
            this.f68645a = fVar;
            this.f68646b = iVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f68645a, dVar.f68645a) && Intrinsics.areEqual(this.f68646b, dVar.f68646b);
        }

        public final int hashCode() {
            return this.f68646b.a.hashCode() + (this.f68645a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Ready(pageData=" + this.f68645a + ", refreshTime=" + this.f68646b + ")";
        }
    }
}
