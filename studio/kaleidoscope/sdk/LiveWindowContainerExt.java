package com.bilibili.studio.kaleidoscope.sdk;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/LiveWindowContainerExt.class */
public class LiveWindowContainerExt extends LiveWindowContainer implements LiveWindowExt {
    public LiveWindowContainerExt(@NonNull Context context) {
        super(context);
    }

    public LiveWindowContainerExt(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveWindowContainerExt(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }

    public LiveWindowContainerExt(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
    }

    public static void addLiveWindowExt(@NonNull LiveWindowExt liveWindowExt, @NonNull View view) {
        if (!(liveWindowExt instanceof LiveWindowContainerExt)) {
            throw new IllegalArgumentException("Container must be instanceof LiveWindowContainerExt");
        }
        if (!(view instanceof LiveWindow)) {
            throw new IllegalArgumentException("Impl must be instanceof LiveWindow");
        }
        if (!(view instanceof LiveWindowExt)) {
            throw new IllegalArgumentException("Impl must be instanceof LiveWindowExt");
        }
        LiveWindowContainerExt liveWindowContainerExt = (LiveWindowContainerExt) liveWindowExt;
        if (liveWindowContainerExt.getChildCount() > 0) {
            liveWindowContainerExt.removeViewAt(0);
        }
        liveWindowContainerExt.addView(view, 0, new FrameLayout.LayoutParams(-1, -1));
        liveWindowContainerExt.initLazyAttr();
        liveWindowContainerExt.clearLazyAttr();
    }

    @Nullable
    public static View getLiveWindowExt(@NonNull LiveWindowExt liveWindowExt) {
        LiveWindowContainerExt liveWindowContainerExt = (LiveWindowContainerExt) liveWindowExt;
        if (liveWindowContainerExt.getChildCount() > 0) {
            return liveWindowContainerExt.getChildAt(0);
        }
        return null;
    }

    public LiveWindowExt getLiveWindowExt() {
        return (LiveWindowExt) getImpl();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindowExt
    public Context getViewExtContext() {
        return getContext();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindowContainer
    public void initAttr(String str, Object obj) {
        super.initAttr(str, obj);
        if ("opaque".equals(str)) {
            setOpaqueX(((Boolean) obj).booleanValue());
        }
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.LiveWindowExt
    public void setOpaqueX(boolean z6) {
        if (lazyInit("opaque", Boolean.valueOf(z6))) {
            return;
        }
        getLiveWindowExt().setOpaqueX(z6);
    }
}
