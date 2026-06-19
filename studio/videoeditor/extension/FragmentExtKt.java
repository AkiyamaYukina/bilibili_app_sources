package com.bilibili.studio.videoeditor.extension;

import androidx.fragment.app.Fragment;
import com.bilibili.base.BiliContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/extension/FragmentExtKt.class */
public final class FragmentExtKt {
    public static final boolean isFragmentActive(@Nullable Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        boolean z6 = false;
        if (!fragment.isDetached()) {
            z6 = false;
            if (fragment.isAdded()) {
                z6 = true;
            }
        }
        return z6;
    }

    public static final void post(@Nullable final Fragment fragment, @NotNull final Function0<Unit> function0) {
        BiliContext.getMainHandler().post(new Runnable(fragment, function0) { // from class: com.bilibili.studio.videoeditor.extension.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Fragment f109569a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Function0 f109570b;

            {
                this.f109569a = fragment;
                this.f109570b = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Fragment fragment2 = this.f109569a;
                Function0 function02 = this.f109570b;
                if (FragmentExtKt.isFragmentActive(fragment2)) {
                    function02.invoke();
                }
            }
        });
    }

    public static final void postDelay(@Nullable Fragment fragment, long j7, @NotNull Function0<Unit> function0) {
        BiliContext.getMainHandler().postDelayed(new com.bilibili.lib.fasthybrid.uimodule.widget.playet.l(1, fragment, function0), j7);
    }
}
