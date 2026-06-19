package com.bilibili.playerbizcommon.features.hardware;

import android.content.res.Configuration;
import android.provider.Settings;
import android.view.View;
import androidx.compose.foundation.Q;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.pegasus.holders.oversea.RunnableC5682g;
import com.bilibili.playerbizcommon.features.hardware.HardwareService;
import j4.t;
import java.lang.ref.WeakReference;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tq0.C8680c;
import tq0.C8681d;
import tq0.C8683f;
import tq0.C8685h;
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.DisplayOrientation;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.PlayerSharingBundle;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.collection.Collections;
import tv.danmaku.biliplayerv2.service.CurrentVideoPointer;
import tv.danmaku.biliplayerv2.service.IPlayerService;
import tv.danmaku.biliplayerv2.service.IVideosPlayDirectorService;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.utils.NavigationHelper;
import tv.danmaku.videoplayer.core.log.PlayerLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/hardware/HardwareService.class */
public final class HardwareService implements IPlayerService, IVideosPlayDirectorService.VideoPlayEventListener {

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    public static final String TAG = "HardwareService";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PlayerContainer f79804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f79805b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public C8681d f79807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public C8685h f79808e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public IHardwareDelegate f79810g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collections.SafeIteratorList<b> f79806c = Q.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f79809f = true;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/hardware/HardwareService$a.class */
    public static final class a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/hardware/HardwareService$b.class */
    public interface b {
        void a(int i7);
    }

