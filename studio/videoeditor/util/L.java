package com.bilibili.studio.videoeditor.util;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/L.class */
public final class L {
    public static void a(@Nullable ViewGroup viewGroup, @Nullable ImageView imageView, @Nullable TextView textView, String str) {
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        if (imageView != null) {
            imageView.setImageResource(2131235613);
            imageView.setVisibility(0);
        }
        if (textView != null) {
            if (TextUtils.isEmpty(str)) {
                textView.setVisibility(8);
            } else {
                textView.setText(str);
                textView.setVisibility(0);
            }
        }
    }
}
