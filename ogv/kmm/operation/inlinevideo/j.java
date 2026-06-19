package com.bilibili.ogv.kmm.operation.inlinevideo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.framework.exposure.core.ExposureLayoutInfo;
import com.bilibili.framework.exposure.core.ExposureLayoutInfoReceiver;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinevideo/j.class */
@StabilityInferred(parameters = 0)
public final class j implements ExposureLayoutInfoReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<ExposureLayoutInfo> f68508a = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinevideo/j$a.class */
    public interface a {

        /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.inlinevideo.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinevideo/j$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0414a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0414a f68509a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof C0414a);
            }

            public final int hashCode() {
                return 611415595;
            }

            @NotNull
            public final String toString() {
                return "NotNoticeable";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinevideo/j$a$b.class */
        @StabilityInferred(parameters = 0)
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final com.bilibili.framework.exposure.core.a f68510a;

            public b(@NotNull com.bilibili.framework.exposure.core.a aVar) {
                this.f68510a = aVar;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.areEqual(this.f68510a, ((b) obj).f68510a);
            }

            public final int hashCode() {
                return this.f68510a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "Noticeable(position=" + this.f68510a + ")";
            }
        }
    }

    public final void onNewLayoutInfoReceived(@Nullable ExposureLayoutInfo exposureLayoutInfo) {
        this.f68508a.setValue(exposureLayoutInfo);
    }
}
