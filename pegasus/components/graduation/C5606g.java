package com.bilibili.pegasus.components.graduation;

import androidx.lifecycle.Observer;
import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.pegasus.components.graduation.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/g.class */
public final class C5606g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f76122a;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.graduation.g$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/g$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5605f f76123a;

        public a(C5605f c5605f) {
            this.f76123a = c5605f;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f76123a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f76123a.invoke(obj);
        }
    }
}
