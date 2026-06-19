package com.bilibili.pegasus.holders.bannerv8;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.AccessibilityDelegateCompat;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/m.class */
@StabilityInferred(parameters = 0)
public final class m extends AccessibilityDelegateCompat {
    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean dispatchPopulateAccessibilityEvent(@NotNull View view, @NotNull AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.getText().add("");
        return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }
}
