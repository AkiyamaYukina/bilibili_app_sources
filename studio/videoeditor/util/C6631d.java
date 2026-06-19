package com.bilibili.studio.videoeditor.util;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.DrawableAcquireRequestBuilder;
import com.bilibili.lib.image2.bean.BiliAnimatedDrawable;
import com.bilibili.lib.image2.bean.DrawableHolder;
import com.bilibili.lib.image2.bean.ImageDataSource;
import com.bilibili.lib.image2.bean.ImageDataSubscriber;
import com.bilibili.lib.image2.view.BiliImageView;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.studio.videoeditor.util.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/d.class */
public final class C6631d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ConcurrentHashMap<BiliImageView, a> f110226a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.bilibili.studio.videoeditor.util.d$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/d$a.class */
    public static final class a implements LifecycleEventObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final BiliImageView f110227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Lifecycle f110228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DrawableHolder f110229c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final BiliAnimatedDrawable f110230d;

        /* JADX INFO: renamed from: com.bilibili.studio.videoeditor.util.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/d$a$a.class */
        public static final /* synthetic */ class C1211a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f110231a;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                f110231a = iArr;
            }
        }

        public a(@NotNull BiliImageView biliImageView, @NotNull Lifecycle lifecycle, @NotNull DrawableHolder drawableHolder, @NotNull BiliAnimatedDrawable biliAnimatedDrawable) {
            this.f110227a = biliImageView;
            this.f110228b = lifecycle;
            this.f110229c = drawableHolder;
            this.f110230d = biliAnimatedDrawable;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(@NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.Event event) {
            int i7 = C1211a.f110231a[event.ordinal()];
            BiliAnimatedDrawable biliAnimatedDrawable = this.f110230d;
            if (i7 == 1) {
                biliAnimatedDrawable.start();
                return;
            }
            if (i7 == 2) {
                biliAnimatedDrawable.stop();
            } else {
                if (i7 != 3) {
                    return;
                }
                C6631d.f110226a.remove(this.f110227a);
                this.f110229c.close();
                this.f110228b.removeObserver(this);
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.studio.videoeditor.util.d$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/d$b.class */
    public static final class b implements ImageDataSubscriber<DrawableHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliImageView f110232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LifecycleOwner f110233b;

        public b(BiliImageView biliImageView, LifecycleOwner lifecycleOwner) {
            this.f110232a = biliImageView;
            this.f110233b = lifecycleOwner;
        }

        public final void onCancellation(ImageDataSource<DrawableHolder> imageDataSource) {
        }

        public final void onFailure(ImageDataSource<DrawableHolder> imageDataSource) {
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onResult(com.bilibili.lib.image2.bean.ImageDataSource<com.bilibili.lib.image2.bean.DrawableHolder> r8) {
            /*
                r7 = this;
                r0 = r8
                if (r0 == 0) goto L80
                r0 = r8
                java.lang.Object r0 = r0.getResult()
                com.bilibili.lib.image2.bean.DrawableHolder r0 = (com.bilibili.lib.image2.bean.DrawableHolder) r0
                r12 = r0
                r0 = r12
                if (r0 != 0) goto L17
                goto L80
            L17:
                r0 = r12
                android.graphics.drawable.Drawable r0 = r0.get()
                r11 = r0
                r0 = r11
                if (r0 != 0) goto L24
                return
            L24:
                r0 = r7
                com.bilibili.lib.image2.view.BiliImageView r0 = r0.f110232a
                r10 = r0
                r0 = r10
                com.bilibili.lib.image2.view.IGenericProperties r0 = r0.getGenericProperties()
                r1 = r11
                r0.setImage(r1)
                r0 = r11
                boolean r0 = r0 instanceof com.bilibili.lib.image2.bean.BiliAnimatedDrawable
                if (r0 == 0) goto L80
                r0 = r7
                androidx.lifecycle.LifecycleOwner r0 = r0.f110233b
                r8 = r0
                r0 = r8
                if (r0 == 0) goto L52
                r0 = r8
                androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
                r9 = r0
                r0 = r9
                r8 = r0
                r0 = r9
                if (r0 != 0) goto L61
            L52:
                r0 = r10
                android.content.Context r0 = r0.getContext()
                androidx.lifecycle.Lifecycle r0 = com.bilibili.studio.videoeditor.extension.ContextExtKt.lifecycle(r0)
                r9 = r0
                r0 = r9
                r8 = r0
                r0 = r9
                if (r0 != 0) goto L61
                return
            L61:
                com.bilibili.studio.videoeditor.util.d$a r0 = new com.bilibili.studio.videoeditor.util.d$a
                r1 = r0
                r2 = r10
                r3 = r8
                r4 = r12
                r5 = r11
                com.bilibili.lib.image2.bean.BiliAnimatedDrawable r5 = (com.bilibili.lib.image2.bean.BiliAnimatedDrawable) r5
                r1.<init>(r2, r3, r4, r5)
                r9 = r0
                java.util.concurrent.ConcurrentHashMap<com.bilibili.lib.image2.view.BiliImageView, com.bilibili.studio.videoeditor.util.d$a> r0 = com.bilibili.studio.videoeditor.util.C6631d.f110226a
                r1 = r10
                r2 = r9
                java.lang.Object r0 = r0.put(r1, r2)
                r0 = r8
                r1 = r9
                r0.addObserver(r1)
            L80:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.util.C6631d.b.onResult(com.bilibili.lib.image2.bean.ImageDataSource):void");
        }
    }

    public static void a(@NotNull BiliImageView biliImageView, @NotNull String str, @Nullable LifecycleOwner lifecycleOwner) {
        ConcurrentHashMap<BiliImageView, a> concurrentHashMap = f110226a;
        a aVar = concurrentHashMap.get(biliImageView);
        if (aVar != null) {
            concurrentHashMap.remove(aVar.f110227a);
            aVar.f110229c.close();
            aVar.f110228b.removeObserver(aVar);
        }
        DrawableAcquireRequestBuilder.enableAnimatable$default(BiliImageLoader.INSTANCE.acquire(biliImageView).with(biliImageView).asDrawable(), 0, (Boolean) null, 3, (Object) null).url(str).submit().subscribe(new b(biliImageView, lifecycleOwner));
    }
}
