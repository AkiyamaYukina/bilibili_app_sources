package com.bilibili.playerbizcommonv2.danmaku.input.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.community.service.dm.v1.Expressions;
import com.bilibili.lib.image2.bean.BaseImageDataSubscriber;
import com.bilibili.lib.image2.bean.DrawableHolder;
import com.bilibili.lib.image2.bean.ImageDataSource;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/widget/PlayerDanmakuExpressionView.class */
@StabilityInferred(parameters = 0)
public final class PlayerDanmakuExpressionView extends AppCompatImageView {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f81175g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public List<Expressions> f81176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Function0<Long> f81177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Function0<Long> f81178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Function1<? super String, Unit> f81179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public String f81180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public b f81181f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/widget/PlayerDanmakuExpressionView$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Function0<List<Expressions>> f81182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Function0<Long> f81183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Function0<Long> f81184c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Function1<String, Unit> f81185d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Function0<? extends List<Expressions>> function0, @NotNull Function0<Long> function02, @NotNull Function0<Long> function03, @NotNull Function1<? super String, Unit> function1) {
            this.f81182a = function0;
            this.f81183b = function02;
            this.f81184c = function03;
            this.f81185d = function1;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/widget/PlayerDanmakuExpressionView$b.class */
    public interface b {
        void onHide();

        void onShow();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/widget/PlayerDanmakuExpressionView$c.class */
    public static final class c extends BaseImageDataSubscriber<DrawableHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerDanmakuExpressionView f81186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81187b;

        public c(PlayerDanmakuExpressionView playerDanmakuExpressionView, String str) {
            this.f81186a = playerDanmakuExpressionView;
            this.f81187b = str;
        }

        public final void onFailureImpl(ImageDataSource<DrawableHolder> imageDataSource) {
            int i7 = PlayerDanmakuExpressionView.f81175g;
            this.f81186a.q();
        }

        public final void onNewResultImpl(ImageDataSource<DrawableHolder> imageDataSource) {
            DrawableHolder drawableHolder;
            Drawable drawable = (imageDataSource == null || (drawableHolder = (DrawableHolder) imageDataSource.getResult()) == null) ? null : drawableHolder.get();
            PlayerDanmakuExpressionView playerDanmakuExpressionView = this.f81186a;
            if (drawable == null) {
                int i7 = PlayerDanmakuExpressionView.f81175g;
                playerDanmakuExpressionView.q();
                Unit unit = Unit.INSTANCE;
            }
            int i8 = PlayerDanmakuExpressionView.f81175g;
            if (playerDanmakuExpressionView.getVisibility() != 0) {
                String str = playerDanmakuExpressionView.f81180e;
                String str2 = this.f81187b;
                if (Intrinsics.areEqual(str, str2)) {
                    playerDanmakuExpressionView.setVisibility(0);
                    Function1<? super String, Unit> function1 = playerDanmakuExpressionView.f81179d;
                    if (function1 != null) {
                        function1.invoke(str2);
                    }
                    b bVar = playerDanmakuExpressionView.f81181f;
                    if (bVar != null) {
                        bVar.onShow();
                    }
                }
            }
            playerDanmakuExpressionView.setImageDrawable(drawable);
        }
    }

    public PlayerDanmakuExpressionView(@NotNull Context context) {
        this(context, null, 0);
    }

    public PlayerDanmakuExpressionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerDanmakuExpressionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, 0);
        this.f81180e = "";
        setVisibility(8);
    }

    public final void q() {
        if (getVisibility() == 0) {
            setVisibility(8);
            b bVar = this.f81181f;
            if (bVar != null) {
                bVar.onHide();
            }
        }
    }

    public final void setData(@NotNull a aVar) {
        this.f81176a = (List) aVar.f81182a.invoke();
        this.f81177b = aVar.f81183b;
        this.f81178c = aVar.f81184c;
        this.f81179d = aVar.f81185d;
    }

    public final void setVisibilityObserver(@NotNull b bVar) {
        this.f81181f = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0025, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0052, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(@org.jetbrains.annotations.NotNull java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.input.widget.PlayerDanmakuExpressionView.v(java.lang.String):void");
    }
}
