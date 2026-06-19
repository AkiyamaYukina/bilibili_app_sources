package com.bilibili.ogv.story;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.video.story.helper.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/OgvStoryTitleWidget.class */
@StabilityInferred(parameters = 0)
public final class OgvStoryTitleWidget extends AppCompatTextView implements com.bilibili.video.story.action.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f73045d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public com.bilibili.video.story.action.g f73046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final b0.a f73047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f73048c;

    public OgvStoryTitleWidget(@NotNull Context context) {
        this(context, null, 0);
    }

    public OgvStoryTitleWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OgvStoryTitleWidget(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, 0);
        this.f73047b = new b0.a();
        this.f73048c = getContext().getResources().getDisplayMetrics().widthPixels - Uj0.c.b(80.0f, getContext());
    }

    public final void Y(@NotNull com.bilibili.video.story.action.g gVar) {
        this.f73046a = gVar;
    }

    public final void onStart(int i7) {
    }

    public final void onStop(int i7) {
    }

    public final void onUnbind() {
        this.f73046a = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Type inference failed for: r0v70, types: [Zq0.f, android.text.style.ImageSpan, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.text.SpannableString] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(@org.jetbrains.annotations.NotNull com.bilibili.video.story.action.StoryActionType r10, @org.jetbrains.annotations.Nullable com.bilibili.video.story.action.i r11) {
        /*
            Method dump skipped, instruction units count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.story.OgvStoryTitleWidget.r(com.bilibili.video.story.action.StoryActionType, com.bilibili.video.story.action.i):void");
    }
}
