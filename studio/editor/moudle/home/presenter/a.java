package com.bilibili.studio.editor.moudle.home.presenter;

import android.widget.PopupWindow;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/home/presenter/a.class */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Lazy<a> f107228b = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new FD.a(6));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArrayList<PopupWindow> f107229a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.home.presenter.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/home/presenter/a$a.class */
    public static final class C1194a {
        @NotNull
        public static a a() {
            return (a) a.f107228b.getValue();
        }
    }
}
