package com.bilibili.live.streaming.widget;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.NonNull;
import com.bilibili.live.streaming.widget.TextureRenderView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/widget/TextureRenderView.class */
public final class TextureRenderView extends TextureView implements IRenderView {
    private SurfaceCallback surfaceCallback;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/widget/TextureRenderView$InternalSurfaceHolder.class */
    public static final class InternalSurfaceHolder implements ISurfaceHolder {

        @Nullable
        private final TextureRenderView renderView;

        @Nullable
        private final SurfaceTexture surfaceTexture;

        public InternalSurfaceHolder(@Nullable TextureRenderView textureRenderView, @Nullable SurfaceTexture surfaceTexture) {
            this.renderView = textureRenderView;
            this.surfaceTexture = surfaceTexture;
        }

        @Override // com.bilibili.live.streaming.widget.ISurfaceHolder
        @Nullable
        public SurfaceTexture getPreview() {
            return this.surfaceTexture;
        }

        @Override // com.bilibili.live.streaming.widget.ISurfaceHolder
        @Nullable
        public IRenderView getRenderView() {
            return this.renderView;
        }

        @Override // com.bilibili.live.streaming.widget.ISurfaceHolder
        @Nullable
        public SurfaceHolder getSurfaceHolder() {
            return null;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/widget/TextureRenderView$SurfaceCallback.class */
    public static final class SurfaceCallback implements TextureView.SurfaceTextureListener {
        private boolean isFormatChanged;

        @NotNull
        private final CopyOnWriteArrayList<IRenderViewCallback> renderCallbacks = new CopyOnWriteArrayList<>();
        private int surfaceHeight;

        @Nullable
        private SurfaceTexture surfaceTexture;
        private int surfaceWidth;

        @NotNull
        private final WeakReference<TextureRenderView> weakRenderView;

        public SurfaceCallback(@NotNull TextureRenderView textureRenderView) {
            this.weakRenderView = new WeakReference<>(textureRenderView);
        }

        private final void dispatch(Function1<? super IRenderViewCallback, ? extends Object> function1) {
            Iterator<IRenderViewCallback> it = this.renderCallbacks.iterator();
            while (it.hasNext()) {
                try {
                    function1.invoke(it.next());
                } catch (Exception e7) {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onSurfaceTextureAvailable$lambda$0(InternalSurfaceHolder internalSurfaceHolder, int i7, int i8, IRenderViewCallback iRenderViewCallback) {
            iRenderViewCallback.onSurfaceCreated(internalSurfaceHolder, i7, i8);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onSurfaceTextureDestroyed$lambda$2(InternalSurfaceHolder internalSurfaceHolder, IRenderViewCallback iRenderViewCallback) {
            iRenderViewCallback.onSurfaceDestroyed(internalSurfaceHolder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onSurfaceTextureSizeChanged$lambda$1(InternalSurfaceHolder internalSurfaceHolder, int i7, int i8, IRenderViewCallback iRenderViewCallback) {
            iRenderViewCallback.onSurfaceChanged(internalSurfaceHolder, 0, i7, i8);
            return Unit.INSTANCE;
        }

        public final void addRenderCallback(@NonNull @NotNull IRenderViewCallback iRenderViewCallback) {
            this.renderCallbacks.add(iRenderViewCallback);
            if (this.surfaceTexture != null) {
                iRenderViewCallback.onSurfaceCreated(new InternalSurfaceHolder(this.weakRenderView.get(), this.surfaceTexture), this.surfaceWidth, this.surfaceHeight);
            }
            if (this.isFormatChanged) {
                iRenderViewCallback.onSurfaceChanged(new InternalSurfaceHolder(this.weakRenderView.get(), this.surfaceTexture), 0, this.surfaceWidth, this.surfaceHeight);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(@NotNull SurfaceTexture surfaceTexture, final int i7, final int i8) {
            this.surfaceTexture = surfaceTexture;
            this.isFormatChanged = false;
            this.surfaceWidth = i7;
            this.surfaceHeight = i8;
            final InternalSurfaceHolder internalSurfaceHolder = new InternalSurfaceHolder(this.weakRenderView.get(), surfaceTexture);
            dispatch(new Function1(internalSurfaceHolder, i7, i8) { // from class: com.bilibili.live.streaming.widget.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final TextureRenderView.InternalSurfaceHolder f65433a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f65434b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f65435c;

                {
                    this.f65433a = internalSurfaceHolder;
                    this.f65434b = i7;
                    this.f65435c = i8;
                }

                public final Object invoke(Object obj) {
                    return TextureRenderView.SurfaceCallback.onSurfaceTextureAvailable$lambda$0(this.f65433a, this.f65434b, this.f65435c, (IRenderViewCallback) obj);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(@NotNull SurfaceTexture surfaceTexture) {
            this.surfaceTexture = surfaceTexture;
            this.isFormatChanged = false;
            this.surfaceWidth = 0;
            this.surfaceHeight = 0;
            final InternalSurfaceHolder internalSurfaceHolder = new InternalSurfaceHolder(this.weakRenderView.get(), surfaceTexture);
            dispatch(new Function1(internalSurfaceHolder) { // from class: com.bilibili.live.streaming.widget.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final TextureRenderView.InternalSurfaceHolder f65432a;

                {
                    this.f65432a = internalSurfaceHolder;
                }

                public final Object invoke(Object obj) {
                    return TextureRenderView.SurfaceCallback.onSurfaceTextureDestroyed$lambda$2(this.f65432a, (IRenderViewCallback) obj);
                }
            });
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(@NotNull SurfaceTexture surfaceTexture, final int i7, final int i8) {
            this.surfaceTexture = surfaceTexture;
            this.isFormatChanged = true;
            this.surfaceWidth = i7;
            this.surfaceHeight = i8;
            final InternalSurfaceHolder internalSurfaceHolder = new InternalSurfaceHolder(this.weakRenderView.get(), surfaceTexture);
            dispatch(new Function1(internalSurfaceHolder, i7, i8) { // from class: com.bilibili.live.streaming.widget.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final TextureRenderView.InternalSurfaceHolder f65429a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f65430b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f65431c;

                {
                    this.f65429a = internalSurfaceHolder;
                    this.f65430b = i7;
                    this.f65431c = i8;
                }

                public final Object invoke(Object obj) {
                    return TextureRenderView.SurfaceCallback.onSurfaceTextureSizeChanged$lambda$1(this.f65429a, this.f65430b, this.f65431c, (IRenderViewCallback) obj);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(@NotNull SurfaceTexture surfaceTexture) {
        }

        public final void removeRenderCallback(@NonNull @NotNull IRenderViewCallback iRenderViewCallback) {
            this.renderCallbacks.remove(iRenderViewCallback);
        }
    }

    public TextureRenderView(@NotNull Context context) {
        this(context, null, 0);
    }

    public TextureRenderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextureRenderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        initView(context);
    }

    private final void initView(Context context) {
        SurfaceCallback surfaceCallback = new SurfaceCallback(this);
        this.surfaceCallback = surfaceCallback;
        setSurfaceTextureListener(surfaceCallback);
    }

    @Override // com.bilibili.live.streaming.widget.IRenderView
    public void addRenderCallback(@NotNull IRenderViewCallback iRenderViewCallback) {
        SurfaceCallback surfaceCallback = this.surfaceCallback;
        SurfaceCallback surfaceCallback2 = surfaceCallback;
        if (surfaceCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("surfaceCallback");
            surfaceCallback2 = null;
        }
        surfaceCallback2.addRenderCallback(iRenderViewCallback);
    }

    @Override // com.bilibili.live.streaming.widget.IRenderView
    @NotNull
    public View getView() {
        return this;
    }

    @Override // com.bilibili.live.streaming.widget.IRenderView
    public void removeRenderCallback(@NotNull IRenderViewCallback iRenderViewCallback) {
        SurfaceCallback surfaceCallback = this.surfaceCallback;
        SurfaceCallback surfaceCallback2 = surfaceCallback;
        if (surfaceCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("surfaceCallback");
            surfaceCallback2 = null;
        }
        surfaceCallback2.removeRenderCallback(iRenderViewCallback);
    }
}
