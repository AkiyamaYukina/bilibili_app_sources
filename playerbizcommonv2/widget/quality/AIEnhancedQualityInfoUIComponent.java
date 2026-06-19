package com.bilibili.playerbizcommonv2.widget.quality;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.framework.exposure.core.ExposureEntry;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/AIEnhancedQualityInfoUIComponent.class */
@StabilityInferred(parameters = 0)
public final class AIEnhancedQualityInfoUIComponent implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f82629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f82630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f82631c;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.quality.AIEnhancedQualityInfoUIComponent$bindToView$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/AIEnhancedQualityInfoUIComponent$bindToView$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        Object result;
        final AIEnhancedQualityInfoUIComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AIEnhancedQualityInfoUIComponent aIEnhancedQualityInfoUIComponent, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = aIEnhancedQualityInfoUIComponent;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.bindToView(null, this);
        }
    }

    public AIEnhancedQualityInfoUIComponent(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull ExposureEntry exposureEntry) {
        this.f82629a = function0;
        this.f82630b = function02;
        this.f82631c = exposureEntry;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object bindToView(@org.jetbrains.annotations.NotNull com.bilibili.app.gemini.ui.UIComponent.b<androidx.compose.ui.platform.ComposeView> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.quality.AIEnhancedQualityInfoUIComponent.bindToView(com.bilibili.app.gemini.ui.UIComponent$b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setLayoutParams(layoutParams);
        return new UIComponent.b(composeView);
    }
}
