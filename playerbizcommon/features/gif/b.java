package com.bilibili.playerbizcommon.features.gif;

import K7.M;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.util.DisplayMetrics;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import bolts.Task;
import com.bilibili.app.gemini.base.player.GeminiCommonResolverParams;
import com.bilibili.app.preferences.fragment.u0;
import com.bilibili.base.BiliContext;
import com.bilibili.common.chronoscommon.E;
import com.bilibili.lib.media.resource.DashMediaIndex;
import com.bilibili.lib.media.resource.DashResource;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.media.resource.PlayIndex;
import com.bilibili.opd.app.core.config.ConfigService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rq0.C8539d;
import rq0.CallableC8537b;
import rq0.l;
import sq0.C8616a;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainerKt;
import tv.danmaku.biliplayerv2.service.IActivityStateService;
import tv.danmaku.biliplayerv2.service.IPlayDirector;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IRenderContainerService;
import tv.danmaku.biliplayerv2.service.LifecycleObserver;
import tv.danmaku.biliplayerv2.service.LifecycleState;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.ChronosScene;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.GetVideoSize;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.GetWorkInfo;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;
import tv.danmaku.biliplayerv2.service.interact.biz.multi.IMultiDanmakuCallback;
import tv.danmaku.biliplayerv2.service.interact.biz.multi.MultiDanmakuPlayer;
import tv.danmaku.biliplayerv2.service.resolve.DownloadParams;
import tv.danmaku.biliplayerv2.service.resolve.NormalMediaResourceResolveTask;
import tv.danmaku.biliplayerv2.utils.MediaItemBuilderExtKt;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.render.core.IVideoRenderLayer;
import tv.danmaku.videoplayer.coreV2.IMediaPlayParams;
import tv.danmaku.videoplayer.coreV2.MediaItem;
import tv.danmaku.videoplayer.coreV2.transformer.MediaItemParams;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/gif/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public PlayerContainer f79767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public tv.danmaku.videoplayer.coreV2.a f79768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public MediaItem<?> f79769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public IVideoRenderLayer f79770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public ViewGroup f79771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public l f79772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public C8539d f79773g;

    @Nullable
    public MultiDanmakuPlayer h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public TextureView f79774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public rq0.g f79775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public rq0.f f79776k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public com.bilibili.playerbizcommon.features.gif.g f79777l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public MediaResource f79778m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f79779n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f79780o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f79781p = 32;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final e f79782q = new e(this);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final d f79783r = new d(this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final f f79784s = new f(this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final g f79785t = new g(this);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final c f79786u = new c(this);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final com.bilibili.playerbizcommon.features.gif.a f79787v = new IMediaPlayer.OnPlayerClockChangedListener(this) { // from class: com.bilibili.playerbizcommon.features.gif.a

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f79766a;

        {
            this.f79766a = this;
        }

        public final void onPlayerClockChanged(IMediaPlayer iMediaPlayer, float f7, long j7) {
            MultiDanmakuPlayer multiDanmakuPlayer;
            IRemoteHandler remoteHandler;
            b bVar = this.f79766a;
            if (!bVar.f() && (multiDanmakuPlayer = bVar.h) != null && (remoteHandler = multiDanmakuPlayer.getRemoteHandler()) != null) {
                remoteHandler.onPlayerClockChanged(f7, j7, (Map) null);
            }
            boolean zF = bVar.f();
            StringBuilder sb = new StringBuilder("onPlayerClockChanged rate:");
            sb.append(f7);
            sb.append(" curposition:");
            sb.append(j7);
            u0.a(sb, " isRecording：", zF, "GifPlayerContext");
        }
    };

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final TextureViewSurfaceTextureListenerC0520b f79788w = new TextureViewSurfaceTextureListenerC0520b(this);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final a f79789x = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/gif/b$a.class */
    public static final class a implements LifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f79790a;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommon.features.gif.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/gif/b$a$a.class */
        public static final /* synthetic */ class C0519a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f79791a;

            static {
                int[] iArr = new int[LifecycleState.values().length];
                try {
                    iArr[LifecycleState.ACTIVITY_PAUSE.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[LifecycleState.ACTIVITY_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                f79791a = iArr;
            }
        }

        public a(b bVar) {
            this.f79790a = bVar;
        }

        public final void onLifecycleChanged(LifecycleState lifecycleState) {
            tv.danmaku.videoplayer.coreV2.a aVar;
            int i7 = C0519a.f79791a[lifecycleState.ordinal()];
            b bVar = this.f79790a;
            if (i7 != 1) {
                if (i7 == 2 && (aVar = bVar.f79768b) != null) {
                    aVar.resume();
                    return;
                }
                return;
            }
            tv.danmaku.videoplayer.coreV2.a aVar2 = bVar.f79768b;
            if (aVar2 != null) {
                aVar2.pause();
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommon.features.gif.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/gif/b$b.class */
    public static final class TextureViewSurfaceTextureListenerC0520b implements TextureView.SurfaceTextureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Surface f79792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f79793b;

        public TextureViewSurfaceTextureListenerC0520b(b bVar) {
            this.f79793b = bVar;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
            E render;
            E render2;
            this.f79792a = new Surface(surfaceTexture);
            if (!this.f79793b.f()) {
                MultiDanmakuPlayer multiDanmakuPlayer = this.f79793b.h;
                if (multiDanmakuPlayer != null && (render2 = multiDanmakuPlayer.getRender()) != null) {
                    render2.d(this.f79792a);
                }
                MultiDanmakuPlayer multiDanmakuPlayer2 = this.f79793b.h;
                if (multiDanmakuPlayer2 != null && (render = multiDanmakuPlayer2.getRender()) != null) {
                    render.b(true);
                }
            }
            BLog.i("GifPlayerContext", "danmaku surface vailable");
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            E render;
            E render2;
            BLog.i("GifPlayerContext", "danmaku surface destroyed");
            if (!this.f79793b.f()) {
                MultiDanmakuPlayer multiDanmakuPlayer = this.f79793b.h;
                if (multiDanmakuPlayer != null && (render2 = multiDanmakuPlayer.getRender()) != null) {
                    render2.b(false);
                }
                MultiDanmakuPlayer multiDanmakuPlayer2 = this.f79793b.h;
                if (multiDanmakuPlayer2 != null && (render = multiDanmakuPlayer2.getRender()) != null) {
                    render.d((Surface) null);
                }
            }
            Surface surface = this.f79792a;
            if (surface != null) {
                surface.release();
            }
            this.f79792a = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i8) {
            MultiDanmakuPlayer multiDanmakuPlayer;
            E render;
            com.bilibili.bplus.im.protobuf.a.b(i7, i8, "danmaku surface size changed:", " ", "GifPlayerContext");
            if (this.f79793b.f() || this.f79792a == null || (multiDanmakuPlayer = this.f79793b.h) == null || (render = multiDanmakuPlayer.getRender()) == null) {
                return;
            }
            Surface surface = this.f79792a;
            if (Intrinsics.areEqual(render.getInstance$chronoscommon_release().getOutputSurface(), surface)) {
                render.d(surface);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/gif/b$c.class */
    public static final class c implements IMultiDanmakuCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f79794a;

        public c(b bVar) {
            this.f79794a = bVar;
        }

        public final ChronosScene getScene() {
            return ChronosScene.SCENE_RECORD;
        }

        public final GetVideoSize.Response getVideoSize() {
            Context context;
            Resources resources;
            DisplayMetrics displayMetrics;
            b bVar = this.f79794a;
            Vi1.c cVarE = bVar.e();
            if (cVarE == null) {
                return null;
            }
            PlayerContainer playerContainer = bVar.f79767a;
            float f7 = (playerContainer == null || (context = playerContainer.getContext()) == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 1.0f : displayMetrics.density;
            GetVideoSize.Response response = new GetVideoSize.Response();
            if (bVar.d() == null) {
                return null;
            }
            response.setOrigin(new float[]{r0.left / f7, r0.top / f7});
            response.setRotation(Float.valueOf((float) Math.toRadians(cVarE.e)));
            response.setScale(new float[]{cVarE.c, cVarE.d});
            response.setSize(new int[]{(int) (r0.width() / f7), (int) (r0.height() / f7)});
            response.setTranslation(new float[]{cVarE.a / f7, cVarE.b / f7});
            return response;
        }

        public final GetWorkInfo.Response getWorkInfo() {
            com.bilibili.playerbizcommon.features.gif.g gVar = this.f79794a.f79777l;
            return gVar != null ? gVar.getWorkInfo() : null;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/gif/b$d.class */
    public static final class d implements rq0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f79795a;

        public d(b bVar) {
            this.f79795a = bVar;
        }

        @Override // rq0.f
        public final void a(int i7) {
            rq0.f fVar;
            b bVar = this.f79795a;
            if (bVar.f79780o && (fVar = bVar.f79776k) != null) {
                fVar.a(i7);
            }
        }

        @Override // rq0.f
        public final void b(String str) {
            b bVar = this.f79795a;
            if (bVar.f79780o) {
                rq0.f fVar = bVar.f79776k;
                bVar.n();
                if (fVar != null) {
                    fVar.b(str);
                }
            }
        }

        @Override // rq0.f
        public final void c(int i7, String str, boolean z6) {
            MultiDanmakuPlayer multiDanmakuPlayer;
            E render;
            b bVar = this.f79795a;
            if (bVar.f79780o) {
                rq0.f fVar = bVar.f79776k;
                if (fVar != null) {
                    fVar.c(i7, str, z6);
                }
                tv.danmaku.videoplayer.coreV2.a aVar = bVar.f79768b;
                if (aVar != null) {
                    aVar.pause();
                }
                if (!bVar.f() && (multiDanmakuPlayer = bVar.h) != null && (render = multiDanmakuPlayer.getRender()) != null) {
                    render.b(false);
                }
                C8539d c8539d = bVar.f79773g;
                if (c8539d != null) {
                    c8539d.f126899p.removeCallbacksAndMessages(null);
                    c8539d.f126892i = 0;
                    c8539d.c();
                    C8616a c8616a = c8539d.f126891g;
                    if (c8616a != null) {
                        c8616a.f127328f = true;
                        ExecutorService executorService = c8616a.f127324b;
                        if (executorService != null) {
                            executorService.shutdown();
                        }
                    }
                    c8539d.f126891g = null;
                    if (c8539d.h != null && c8539d.f126895l != c8539d.f126892i) {
                        Task.callInBackground(new CallableC8537b(c8539d.h));
                    }
                    c8539d.h = null;
                    c8539d.f126888d = null;
                    ((ArrayList) c8539d.f126890f).clear();
                    ((ArrayList) c8539d.f126889e).clear();
                    if (c8539d.f126886b != null) {
                        synchronized (c8539d.f126898o) {
                            c8539d.f126886b = null;
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                    bVar.f79773g = null;
                    bVar.f79776k = null;
                }
                bVar.p();
            }
        }

        @Override // rq0.f
        public final void d() {
            rq0.f fVar = this.f79795a.f79776k;
            if (fVar != null) {
                fVar.d();
            }
        }

        @Override // rq0.f
        public final void onCancel() {
            b bVar = this.f79795a;
            rq0.f fVar = bVar.f79776k;
            if (fVar != null) {
                fVar.onCancel();
            }
            bVar.n();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/gif/b$e.class */
    public static final class e implements rq0.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f79796a;

        public e(b bVar) {
            this.f79796a = bVar;
        }

        @Override // rq0.g
        public final void a(String str) {
            b bVar = this.f79796a;
            if (bVar.f79780o) {
                rq0.g gVar = bVar.f79775j;
                bVar.j();
                b.a(bVar);
                bVar.p();
                if (gVar != null) {
                    gVar.a(str);
                }
            }
        }

        @Override // rq0.g
        public final void onError(Exception exc) {
            b bVar = this.f79796a;
            if (bVar.f79780o) {
                rq0.g gVar = bVar.f79775j;
                bVar.j();
                bVar.p();
                if (gVar != null) {
                    gVar.onError(exc);
                }
            }
        }

        @Override // rq0.g
        public final void onProgress(float f7) {
            rq0.g gVar;
            b bVar = this.f79796a;
            if (bVar.f79780o && (gVar = bVar.f79775j) != null) {
                gVar.onProgress(f7);
            }
        }

        @Override // rq0.g
        public final void onStart() {
            rq0.g gVar;
            b bVar = this.f79796a;
            if (bVar.f79780o && (gVar = bVar.f79775j) != null) {
                gVar.onStart();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/gif/b$f.class */
    public static final class f implements IVideoRenderLayer.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f79797a;

        public f(b bVar) {
            this.f79797a = bVar;
        }

        public final void onChanged() {
            Rect rectD;
            Vi1.c cVarE;
            IRemoteHandler remoteHandler;
            IRemoteHandler remoteHandler2;
            b bVar = this.f79797a;
            if (bVar.f() || (rectD = bVar.d()) == null || (cVarE = bVar.e()) == null) {
                return;
            }
            MultiDanmakuPlayer multiDanmakuPlayer = bVar.h;
            if (multiDanmakuPlayer != null && (remoteHandler2 = multiDanmakuPlayer.getRemoteHandler()) != null) {
                remoteHandler2.onViewPortUpdate(rectD);
            }
            MultiDanmakuPlayer multiDanmakuPlayer2 = bVar.h;
            if (multiDanmakuPlayer2 == null || (remoteHandler = multiDanmakuPlayer2.getRemoteHandler()) == null) {
                return;
            }
            remoteHandler.onVideoSizeChanged(rectD, cVarE);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/gif/b$g.class */
    public static final class g implements IVideoRenderLayer.OnVideoSizeChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f79798a;

        public g(b bVar) {
            this.f79798a = bVar;
        }

        public final void onChanged(int i7, int i8) {
            BLog.i("GifPlayerContext", androidx.compose.runtime.collection.d.a(i7, i8, "preview[", ", ", "]"));
            this.f79798a.o();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/gif/b$h.class */
    public static final class h implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f79799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ViewGroup f79800b;

        public h(b bVar, ViewGroup viewGroup) {
            this.f79799a = bVar;
            this.f79800b = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver;
            ViewGroup viewGroup = this.f79799a.f79771e;
            if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            IVideoRenderLayer iVideoRenderLayer = this.f79799a.f79770d;
            if (iVideoRenderLayer != null) {
                iVideoRenderLayer.updateViewPort(new Rect(0, 0, this.f79800b.getWidth(), this.f79800b.getHeight()));
            }
            com.bilibili.bplus.im.protobuf.a.b(this.f79800b.getWidth(), this.f79800b.getHeight(), "removePreViewContainer-set video size: ", ConfigService.ANY, "GifPlayerContext");
        }
    }

    public static final void a(b bVar) {
        ViewTreeObserver viewTreeObserver;
        View view;
        TextureView textureView = bVar.f79774i;
        if (textureView == null) {
            return;
        }
        ViewParent parent = textureView.getParent();
        ViewGroup viewGroup = null;
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        IVideoRenderLayer iVideoRenderLayer = bVar.f79770d;
        ViewParent parent2 = (iVideoRenderLayer == null || (view = iVideoRenderLayer.getView()) == null) ? null : view.getParent();
        if (parent2 instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent2;
        }
        if (Intrinsics.areEqual(viewGroup2, viewGroup)) {
            return;
        }
        if (viewGroup2 != null) {
            viewGroup2.removeView(bVar.f79774i);
        }
        if (viewGroup != null) {
            viewGroup.addView(bVar.f79774i, 1, new FrameLayout.LayoutParams(-1, -1));
        }
        if (viewGroup == null || (viewTreeObserver = viewGroup.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new com.bilibili.playerbizcommon.features.gif.f(bVar));
    }

    public final int b(@Nullable MediaResource mediaResource) {
        List list;
        if ((mediaResource != null ? mediaResource.getPlayIndex() : null) == null) {
            return -1;
        }
        PlayIndex playIndex = mediaResource.getPlayIndex();
        int i7 = playIndex != null ? playIndex.mQuality : 0;
        int i8 = i7;
        if (i7 > 80) {
            BLog.i("GifPlayerContext", "current quality:" + i7 + " should change quality");
            DashResource dashResource = mediaResource.getDashResource();
            if (dashResource == null || (list = dashResource.a) == null) {
                return -1;
            }
            Iterator it = list.iterator();
            int iMax = -1;
            while (it.hasNext()) {
                int i9 = ((DashMediaIndex) it.next()).a;
                if (i9 <= 80) {
                    iMax = Math.max(iMax, i9);
                }
            }
            i8 = iMax;
        }
        return i8;
    }

    public final void c(@Nullable PlayerContainer playerContainer, @Nullable GeminiCommonResolverParams geminiCommonResolverParams, @NotNull com.bilibili.app.gemini.player.feature.gif.a aVar) {
        if (playerContainer == null) {
            return;
        }
        BLog.i("GifPlayerContext", "need resolver mediaResource");
        Application application = BiliContext.application();
        Context applicationContext = application != null ? application.getApplicationContext() : null;
        if (applicationContext == null) {
            return;
        }
        BuildersKt.launch$default(tv.danmaku.biliplayerv2.c.a(playerContainer), Dispatchers.getIO(), (CoroutineStart) null, new GifPlayerContext$defaultMediaResourceResolver$1(new NormalMediaResourceResolveTask(true, applicationContext.getApplicationContext(), false, geminiCommonResolverParams, (DownloadParams) null), aVar, null), 2, (Object) null);
    }

    public final Rect d() {
        if (this.f79770d == null) {
            return null;
        }
        IVideoRenderLayer iVideoRenderLayer = this.f79770d;
        int videoWidth = iVideoRenderLayer != null ? iVideoRenderLayer.getVideoWidth() : 0;
        IVideoRenderLayer iVideoRenderLayer2 = this.f79770d;
        return new Rect(0, 0, videoWidth, iVideoRenderLayer2 != null ? iVideoRenderLayer2.getVideoHeight() : 0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Vi1.c, java.lang.Object] */
    public final Vi1.c e() {
        if (this.f79770d == null) {
            return null;
        }
        ?? obj = new Object();
        IVideoRenderLayer iVideoRenderLayer = this.f79770d;
        int videoWidth = iVideoRenderLayer != null ? iVideoRenderLayer.getVideoWidth() : 0;
        IVideoRenderLayer iVideoRenderLayer2 = this.f79770d;
        Rect rect = new Rect(0, 0, videoWidth, iVideoRenderLayer2 != null ? iVideoRenderLayer2.getVideoHeight() : 0);
        if (rect.width() <= 0 || rect.height() <= 0) {
            BLog.e("GifPlayerContext", "should wait video prepare");
            return null;
        }
        ((Vi1.c) obj).f = rect.centerX();
        ((Vi1.c) obj).g = rect.centerY();
        ((Vi1.c) obj).e = 0.0f;
        ((Vi1.c) obj).c = 1.0f;
        ((Vi1.c) obj).d = 1.0f;
        ((Vi1.c) obj).a = 0.0f;
        ((Vi1.c) obj).b = 0.0f;
        return obj;
    }

    public final boolean f() {
        return (this.f79772f == null && this.f79773g == null) ? false : true;
    }

    public final boolean g(long j7) {
        IRemoteHandler remoteHandler;
        IRemoteHandler remoteHandler2;
        E render;
        if (this.h == null) {
            return false;
        }
        Vi1.c cVarE = e();
        Rect rectD = d();
        if (cVarE == null || rectD == null) {
            return false;
        }
        MultiDanmakuPlayer multiDanmakuPlayer = this.h;
        if (multiDanmakuPlayer != null && (render = multiDanmakuPlayer.getRender()) != null) {
            render.b(false);
        }
        MultiDanmakuPlayer multiDanmakuPlayer2 = this.h;
        if (multiDanmakuPlayer2 != null && (remoteHandler2 = multiDanmakuPlayer2.getRemoteHandler()) != null) {
            remoteHandler2.onVideoSizeChanged(rectD, cVarE);
        }
        MultiDanmakuPlayer multiDanmakuPlayer3 = this.h;
        if (multiDanmakuPlayer3 == null || (remoteHandler = multiDanmakuPlayer3.getRemoteHandler()) == null) {
            return true;
        }
        remoteHandler.onPlayerClockChanged(1.0f, j7, (Map) null);
        return true;
    }

    public final void h() {
        IActivityStateService activityStateService;
        this.f79780o = false;
        PlayerContainer playerContainer = this.f79767a;
        if (playerContainer != null && (activityStateService = playerContainer.getActivityStateService()) != null) {
            activityStateService.unregisterLifecycle(this.f79789x);
        }
        j();
        C8539d c8539d = this.f79773g;
        if (c8539d != null) {
            c8539d.f126899p.removeCallbacksAndMessages(null);
            c8539d.f126892i = 0;
            c8539d.c();
            C8616a c8616a = c8539d.f126891g;
            if (c8616a != null) {
                c8616a.f127328f = true;
                ExecutorService executorService = c8616a.f127324b;
                if (executorService != null) {
                    executorService.shutdown();
                }
            }
            c8539d.f126891g = null;
            if (c8539d.h != null && c8539d.f126895l != c8539d.f126892i) {
                Task.callInBackground(new CallableC8537b(c8539d.h));
            }
            c8539d.h = null;
            c8539d.f126888d = null;
            ((ArrayList) c8539d.f126890f).clear();
            ((ArrayList) c8539d.f126889e).clear();
            if (c8539d.f126886b != null) {
                synchronized (c8539d.f126898o) {
                    c8539d.f126886b = null;
                    Unit unit = Unit.INSTANCE;
                }
            }
            this.f79773g = null;
            this.f79776k = null;
        }
        i();
        MultiDanmakuPlayer multiDanmakuPlayer = this.h;
        if (multiDanmakuPlayer != null) {
            multiDanmakuPlayer.release();
        }
        this.h = null;
        this.f79774i = null;
        this.f79767a = null;
        this.f79771e = null;
        this.f79779n = false;
    }

    public final void i() {
        IPlayerCoreService playerCoreService;
        tv.danmaku.videoplayer.coreV2.a aVar = this.f79768b;
        if (aVar != null) {
            IVideoRenderLayer iVideoRenderLayer = this.f79770d;
            if (iVideoRenderLayer != null) {
                iVideoRenderLayer.setVideoRenderLayerChangedListener((IVideoRenderLayer.a) null);
            }
            IVideoRenderLayer iVideoRenderLayer2 = this.f79770d;
            if (iVideoRenderLayer2 != null) {
                iVideoRenderLayer2.removeVideoSizeChangedListener(this.f79785t);
            }
            IVideoRenderLayer iVideoRenderLayer3 = this.f79770d;
            if (iVideoRenderLayer3 != null) {
                IVideoRenderLayer.unbindRenderContext$default(iVideoRenderLayer3, aVar.getMediaPlayRenderContext(), false, 2, (Object) null);
            }
            IVideoRenderLayer iVideoRenderLayer4 = this.f79770d;
            if (iVideoRenderLayer4 != null) {
                iVideoRenderLayer4.release();
            }
            aVar.setPlayerClockChangedListener((IMediaPlayer.OnPlayerClockChangedListener) null);
            PlayerContainer playerContainer = this.f79767a;
            if (playerContainer != null && (playerCoreService = playerContainer.getPlayerCoreService()) != null) {
                playerCoreService.releaseMultiMediaContext(aVar);
            }
        }
        MediaItem<?> mediaItem = this.f79769c;
        if (mediaItem != null) {
            mediaItem.release(true);
        }
        this.f79769c = null;
        this.f79768b = null;
        this.f79767a = null;
        this.f79771e = null;
        this.f79778m = null;
    }

    public final void j() {
        l lVar = this.f79772f;
        if (lVar == null) {
            return;
        }
        lVar.a();
        this.f79772f = null;
        this.f79775j = null;
    }

    public final void k(@Nullable ViewGroup viewGroup) {
        IVideoRenderLayer iVideoRenderLayer;
        View view;
        if (viewGroup == null || (iVideoRenderLayer = this.f79770d) == null || iVideoRenderLayer.getView() == null) {
            return;
        }
        IVideoRenderLayer iVideoRenderLayer2 = this.f79770d;
        View view2 = null;
        ViewParent parent = (iVideoRenderLayer2 == null || (view = iVideoRenderLayer2.getView()) == null) ? null : view.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (Intrinsics.areEqual(viewGroup2, viewGroup)) {
            return;
        }
        if (viewGroup2 != null) {
            IVideoRenderLayer iVideoRenderLayer3 = this.f79770d;
            if (iVideoRenderLayer3 != null) {
                view2 = iVideoRenderLayer3.getView();
            }
            viewGroup2.removeView(view2);
        }
        viewGroup.addView(this.f79770d.getView(), 0, new FrameLayout.LayoutParams(-1, -1));
        ViewTreeObserver viewTreeObserver = viewGroup.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new h(this, viewGroup));
        }
    }

    public final void l() {
        MultiDanmakuPlayer multiDanmakuPlayer;
        E render;
        tv.danmaku.videoplayer.coreV2.a aVar = this.f79768b;
        if (aVar != null) {
            aVar.resume();
        }
        if (f() || (multiDanmakuPlayer = this.h) == null || (render = multiDanmakuPlayer.getRender()) == null) {
            return;
        }
        render.b(true);
    }

    /* JADX WARN: Type inference failed for: r1v60, types: [java.lang.Object, tv.danmaku.videoplayer.coreV2.IMediaPlayParams] */
    public final void m(@Nullable PlayerContainer playerContainer, @Nullable ViewGroup viewGroup, @NotNull MediaResource mediaResource, @Nullable com.bilibili.playerbizcommon.features.gif.g gVar) {
        IActivityStateService activityStateService;
        MultiDanmakuPlayer multiDanmakuPlayer;
        IRemoteHandler remoteHandler;
        IRemoteHandler remoteHandler2;
        IRemoteHandler remoteHandler3;
        IRemoteHandler remoteHandler4;
        E render;
        Context context;
        Resources resources;
        DisplayMetrics displayMetrics;
        IInteractLayerService interactLayerService;
        ViewTreeObserver viewTreeObserver;
        IRenderContainerService renderContainerService;
        IPlayerCoreService playerCoreService;
        IPlayerCoreService playerCoreService2;
        IPlayerCoreService playerCoreService3;
        if (playerContainer == null || viewGroup == null) {
            return;
        }
        this.f79780o = true;
        this.f79767a = playerContainer;
        this.f79771e = viewGroup;
        this.f79779n = gVar != null;
        this.f79777l = gVar;
        int iB = b(mediaResource);
        int i7 = -1;
        if (iB <= 0) {
            PlayIndex playIndex = mediaResource.getPlayIndex();
            if (playIndex != null) {
                i7 = playIndex.mQuality;
            }
            bilibili.live.app.service.resolver.c.a(i7, "preview quality error:", "GifPlayerContext");
            return;
        }
        PlayerContainer playerContainer2 = this.f79767a;
        if (playerContainer2 == null || this.f79771e == null) {
            return;
        }
        this.f79778m = mediaResource;
        this.f79781p = iB;
        IPlayDirector playDirector = PlayerContainerKt.getPlayDirector(playerContainer2);
        Video.PlayableParams currentPlayableParams = playDirector != null ? playDirector.getCurrentPlayableParams() : null;
        if (currentPlayableParams == null) {
            return;
        }
        PlayerContainer playerContainer3 = this.f79767a;
        tv.danmaku.videoplayer.coreV2.a aVarCreateMultiMediaContext = (playerContainer3 == null || (playerCoreService3 = playerContainer3.getPlayerCoreService()) == null) ? null : playerCoreService3.createMultiMediaContext((IMediaPlayParams) new Object());
        this.f79768b = aVarCreateMultiMediaContext;
        if (aVarCreateMultiMediaContext == null) {
            return;
        }
        MediaItemParams.Builder builderApplyPlayableParams = MediaItemBuilderExtKt.applyPlayableParams(MediaItemBuilderExtKt.getMediaItemParamsBuilder(this.f79767a, mediaResource), currentPlayableParams);
        builderApplyPlayableParams.setScheme(2);
        builderApplyPlayableParams.setVideoStreamId(iB);
        builderApplyPlayableParams.setStartWhenPrepared(true);
        builderApplyPlayableParams.setForceStartAccurateSeek(true);
        PlayerContainer playerContainer4 = this.f79767a;
        builderApplyPlayableParams.setStartPosition((playerContainer4 == null || (playerCoreService2 = playerContainer4.getPlayerCoreService()) == null) ? 0L : playerCoreService2.getCurrentPosition());
        MediaItemParams mediaItemParamsBuild = builderApplyPlayableParams.build();
        PlayerContainer playerContainer5 = this.f79767a;
        MediaItem<?> mediaItemCreateMediaItem = (playerContainer5 == null || (playerCoreService = playerContainer5.getPlayerCoreService()) == null) ? null : playerCoreService.createMediaItem(mediaItemParamsBuild, mediaResource);
        if (mediaItemCreateMediaItem == null) {
            BLog.i("GifPlayerContext", "create mediaItem fail");
            i();
            return;
        }
        mediaItemCreateMediaItem.setKeepAliveRemoveFromPlayer(true);
        tv.danmaku.videoplayer.coreV2.a aVar = this.f79768b;
        if (aVar != null) {
            aVar.setMediaItem(mediaItemCreateMediaItem);
        }
        this.f79769c = mediaItemCreateMediaItem;
        PlayerContainer playerContainer6 = this.f79767a;
        IVideoRenderLayer iVideoRenderLayerCreateVideoLayer = (playerContainer6 == null || (renderContainerService = playerContainer6.getRenderContainerService()) == null) ? null : renderContainerService.createVideoLayer(IVideoRenderLayer.Type.TypeTextureView);
        this.f79770d = iVideoRenderLayerCreateVideoLayer;
        if (iVideoRenderLayerCreateVideoLayer == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ViewGroup viewGroup2 = this.f79771e;
        if (viewGroup2 != null) {
            viewGroup2.addView(this.f79770d.getView(), 0, layoutParams);
        }
        ViewGroup viewGroup3 = this.f79771e;
        if (viewGroup3 != null && (viewTreeObserver = viewGroup3.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new com.bilibili.playerbizcommon.features.gif.e(this));
        }
        IVideoRenderLayer.bindRenderContext$default(this.f79770d, this.f79768b.getMediaPlayRenderContext(), false, 2, (Object) null);
        if (!this.f79779n) {
            BLog.i("GifPlayerContext", "has no show danmaku");
        } else if (this.f79771e != null) {
            c cVar = this.f79786u;
            GetWorkInfo.Response workInfo = cVar.getWorkInfo();
            if (workInfo == null) {
                BLog.e("GifPlayerContext", "start danmaku error: work info");
            } else {
                PlayerContainer playerContainer7 = this.f79767a;
                this.h = (playerContainer7 == null || (interactLayerService = playerContainer7.getInteractLayerService()) == null) ? null : interactLayerService.cloneMultiDanmaku(this.f79771e.getContext(), cVar);
                IVideoRenderLayer iVideoRenderLayer = this.f79770d;
                if (iVideoRenderLayer != null) {
                    iVideoRenderLayer.setVideoRenderLayerChangedListener(this.f79784s);
                }
                IVideoRenderLayer iVideoRenderLayer2 = this.f79770d;
                if (iVideoRenderLayer2 != null) {
                    iVideoRenderLayer2.addVideoSizeChangedListener(this.f79785t);
                }
                tv.danmaku.videoplayer.coreV2.a aVar2 = this.f79768b;
                if (aVar2 != null) {
                    aVar2.setPlayerClockChangedListener(this.f79787v);
                }
                TextureView textureView = new TextureView(this.f79771e.getContext());
                this.f79774i = textureView;
                textureView.setOpaque(false);
                TextureView textureView2 = this.f79774i;
                if (textureView2 != null) {
                    textureView2.setSurfaceTextureListener(this.f79788w);
                }
                Rect rectD = d();
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                ViewGroup viewGroup4 = this.f79771e;
                if (viewGroup4 != null) {
                    viewGroup4.addView(this.f79774i, 1, layoutParams2);
                }
                MultiDanmakuPlayer multiDanmakuPlayer2 = this.h;
                if (multiDanmakuPlayer2 != null && (render = multiDanmakuPlayer2.getRender()) != null) {
                    PlayerContainer playerContainer8 = this.f79767a;
                    render.c((playerContainer8 == null || (context = playerContainer8.getContext()) == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 1.0f : displayMetrics.density);
                }
                if (rectD != null && !rectD.isEmpty()) {
                    MultiDanmakuPlayer multiDanmakuPlayer3 = this.h;
                    if (multiDanmakuPlayer3 != null && (remoteHandler4 = multiDanmakuPlayer3.getRemoteHandler()) != null) {
                        remoteHandler4.onViewPortUpdate(rectD);
                    }
                    MultiDanmakuPlayer multiDanmakuPlayer4 = this.h;
                    if (multiDanmakuPlayer4 != null && (remoteHandler3 = multiDanmakuPlayer4.getRemoteHandler()) != null) {
                        remoteHandler3.onVideoSizeChanged(rectD, e());
                    }
                    o();
                }
                MultiDanmakuPlayer multiDanmakuPlayer5 = this.h;
                if (multiDanmakuPlayer5 != null && (remoteHandler2 = multiDanmakuPlayer5.getRemoteHandler()) != null) {
                    remoteHandler2.updateCurrentWorkInfo(workInfo);
                }
                tv.danmaku.videoplayer.coreV2.a aVar3 = this.f79768b;
                if (aVar3 != null && aVar3.isPlaying() && (multiDanmakuPlayer = this.h) != null && (remoteHandler = multiDanmakuPlayer.getRemoteHandler()) != null) {
                    tv.danmaku.videoplayer.coreV2.a aVar4 = this.f79768b;
                    long currentPosition = 0;
                    if (aVar4 != null) {
                        currentPosition = aVar4.getCurrentPosition();
                    }
                    remoteHandler.onPlayerClockChanged(1.0f, currentPosition, (Map) null);
                }
            }
        }
        PlayerContainer playerContainer9 = this.f79767a;
        if (playerContainer9 == null || (activityStateService = playerContainer9.getActivityStateService()) == null) {
            return;
        }
        activityStateService.registerLifecycle(this.f79789x, new LifecycleState[]{LifecycleState.ACTIVITY_PAUSE, LifecycleState.ACTIVITY_RESUME});
    }

    public final void n() {
        C8539d c8539d = this.f79773g;
        if (c8539d != null) {
            c8539d.f126899p.removeCallbacksAndMessages(null);
            c8539d.f126892i = 0;
            c8539d.c();
            C8616a c8616a = c8539d.f126891g;
            if (c8616a != null) {
                c8616a.f127328f = true;
                ExecutorService executorService = c8616a.f127324b;
                if (executorService != null) {
                    executorService.shutdown();
                }
            }
            c8539d.f126891g = null;
            if (c8539d.h != null && c8539d.f126895l != c8539d.f126892i) {
                Task.callInBackground(new CallableC8537b(c8539d.h));
            }
            c8539d.h = null;
            c8539d.f126888d = null;
            ((ArrayList) c8539d.f126890f).clear();
            ((ArrayList) c8539d.f126889e).clear();
            if (c8539d.f126886b != null) {
                synchronized (c8539d.f126898o) {
                    c8539d.f126886b = null;
                    Unit unit = Unit.INSTANCE;
                }
            }
            this.f79773g = null;
            this.f79776k = null;
        }
        p();
    }

    public final void o() {
        if (this.f79774i == null) {
            return;
        }
        Rect rectD = d();
        IVideoRenderLayer iVideoRenderLayer = this.f79770d;
        Vi1.c transformParams = null;
        Rect bounds = iVideoRenderLayer != null ? iVideoRenderLayer.getBounds() : null;
        IVideoRenderLayer iVideoRenderLayer2 = this.f79770d;
        if (iVideoRenderLayer2 != null) {
            transformParams = iVideoRenderLayer2.getTransformParams();
        }
        if (rectD == null || rectD.isEmpty() || bounds == null || bounds.isEmpty() || transformParams == null) {
            return;
        }
        int iWidth = rectD.width();
        int iHeight = rectD.height();
        int i7 = (int) transformParams.f;
        int i8 = (int) transformParams.g;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iWidth, iHeight);
        layoutParams.leftMargin = i7 - (iWidth / 2);
        layoutParams.topMargin = i8 - (iHeight / 2);
        TextureView textureView = this.f79774i;
        if (textureView != null) {
            textureView.setLayoutParams(layoutParams);
        }
        TextureView textureView2 = this.f79774i;
        if (textureView2 != null) {
            textureView2.setScaleX(bounds.width() / iWidth);
        }
        TextureView textureView3 = this.f79774i;
        if (textureView3 != null) {
            textureView3.setScaleY(bounds.height() / iHeight);
        }
    }

    public final void p() {
        IRemoteHandler remoteHandler;
        E render;
        MultiDanmakuPlayer multiDanmakuPlayer;
        E render2;
        MultiDanmakuPlayer multiDanmakuPlayer2;
        E render3;
        E render4;
        E render5;
        MultiDanmakuPlayer multiDanmakuPlayer3 = this.h;
        if (multiDanmakuPlayer3 == null) {
            return;
        }
        if (multiDanmakuPlayer3 == null || (render5 = multiDanmakuPlayer3.getRender()) == null || !render5.h) {
            MultiDanmakuPlayer multiDanmakuPlayer4 = this.h;
            Surface surfaceA = (multiDanmakuPlayer4 == null || (render4 = multiDanmakuPlayer4.getRender()) == null) ? null : render4.a();
            TextureViewSurfaceTextureListenerC0520b textureViewSurfaceTextureListenerC0520b = this.f79788w;
            if (!Intrinsics.areEqual(surfaceA, textureViewSurfaceTextureListenerC0520b.f79792a) && (multiDanmakuPlayer2 = this.h) != null && (render3 = multiDanmakuPlayer2.getRender()) != null) {
                render3.d(textureViewSurfaceTextureListenerC0520b.f79792a);
            }
            MultiDanmakuPlayer multiDanmakuPlayer5 = this.h;
            if (multiDanmakuPlayer5 != null && (render = multiDanmakuPlayer5.getRender()) != null && !render.h && (multiDanmakuPlayer = this.h) != null && (render2 = multiDanmakuPlayer.getRender()) != null) {
                render2.b(true);
            }
            tv.danmaku.videoplayer.coreV2.a aVar = this.f79768b;
            M.c(aVar != null ? Long.valueOf(aVar.getCurrentPosition()) : null, "switchDanmakuToPlay: ", "GifPlayerContext");
            MultiDanmakuPlayer multiDanmakuPlayer6 = this.h;
            if (multiDanmakuPlayer6 == null || (remoteHandler = multiDanmakuPlayer6.getRemoteHandler()) == null) {
                return;
            }
            tv.danmaku.videoplayer.coreV2.a aVar2 = this.f79768b;
            remoteHandler.onPlayerClockChanged(1.0f, aVar2 != null ? aVar2.getCurrentPosition() : 0L, (Map) null);
        }
    }
}
