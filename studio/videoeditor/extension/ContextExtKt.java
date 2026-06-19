package com.bilibili.studio.videoeditor.extension;

import android.content.Context;
import com.bilibili.base.BiliContext;
import com.bilibili.base.MainThread;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/extension/ContextExtKt.class */
public final class ContextExtKt {
    public static final boolean isActivityActive(@Nullable Context context) {
        return ActivityExtKt.isActive(ContextUtilKt.findActivityOrNull(context));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0017, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.lifecycle.Lifecycle lifecycle(@org.jetbrains.annotations.Nullable android.content.Context r2) {
        /*
            r0 = r2
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r2
            boolean r0 = r0 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L15
            r0 = r2
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            r2 = r0
            goto L17
        L15:
            r0 = 0
            r2 = r0
        L17:
            r0 = r2
            if (r0 == 0) goto L40
            r0 = r2
            boolean r0 = r0 instanceof androidx.lifecycle.LifecycleOwner
            if (r0 == 0) goto L2c
            r0 = r2
            androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            return r0
        L2c:
            r0 = r2
            android.content.Context r0 = r0.getBaseContext()
            r2 = r0
            r0 = r2
            boolean r0 = r0 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L15
            r0 = r2
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            r2 = r0
            goto L17
        L40:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.extension.ContextExtKt.lifecycle(android.content.Context):androidx.lifecycle.Lifecycle");
    }

    public static final void postSafely(@Nullable final Context context, @NotNull final Function0<Unit> function0) {
        BiliContext.getMainHandler().post(new Runnable(context, function0) { // from class: com.bilibili.studio.videoeditor.extension.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Context f109566a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Function0 f109567b;

            {
                this.f109566a = context;
                this.f109567b = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = this.f109566a;
                Function0 function02 = this.f109567b;
                if (ContextExtKt.isActivityActive(context2)) {
                    function02.invoke();
                }
            }
        });
    }

    public static final void runOnMainThreadSafely(@Nullable Context context, @NotNull Function0<Unit> function0) {
        MainThread.runOnMainThread(new com.bilibili.app.comm.list.common.widget.bottomsheet.drag.f(1, context, function0));
    }
}