    public void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f79804a = playerContainer;
    }

    public final void dispatchStatusBarDrawHeightChanged(final int i7) {
        if (this.f79805b == i7) {
            return;
        }
        this.f79805b = i7;
        this.f79806c.forEach(new Collections.IteratorAction(i7) { // from class: tq0.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f127639a;

            {
                this.f127639a = i7;
            }

            public final void run(Object obj) {
                ((HardwareService.b) obj).a(this.f127639a);
            }
        });
    }

    public final int getStatusBarDrawHeight() {
        return this.f79805b;
    }

    public final void init(@NotNull FragmentActivity fragmentActivity, @NotNull IHardwareDelegate iHardwareDelegate) {
        this.f79810g = iHardwareDelegate;
        IPlayerContainer iPlayerContainer = this.f79804a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        C8681d c8681d = new C8681d(fragmentActivity, iHardwareDelegate, iPlayerContainer2);
        this.f79807d = c8681d;
        iPlayerContainer2.getControlContainerService().registerState(c8681d.f127637m);
        c8681d.f127634j = iPlayerContainer2.getPlayerSettingService().getCloudConfig().c();
        c8681d.f127636l.enable();
        C8683f c8683f = c8681d.f127632g;
        c8683f.f127641a.registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), false, c8683f);
        C8680c c8680c = c8681d.f127635k;
        c8683f.f127642b = c8680c == null ? null : new WeakReference<>(c8680c);
        IPlayerContainer iPlayerContainer3 = this.f79804a;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer3 = null;
        }
        final C8685h c8685h = new C8685h(fragmentActivity, iHardwareDelegate, iPlayerContainer3);
        this.f79808e = c8685h;
        iPlayerContainer3.getControlContainerService().registerState(c8685h.f127648e);
        c8685h.a(iPlayerContainer3.getControlContainerService().getScreenModeType());
        NavigationHelper.INSTANCE.setOnSystemUiVisibilityChangeListener(fragmentActivity, new View.OnSystemUiVisibilityChangeListener(c8685h) { // from class: tq0.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C8685h f127643a;

            {
                this.f127643a = c8685h;
            }

            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public final void onSystemUiVisibilityChange(int i7) {
                C8685h c8685h2 = this.f127643a;
                ScreenModeType screenModeType = c8685h2.f127645b.getControlContainerService().getScreenModeType();
                if ((screenModeType == ScreenModeType.LANDSCAPE_FULLSCREEN || screenModeType == ScreenModeType.VERTICAL_FULLSCREEN) && NavigationHelper.INSTANCE.getVisibility(c8685h2.f127644a) != c8685h2.f127647d) {
                    c8685h2.a(screenModeType);
                }
            }
        });
    }

    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        C8681d c8681d = this.f79807d;
        if (c8681d != null) {
            boolean zIsInMultiWindowMode = c8681d.f127626a.isInMultiWindowMode();
            IHardwareDelegate iHardwareDelegate = c8681d.f127627b;
            if (zIsInMultiWindowMode) {
                ControlContainerType controlContainerTypeOnGetControlContainerType = iHardwareDelegate.onGetControlContainerType(ScreenModeType.THUMB);
                ControlContainerType controlContainerType = controlContainerTypeOnGetControlContainerType;
                if (controlContainerTypeOnGetControlContainerType == null) {
                    controlContainerType = ControlContainerType.HALF_SCREEN;
                }
                c8681d.b(controlContainerType);
                return;
            }
            RunnableC5682g runnableC5682g = c8681d.f127638n;
            HandlerThreads.remove(0, runnableC5682g);
            int i7 = configuration.orientation;
            if (i7 == 1) {
                int i8 = c8681d.f127631f;
                if (i8 != 1 && i8 != 9) {
                    HandlerThreads.postDelayed(0, runnableC5682g, 1000L);
                }
                ControlContainerType controlContainerTypeOnGetControlContainerTypeForOrientation = iHardwareDelegate.onGetControlContainerTypeForOrientation(configuration.orientation);
                ControlContainerType controlContainerTypeOnGetControlContainerType2 = controlContainerTypeOnGetControlContainerTypeForOrientation;
                if (controlContainerTypeOnGetControlContainerTypeForOrientation == null) {
                    controlContainerTypeOnGetControlContainerType2 = iHardwareDelegate.onGetControlContainerType(ScreenModeType.THUMB);
                }
                ControlContainerType controlContainerType2 = controlContainerTypeOnGetControlContainerType2;
                if (controlContainerTypeOnGetControlContainerType2 == null) {
                    controlContainerType2 = ControlContainerType.HALF_SCREEN;
                }
                c8681d.b(controlContainerType2);
                return;
            }
            if (i7 == 2) {
                int i9 = c8681d.f127631f;
                if (i9 != 0 && i9 != 8) {
                    HandlerThreads.postDelayed(0, runnableC5682g, 1000L);
                }
                ControlContainerType controlContainerTypeOnGetControlContainerTypeForOrientation2 = iHardwareDelegate.onGetControlContainerTypeForOrientation(configuration.orientation);
                ControlContainerType controlContainerTypeOnGetControlContainerType3 = controlContainerTypeOnGetControlContainerTypeForOrientation2;
                if (controlContainerTypeOnGetControlContainerTypeForOrientation2 == null) {
                    controlContainerTypeOnGetControlContainerType3 = iHardwareDelegate.onGetControlContainerType(ScreenModeType.LANDSCAPE_FULLSCREEN);
                }
                ControlContainerType controlContainerType3 = controlContainerTypeOnGetControlContainerType3;
                if (controlContainerTypeOnGetControlContainerType3 == null) {
                    controlContainerType3 = ControlContainerType.LANDSCAPE_FULLSCREEN;
                }
                c8681d.b(controlContainerType3);
            }
        }
    }

    public final void onMultiWindowModeChanged(boolean z6) {
        C8681d c8681d = this.f79807d;
        if (c8681d != null) {
            if (!z6) {
                FragmentActivity fragmentActivity = c8681d.f127626a;
                if (fragmentActivity.getRequestedOrientation() == 0 || fragmentActivity.getRequestedOrientation() == 8) {
                    ControlContainerType state = c8681d.f127628c.getControlContainerService().getState();
                    ControlContainerType controlContainerType = ControlContainerType.LANDSCAPE_FULLSCREEN;
                    if (state != controlContainerType) {
                        c8681d.b(controlContainerType);
                    }
                }
            }
            t.a("multi window mode: ", "ControllerTypeChangeProcessor", z6);
        }
    }

    public void onStart(@Nullable PlayerSharingBundle playerSharingBundle) {
        IPlayerContainer iPlayerContainer = this.f79804a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getVideoPlayDirectorService().addVideoPlayEventListener(this);
    }

    public void onStop() {
        IPlayerContainer iPlayerContainer = this.f79804a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getVideoPlayDirectorService().removeVideoPlayEventListener(this);
        C8681d c8681d = this.f79807d;
        if (c8681d != null) {
            c8681d.f127628c.getControlContainerService().unregisterState(c8681d.f127637m);
            c8681d.f127636l.disable();
            C8683f c8683f = c8681d.f127632g;
            c8683f.f127641a.unregisterContentObserver(c8683f);
            c8683f.f127642b = null;
        }
        C8685h c8685h = this.f79808e;
        if (c8685h != null) {
            c8685h.f127645b.getControlContainerService().unregisterState(c8685h.f127648e);
            NavigationHelper.INSTANCE.setOnSystemUiVisibilityChangeListener(c8685h.f127644a, (View.OnSystemUiVisibilityChangeListener) null);
        }
    }

    public void onVideoItemStart(@NotNull CurrentVideoPointer currentVideoPointer, @NotNull Video video) {
        IPlayerContainer iPlayerContainer = this.f79804a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        Video.PlayableParams currentPlayableParams = iPlayerContainer2.getVideoPlayDirectorService().getCurrentPlayableParams();
        if (currentPlayableParams == null) {
            return;
        }
        IPlayerContainer iPlayerContainer3 = this.f79804a;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer3 = null;
        }
        ScreenModeType screenModeType = iPlayerContainer3.getControlContainerService().getScreenModeType();
        if (currentPlayableParams.getDisplayParams().getDisplayOrientation() == DisplayOrientation.VERTICAL) {
            this.f79809f = false;
            setGravityEnable(false);
            if (screenModeType == ScreenModeType.LANDSCAPE_FULLSCREEN) {
                PlayerLog.i(TAG, "current screen mode type is Landscape fullscreen, but video orientation is vertical, do not match");
                IHardwareDelegate iHardwareDelegate = this.f79810g;
                if (iHardwareDelegate == null || !iHardwareDelegate.onAdjustControlContainerType(screenModeType, currentPlayableParams)) {
                    switchScreenOrientation(1);
                    return;
                } else {
                    PlayerLog.i(TAG, "adjust control container type by customer");
                    return;
                }
            }
            return;
        }
        this.f79809f = true;
        setGravityEnable(true);
        if (screenModeType == ScreenModeType.VERTICAL_FULLSCREEN) {
            PlayerLog.i(TAG, "current screen mode type is vertical fullscreen, but video orientation is landscape, do not match");
            IHardwareDelegate iHardwareDelegate2 = this.f79810g;
            if (iHardwareDelegate2 != null && iHardwareDelegate2.onAdjustControlContainerType(screenModeType, currentPlayableParams)) {
                PlayerLog.i(TAG, "adjust control container type by customer");
                return;
            }
            C8681d c8681d = this.f79807d;
            if (c8681d != null) {
                c8681d.b(ControlContainerType.HALF_SCREEN);
            }
        }
    }

    public final boolean performBackPressed() {
        C8681d c8681d = this.f79807d;
        boolean z6 = false;
        if (c8681d != null) {
            PlayerLog.i("ControllerTypeChangeProcessor", "onBackPressed");
            ScreenModeType screenModeType = c8681d.f127628c.getControlContainerService().getScreenModeType();
            if (screenModeType == ScreenModeType.LANDSCAPE_FULLSCREEN) {
                c8681d.a(1);
            } else if (screenModeType == ScreenModeType.VERTICAL_FULLSCREEN) {
                ControlContainerType controlContainerTypeOnGetControlContainerType = c8681d.f127627b.onGetControlContainerType(ScreenModeType.THUMB);
                ControlContainerType controlContainerType = controlContainerTypeOnGetControlContainerType;
                if (controlContainerTypeOnGetControlContainerType == null) {
                    controlContainerType = ControlContainerType.HALF_SCREEN;
                }
                c8681d.b(controlContainerType);
            } else {
                PlayerLog.i("ControllerTypeChangeProcessor", "onBackPressed not resolve, screenMode:" + screenModeType);
                z6 = false;
            }
            z6 = true;
        }
        return z6;
    }

    public final void registerStatusBarDrawHeight(@NotNull b bVar) {
        Collections.SafeIteratorList<b> safeIteratorList = this.f79806c;
        if (safeIteratorList.contains(bVar)) {
            return;
        }
        safeIteratorList.add(bVar);
    }

    @NotNull
    public PlayerServiceManager.ServiceConfig serviceConfig() {
        return PlayerServiceManager.ServiceConfig.Companion.obtain(true);
    }

    public final void setGravityEnable(boolean z6) {
        C8681d c8681d = this.f79807d;
        if (c8681d != null) {
            c8681d.f127633i = z6;
        }
    }

    public final void setOnlyHorizontalRotationEnable(boolean z6) {
        C8681d c8681d = this.f79807d;
        if (c8681d != null) {
            c8681d.f127629d = z6;
        }
        if (z6) {
            setGravityEnable(true);
        }
    }

    public final void startGravitySensor() {
        PlayerContainer playerContainer = this.f79804a;
        PlayerContainer playerContainer2 = playerContainer;
        if (playerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer2 = null;
        }
        FragmentActivity fragmentActivityFindFragmentActivityOrNull = ContextUtilKt.findFragmentActivityOrNull(playerContainer2.getContext());
        if (fragmentActivityFindFragmentActivityOrNull == null) {
            return;
        }
        boolean zHasWindowFocus = fragmentActivityFindFragmentActivityOrNull.hasWindowFocus();
        if (zHasWindowFocus && this.f79809f) {
            C8681d c8681d = this.f79807d;
            if (c8681d != null ? c8681d.f127633i : true) {
                if (c8681d != null) {
                    c8681d.f127634j = c8681d.f127628c.getPlayerSettingService().getCloudConfig().c();
                    c8681d.f127636l.enable();
                }
                PlayerLog.i(TAG, "startGravitySensor");
                return;
            }
        }
        C8681d c8681d2 = this.f79807d;
        boolean z6 = true;
        if (c8681d2 != null) {
            z6 = c8681d2.f127633i;
        }
        boolean z7 = this.f79809f;
        StringBuilder sbA = c6.Q.a("not start gravity sensor, hasFocus:", ", enable:", ", support:", zHasWindowFocus, z6);
        sbA.append(z7);
        PlayerLog.i(TAG, sbA.toString());
    }

    public final void stopGravitySensor() {
        C8681d c8681d = this.f79807d;
        if (c8681d != null) {
            c8681d.f127636l.disable();
        }
        PlayerLog.i(TAG, "stopGravitySensor");
    }

    public final void switchScreenOrientation(int i7) {
        C8681d c8681d = this.f79807d;
        if (c8681d != null) {
            c8681d.a(i7);
        }
    }

    public final void unregisterStatusBarDrawHeight(@NotNull b bVar) {
        this.f79806c.remove(bVar);
    }
}
