package com.bilibili.playerbizcommon.widget.control.seekbar;

import Je1.k;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.bean.BaseImageDataSubscriber;
import com.bilibili.lib.image2.bean.DrawableHolder;
import com.bilibili.lib.image2.bean.ImageDataSource;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/seekbar/PlayerSeekbarPngThumb.class */
public final class PlayerSeekbarPngThumb implements com.bilibili.playerbizcommon.widget.control.seekbar.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public f f80600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f80601b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Drawable f80603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Drawable f80604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Drawable f80605f;

    @Nullable
    public ValueAnimator h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public a f80607i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f80602c = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f80606g = 1.0f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/seekbar/PlayerSeekbarPngThumb$a.class */
    public static final class a extends Gh1.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f80608b;

        /* JADX WARN: Multi-variable type inference failed */
        public final void draw(@NotNull Canvas canvas) {
            int iSave = canvas.save();
            try {
                Rect bounds = getBounds();
                float f7 = this.f80608b;
                canvas.scale(f7, f7, bounds.exactCenterX(), bounds.exactCenterY());
                super.draw(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/seekbar/PlayerSeekbarPngThumb$b.class */
    public static final class b extends BaseImageDataSubscriber<DrawableHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CancellableContinuationImpl f80609a;

        public b(CancellableContinuationImpl cancellableContinuationImpl) {
            this.f80609a = cancellableContinuationImpl;
        }

        public final void onFailureImpl(ImageDataSource<DrawableHolder> imageDataSource) {
            com.bilibili.adcommon.utils.e.a("setThumb fail ", "SeekbarThumb-png", imageDataSource != null ? imageDataSource.getFailureCause() : null);
            if (imageDataSource != null) {
                imageDataSource.close();
            }
            this.f80609a.resumeWith(Result.constructor-impl((Object) null));
        }

        public final void onNewResultImpl(ImageDataSource<DrawableHolder> imageDataSource) {
            DrawableHolder drawableHolder;
            Drawable drawable = (imageDataSource == null || (drawableHolder = (DrawableHolder) imageDataSource.getResult()) == null) ? null : drawableHolder.get();
            if (imageDataSource != null) {
                imageDataSource.close();
            }
            this.f80609a.resumeWith(Result.constructor-impl(drawable));
        }
    }

    public static Object i(FragmentActivity fragmentActivity, String str, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        BiliImageLoader.INSTANCE.acquire(fragmentActivity).useOrigin().asDrawable().url(str).submit().subscribe(new b(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void a(int i7) {
        this.f80601b = i7;
        this.f80602c = false;
        f fVar = this.f80600a;
        if (fVar != null) {
            fVar.b(this.f80604e);
        }
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void b() {
        this.f80602c = true;
        f fVar = this.f80600a;
        if (fVar != null) {
            fVar.b(this.f80604e);
        }
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void d(boolean z6) {
        if (z6) {
            this.f80606g = 0.3f;
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f7 = this.f80606g;
            if (f7 == 1.0f) {
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f7, 1.0f);
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new k(this, 1));
            valueAnimatorOfFloat.start();
            this.h = valueAnimatorOfFloat;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(@org.jetbrains.annotations.Nullable com.bilibili.playerbizcommon.widget.control.seekbar.e r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r7) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.widget.control.seekbar.PlayerSeekbarPngThumb.e(com.bilibili.playerbizcommon.widget.control.seekbar.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void f() {
        f fVar = this.f80600a;
        if (fVar != null) {
            fVar.b(this.f80604e);
        }
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void h(@Nullable f fVar) {
        this.f80600a = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [Gh1.a, com.bilibili.playerbizcommon.widget.control.seekbar.PlayerSeekbarPngThumb$a] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.graphics.drawable.Drawable, com.bilibili.playerbizcommon.widget.control.seekbar.PlayerSeekbarPngThumb$a] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void j(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        a aVar = this.f80607i;
        if (!Intrinsics.areEqual(aVar != null ? ((Gh1.a) aVar).a : null, drawable)) {
            ?? aVar2 = new Gh1.a(drawable);
            aVar2.f80608b = 1.0f;
            this.f80607i = aVar2;
        }
        ?? r02 = this.f80607i;
        if (r02 != 0) {
            r02.f80608b = this.f80606g;
            f fVar = this.f80600a;
            if (fVar != 0) {
                fVar.b(r02);
            }
        }
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void onProgressChanged(int i7) {
        Drawable drawable = this.f80604e;
        if (drawable == null || this.f80602c) {
            return;
        }
        int i8 = i7 - this.f80601b;
        this.f80601b = i7;
        if (i8 > 0) {
            Drawable drawable2 = this.f80605f;
            if (drawable2 != null) {
                drawable = drawable2;
            }
            j(drawable);
            return;
        }
        if (i8 >= 0) {
            j(drawable);
            return;
        }
        Drawable drawable3 = this.f80603d;
        if (drawable3 != null) {
            drawable = drawable3;
        }
        j(drawable);
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void reset() {
        this.f80603d = null;
        this.f80604e = null;
        this.f80605f = null;
        this.f80600a = null;
        this.f80602c = true;
        this.f80601b = 0;
    }
}
