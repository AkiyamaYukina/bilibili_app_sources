package com.bilibili.music.podcast;

import Ki0.j;
import Ki0.k;
import Li0.r;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.music.podcast.collection.MusicPodcastPrimaryFavFragment;
import com.bilibili.music.podcast.data.MusicPlayItem;
import com.bilibili.music.podcast.data.MusicPlayVideo;
import com.bilibili.music.podcast.fragment.MusicPodcastFindFragment;
import com.bilibili.music.podcast.fragment.MusicPodcastHistoryFragment;
import com.bilibili.music.podcast.fragment.MusicPodcastSecondaryFavFragment;
import com.bilibili.music.podcast.fragment.MusicPodcastUpperFragment;
import com.bilibili.music.podcast.view.mini.MusicBottomPlayView;
import com.bilibili.video.story.X;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qi0.InterfaceC8437g;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/MusicPodcastCardTransferActivity.class */
public final class MusicPodcastCardTransferActivity extends BaseAppCompatActivity implements Ci0.d {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f66345I = 0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public MusicBottomPlayView f66347C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public r f66348D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public Pair<Long, Long> f66349E;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public String f66346B = "";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final b f66350F = new b(this);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final a f66351G = new a(this);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final c f66352H = new c(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/MusicPodcastCardTransferActivity$a.class */
    public static final class a implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastCardTransferActivity f66353a;

        public a(MusicPodcastCardTransferActivity musicPodcastCardTransferActivity) {
            this.f66353a = musicPodcastCardTransferActivity;
        }

        @Override // Ki0.k
        public final void c(Pair<Integer, Integer> pair, Pair<Integer, Integer> pair2, Bundle bundle) {
            j jVarG;
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("play_index_old", pair);
            bundle2.putSerializable("play_index_new", pair2);
            bundle2.putBundle("play_index_extra", bundle);
            int i7 = MusicPodcastCardTransferActivity.f66345I;
            MusicPodcastCardTransferActivity musicPodcastCardTransferActivity = this.f66353a;
            musicPodcastCardTransferActivity.getSupportFragmentManager().setFragmentResult("play_index_change", bundle2);
            r rVar = musicPodcastCardTransferActivity.f66348D;
            if (rVar == null || (jVarG = rVar.g()) == null) {
                return;
            }
            jVarG.A();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/MusicPodcastCardTransferActivity$b.class */
    public static final class b implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastCardTransferActivity f66354a;

        public b(MusicPodcastCardTransferActivity musicPodcastCardTransferActivity) {
            this.f66354a = musicPodcastCardTransferActivity;
        }

        @Override // Ki0.k
        public final void e(List list, Bundle bundle) {
            j jVarG;
            int i7;
            r rVar;
            j jVarG2;
            j jVarG3;
            MusicPodcastCardTransferActivity musicPodcastCardTransferActivity = this.f66354a;
            r rVar2 = musicPodcastCardTransferActivity.f66348D;
            if (rVar2 != null && (jVarG3 = rVar2.g()) != null) {
                jVarG3.x(this);
            }
            Pair<Long, Long> pair = musicPodcastCardTransferActivity.f66349E;
            boolean z6 = pair != null;
            if (pair != null) {
                ArrayList arrayList = (ArrayList) list;
                Iterator it = arrayList.iterator();
                int i8 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i7 = -1;
                        break;
                    } else {
                        if (((MusicPlayVideo) it.next()).getOid() == ((Number) musicPodcastCardTransferActivity.f66349E.getFirst()).longValue()) {
                            i7 = i8;
                            break;
                        }
                        i8++;
                    }
                }
                MusicPlayVideo musicPlayVideo = (MusicPlayVideo) CollectionsKt.getOrNull(arrayList, i7);
                int i9 = -1;
                if (musicPlayVideo != null) {
                    List<MusicPlayItem> parts = musicPlayVideo.getParts();
                    i9 = -1;
                    if (parts != null) {
                        Iterator<MusicPlayItem> it2 = parts.iterator();
                        int i10 = 0;
                        while (true) {
                            i9 = -1;
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (it2.next().getSid() == ((Number) musicPodcastCardTransferActivity.f66349E.getSecond()).longValue()) {
                                i9 = i10;
                                break;
                            }
                            i10++;
                        }
                    }
                }
                if (i7 >= 0 && i9 >= 0 && (rVar = musicPodcastCardTransferActivity.f66348D) != null && (jVarG2 = rVar.g()) != null) {
                    jVarG2.s(i7, i9, null);
                }
                musicPodcastCardTransferActivity.f66349E = null;
            }
            Pair serializable = bundle.getSerializable("anchor_index");
            Pair pair2 = null;
            if (serializable instanceof Pair) {
                pair2 = serializable;
            }
            if (pair2 != null && !z6) {
                int iIntValue = ((Integer) pair2.getFirst()).intValue();
                int iIntValue2 = ((Integer) pair2.getSecond()).intValue();
                if (iIntValue >= ((ArrayList) list).size()) {
                    r rVar3 = musicPodcastCardTransferActivity.f66348D;
                    boolean zC = (rVar3 == null || (jVarG = rVar3.g()) == null) ? false : jVarG.c();
                    Bundle bundleA = X.a("play_scroll", false);
                    if (Ei0.b.a("pref_music_podcast_player_completion_action_key", 4) == 8) {
                        r rVar4 = musicPodcastCardTransferActivity.f66348D;
                        if (rVar4 != null) {
                            rVar4.t(bundleA, zC);
                        }
                    } else {
                        r rVar5 = musicPodcastCardTransferActivity.f66348D;
                        if (rVar5 != null) {
                            rVar5.s(bundleA, zC);
                        }
                    }
                } else {
                    r rVar6 = musicPodcastCardTransferActivity.f66348D;
                    if (rVar6 != null) {
                        rVar6.r(iIntValue, iIntValue2);
                    }
                }
            }
            MusicBottomPlayView musicBottomPlayView = musicPodcastCardTransferActivity.f66347C;
            if (musicBottomPlayView != null) {
                musicBottomPlayView.f(musicPodcastCardTransferActivity, false, false);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/MusicPodcastCardTransferActivity$c.class */
    public static final class c implements InterfaceC8437g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastCardTransferActivity f66355a;

        public c(MusicPodcastCardTransferActivity musicPodcastCardTransferActivity) {
            this.f66355a = musicPodcastCardTransferActivity;
        }

        @Override // qi0.InterfaceC8437g
        public final MusicPlayItem a() {
            MusicBottomPlayView musicBottomPlayView = this.f66355a.f66347C;
            return musicBottomPlayView != null ? musicBottomPlayView.getCurrentPlayItem() : null;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.music.podcast.MusicPodcastCardTransferActivity$onCreate$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/MusicPodcastCardTransferActivity$onCreate$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final MusicPodcastCardTransferActivity this$0;

        /* JADX INFO: renamed from: com.bilibili.music.podcast.MusicPodcastCardTransferActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/MusicPodcastCardTransferActivity$onCreate$1$1.class */
        public static final class C03761 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            int label;
            final MusicPodcastCardTransferActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03761(MusicPodcastCardTransferActivity musicPodcastCardTransferActivity, Continuation<? super C03761> continuation) {
                super(2, continuation);
                this.this$0 = musicPodcastCardTransferActivity;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03761(this.this$0, continuation);
            }

            public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
                return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ScreenAdjustUtilsKt.correctOrientation(this.this$0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MusicPodcastCardTransferActivity musicPodcastCardTransferActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = musicPodcastCardTransferActivity;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowWindowSizeFlow = ScreenAdjustUtilsKt.windowSizeFlow(this.this$0);
                C03761 c03761 = new C03761(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowWindowSizeFlow, c03761, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final BaseFragment P6(String str) throws Exception {
        BaseFragment baseFragment;
        Bundle extras = getIntent().getExtras();
        int iHashCode = str.hashCode();
        c cVar = this.f66352H;
        switch (iHashCode) {
            case -1043893951:
                if (str.equals("dest_primary_fav")) {
                    MusicPodcastPrimaryFavFragment musicPodcastPrimaryFavFragment = new MusicPodcastPrimaryFavFragment();
                    musicPodcastPrimaryFavFragment.setArguments(extras);
                    baseFragment = musicPodcastPrimaryFavFragment;
                    return baseFragment;
                }
                break;
            case 921417925:
                if (str.equals("dest_upper")) {
                    MusicPodcastUpperFragment musicPodcastUpperFragment = new MusicPodcastUpperFragment();
                    musicPodcastUpperFragment.setArguments(extras);
                    musicPodcastUpperFragment.f66497b = cVar;
                    baseFragment = musicPodcastUpperFragment;
                    return baseFragment;
                }
                break;
            case 1165287155:
                if (str.equals("dest_secondary_fav")) {
                    MusicPodcastSecondaryFavFragment musicPodcastSecondaryFavFragment = new MusicPodcastSecondaryFavFragment();
                    musicPodcastSecondaryFavFragment.setArguments(extras);
                    musicPodcastSecondaryFavFragment.f66497b = cVar;
                    baseFragment = musicPodcastSecondaryFavFragment;
                    return baseFragment;
                }
                break;
            case 1869531127:
                if (str.equals("dest_history")) {
                    MusicPodcastHistoryFragment musicPodcastHistoryFragment = new MusicPodcastHistoryFragment();
                    musicPodcastHistoryFragment.setArguments(extras);
                    baseFragment = musicPodcastHistoryFragment;
                    return baseFragment;
                }
                break;
            case 1968932150:
                if (str.equals("dest_find")) {
                    MusicPodcastFindFragment musicPodcastFindFragment = new MusicPodcastFindFragment();
                    musicPodcastFindFragment.setArguments(extras);
                    baseFragment = musicPodcastFindFragment;
                    return baseFragment;
                }
                break;
        }
        throw new Exception("detail from unknown");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ea  */
    /* JADX WARN: Type inference failed for: r0v35, types: [Qi0.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v88, types: [Li0.d, Li0.r, androidx.lifecycle.LifecycleObserver] */
    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 1421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.MusicPodcastCardTransferActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        Li0.d dVar;
        j jVarG;
        j jVarG2;
        super.onDestroy();
        r rVar = this.f66348D;
        if (rVar != null && (jVarG2 = rVar.g()) != null) {
            jVarG2.x(this.f66350F);
        }
        MusicBottomPlayView musicBottomPlayView = this.f66347C;
        if (musicBottomPlayView != null && (dVar = musicBottomPlayView.f67286g) != null && (jVarG = dVar.g()) != null) {
            jVarG.x(this.f66351G);
        }
        r rVar2 = this.f66348D;
        if (rVar2 != null) {
            rVar2.c();
        }
        this.f66348D = null;
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        Window window = getWindow();
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1280);
        window.clearFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        j jVarG;
        super.onResume();
        MusicBottomPlayView musicBottomPlayView = this.f66347C;
        if (musicBottomPlayView != null) {
            int i7 = MusicBottomPlayView.f67279p;
            musicBottomPlayView.f(this, false, true);
            Li0.d dVar = musicBottomPlayView.f67286g;
            if (dVar != null && (jVarG = dVar.g()) != null) {
                jVarG.q(this.f66351G);
            }
        }
        getSupportFragmentManager().setFragmentResult("playing_highlight_check", new Bundle());
    }
}
