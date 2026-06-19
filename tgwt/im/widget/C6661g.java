package com.bilibili.tgwt.im.widget;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.chatroomsdk.ChatBubble;
import com.bilibili.chatroomsdk.ColorType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.tgwt.im.widget.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/g.class */
@StabilityInferred(parameters = 0)
public final class C6661g extends androidx.databinding.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f111415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final ChatBubble f111416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f111417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public InterfaceC6660f f111418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f111419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public BangumiVoiceRecordState f111420f = BangumiVoiceRecordState.PREV_RECORD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f111421g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public String f111422i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public CharSequence f111423j;

    /* JADX INFO: renamed from: com.bilibili.tgwt.im.widget.g$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/g$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f111424a;

        static {
            int[] iArr = new int[ColorType.values().length];
            try {
                iArr[ColorType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ColorType.PURE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[ColorType.GRADIENT.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f111424a = iArr;
        }
    }

    public C6661g(boolean z6, @Nullable ChatBubble chatBubble, int i7) {
        this.f111415a = z6;
        this.f111416b = chatBubble;
        this.f111417c = i7;
        this.f111421g = z6 ? 30.0f : 40.0f;
        this.f111422i = "";
        this.f111423j = "";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable m(float r7, @org.jetbrains.annotations.NotNull android.content.Context r8) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 577
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.im.widget.C6661g.m(float, android.content.Context):android.graphics.drawable.Drawable");
    }

    public final void n(@NotNull BangumiVoiceRecordState bangumiVoiceRecordState) {
        if (Intrinsics.areEqual(bangumiVoiceRecordState, this.f111420f)) {
            return;
        }
        this.f111420f = bangumiVoiceRecordState;
        notifyPropertyChanged(735);
    }
}
