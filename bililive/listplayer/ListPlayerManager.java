package com.bilibili.bililive.listplayer;

import OB.b;
import OB.c;
import OB.d;
import OB.e;
import android.graphics.Rect;
import android.media.AudioManager;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCaller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.droid.thread.HandlerThreads;
import java.lang.ref.SoftReference;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.ScreenModeType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/bililive/listplayer/ListPlayerManager.class */
@Deprecated
public class ListPlayerManager {

    @Deprecated
    public static final String AUTO_PLAY_VIEW_TAG = "list_player_container";
    public static final String FOLLOWING_AUTO_PLAY_VIEW_TAG = "view_auto_play_container";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile ListPlayerManager f62912m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public FragmentManager f62913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ViewGroup f62914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Fragment f62915c;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f62920i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f62923l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f62916d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final QB.a f62917e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseArray<PB.a> f62918f = new SparseArray<>(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f62919g = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f62921j = new a(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Lq.a f62922k = new Lq.a(this, 1);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/bililive/listplayer/ListPlayerManager$a.class */
    public final class a implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ListPlayerManager f62924a;

        public a(ListPlayerManager listPlayerManager) {
            this.f62924a = listPlayerManager;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i7) {
            if (i7 == 1) {
                this.f62924a.f62919g = 2;
            } else if (i7 == -1 || i7 == -2 || i7 == -3) {
                int i8 = i7 == -3 ? 1 : 0;
                ListPlayerManager listPlayerManager = this.f62924a;
                listPlayerManager.f62919g = i8;
                if (listPlayerManager.isPlaying() && i8 == 0) {
                    this.f62924a.h = true;
                }
            }
            ListPlayerManager listPlayerManager2 = this.f62924a;
            if (listPlayerManager2.f62919g == 0) {
                listPlayerManager2.f62920i = listPlayerManager2.isPlaying();
                OB.a aVar = listPlayerManager2.f62915c;
                if (!(aVar instanceof OB.a) || aVar.isPaused()) {
                    return;
                }
                listPlayerManager2.f62915c.getClass();
                return;
            }
            if (listPlayerManager2.h) {
                if (listPlayerManager2.f62915c != null && !listPlayerManager2.isPlaying() && listPlayerManager2.f62920i) {
                    listPlayerManager2.resumePlaying();
                }
                listPlayerManager2.h = false;
            }
        }
    }

    public static ListPlayerManager getInstance() {
        if (f62912m == null) {
            synchronized (ListPlayerManager.class) {
                try {
                    if (f62912m == null) {
                        f62912m = new ListPlayerManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f62912m;
    }

    public void clearCurrentCardVisibleRect() {
        this.f62916d.setEmpty();
    }

    @Nullable
    public Fragment getCurrentFragment() {
        return this.f62915c;
    }

    public Rect getCurrentPlayingCardRect() {
        return new Rect(this.f62916d);
    }

    public int getCurrentPosition() {
        ActivityResultCaller activityResultCaller = this.f62915c;
        if (activityResultCaller instanceof com.bilibili.bililive.listplayer.videonew.a) {
            return ((com.bilibili.bililive.listplayer.videonew.a) activityResultCaller).getCurrentPosition();
        }
        return -1;
    }

    public AudioManager.OnAudioFocusChangeListener getListPlayerAudioFocusListener() {
        return this.f62921j;
    }

    @Nullable
    public com.bilibili.bililive.listplayer.videonew.a getPlayerController() {
        ActivityResultCaller activityResultCaller = this.f62915c;
        if (activityResultCaller instanceof com.bilibili.bililive.listplayer.videonew.a) {
            return (com.bilibili.bililive.listplayer.videonew.a) activityResultCaller;
        }
        return null;
    }

    public boolean hasAdPlayerFragment() {
        FragmentManager fragmentManager = this.f62913a;
        boolean z6 = false;
        if (fragmentManager != null) {
            Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("tag_fragment_ad");
            z6 = false;
            if (fragmentFindFragmentByTag != null) {
                z6 = false;
                if (fragmentFindFragmentByTag == this.f62915c) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    public boolean isCurrentContainer(@Nullable ViewGroup viewGroup) {
        return (viewGroup == null || this.f62914b == null || viewGroup.getId() != this.f62914b.getId()) ? false : true;
    }

    public boolean isCurrentManager(FragmentManager fragmentManager) {
        FragmentManager fragmentManager2 = this.f62913a;
        boolean z6 = false;
        if (fragmentManager2 == null) {
            return false;
        }
        if (fragmentManager2 == fragmentManager) {
            z6 = true;
        }
        return z6;
    }

    public boolean isPausing(FragmentManager fragmentManager) {
        if (!isCurrentManager(fragmentManager)) {
            return false;
        }
        OB.a aVar = this.f62915c;
        if (aVar instanceof OB.a) {
            return aVar.isPaused();
        }
        boolean z6 = false;
        if (aVar instanceof com.bilibili.bililive.listplayer.videonew.a) {
            z6 = false;
            if (((com.bilibili.bililive.listplayer.videonew.a) aVar).getPlayerState() == 5) {
                z6 = true;
            }
        }
        return z6;
    }

    public boolean isPlaying() {
        OB.a aVar = this.f62915c;
        if (aVar instanceof OB.a) {
            return aVar.isPlaying();
        }
        boolean z6 = false;
        if (aVar instanceof com.bilibili.bililive.listplayer.videonew.a) {
            z6 = false;
            if (((com.bilibili.bililive.listplayer.videonew.a) aVar).getPlayerState() == 4) {
                z6 = true;
            }
        }
        return z6;
    }

    public boolean isSamePlayer(@Nullable Fragment fragment) {
        boolean z6 = false;
        if (fragment == null) {
            return false;
        }
        if (fragment == this.f62915c) {
            z6 = true;
        }
        return z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isSameVideo(long r5) {
        /*
            r4 = this;
            r0 = r4
            androidx.fragment.app.Fragment r0 = r0.f62915c
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof OB.f
            if (r0 == 0) goto L1b
            r0 = r8
            OB.f r0 = (OB.f) r0
            boolean r0 = r0.b()
            if (r0 != 0) goto L37
        L1b:
            r0 = r4
            androidx.fragment.app.Fragment r0 = r0.f62915c
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.bililive.listplayer.videonew.a
            if (r0 == 0) goto L3c
            r0 = r8
            com.bilibili.bililive.listplayer.videonew.a r0 = (com.bilibili.bililive.listplayer.videonew.a) r0
            r1 = r5
            boolean r0 = r0.Z(r1)
            if (r0 == 0) goto L3c
        L37:
            r0 = 1
            r7 = r0
            goto L3e
        L3c:
            r0 = 0
            r7 = r0
        L3e:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.bililive.listplayer.ListPlayerManager.isSameVideo(long):boolean");
    }

    public boolean isSameVideoContainer(@Nullable View view) {
        boolean z6 = false;
        if (view == null) {
            return false;
        }
        if (view == this.f62914b) {
            return true;
        }
        if (view.findViewWithTag(AUTO_PLAY_VIEW_TAG) == this.f62914b || view.findViewWithTag(FOLLOWING_AUTO_PLAY_VIEW_TAG) == this.f62914b) {
            z6 = true;
        }
        return z6;
    }

    public boolean isSameVideoContainer(View view, String str) {
        boolean z6 = false;
        if (view == null) {
            return false;
        }
        if (view == this.f62914b) {
            return true;
        }
        if (view.findViewWithTag(str) == this.f62914b) {
            z6 = true;
        }
        return z6;
    }

    public boolean isTopVideoActivity(int i7) {
        int i8 = this.f62923l;
        return i8 == 0 || i8 == i7;
    }

    public void onDestroy(FragmentManager fragmentManager) {
        if (isCurrentManager(fragmentManager)) {
            b bVar = this.f62915c;
            if (bVar instanceof b) {
                bVar.a();
            } else if (bVar instanceof com.bilibili.bililive.listplayer.videonew.a) {
                releaseCurrentFragment();
            }
        }
    }

    public void onListDragging() {
        OB.a aVar = this.f62915c;
        if (aVar instanceof OB.a) {
            aVar.getClass();
        } else if (aVar instanceof com.bilibili.bililive.listplayer.videonew.a) {
            ((com.bilibili.bililive.listplayer.videonew.a) aVar).D();
        }
    }

    public void onPause(FragmentManager fragmentManager) {
        if (isCurrentManager(fragmentManager)) {
            b bVar = this.f62915c;
            if (bVar instanceof b) {
                bVar.d();
            }
        }
    }

    public void onResume(FragmentManager fragmentManager) {
        if (isCurrentManager(fragmentManager)) {
            b bVar = this.f62915c;
            if (bVar instanceof b) {
                bVar.b();
            }
        }
    }

    public void onStop(FragmentManager fragmentManager) {
        if (isCurrentManager(fragmentManager)) {
            b bVar = this.f62915c;
            if (bVar instanceof b) {
                bVar.c();
            }
        }
    }

    public void onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        ActivityResultCaller activityResultCaller = this.f62915c;
        if (activityResultCaller instanceof com.bilibili.bililive.listplayer.videonew.a) {
            ((com.bilibili.bililive.listplayer.videonew.a) activityResultCaller).te(viewHolder);
        }
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        ActivityResultCaller activityResultCaller = this.f62915c;
        if (activityResultCaller instanceof com.bilibili.bililive.listplayer.videonew.a) {
            ((com.bilibili.bililive.listplayer.videonew.a) activityResultCaller).gd(viewHolder);
        }
    }

    public void pausePlaying() {
        OB.a aVar = this.f62915c;
        if (aVar instanceof OB.a) {
            aVar.getClass();
        } else if (aVar instanceof com.bilibili.bililive.listplayer.videonew.a) {
            ((com.bilibili.bililive.listplayer.videonew.a) aVar).pause();
        }
    }

    public void pausePlaying(View view) {
        if (isSameVideoContainer(view)) {
            pausePlaying();
        }
    }

    public void pausePlaying(FragmentManager fragmentManager) {
        if (isCurrentManager(fragmentManager)) {
            pausePlaying();
        }
    }

    public void playVideoInFragment(@NonNull FragmentManager fragmentManager, @NonNull ViewGroup viewGroup, @NonNull Fragment fragment) {
        HandlerThreads.remove(0, this.f62922k);
        releaseCurrentFragment();
        this.f62913a = fragmentManager;
        this.f62914b = viewGroup;
        this.f62915c = fragment;
        try {
            fragmentManager.beginTransaction().replace(viewGroup.getId(), this.f62915c).commitNowAllowingStateLoss();
        } catch (Exception e7) {
            BLog.e("ListPlayerManager", "Fail to start play video: " + e7.getLocalizedMessage(), e7);
            this.f62913a = null;
            this.f62914b = null;
            this.f62915c = null;
        }
    }

    public void registerReleaseObserver(int i7, @NonNull PB.a aVar) {
        this.f62918f.append(i7, aVar);
    }

    public void registerStartPlayListener(e eVar) {
        new SoftReference(eVar);
    }

    @Deprecated
    public void releaseCurrentFragment() {
        QB.a aVar = this.f62917e;
        if (this.f62915c == null || this.f62913a == null) {
            return;
        }
        if (getPlayerController() == null || getPlayerController().getPlayerContainer() == null || getPlayerController().getPlayerContainer().getControlContainerService().getScreenModeType() == ScreenModeType.THUMB) {
            stopSharing();
            try {
                this.f62913a.beginTransaction().remove(this.f62915c).commitNowAllowingStateLoss();
                ViewGroup viewGroup = this.f62914b;
                if (viewGroup != null) {
                    int id = viewGroup.getId();
                    if (id == 2131316149) {
                        this.f62914b.setId(0);
                    }
                    this.f62914b.removeOnAttachStateChangeListener(aVar);
                    if (this.f62918f.get(id) != null) {
                        this.f62918f.get(id).onRelease();
                    }
                }
                this.f62915c = null;
                this.f62914b = null;
                this.f62913a = null;
                this.f62923l = 0;
            } catch (Throwable th) {
                ViewGroup viewGroup2 = this.f62914b;
                if (viewGroup2 != null) {
                    int id2 = viewGroup2.getId();
                    if (id2 == 2131316149) {
                        this.f62914b.setId(0);
                    }
                    this.f62914b.removeOnAttachStateChangeListener(aVar);
                    if (this.f62918f.get(id2) != null) {
                        this.f62918f.get(id2).onRelease();
                    }
                }
                this.f62915c = null;
                this.f62914b = null;
                this.f62913a = null;
                this.f62923l = 0;
                throw th;
            }
        }
    }

    public void releaseCurrentFragment(@Nullable View view) {
        if (isSameVideoContainer(view)) {
            releaseCurrentFragment();
        }
    }

    public void releaseCurrentFragment(FragmentManager fragmentManager) {
        if (this.f62913a != fragmentManager) {
            return;
        }
        releaseCurrentFragment();
    }

    public void restoreVolume() {
        ActivityResultCaller activityResultCaller = this.f62915c;
        if (activityResultCaller instanceof com.bilibili.bililive.listplayer.videonew.a) {
            ((com.bilibili.bililive.listplayer.videonew.a) activityResultCaller).restoreVolume();
        }
    }

    public void resumePlaying() {
        OB.a aVar = this.f62915c;
        if (aVar instanceof OB.a) {
            aVar.getClass();
        } else if (aVar instanceof com.bilibili.bililive.listplayer.videonew.a) {
            ((com.bilibili.bililive.listplayer.videonew.a) aVar).resume();
        }
    }

    public void setOnResumeValueFromDynamic(FragmentManager fragmentManager, boolean z6) {
        if (isCurrentManager(fragmentManager)) {
            c cVar = this.f62915c;
            if (cVar instanceof c) {
                cVar.b();
            }
        }
    }

    public void setTopVideoActivityHashCode(int i7) {
        this.f62923l = i7;
    }

    public void setUserVisibleCompat(FragmentManager fragmentManager, boolean z6) {
        if (isCurrentManager(fragmentManager)) {
            b bVar = this.f62915c;
            if (bVar instanceof b) {
                bVar.e();
            } else if (bVar instanceof com.bilibili.bililive.listplayer.videonew.a) {
                ((com.bilibili.bililive.listplayer.videonew.a) bVar).mc(z6);
                if (z6) {
                    return;
                }
                HandlerThreads.postDelayed(0, this.f62922k, 100L);
            }
        }
    }

    public void setUserVisibleFromDynamic(FragmentManager fragmentManager, boolean z6) {
        if (isCurrentManager(fragmentManager)) {
            c cVar = this.f62915c;
            if (cVar instanceof c) {
                cVar.a();
            }
        }
    }

    @Deprecated
    public void showVideoContainer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void startPlayVideoV2(FragmentManager fragmentManager, ViewGroup viewGroup, com.bilibili.bililive.listplayer.videonew.a aVar) {
        if (fragmentManager.isDestroyed() || viewGroup == null || !(aVar instanceof Fragment)) {
            return;
        }
        playVideoInFragment(fragmentManager, viewGroup, (Fragment) aVar);
        viewGroup.addOnAttachStateChangeListener(this.f62917e);
    }

    public void startSharing() {
        d dVar = this.f62915c;
        if (dVar instanceof d) {
            dVar.a();
        }
    }

    public void stopSharing() {
        d dVar = this.f62915c;
        if (dVar instanceof d) {
            dVar.c();
        }
    }

    public void unregisterReleaseObserver(int i7) {
        this.f62918f.remove(i7);
    }

    public Rect updateCurrentPlayingCardRect(@Nullable View view) {
        if (view != null) {
            view.getGlobalVisibleRect(this.f62916d);
        } else {
            clearCurrentCardVisibleRect();
        }
        return this.f62916d;
    }
}
