package com.bilibili.studio.videoeditor.capturev3.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/widget/ScrollTextView.class */
public class ScrollTextView extends AppCompatTextView {
    public ScrollTextView(Context context) {
        super(context);
    }

    public ScrollTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return true;
    }
}
