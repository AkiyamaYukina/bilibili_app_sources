package com.bilibili.studio.videoeditor.bgm.bgmsearch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.appcompat.widget.AppCompatEditText;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmsearch/SearchEditText.class */
public class SearchEditText extends AppCompatEditText {
    public SearchEditText(Context context) {
        super(context);
    }

    public SearchEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            clearFocus();
            setFocusableInTouchMode(false);
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }
}
