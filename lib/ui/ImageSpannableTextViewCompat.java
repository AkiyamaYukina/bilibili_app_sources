package com.bilibili.lib.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.util.AttributeSet;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/ImageSpannableTextViewCompat.class */
public class ImageSpannableTextViewCompat extends ImageSpannableTextView {
    public ImageSpannableTextViewCompat(Context context) {
        this(context, null);
    }

    public ImageSpannableTextViewCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ImageSpannableTextViewCompat(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }

    private ImageSpan2[] getImages2() {
        if (isHasImages() && length() > 0) {
            CharSequence text = getText();
            if (text instanceof Spanned) {
                return (ImageSpan2[]) ((Spanned) text).getSpans(0, length(), ImageSpan2.class);
            }
        }
        return new ImageSpan2[0];
    }

    @Override // com.bilibili.lib.ui.ImageSpannableTextView
    public void onAttach() {
        super.onAttach();
        for (ImageSpan2 imageSpan2 : getImages2()) {
            imageSpan2.onAttach(this);
        }
    }

    @Override // com.bilibili.lib.ui.ImageSpannableTextView
    public void onDetach() {
        super.onDetach();
        for (ImageSpan2 imageSpan2 : getImages2()) {
            Drawable drawable = imageSpan2.getDrawable();
            if (drawable != null) {
                unscheduleDrawable(drawable);
            }
            imageSpan2.onDetach();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    @Override // com.bilibili.lib.ui.ImageSpannableTextView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onTextSet(java.lang.CharSequence r6) {
        /*
            r5 = this;
            r0 = r5
            boolean r0 = r0.isHasImages()
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L14
            r0 = r5
            r0.onDetach()
            r0 = r5
            r1 = 0
            r0.setHasImages(r1)
        L14:
            r0 = r6
            boolean r0 = r0 instanceof android.text.Spanned
            if (r0 == 0) goto L69
            r0 = r6
            android.text.Spanned r0 = (android.text.Spanned) r0
            r10 = r0
            r0 = r10
            r1 = 0
            r2 = r6
            int r2 = r2.length()
            java.lang.Class<com.bilibili.lib.ui.ImageSpan2> r3 = com.bilibili.lib.ui.ImageSpan2.class
            java.lang.Object[] r0 = r0.getSpans(r1, r2, r3)
            com.bilibili.lib.ui.ImageSpan2[] r0 = (com.bilibili.lib.ui.ImageSpan2[]) r0
            r9 = r0
            r0 = r10
            r1 = 0
            r2 = r6
            int r2 = r2.length()
            java.lang.Class<com.bilibili.lib.ui.ImageSpan> r3 = com.bilibili.lib.ui.ImageSpan.class
            java.lang.Object[] r0 = r0.getSpans(r1, r2, r3)
            com.bilibili.lib.ui.ImageSpan[] r0 = (com.bilibili.lib.ui.ImageSpan[]) r0
            r6 = r0
            r0 = r9
            if (r0 == 0) goto L55
            r0 = r9
            int r0 = r0.length
            if (r0 > 0) goto L62
        L55:
            r0 = r8
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L64
            r0 = r8
            r7 = r0
            r0 = r6
            int r0 = r0.length
            if (r0 <= 0) goto L64
        L62:
            r0 = 1
            r7 = r0
        L64:
            r0 = r5
            r1 = r7
            r0.setHasImages(r1)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.ui.ImageSpannableTextViewCompat.onTextSet(java.lang.CharSequence):void");
    }
}
