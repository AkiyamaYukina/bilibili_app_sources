package com.bilibili.studio.editor.moudle.caption.v1.captionrect;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import px0.b;
import qx0.d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/v1/captionrect/CaptionRectV2.class */
public class CaptionRectV2 extends b {
    public CaptionRectV2(Context context) {
        super(context);
    }

    public CaptionRectV2(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // px0.b
    public d getCaptionRectEventHelper() {
        return new qx0.b(this);
    }
}
