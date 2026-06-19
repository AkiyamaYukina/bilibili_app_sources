package com.bilibili.playerbizcommon.widget.control.seekbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.BiliImageLoaderHelper;
import com.bilibili.lib.image2.bean.BaseImageDataSubscriber;
import com.bilibili.lib.image2.bean.BiliAnimatedDrawable;
import com.bilibili.lib.image2.bean.DrawableHolder;
import com.bilibili.lib.image2.bean.ImageDataSource;
import java.io.File;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/seekbar/PlayerSeekbarSpriteThumb.class */
public final class PlayerSeekbarSpriteThumb implements b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final boolean f80610j = ConfigManager.Companion.isHitFF("ugc.player_seekbar_sprite_disable");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public f f80612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f80613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f80614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f80615e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f80617g;

    @Nullable
    public BiliAnimatedDrawable h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public BiliAnimatedDrawable f80618i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f80611a = LazyKt.lazy(new Bc.f(this, 5));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f80616f = true;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/seekbar/PlayerSeekbarSpriteThumb$a.class */
    public static final class a extends BaseImageDataSubscriber<DrawableHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CancellableContinuationImpl f80619a;

        public a(CancellableContinuationImpl cancellableContinuationImpl) {
            this.f80619a = cancellableContinuationImpl;
        }

        public final void onFailureImpl(ImageDataSource<DrawableHolder> imageDataSource) {
            if (imageDataSource != null) {
                imageDataSource.close();
            }
            this.f80619a.resumeWith(Result.constructor-impl((Object) null));
        }

        public final void onNewResultImpl(ImageDataSource<DrawableHolder> imageDataSource) {
            DrawableHolder drawableHolder;
            BiliAnimatedDrawable biliAnimatedDrawable = null;
            Drawable drawable = (imageDataSource == null || (drawableHolder = (DrawableHolder) imageDataSource.getResult()) == null) ? null : drawableHolder.get();
            if (drawable instanceof BiliAnimatedDrawable) {
                biliAnimatedDrawable = (BiliAnimatedDrawable) drawable;
            }
            if (imageDataSource != null) {
                imageDataSource.close();
            }
            this.f80619a.resumeWith(Result.constructor-impl(biliAnimatedDrawable));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i(com.bilibili.playerbizcommon.widget.control.seekbar.PlayerSeekbarSpriteThumb r5, androidx.fragment.app.FragmentActivity r6, java.io.File r7, java.io.File r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.widget.control.seekbar.PlayerSeekbarSpriteThumb.i(com.bilibili.playerbizcommon.widget.control.seekbar.PlayerSeekbarSpriteThumb, androidx.fragment.app.FragmentActivity, java.io.File, java.io.File, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static Object j(FragmentActivity fragmentActivity, File file, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        BiliImageLoader.INSTANCE.acquire(fragmentActivity).useOrigin().asDrawable().enableAnimatable(1, Boxing.boxBoolean(false)).url(BiliImageLoaderHelper.fileToUri(file)).submit().subscribe(new a(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void a(int i7) {
        BiliAnimatedDrawable biliAnimatedDrawable = this.f80618i;
        if (biliAnimatedDrawable != null) {
            biliAnimatedDrawable.stop();
        }
        this.f80615e = i7;
        this.f80616f = false;
        Drawable drawable = this.h;
        if (drawable == null) {
            return;
        }
        f fVar = this.f80612b;
        if (fVar != null) {
            fVar.b(drawable);
        }
        int frameCount = drawable.getFrameCount() / 2;
        this.f80617g = frameCount;
        drawable.jumpToFrame(frameCount);
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void b() {
        this.f80616f = true;
        f fVar = this.f80612b;
        if (fVar != null) {
            fVar.b(this.f80618i);
        }
        BiliAnimatedDrawable biliAnimatedDrawable = this.f80618i;
        if (biliAnimatedDrawable != null) {
            biliAnimatedDrawable.start();
        }
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void d(boolean z6) {
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    @Nullable
    public final Object e(@Nullable e eVar, @NotNull Continuation<? super Boolean> continuation) {
        return eVar == null ? Boxing.boxBoolean(false) : BuildersKt.withContext(Dispatchers.getIO(), new PlayerSeekbarSpriteThumb$load$2(this, eVar, null), continuation);
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void f() {
        String str;
        Context contextX;
        String str2 = this.f80613c;
        if (str2 == null || (str = this.f80614d) == null) {
            return;
        }
        File file = new File(str2);
        File file2 = new File(str);
        f fVar = this.f80612b;
        FragmentActivity fragmentActivityFindFragmentActivityOrNull = (fVar == null || (contextX = fVar.x()) == null) ? null : ContextUtilKt.findFragmentActivityOrNull(contextX);
        if (file.exists() && file2.exists() && fragmentActivityFindFragmentActivityOrNull != null) {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivityFindFragmentActivityOrNull), (CoroutineContext) null, (CoroutineStart) null, new PlayerSeekbarSpriteThumb$refreshThumb$1(this, fragmentActivityFindFragmentActivityOrNull, file, file2, null), 3, (Object) null);
        }
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void h(@Nullable f fVar) {
        this.f80612b = fVar;
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void onProgressChanged(int i7) {
        BiliAnimatedDrawable biliAnimatedDrawable = this.h;
        if (biliAnimatedDrawable == null || this.f80616f) {
            return;
        }
        int i8 = i7 - this.f80615e;
        this.f80615e = i7;
        int frameCount = biliAnimatedDrawable.getFrameCount();
        if (i8 > 0) {
            this.f80617g++;
        } else if (i8 < 0) {
            this.f80617g--;
        } else {
            int i9 = this.f80617g;
            this.f80617g = i9 < frameCount / 2 ? i9 + 1 : i9 - 1;
        }
        int iCoerceIn = RangesKt.coerceIn(this.f80617g, 0, frameCount - 1);
        this.f80617g = iCoerceIn;
        biliAnimatedDrawable.jumpToFrame(iCoerceIn);
    }

    @Override // com.bilibili.playerbizcommon.widget.control.seekbar.b
    public final void reset() {
        this.f80612b = null;
        this.f80613c = null;
        this.f80614d = null;
        this.h = null;
        this.f80618i = null;
    }
}
