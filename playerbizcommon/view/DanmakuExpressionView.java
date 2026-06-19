package com.bilibili.playerbizcommon.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/DanmakuExpressionView.class */
public final class DanmakuExpressionView extends AppCompatImageView {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f80338g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public List<Expressions> f80339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Function0<Long> f80340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Function0<Long> f80341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Function1<? super String, Unit> f80342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public String f80343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public b f80344f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/DanmakuExpressionView$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Function0<List<Expressions>> f80345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Function0<Long> f80346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Function0<Long> f80347c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Function1<String, Unit> f80348d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Function0<? extends List<Expressions>> function0, @NotNull Function0<Long> function02, @NotNull Function0<Long> function03, @NotNull Function1<? super String, Unit> function1) {
            this.f80345a = function0;
            this.f80346b = function02;
            this.f80347c = function03;
            this.f80348d = function1;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/DanmakuExpressionView$b.class */
    public interface b {
        void onHide();

        void onShow();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/DanmakuExpressionView$c.class */
    public static final class c extends BaseImageDataSubscriber<DrawableHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DanmakuExpressionView f80349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f80350b;

        public c(DanmakuExpressionView danmakuExpressionView, String str) {
            this.f80349a = danmakuExpressionView;
            this.f80350b = str;
        }

        public final void onFailureImpl(ImageDataSource<DrawableHolder> imageDataSource) {
            int i7 = DanmakuExpressionView.f80338g;
            this.f80349a.q();
        }

        public final void onNewResultImpl(ImageDataSource<DrawableHolder> imageDataSource) {
            DrawableHolder drawableHolder;
            Drawable drawable = (imageDataSource == null || (drawableHolder = (DrawableHolder) imageDataSource.getResult()) == null) ? null : drawableHolder.get();
            DanmakuExpressionView danmakuExpressionView = this.f80349a;
            if (drawable == null) {
                int i7 = DanmakuExpressionView.f80338g;
                danmakuExpressionView.q();
                Unit unit = Unit.INSTANCE;
            }
            int i8 = DanmakuExpressionView.f80338g;
            if (danmakuExpressionView.getVisibility() != 0) {
                String str = danmakuExpressionView.f80343e;
                String str2 = this.f80350b;
                if (Intrinsics.areEqual(str, str2)) {
                    danmakuExpressionView.setVisibility(0);
                    Function1<? super String, Unit> function1 = danmakuExpressionView.f80342d;
                    if (function1 != null) {
                        function1.invoke(str2);
                    }
                    b bVar = danmakuExpressionView.f80344f;
                    if (bVar != null) {
                        bVar.onShow();
                    }
                }
            }
            danmakuExpressionView.setImageDrawable(drawable);
        }
    }

    public DanmakuExpressionView(@NotNull Context context) {
        this(context, null, 0);
    }

    public DanmakuExpressionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DanmakuExpressionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, 0);
        this.f80343e = "";
        setVisibility(8);
    }

    public final void q() {
        if (getVisibility() == 0) {
            setVisibility(8);
            b bVar = this.f80344f;
            if (bVar != null) {
                bVar.onHide();
            }
        }
    }

    public final void setData(@NotNull a aVar) {
        this.f80339a = (List) aVar.f80345a.invoke();
        this.f80340b = aVar.f80346b;
        this.f80341c = aVar.f80347c;
        this.f80342d = aVar.f80348d;
    }

    public final void setVisibilityObserver(@NotNull b bVar) {
        this.f80344f = bVar;
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.view.DanmakuExpressionView.v(java.lang.String):void");
    }
}
