package com.bilibili.pegasus.components.graduation;

import android.R;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.pegasus.components.graduation.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/w.class */
public final class C5621w {
    public static final void a(@NotNull Window window) {
        window.setLayout(-1, -1);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.getDecorView().setFitsSystemWindows(false);
        View viewFindViewById = window.getDecorView().findViewById(R.id.content);
        if (viewFindViewById != null) {
            viewFindViewById.setPadding(0, 0, 0, 0);
            viewFindViewById.setFitsSystemWindows(false);
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = layoutParams;
            if (layoutParams == null) {
                layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
            }
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            viewFindViewById.setLayoutParams(layoutParams2);
        }
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setDimAmount(0.0f);
        window.clearFlags(201327616);
        window.addFlags(Integer.MIN_VALUE);
        window.setFlags(768, 768);
        WindowCompat.setDecorFitsSystemWindows(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 5890);
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
        insetsController.setSystemBarsBehavior(2);
        insetsController.hide(WindowInsetsCompat.Type.navigationBars());
    }
}
