package com.bilibili.music.podcast.utils;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.bilibili.music.podcast.view.MusicTopCarLayout;
import gi0.C7309M;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/F.class */
public final class F implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public MusicTopCarLayout f66906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ImageView f66907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public View f66908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public C7309M f66909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f66910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public AnimatorSet f66911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C5421a f66912g;

    public final void a() {
        MusicTopCarLayout musicTopCarLayout;
        ImageView imageView = this.f66907b;
        if (imageView != null) {
            imageView.setRotation(0.0f);
        }
        C5421a c5421a = this.f66912g;
        C5421a c5421a2 = c5421a;
        if (c5421a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSpaceDataProvider");
            c5421a2 = null;
        }
        if (c5421a2.f66968j && (musicTopCarLayout = this.f66906a) != null) {
            musicTopCarLayout.a(0.0f, false);
        }
        MusicTopCarLayout musicTopCarLayout2 = this.f66906a;
        if (musicTopCarLayout2 != null) {
            musicTopCarLayout2.setVisibility(8);
        }
    }

    public final void b() {
        MusicTopCarLayout musicTopCarLayout;
        ImageView imageView = this.f66907b;
        if (imageView != null) {
            imageView.setRotation(180.0f);
        }
        MusicTopCarLayout musicTopCarLayout2 = this.f66906a;
        if (musicTopCarLayout2 != null) {
            musicTopCarLayout2.setVisibility(0);
        }
        MusicTopCarLayout musicTopCarLayout3 = this.f66906a;
        if (musicTopCarLayout3 != null) {
            musicTopCarLayout3.setRecycleViewAlpha(1.0f);
        }
        MusicTopCarLayout musicTopCarLayout4 = this.f66906a;
        if (musicTopCarLayout4 != null) {
            C5421a c5421a = this.f66912g;
            C5421a c5421a2 = c5421a;
            if (c5421a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSpaceDataProvider");
                c5421a2 = null;
            }
            musicTopCarLayout4.setRecycleViewMarginTop(c5421a2.c());
        }
        C5421a c5421a3 = this.f66912g;
        if (c5421a3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSpaceDataProvider");
            c5421a3 = null;
        }
        if (!c5421a3.f66968j || (musicTopCarLayout = this.f66906a) == null) {
            return;
        }
        musicTopCarLayout.a(1.0f, true);
    }

    public final void c(boolean z6, boolean z7) {
        int iT;
        ValueAnimator valueAnimator;
        AnimatorSet.Builder builderPlay;
        int iC;
        AnimatorSet.Builder builderPlay2;
        AnimatorSet.Builder builderPlay3;
        AnimatorSet.Builder builderPlay4;
        int iT2;
        int iC2;
        int i7 = 0;
        if (z6 == this.f66910e) {
            return;
        }
        MusicTopCarLayout musicTopCarLayout = this.f66906a;
        if (musicTopCarLayout == null || ((ArrayList) musicTopCarLayout.f67128e.f120192a).isEmpty()) {
            BLog.w("MusicNavigationTabWrapper", "NavigationTab data is empty,Don't allow setExpand=" + z6);
            return;
        }
        C5421a c5421a = null;
        if (!z7) {
            if (z6) {
                b();
                C5421a c5421a2 = this.f66912g;
                if (c5421a2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSpaceDataProvider");
                } else {
                    c5421a = c5421a2;
                }
                int iB = c5421a.b();
                C7309M c7309m = this.f66909d;
                if (c7309m != null) {
                    c7309m.V(iB);
                }
                C7309M c7309m2 = this.f66909d;
                if (c7309m2 != null) {
                    c7309m2.U(iB);
                }
            } else {
                C5421a c5421a3 = this.f66912g;
                if (c5421a3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSpaceDataProvider");
                    c5421a3 = null;
                }
                int iA = c5421a3.a();
                a();
                C7309M c7309m3 = this.f66909d;
                if (c7309m3 != null) {
                    c7309m3.V(iA);
                }
                C7309M c7309m4 = this.f66909d;
                if (c7309m4 != null) {
                    c7309m4.U(iA);
                }
            }
            this.f66910e = z6;
            return;
        }
        AnimatorSet animatorSet = this.f66911f;
        if (animatorSet == null || !animatorSet.isRunning()) {
            if (z6) {
                AnimatorSet animatorSet2 = this.f66911f;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    C5421a c5421a4 = this.f66912g;
                    C5421a c5421a5 = c5421a4;
                    if (c5421a4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mSpaceDataProvider");
                        c5421a5 = null;
                    }
                    if (c5421a5.f66968j) {
                        C5421a c5421a6 = this.f66912g;
                        C5421a c5421a7 = c5421a6;
                        if (c5421a6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mSpaceDataProvider");
                            c5421a7 = null;
                        }
                        iT2 = c5421a7.a();
                    } else {
                        C7309M c7309m5 = this.f66909d;
                        iT2 = c7309m5 != null ? c7309m5.T() : 0;
                    }
                    C5421a c5421a8 = this.f66912g;
                    C5421a c5421a9 = c5421a8;
                    if (c5421a8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mSpaceDataProvider");
                        c5421a9 = null;
                    }
                    int iB2 = c5421a9.b();
                    ArrayList arrayList = new ArrayList();
                    this.f66911f = new AnimatorSet();
                    final ImageView imageView = this.f66907b;
                    if (imageView != null) {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(imageView.getRotation(), 180.0f);
                        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(imageView) { // from class: com.bilibili.music.podcast.utils.z

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final ImageView f67045a;

                            {
                                this.f67045a = imageView;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                this.f67045a.setRotation(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                            }
                        });
                        arrayList.add(valueAnimatorOfFloat);
                    }
                    final MusicTopCarLayout musicTopCarLayout2 = this.f66906a;
                    if (musicTopCarLayout2 != null) {
                        C5421a c5421a10 = this.f66912g;
                        C5421a c5421a11 = c5421a10;
                        if (c5421a10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mSpaceDataProvider");
                            c5421a11 = null;
                        }
                        if (!c5421a11.f66968j) {
                            C5421a c5421a12 = this.f66912g;
                            C5421a c5421a13 = c5421a12;
                            if (c5421a12 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mSpaceDataProvider");
                                c5421a13 = null;
                            }
                            int i8 = c5421a13.f66963d;
                            C5421a c5421a14 = this.f66912g;
                            C5421a c5421a15 = c5421a14;
                            if (c5421a14 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mSpaceDataProvider");
                                c5421a15 = null;
                            }
                            i7 = (iT2 - i8) - c5421a15.f66967i;
                        }
                        C5421a c5421a16 = this.f66912g;
                        C5421a c5421a17 = c5421a16;
                        if (c5421a16 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mSpaceDataProvider");
                            c5421a17 = null;
                        }
                        if (c5421a17.f66968j) {
                            C5421a c5421a18 = this.f66912g;
                            C5421a c5421a19 = c5421a18;
                            if (c5421a18 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mSpaceDataProvider");
                                c5421a19 = null;
                            }
                            iC2 = c5421a19.c();
                        } else {
                            iC2 = (iB2 - iT2) + i7;
                        }
                        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i7, iC2);
                        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
                        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(musicTopCarLayout2) { // from class: com.bilibili.music.podcast.utils.A

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final MusicTopCarLayout f66898a;

                            {
                                this.f66898a = musicTopCarLayout2;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                this.f66898a.setRecycleViewMarginTop(((Integer) valueAnimator2.getAnimatedValue()).intValue());
                            }
                        });
                        arrayList.add(valueAnimatorOfInt);
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(musicTopCarLayout2) { // from class: com.bilibili.music.podcast.utils.B

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final MusicTopCarLayout f66899a;

                            {
                                this.f66899a = musicTopCarLayout2;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                this.f66899a.setRecycleViewAlpha(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                            }
                        });
                        arrayList.add(valueAnimatorOfFloat2);
                        C5421a c5421a20 = this.f66912g;
                        if (c5421a20 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mSpaceDataProvider");
                            c5421a20 = null;
                        }
                        if (c5421a20.f66968j) {
                            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
                            valueAnimatorOfFloat3.addUpdateListener(new C(musicTopCarLayout2));
                            arrayList.add(valueAnimatorOfFloat3);
                        }
                    }
                    C7309M c7309m6 = this.f66909d;
                    if (c7309m6 != null) {
                        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(iT2, iB2);
                        valueAnimatorOfInt2.setInterpolator(new LinearInterpolator());
                        valueAnimatorOfInt2.addUpdateListener(new Le0.e(c7309m6, 1));
                        arrayList.add(valueAnimatorOfInt2);
                    }
                    AnimatorSet animatorSet3 = this.f66911f;
                    if (animatorSet3 != null) {
                        animatorSet3.addListener(new E(this, iB2));
                    }
                    AnimatorSet animatorSet4 = this.f66911f;
                    if (animatorSet4 != null) {
                        animatorSet4.playTogether(arrayList);
                    }
                    AnimatorSet animatorSet5 = this.f66911f;
                    if (animatorSet5 != null) {
                        animatorSet5.setDuration(200L);
                    }
                    AnimatorSet animatorSet6 = this.f66911f;
                    if (animatorSet6 != null) {
                        animatorSet6.start();
                    }
                }
            } else {
                AnimatorSet animatorSet7 = this.f66911f;
                if (animatorSet7 == null || !animatorSet7.isRunning()) {
                    C5421a c5421a21 = this.f66912g;
                    C5421a c5421a22 = c5421a21;
                    if (c5421a21 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mSpaceDataProvider");
                        c5421a22 = null;
                    }
                    if (c5421a22.f66968j) {
                        C5421a c5421a23 = this.f66912g;
                        C5421a c5421a24 = c5421a23;
                        if (c5421a23 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mSpaceDataProvider");
                            c5421a24 = null;
                        }
                        iT = c5421a24.b();
                    } else {
                        C7309M c7309m7 = this.f66909d;
                        iT = c7309m7 != null ? c7309m7.T() : 0;
                    }
                    C5421a c5421a25 = this.f66912g;
                    C5421a c5421a26 = c5421a25;
                    if (c5421a25 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mSpaceDataProvider");
                        c5421a26 = null;
                    }
                    int iA2 = c5421a26.a();
                    this.f66911f = new AnimatorSet();
                    final C7309M c7309m8 = this.f66909d;
                    if (c7309m8 != null) {
                        ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(iT, iA2);
                        if (valueAnimatorOfInt3 != null) {
                            valueAnimatorOfInt3.setInterpolator(new LinearInterpolator());
                        }
                        if (valueAnimatorOfInt3 != null) {
                            final int i9 = 0;
                            valueAnimatorOfInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(c7309m8, i9) { // from class: com.bilibili.music.podcast.utils.u

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final int f67039a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final Object f67040b;

                                {
                                    this.f67039a = i9;
                                    this.f67040b = c7309m8;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    switch (this.f67039a) {
                                        case 0:
                                            ((C7309M) this.f67040b).V(((Integer) valueAnimator2.getAnimatedValue()).intValue());
                                            break;
                                        default:
                                            com.mall.ui.page.home.view.n nVar = (com.mall.ui.page.home.view.n) this.f67040b;
                                            nVar.getClass();
                                            nVar.setAlpha(((Integer) valueAnimator2.getAnimatedValue()).intValue());
                                            break;
                                    }
                                }
                            });
                        }
                        AnimatorSet animatorSet8 = this.f66911f;
                        valueAnimator = valueAnimatorOfInt3;
                        if (animatorSet8 != null) {
                            animatorSet8.play(valueAnimatorOfInt3);
                            valueAnimator = valueAnimatorOfInt3;
                        }
                    } else {
                        valueAnimator = null;
                    }
                    final MusicTopCarLayout musicTopCarLayout3 = this.f66906a;
                    ValueAnimator valueAnimator2 = null;
                    if (musicTopCarLayout3 != null) {
                        C5421a c5421a27 = this.f66912g;
                        C5421a c5421a28 = c5421a27;
                        if (c5421a27 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mSpaceDataProvider");
                            c5421a28 = null;
                        }
                        if (c5421a28.f66968j) {
                            C5421a c5421a29 = this.f66912g;
                            C5421a c5421a30 = c5421a29;
                            if (c5421a29 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mSpaceDataProvider");
                                c5421a30 = null;
                            }
                            iC = c5421a30.c();
                        } else {
                            C5421a c5421a31 = this.f66912g;
                            C5421a c5421a32 = c5421a31;
                            if (c5421a31 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mSpaceDataProvider");
                                c5421a32 = null;
                            }
                            int i10 = c5421a32.f66963d;
                            C5421a c5421a33 = this.f66912g;
                            C5421a c5421a34 = c5421a33;
                            if (c5421a33 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mSpaceDataProvider");
                                c5421a34 = null;
                            }
                            iC = (iT - i10) - c5421a34.f66967i;
                        }
                        ValueAnimator valueAnimatorOfInt4 = ValueAnimator.ofInt(iC, 0);
                        valueAnimatorOfInt4.setInterpolator(new LinearInterpolator());
                        valueAnimatorOfInt4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(musicTopCarLayout3) { // from class: com.bilibili.music.podcast.utils.v

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final MusicTopCarLayout f67041a;

                            {
                                this.f67041a = musicTopCarLayout3;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                this.f67041a.setRecycleViewMarginTop(((Integer) valueAnimator3.getAnimatedValue()).intValue());
                            }
                        });
                        AnimatorSet animatorSet9 = this.f66911f;
                        if (animatorSet9 != null && (builderPlay4 = animatorSet9.play(valueAnimator)) != null) {
                            builderPlay4.with(valueAnimatorOfInt4);
                        }
                        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        if (valueAnimatorOfFloat4 != null) {
                            valueAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
                        }
                        if (valueAnimatorOfFloat4 != null) {
                            valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(musicTopCarLayout3) { // from class: com.bilibili.music.podcast.utils.w

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final MusicTopCarLayout f67042a;

                                {
                                    this.f67042a = musicTopCarLayout3;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                    this.f67042a.setRecycleViewAlpha(((Float) valueAnimator3.getAnimatedValue()).floatValue());
                                }
                            });
                        }
                        AnimatorSet animatorSet10 = this.f66911f;
                        if (animatorSet10 != null && (builderPlay3 = animatorSet10.play(valueAnimator)) != null) {
                            builderPlay3.after(valueAnimatorOfFloat4);
                        }
                        C5421a c5421a35 = this.f66912g;
                        if (c5421a35 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mSpaceDataProvider");
                            c5421a35 = null;
                        }
                        if (c5421a35.f66968j) {
                            ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(1.0f, 0.0f);
                            valueAnimatorOfFloat5.setInterpolator(new LinearInterpolator());
                            valueAnimatorOfFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(musicTopCarLayout3) { // from class: com.bilibili.music.podcast.utils.x

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final MusicTopCarLayout f67043a;

                                {
                                    this.f67043a = musicTopCarLayout3;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                    this.f67043a.a(((Float) valueAnimator3.getAnimatedValue()).floatValue(), true);
                                }
                            });
                            AnimatorSet animatorSet11 = this.f66911f;
                            if (animatorSet11 != null && (builderPlay2 = animatorSet11.play(valueAnimator)) != null) {
                                builderPlay2.after(valueAnimatorOfFloat5);
                            }
                        }
                        valueAnimator2 = valueAnimatorOfFloat4;
                    }
                    final ImageView imageView2 = this.f66907b;
                    if (imageView2 != null) {
                        ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(imageView2.getRotation(), 0.0f);
                        valueAnimatorOfFloat6.setInterpolator(new LinearInterpolator());
                        valueAnimatorOfFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(imageView2) { // from class: com.bilibili.music.podcast.utils.y

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final ImageView f67044a;

                            {
                                this.f67044a = imageView2;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                this.f67044a.setRotation(((Float) valueAnimator3.getAnimatedValue()).floatValue());
                            }
                        });
                        AnimatorSet animatorSet12 = this.f66911f;
                        if (animatorSet12 != null && (builderPlay = animatorSet12.play(valueAnimator2)) != null) {
                            builderPlay.with(valueAnimatorOfFloat6);
                        }
                    }
                    AnimatorSet animatorSet13 = this.f66911f;
                    if (animatorSet13 != null) {
                        animatorSet13.addListener(new D(this, iA2));
                    }
                    AnimatorSet animatorSet14 = this.f66911f;
                    if (animatorSet14 != null) {
                        animatorSet14.setDuration(200L);
                    }
                    AnimatorSet animatorSet15 = this.f66911f;
                    if (animatorSet15 != null) {
                        animatorSet15.start();
                    }
                }
            }
            this.f66910e = z6;
        }
    }

    @Override // com.bilibili.music.podcast.utils.s
    public final boolean isExpanded() {
        return this.f66910e;
    }
}
