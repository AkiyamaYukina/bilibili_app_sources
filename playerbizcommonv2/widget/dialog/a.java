package com.bilibili.playerbizcommonv2.widget.dialog;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.halfscreen.SearchCoreHostFragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dialog/a.class */
@StabilityInferred(parameters = 1)
public abstract class a {

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dialog.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dialog/a$a.class */
    @StabilityInferred(parameters = 0)
    public static final class C0541a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final SearchCoreHostFragment f82482a;

        public C0541a(@NotNull SearchCoreHostFragment searchCoreHostFragment) {
            this.f82482a = searchCoreHostFragment;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0541a) && Intrinsics.areEqual(this.f82482a, ((C0541a) obj).f82482a);
        }

        public final int hashCode() {
            return this.f82482a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Instance(fragment=" + this.f82482a + ")";
        }
    }
}
