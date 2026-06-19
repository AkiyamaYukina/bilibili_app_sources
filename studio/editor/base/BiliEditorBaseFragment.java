package com.bilibili.studio.editor.base;

import Ex0.j;
import Ex0.n;
import R50.v;
import UC0.a;
import aC0.InterfaceC3194a;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.ad.adview.videodetail.upper.banner.v2.h;
import com.bilibili.base.MainThread;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.studio.editor.moudle.editormain.ui.BiliEditorMainActivity;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.BiliEditorCaptionAsrFragmentV2;
import com.bilibili.studio.editor.moudle.editormain.usecase.middlemodule.MiddleControlUseCase;
import com.bilibili.studio.editor.timeline.UpperTimeline;
import com.bilibili.studio.editor.timeline.backup.BackUpTag;
import com.bilibili.studio.editor.timeline.i;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.widgets.track.cover.BiliEditorTrackCoverCommonView;
import dz0.f;
import ey0.c;
import fz0.InterfaceC7206a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import px0.b;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/base/BiliEditorBaseFragment.class */
public abstract class BiliEditorBaseFragment extends androidx_fragment_app_Fragment implements InterfaceC3194a, b.c, InterfaceC7206a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f105685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EditVideoInfo f105686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f105687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f105688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f105689f;
    public ImageView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BiliEditorTrackCoverCommonView f105691i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f105690g = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f105692j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f105693k = true;

    @Override // aC0.InterfaceC3194a
    public void D6() {
        BLog.e("BiliEditorBaseFragment", "onVideoEOF");
        this.f105690g = false;
    }

    @Override // fz0.InterfaceC7206a
    public void La(@NonNull Function1<? super Boolean, Unit> function1) {
        function1.invoke(Boolean.TRUE);
    }

    @Override // fz0.InterfaceC7206a
    @Nullable
    public EditVideoInfo Q0() {
        return null;
    }

    @Override // px0.b.c
    public b.d S8() {
        return null;
    }

    public void hf() {
    }

    /* JADX INFO: renamed from: if, reason: not valid java name */
    public void mo9869if(boolean z6) {
    }

    @Override // aC0.InterfaceC3194a
    public void j8() {
        BLog.e("BiliEditorBaseFragment", "onVideoPause");
        this.f105690g = false;
        BiliEditorTrackCoverCommonView biliEditorTrackCoverCommonView = this.f105691i;
        if (biliEditorTrackCoverCommonView != null) {
            biliEditorTrackCoverCommonView.setVideoMode(2);
        }
        uf();
    }

    public void jf() {
        this.f105685b.h();
        uf();
    }

    public final void kf() {
        f fVar;
        n nVar;
        dz0.c cVar = ((Yv0.b) this.f105685b.a).B;
        if (cVar != null && (fVar = cVar.d) != null && (nVar = fVar.a) != null) {
            nVar.k();
        }
        tf();
    }

    @Override // aC0.InterfaceC3194a
    public void l4(long j7) {
        tf();
        BiliEditorTrackCoverCommonView biliEditorTrackCoverCommonView = this.f105691i;
        if (biliEditorTrackCoverCommonView != null) {
            biliEditorTrackCoverCommonView.setVideoMode(2);
        }
    }

    public final void lf(long j7) {
        f fVar;
        n nVar;
        v vVarE;
        dz0.c cVar = ((Yv0.b) this.f105685b.a).B;
        if (cVar != null && (fVar = cVar.d) != null && (nVar = fVar.a) != null) {
            com.bilibili.ad.comm.applist.b.b(j7, "onAskVideoPlay startTime=", "StreamingRepository");
            h hVar = nVar.f4836f;
            if (hVar != null) {
                hVar.invoke(Boolean.TRUE);
            }
            if (nVar.f4833c != null && (vVarE = nVar.e()) != null) {
                InterfaceC3194a interfaceC3194a = nVar.f4832b;
                if (interfaceC3194a != null) {
                    interfaceC3194a.l4(j7);
                }
                j jVar = nVar.f4831a;
                jVar.getClass();
                MainThread.runOnMainThread(new Ex0.f(jVar, j7));
                nVar.d(j7, vVarE.a.getDuration());
            }
        }
        tf();
    }

    public void mf(EditVideoInfo editVideoInfo, BackUpTag backUpTag) {
    }

    public final a nf() {
        UpperTimeline upperTimeline;
        i iVar = this.f105687d;
        if (iVar == null || (upperTimeline = iVar.f108300b) == null) {
            return null;
        }
        return upperTimeline.getEditNativeAudioTrack();
    }

    public final long of() {
        i iVar = this.f105687d;
        if (iVar == null) {
            return 0L;
        }
        return iVar.j();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@NonNull Activity activity) {
        super.onAttach(activity);
        pf(activity);
        sf();
        BLog.e("BiliEditorBaseFragment", "onAttach " + this);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final Animation onCreateAnimation(int i7, boolean z6, int i8) {
        if (!qf() || getContext() == null) {
            return super.onCreateAnimation(i7, z6, i8);
        }
        return z6 ? AnimationUtils.loadAnimation(getContext(), 2130772427) : AnimationUtils.loadAnimation(getContext(), 2130772428);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        BLog.e("BiliEditorBaseFragment", "onDestroy " + this);
        super.onDestroy();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        BLog.e("BiliEditorBaseFragment", "onDestroyView " + this);
        this.f105688e = false;
        super.onDestroyView();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        dz0.c cVar;
        dz0.h hVar;
        MiddleControlUseCase middleControlUseCase;
        super.onPause();
        if (this.f105692j && (cVar = ((Yv0.b) this.f105685b.a).B) != null && (hVar = cVar.e) != null && (middleControlUseCase = hVar.i) != null) {
            middleControlUseCase.f107183a.f4832b = middleControlUseCase.f107191j;
        }
        if (this.f105693k) {
            jf();
        }
        BLog.e("BiliEditorBaseFragment", "onPause " + this);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f105685b.a(this);
        BLog.e("BiliEditorBaseFragment", "onResume " + this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View$OnTouchListener, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        BLog.e("BiliEditorBaseFragment", "onViewCreated " + this);
        this.f105688e = true;
        if (rf()) {
            view.setOnTouchListener(new Object());
        }
    }

    public void p1() {
        jf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void pf(Activity activity) {
        this.f105689f = activity.getApplicationContext();
        BiliEditorMainActivity biliEditorMainActivity = (BiliEditorMainActivity) activity;
        c cVar = new c(biliEditorMainActivity);
        this.f105685b = cVar;
        dz0.c cVar2 = ((Yv0.b) biliEditorMainActivity).B;
        if (cVar2 != null ? cVar2.f : false) {
            i iVarE = cVar.e();
            this.f105687d = iVarE;
            iVarE.h = 0;
        }
    }

    public boolean qf() {
        return this instanceof BiliEditorCaptionAsrFragmentV2;
    }

    public boolean rf() {
        return this instanceof BiliEditorCaptionAsrFragmentV2;
    }

    public void sf() {
        f fVar;
        Ex0.c cVar;
        c cVar2 = this.f105685b;
        if (cVar2 != null) {
            dz0.c cVar3 = ((Yv0.b) cVar2.a).B;
            if (((cVar3 == null || (fVar = cVar3.d) == null || (cVar = fVar.b) == null) ? null : cVar.f4806b) != null) {
                c cVar4 = this.f105685b;
                this.f105686c = cVar4 == null ? null : cVar4.q();
                return;
            }
        }
        BLog.e("BiliEditorBaseFragment", "startEdit isInitMainEngineData false");
    }

    public final void tf() {
        dz0.h hVar;
        MiddleControlUseCase middleControlUseCase;
        dz0.c cVar = ((Yv0.b) this.f105685b.a).B;
        if (cVar != null && (hVar = cVar.e) != null && (middleControlUseCase = hVar.i) != null) {
            middleControlUseCase.f107186d.f(true);
            middleControlUseCase.h.d(true);
        }
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setImageResource(2131244230);
        }
        mo9869if(true);
    }

    public final void uf() {
        dz0.h hVar;
        MiddleControlUseCase middleControlUseCase;
        dz0.c cVar = ((Yv0.b) this.f105685b.a).B;
        if (cVar != null && (hVar = cVar.e) != null && (middleControlUseCase = hVar.i) != null) {
            middleControlUseCase.f107186d.f(false);
            middleControlUseCase.h.d(false);
        }
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setImageResource(2131244229);
        }
        mo9869if(false);
    }

    @Override // aC0.InterfaceC3194a
    public void vd() {
        BLog.e("BiliEditorBaseFragment", "onVideoStop");
        this.f105690g = false;
        uf();
        BiliEditorTrackCoverCommonView biliEditorTrackCoverCommonView = this.f105691i;
        if (biliEditorTrackCoverCommonView != null) {
            biliEditorTrackCoverCommonView.setVideoMode(2);
        }
    }

    public final void vf() {
        i iVar = this.f105687d;
        if (iVar != null) {
            iVar.s();
        }
    }

    @Override // aC0.InterfaceC3194a
    public void w2(long j7) {
        this.f105690g = true;
        tf();
        BiliEditorTrackCoverCommonView biliEditorTrackCoverCommonView = this.f105691i;
        if (biliEditorTrackCoverCommonView != null) {
            biliEditorTrackCoverCommonView.setVideoMode(1);
            this.f105691i.setPlayingTime(j7);
        }
    }

    @Override // aC0.InterfaceC3194a
    public void z4(long j7, long j8) {
        i iVar = this.f105687d;
        if (iVar != null) {
            iVar.q(j8, 0L);
        }
    }
}
