package com.bilibili.studio.editor.moudle.musicv3.ui;

import Ky0.a0;
import TB0.m0;
import TB0.n0;
import TB0.q0;
import TB0.r0;
import TB0.u0;
import TB0.v0;
import UC0.n;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bilibili.base.BiliContext;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.editor.base.BiliEditorBaseFragment;
import com.bilibili.studio.editor.moudle.editormain.constans.EditorPage;
import com.bilibili.studio.editor.moudle.editormain.uistate.bottomfragment.FragmentContainerModal;
import com.bilibili.studio.editor.moudle.music.common.EditorMusicInfo;
import com.bilibili.studio.editor.timeline.UpperTimeline;
import com.bilibili.studio.editor.timeline.backup.BackUpTag;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import com.bilibili.studio.videoeditor.util.C6635h;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import com.bilibili.studio.videoeditor.util.EditorUsedFunctionUtil;
import com.bilibili.studio.videoeditor.util.V;
import com.bilibili.studio.videoeditor.widgets.EditorTrackView;
import com.bilibili.studio.videoeditor.widgets.TrackEditEntry;
import com.bilibili.studio.videoeditor.widgets.track.media.BiliEditorMediaTrackView;
import com.bilibili.studio.videoeditor.widgets.track.timeaxis.TimeAxisZoomView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/BiliEditorMusicFragmentV3.class */
public class BiliEditorMusicFragmentV3 extends BiliEditorBaseFragment implements Hz0.a, View.OnClickListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public ViewBinding f107960l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Jz0.e f107961m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f107962n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f107963o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f107965q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f107967s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f107969u;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f107964p = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f107966r = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Kz0.b f107968t = new Object();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/BiliEditorMusicFragmentV3$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final H90.e f107970a;

        public a(H90.e eVar) {
            this.f107970a = eVar;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f107970a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f107970a.invoke(obj);
        }
    }

    public void Af() {
        this.f107963o = false;
        FrameLayout frameLayout = this.f107968t.f13212q;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        ViewGroup viewGroup = this.f107968t.f13213r;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        ey0.c cVar = this.f105685b;
        if (cVar != null) {
            cVar.r();
        }
        BMusic bMusicE = wf().e(this.f107965q);
        Long lValueOf = bMusicE != null ? Long.valueOf(bMusicE.inPoint) : null;
        if (this.f105685b.a.f106283W || lValueOf == null) {
            return;
        }
        lf(lValueOf.longValue());
        Unit unit = Unit.INSTANCE;
        kf();
    }

    public void Bf() {
        TextView textView = this.f107968t.f13197a;
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = this.f107968t.f13197a;
        if (textView2 != null) {
            textView2.setEnabled(true);
        }
        TextView textView3 = this.f107968t.f13198b;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        TextView textView4 = this.f107968t.f13198b;
        if (textView4 != null) {
            textView4.setEnabled(false);
        }
        TextView textView5 = this.f107968t.f13199c;
        if (textView5 != null) {
            textView5.setVisibility(8);
        }
        TextView textView6 = this.f107968t.f13199c;
        if (textView6 != null) {
            textView6.setEnabled(false);
        }
        TextView textView7 = this.f107968t.f13200d;
        if (textView7 != null) {
            textView7.setVisibility(8);
        }
        TextView textView8 = this.f107968t.f13200d;
        if (textView8 != null) {
            textView8.setEnabled(false);
        }
        TextView textView9 = this.f107968t.f13201e;
        if (textView9 != null) {
            textView9.setVisibility(8);
        }
        TextView textView10 = this.f107968t.f13201e;
        if (textView10 != null) {
            textView10.setEnabled(false);
        }
        TextView textView11 = this.f107968t.f13202f;
        if (textView11 != null) {
            textView11.setVisibility(8);
        }
        TextView textView12 = this.f107968t.f13202f;
        if (textView12 != null) {
            textView12.setEnabled(false);
        }
        TextView textView13 = this.f107968t.f13203g;
        if (textView13 != null) {
            textView13.setVisibility(0);
        }
        TextView textView14 = this.f107968t.f13203g;
        if (textView14 != null) {
            textView14.setEnabled(true);
        }
    }

    public final void Cf() {
        UC0.a bgmAudioTrack;
        float userTrackNativeVolume = this.f105686c.getUserTrackNativeVolume();
        UC0.a aVarNf = nf();
        if (aVarNf != null) {
            aVarNf.B(userTrackNativeVolume, userTrackNativeVolume);
        }
        Lazy<UC0.n> lazy = UC0.n.f24629b;
        n.a.a().getClass();
        UpperTimeline upperTimelineC = UC0.n.c();
        if (upperTimelineC == null || (bgmAudioTrack = upperTimelineC.getBgmAudioTrack()) == null) {
            return;
        }
        bgmAudioTrack.E(1.0f, 1.0f);
    }

    public final void Df(EditorMusicInfo editorMusicInfo) {
        Kz0.b bVar = this.f107968t;
        EditorTrackView editorTrackView = bVar.f13207l;
        if (editorTrackView != null) {
            editorTrackView.f110343v.clear();
            editorTrackView.y(4);
            editorTrackView.invalidate();
        }
        if (editorMusicInfo != null) {
            for (BMusic bMusic : editorMusicInfo.bMusicList) {
                EditorTrackView editorTrackView2 = bVar.f13207l;
                if (editorTrackView2 != null) {
                    String str = bMusic.musicName;
                    editorTrackView2.f110343v.add(editorTrackView2.a(bMusic.totalTime, bMusic.inPoint, bMusic.outPoint, bMusic.trimIn, bMusic.trimOut, str));
                }
            }
            EditorTrackView editorTrackView3 = bVar.f13207l;
            if (editorTrackView3 != null) {
                editorTrackView3.f110321L = true;
            }
        }
    }

    @Override // Hz0.a
    public final void Ie() {
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, fz0.InterfaceC7206a
    public final void La(@NotNull Function1<? super Boolean, Unit> function1) {
        EditVideoInfo editVideoInfo;
        UC0.a aVarNf = nf();
        float fS = aVarNf != null ? aVarNf.s() : 1.0f;
        EditVideoInfo editVideoInfo2 = this.f105686c;
        if (!Intrinsics.areEqual(editVideoInfo2 != null ? Float.valueOf(editVideoInfo2.getUserTrackNativeVolume()) : null, fS) && (editVideoInfo = this.f105686c) != null) {
            EditorUsedFunctionUtil.b(editVideoInfo, "音乐");
        }
        EditVideoInfo editVideoInfo3 = this.f105686c;
        if (editVideoInfo3 != null) {
            editVideoInfo3.setUserTrackNativeVolume(fS);
        }
        wf().g(function1);
    }

    @Override // Hz0.a
    public final void P9(long j7, boolean z6) {
        com.bilibili.studio.editor.timeline.i iVar;
        if (z6) {
            com.bilibili.studio.editor.timeline.i iVar2 = this.f105687d;
            if (iVar2 != null && !iVar2.m() && (iVar = this.f105687d) != null) {
                iVar.q(j7, 0L);
            }
        } else {
            com.bilibili.studio.editor.timeline.i iVar3 = this.f105687d;
            if (iVar3 != null) {
                iVar3.q(j7, 0L);
            }
        }
        this.f107967s = j7;
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, fz0.InterfaceC7206a
    @Nullable
    public final EditVideoInfo Q0() {
        EditVideoInfo editVideoInfoM10450clone;
        EditVideoInfo editVideoInfo = this.f105686c;
        if (editVideoInfo == null || (editVideoInfoM10450clone = editVideoInfo.m10450clone()) == null) {
            return null;
        }
        UC0.a aVarNf = nf();
        float fS = aVarNf != null ? aVarNf.s() : 1.0f;
        if (editVideoInfoM10450clone.getUserTrackNativeVolume() != fS) {
            EditorUsedFunctionUtil.b(editVideoInfoM10450clone, "音乐");
        }
        editVideoInfoM10450clone.setUserTrackNativeVolume(fS);
        wf().i(editVideoInfoM10450clone);
        return editVideoInfoM10450clone;
    }

    @Override // Hz0.a
    public final void Tb(@NotNull BMusic bMusic) {
        int i7;
        EditorTrackView editorTrackView = this.f107968t.f13207l;
        if (editorTrackView != null) {
            String str = bMusic.musicName;
            long j7 = bMusic.totalTime;
            long j8 = bMusic.inPoint;
            long j9 = bMusic.outPoint;
            long j10 = bMusic.trimIn;
            long j11 = bMusic.trimOut;
            int i8 = 0;
            while (true) {
                if (i8 >= editorTrackView.f110343v.size()) {
                    editorTrackView.f110343v.add(editorTrackView.a(j7, j8, j9, j10, j11, str));
                    break;
                } else {
                    if (j8 < editorTrackView.f110343v.get(i8).inPoint) {
                        editorTrackView.f110343v.add(i8, editorTrackView.a(j7, j8, j9, j10, j11, str));
                        editorTrackView.f110313D = i8;
                        break;
                    }
                    i8++;
                }
            }
            if (editorTrackView.f110313D < 0) {
                editorTrackView.f110313D = editorTrackView.f110343v.size() - 1;
            }
            editorTrackView.t();
            editorTrackView.y(0);
            editorTrackView.n(editorTrackView.f110313D);
            editorTrackView.v(editorTrackView.f110313D);
            editorTrackView.o();
            EditorTrackView.a aVar = editorTrackView.f110341t;
            if (aVar == null || (i7 = editorTrackView.f110313D) == -1) {
                return;
            }
            aVar.a(i7, false);
            EditorTrackView.a aVar2 = editorTrackView.f110341t;
            int i9 = editorTrackView.f110313D;
            long j12 = editorTrackView.f110343v.get(i9).inPoint;
            long j13 = editorTrackView.f110343v.get(editorTrackView.f110313D).outPoint;
            long j14 = editorTrackView.f110343v.get(editorTrackView.f110313D).trimIn;
            long j15 = editorTrackView.f110343v.get(editorTrackView.f110313D).trimOut;
            aVar2.c(i9, j12, 0, j13);
        }
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment
    public final void hf() {
        Xz0.d dVar = Xz0.d.f28458a;
        String strE = com.bilibili.studio.videoeditor.extension.l.e(this.f105686c);
        dVar.getClass();
        Xz0.j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        Xz0.j.c("router_topic_id", Xz0.g.f28463b);
        Map mapB = Xz0.j.b(Xz0.k.f28474a);
        ((HashMap) mapB).put("fast_video", strE);
        Neurons.reportClick(false, "creation.new-video-editor.total.music-play.click", mapB);
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, aC0.InterfaceC3194a
    public final void l4(long j7) {
        super.l4(j7);
        EditorTrackView editorTrackView = this.f107968t.f13207l;
        if (editorTrackView != null) {
            editorTrackView.f110318I = -1;
        }
        if (editorTrackView != null) {
            editorTrackView.x(j7);
        }
    }

    @Override // Hz0.a
    public final void ld(boolean z6) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02e0  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityResult(int r11, int r12, @org.jetbrains.annotations.Nullable android.content.Intent r13) {
        /*
            Method dump skipped, instruction units count: 990
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicFragmentV3.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v280, types: [T, com.bilibili.studio.editor.moudle.music.common.EditorMusicInfo] */
    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        Object obj;
        float userTrackNativeVolume;
        boolean z6;
        ArrayList<BMusic> arrayList;
        EditVideoInfo editVideoInfo;
        if (this.f107960l == null || V.f()) {
            return;
        }
        EditorTrackView editorTrackView = this.f107968t.f13207l;
        if (editorTrackView == null || editorTrackView.f110311B == -1 || editorTrackView.getVisibility() != 0) {
            EditorTrackView editorTrackView2 = this.f107968t.f13207l;
            if (editorTrackView2 != null) {
                editorTrackView2.z();
            }
            Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
            if (numValueOf != null && numValueOf.intValue() == 2131314859) {
                this.f107969u = 2;
                Context context = getContext();
                if (context != null) {
                    jf();
                    if (this.f107964p) {
                        wf().getClass();
                        Jz0.e.f(this);
                    } else {
                        ToastHelper.showToastShort(context, 2131841851);
                    }
                }
                Xz0.d dVar = Xz0.d.f28458a;
                String strE = com.bilibili.studio.videoeditor.extension.l.e(this.f105686c);
                dVar.getClass();
                Xz0.d.E("添加", strE);
                C6635h.a("add");
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 2131314869) {
                EditorTrackView editorTrackView3 = this.f107968t.f13207l;
                if (editorTrackView3 != null) {
                    jf();
                    int i7 = this.f107965q;
                    if (editorTrackView3.f110343v.get(i7).outPoint == editorTrackView3.j(i7)) {
                        ToastHelper.showToastShort(editorTrackView3.getContext(), 2131842061);
                    } else {
                        if (wf().e(this.f107965q) != null) {
                            int i8 = this.f107965q;
                            editorTrackView3.b(i8, editorTrackView3.j(i8));
                        }
                        ToastHelper.showToastShort(editorTrackView3.getContext(), 2131841829);
                    }
                }
                Xz0.d dVar2 = Xz0.d.f28458a;
                String strE2 = com.bilibili.studio.videoeditor.extension.l.e(this.f105686c);
                dVar2.getClass();
                Xz0.d.E("循环", strE2);
                mf(this.f105686c, BackUpTag.MUSIC_LOOP);
                C6635h.a("loop");
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 2131314863) {
                EditorTrackView editorTrackView4 = this.f107968t.f13207l;
                if (editorTrackView4 != null) {
                    jf();
                    BMusic bMusicE = wf().e(this.f107965q);
                    if (bMusicE != null) {
                        long j7 = editorTrackView4.j(this.f107965q);
                        long j8 = bMusicE.trimOut - bMusicE.trimIn;
                        long j9 = bMusicE.inPoint;
                        long j10 = j7 - j9;
                        long j11 = j8;
                        if (j8 > j10) {
                            j11 = j10;
                        }
                        editorTrackView4.b(this.f107965q, j9 + j11);
                        editorTrackView4.w(editorTrackView4.f110343v.get(this.f107965q).rect.left - editorTrackView4.f110336o.getContentStart());
                    }
                }
                Xz0.d dVar3 = Xz0.d.f28458a;
                String strE3 = com.bilibili.studio.videoeditor.extension.l.e(this.f105686c);
                dVar3.getClass();
                Xz0.d.E("取消循环", strE3);
                mf(this.f105686c, BackUpTag.MUSIC_CANCEL_LOOP);
                C6635h.a("noloop");
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 2131314873) {
                this.f107969u = 1;
                jf();
                wf().getClass();
                Jz0.e.f(this);
                Xz0.d dVar4 = Xz0.d.f28458a;
                String strE4 = com.bilibili.studio.videoeditor.extension.l.e(this.f105686c);
                dVar4.getClass();
                Xz0.d.E("更换", strE4);
                C6635h.a("change");
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 2131316854) {
                com.bilibili.studio.editor.timeline.i iVar = this.f105687d;
                this.f107967s = iVar != null ? iVar.j() : 0L;
                ey0.c cVar = this.f105685b;
                if (cVar != null) {
                    cVar.b(new l(this));
                }
                Xz0.d dVar5 = Xz0.d.f28458a;
                String strE5 = com.bilibili.studio.videoeditor.extension.l.e(this.f105686c);
                dVar5.getClass();
                Xz0.d.E("起始点", strE5);
                C6635h.a("set");
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 2131314866) {
                xf();
                Xz0.d dVar6 = Xz0.d.f28458a;
                String strE6 = com.bilibili.studio.videoeditor.extension.l.e(this.f105686c);
                dVar6.getClass();
                Xz0.d.E("删除", strE6);
                C6635h.a("delete");
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 2131314877) {
                if (this.f107965q == -1) {
                    Kz0.b bVar = this.f107968t;
                    LinearLayout linearLayout = bVar.f13211p;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(8);
                    }
                    LinearLayout linearLayout2 = bVar.f13210o;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(0);
                    }
                    SeekBar seekBar = bVar.f13209n;
                    if (seekBar != null) {
                        seekBar.setOnSeekBarChangeListener(new m(this));
                    }
                    int userTrackNativeVolume2 = (int) (this.f105686c.getUserTrackNativeVolume() * 100.0f);
                    SeekBar seekBar2 = bVar.f13209n;
                    if (seekBar2 != null) {
                        seekBar2.setProgress(userTrackNativeVolume2);
                    }
                    TextView textView = bVar.f13216u;
                    if (textView != null) {
                        textView.setText(String.valueOf(userTrackNativeVolume2));
                    }
                    TextView textView2 = bVar.f13204i;
                    if (textView2 != null) {
                        textView2.setText(2131842099);
                    }
                    this.f107966r = 2;
                } else {
                    dz0.c cVar2 = ((Yv0.b) this.f105685b.a).B;
                    if (cVar2 != null) {
                        final a0 a0Var = cVar2.e.p;
                        if (a0Var.f13079f.f4806b != null) {
                            a0Var.f13078e.j();
                            ez0.a aVar = a0Var.f13074a;
                            Runnable runnable = new Runnable(a0Var) { // from class: Ky0.V

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final a0 f13064a;

                                {
                                    this.f13064a = a0Var;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f13064a.f13081i.o(false);
                                }
                            };
                            Dy0.r rVar = (Dy0.r) aVar.h.getValue();
                            Dy0.r rVar2 = rVar;
                            if (rVar == null) {
                                rVar2 = new Dy0.r(false, false, null, FragmentContainerModal.MODAL_ALL);
                            }
                            aVar.h.setValue(Dy0.r.a(rVar2, true, false, runnable, 10));
                        }
                    }
                }
                Xz0.d dVar7 = Xz0.d.f28458a;
                String strE7 = com.bilibili.studio.videoeditor.extension.l.e(this.f105686c);
                dVar7.getClass();
                Xz0.d.E("音量", strE7);
                C6635h.a("volume");
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 2131302459) {
                if (this.f107966r == 2) {
                    TextView textView3 = this.f107968t.f13204i;
                    if (textView3 != null) {
                        textView3.setText(2131842447);
                    }
                    LinearLayout linearLayout3 = this.f107968t.f13211p;
                    if (linearLayout3 != null) {
                        linearLayout3.setVisibility(0);
                    }
                    LinearLayout linearLayout4 = this.f107968t.f13210o;
                    if (linearLayout4 != null) {
                        linearLayout4.setVisibility(8);
                    }
                    Cf();
                    this.f107966r = 1;
                    return;
                }
                jf();
                com.bilibili.studio.editor.moudle.musicv3.logic.d dVar8 = wf().f11745g;
                if (dVar8 != null) {
                    dVar8.i();
                    ?? r02 = dVar8.f107948k;
                    if (r02 != 0) {
                        ArrayList<BMusic> arrayList2 = r02.bMusicList;
                        if (arrayList2 != null) {
                            for (BMusic bMusic : arrayList2) {
                                BLog.e("BiliEditorMusicMainLogicV3", "cancelMusicDownloadFunction " + bMusic + ",insetIndex=" + dVar8.f(bMusic));
                            }
                        }
                        dVar8.g();
                        Cz0.a aVar2 = dVar8.f107930b;
                        if (Nw0.c.a(((EditorMusicInfo) aVar2.f16451b).bMusicList, ((EditorMusicInfo) aVar2.f16450a).bMusicList)) {
                            dVar8.f107931c.getClass();
                            if (UC0.n.b() != null) {
                                aVar2.f16451b = r02;
                                UpperTimeline upperTimelineC = UC0.n.c();
                                if (upperTimelineC != 0) {
                                    upperTimelineC.buildBgmAudio(r02);
                                }
                            }
                        }
                    }
                    dVar8.f107948k = null;
                }
                Cf();
                EditorTrackView editorTrackView5 = this.f107968t.f13207l;
                if (editorTrackView5 != null) {
                    editorTrackView5.z();
                }
                EditorTrackView editorTrackView6 = this.f107968t.f13207l;
                if (editorTrackView6 != null) {
                    editorTrackView6.f110336o.c();
                }
                ey0.c cVar3 = this.f105685b;
                if (cVar3 != null) {
                    cVar3.r();
                }
                ey0.c cVar4 = this.f105685b;
                if (cVar4 != null) {
                    cVar4.v();
                    return;
                }
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 2131302460) {
                if (this.f107966r == 2) {
                    UC0.a aVarNf = nf();
                    userTrackNativeVolume = aVarNf != null ? aVarNf.s() : 1.0f;
                    this.f107966r = 1;
                    EditVideoInfo editVideoInfo2 = this.f105686c;
                    if (!Intrinsics.areEqual(editVideoInfo2 != null ? Float.valueOf(editVideoInfo2.getUserTrackNativeVolume()) : null, userTrackNativeVolume) && (editVideoInfo = this.f105686c) != null) {
                        EditorUsedFunctionUtil.b(editVideoInfo, "音乐");
                    }
                    EditVideoInfo editVideoInfo3 = this.f105686c;
                    if (editVideoInfo3 != null) {
                        editVideoInfo3.setUserTrackNativeVolume(userTrackNativeVolume);
                    }
                    LinearLayout linearLayout5 = this.f107968t.f13211p;
                    if (linearLayout5 != null) {
                        linearLayout5.setVisibility(0);
                    }
                    LinearLayout linearLayout6 = this.f107968t.f13210o;
                    if (linearLayout6 != null) {
                        linearLayout6.setVisibility(8);
                    }
                    TextView textView4 = this.f107968t.f13204i;
                    if (textView4 != null) {
                        textView4.setText(2131842447);
                    }
                    mf(this.f105686c, BackUpTag.MUSIC_VOLUME);
                    return;
                }
                EditorTrackView editorTrackView7 = this.f107968t.f13207l;
                if (editorTrackView7 != null) {
                    editorTrackView7.z();
                }
                jf();
                Jz0.e eVarWf = wf();
                com.bilibili.studio.editor.moudle.musicv3.logic.d dVar9 = eVarWf.f11745g;
                if (dVar9 == null) {
                    obj = "1";
                } else {
                    EditVideoInfo editVideoInfo4 = dVar9.f107929a;
                    if (editVideoInfo4 == null) {
                        BLog.e("BiliEditorMusicMainLogicV3", "confirmListEdit mEditVideoInfo == null");
                        obj = "1";
                    } else {
                        Cz0.a aVar3 = dVar9.f107930b;
                        editVideoInfo4.setEditorMusicInfo((EditorMusicInfo) aVar3.f16451b);
                        if (Cz0.a.c(editVideoInfo4.getEditorMusicInfo()) || editVideoInfo4.getUserTrackNativeVolume() != 1.0f) {
                            editVideoInfo4.setIsEdited(true);
                        }
                        fC0.e.a(BiliContext.application(), editVideoInfo4);
                        Ez0.e eVar = dVar9.f107949l;
                        eVar.f4915f = eVar.f4914e;
                        EditorMusicInfo editorMusicInfo = editVideoInfo4.getEditorMusicInfo();
                        eVar.g(eVar.a(editorMusicInfo != null ? editorMusicInfo.bMusicList : null));
                        Lazy lazy = com.bilibili.studio.editor.moudle.musicv3.logic.b.f107939a;
                        EditorMusicInfo editorMusicInfo2 = editVideoInfo4.getEditorMusicInfo();
                        com.bilibili.studio.editor.moudle.musicv3.logic.b.d((editorMusicInfo2 == null || (arrayList = editorMusicInfo2.bMusicList) == null) ? null : (BMusic) CollectionsKt.firstOrNull(arrayList));
                        EditVideoInfo editVideoInfo5 = dVar9.f107929a;
                        boolean z7 = (editVideoInfo5 != null ? editVideoInfo5.getUserTrackNativeVolume() : 1.0f) == 0.0f;
                        EditVideoInfo editVideoInfo6 = dVar9.f107929a;
                        userTrackNativeVolume = editVideoInfo6 != null ? editVideoInfo6.getUserTrackNativeVolume() : 1.0f;
                        StringBuilder sb = new StringBuilder("confirmEdit enableNativeVolume=");
                        sb.append(!z7);
                        sb.append(",");
                        sb.append(userTrackNativeVolume);
                        BLog.e("BiliEditorMusicMainLogicV3", sb.toString());
                        Iterator<BMusic> it = editVideoInfo4.getEditorMusicInfo().bMusicList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z6 = false;
                                break;
                            }
                            BMusic next = it.next();
                            if (next.outPoint - next.inPoint > next.trimOut - next.trimIn) {
                                z6 = true;
                                break;
                            }
                        }
                        EditorMusicInfo editorMusicInfo3 = editVideoInfo4.getEditorMusicInfo();
                        StringBuilder sb2 = new StringBuilder();
                        ArrayList<BMusic> arrayList3 = editorMusicInfo3.bMusicList;
                        if (arrayList3 != null) {
                            Iterator<BMusic> it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                long j12 = it2.next().bgmSid;
                                if (j12 <= 0) {
                                    sb2.append("-10086,");
                                } else {
                                    sb2.append(j12);
                                    sb2.append(",");
                                }
                            }
                            if (sb2.length() > 0) {
                                M4.a.a(1, sb2);
                            }
                        }
                        InfoEyesManager.getInstance().report2(false, "000225", new String[]{"contribute_music_confirm_click", "click", C6635h.e(), z6 ? "2" : "1", sb2.toString()});
                        obj = "1";
                        if (!EditorUsedFunctionUtil.d(editVideoInfo4, "音乐")) {
                            EditorMusicInfo editorMusicInfo4 = (EditorMusicInfo) aVar3.f16450a;
                            ArrayList<BMusic> arrayList4 = editorMusicInfo4 != null ? editorMusicInfo4.bMusicList : null;
                            EditorMusicInfo editorMusicInfo5 = (EditorMusicInfo) aVar3.f16451b;
                            obj = "1";
                            if (EditorUsedFunctionUtil.i(arrayList4, editorMusicInfo5 != null ? editorMusicInfo5.bMusicList : null)) {
                                EditorUsedFunctionUtil.a(editVideoInfo4, "音乐");
                                obj = "1";
                            }
                        }
                    }
                }
                Xz0.d dVar10 = Xz0.d.f28458a;
                boolean z8 = eVarWf.h;
                dVar10.getClass();
                Xz0.j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
                Xz0.j.c("router_topic_id", Xz0.g.f28463b);
                Map mapB = Xz0.j.b(Xz0.k.f28474a);
                if (!z8) {
                    obj = "0";
                }
                ((HashMap) mapB).put("is_cut_change", obj);
                Neurons.reportClick(false, "creation.new-video-editor.choose-music.edit-finish.click", mapB);
                EditorTrackView editorTrackView8 = this.f107968t.f13207l;
                if (editorTrackView8 != null) {
                    editorTrackView8.z();
                }
                EditorTrackView editorTrackView9 = this.f107968t.f13207l;
                if (editorTrackView9 != null) {
                    editorTrackView9.f110336o.c();
                }
                ey0.c cVar5 = this.f105685b;
                if (cVar5 != null) {
                    cVar5.r();
                }
                ey0.c cVar6 = this.f105685b;
                if (cVar6 != null) {
                    cVar6.v();
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewZf = zf(layoutInflater, viewGroup);
        Kz0.b bVar = this.f107968t;
        ViewBinding viewBinding = this.f107960l;
        bVar.getClass();
        if (viewBinding instanceof q0) {
            q0 q0Var = (q0) viewBinding;
            bVar.f13197a = q0Var.f23940l;
            bVar.f13198b = q0Var.f23943o;
            bVar.f13199c = q0Var.f23941m;
            bVar.f13200d = q0Var.f23944p;
            bVar.f13201e = q0Var.f23945q;
            bVar.f13202f = q0Var.f23942n;
            bVar.f13203g = q0Var.f23946r;
            u0 u0Var = q0Var.h;
            RelativeLayout relativeLayout = u0Var.f24002a;
            bVar.h = u0Var.f24003b;
            bVar.f13205j = u0Var.f24004c;
            bVar.f13204i = u0Var.f24006e;
            bVar.f13206k = u0Var.f24005d;
            bVar.f13207l = q0Var.f23933d;
            bVar.f13208m = q0Var.f23939k;
            bVar.f13209n = q0Var.f23938j;
            bVar.f13210o = q0Var.f23936g;
            bVar.f13211p = q0Var.f23935f;
            bVar.f13212q = q0Var.f23932c;
            bVar.f13213r = q0Var.f23931b;
            m0 m0Var = q0Var.f23937i;
            bVar.f13214s = m0Var.f23877b;
            bVar.f13215t = m0Var.f23878c;
            bVar.f13216u = q0Var.f23947s;
        } else if (viewBinding instanceof r0) {
            r0 r0Var = (r0) viewBinding;
            bVar.f13197a = r0Var.f23966m;
            bVar.f13198b = r0Var.f23969p;
            bVar.f13199c = r0Var.f23967n;
            bVar.f13200d = r0Var.f23970q;
            bVar.f13201e = r0Var.f23971r;
            bVar.f13202f = r0Var.f23968o;
            bVar.f13203g = r0Var.f23972s;
            v0 v0Var = r0Var.f23962i;
            RelativeLayout relativeLayout2 = v0Var.f24013a;
            bVar.h = v0Var.f24014b;
            bVar.f13205j = v0Var.f24015c;
            bVar.f13204i = v0Var.f24017e;
            bVar.f13206k = v0Var.f24016d;
            bVar.f13207l = r0Var.f23959e;
            bVar.f13208m = r0Var.f23965l;
            bVar.f13209n = r0Var.f23964k;
            bVar.f13210o = r0Var.h;
            bVar.f13211p = r0Var.f23961g;
            bVar.f13212q = r0Var.f23958d;
            bVar.f13213r = r0Var.f23957c;
            n0 n0Var = r0Var.f23963j;
            bVar.f13214s = n0Var.f23883b;
            bVar.f13215t = n0Var.f23884c;
            bVar.f13216u = r0Var.f23973t;
        }
        return viewZf;
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f107963o) {
            return;
        }
        lf(0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021d  */
    /* JADX WARN: Type inference failed for: r1v7, types: [Jz0.e, Mw0.d] */
    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r10, @org.jetbrains.annotations.Nullable android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 641
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicFragmentV3.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // Hz0.a
    public final void pb(@NotNull BMusic bMusic, int i7) {
        EditorTrackView editorTrackView = this.f107968t.f13207l;
        if (editorTrackView == null) {
            return;
        }
        String str = bMusic.musicName;
        long j7 = bMusic.trimIn;
        long j8 = bMusic.trimOut;
        long j9 = bMusic.totalTime;
        if (i7 < 0 || i7 >= editorTrackView.f110343v.size()) {
            editorTrackView.f110343v.size();
        } else {
            TrackEditEntry trackEditEntry = editorTrackView.f110343v.get(i7);
            trackEditEntry.clipContent = str;
            trackEditEntry.trimIn = j7;
            trackEditEntry.trimOut = j8;
            trackEditEntry.totalTime = j9;
        }
        editorTrackView.f110321L = true;
    }

    @Override // Hz0.a
    public final void s6() {
        EditorTrackView editorTrackView = this.f107968t.f13207l;
        if (editorTrackView != null) {
            editorTrackView.f110318I = -1;
            editorTrackView.f110336o.d(editorTrackView.i(0L) - editorTrackView.f110316G);
        }
        lf(0L);
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, aC0.InterfaceC3194a
    public final void w2(long j7) {
        super.w2(j7);
        EditorTrackView editorTrackView = this.f107968t.f13207l;
        if (editorTrackView != null) {
            int iG = editorTrackView.f110336o.g(j7);
            if (editorTrackView.f110318I == -1) {
                editorTrackView.f110318I = iG;
            }
            int i7 = iG - editorTrackView.f110318I;
            if (i7 >= 0) {
                editorTrackView.f110318I = iG;
                editorTrackView.f110336o.d(i7);
            }
        }
    }

    @NotNull
    public final Jz0.e wf() {
        Jz0.e eVar = this.f107961m;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mMusicPresenter");
        return null;
    }

    public void xf() {
        Context context;
        jf();
        EditorTrackView editorTrackView = this.f107968t.f13207l;
        if (editorTrackView == null || (context = editorTrackView.getContext()) == null) {
            return;
        }
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setMessage(2131842149).setCancelable(false).setNegativeButton(2131842224, (DialogInterface.OnClickListener) null).setPositiveButton(2131841776, new DialogInterface.OnClickListener(this) { // from class: com.bilibili.studio.editor.moudle.musicv3.ui.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorMusicFragmentV3 f108038a;

            {
                this.f108038a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                BiliEditorMusicFragmentV3 biliEditorMusicFragmentV3 = this.f108038a;
                EditorTrackView editorTrackView2 = biliEditorMusicFragmentV3.f107968t.f13207l;
                if (editorTrackView2 == null) {
                    return;
                }
                editorTrackView2.f110321L = true;
                if (biliEditorMusicFragmentV3.wf().c(biliEditorMusicFragmentV3.f107965q)) {
                    biliEditorMusicFragmentV3.mf(biliEditorMusicFragmentV3.f105686c, BackUpTag.MUSIC_DEL);
                    editorTrackView2.s(biliEditorMusicFragmentV3.f107965q);
                }
            }
        }).create();
        alertDialogCreate.show();
        fA0.a.a(alertDialogCreate);
    }

    public final void yf(boolean z6, @NotNull List<? extends BClip> list, @Nullable EditorMusicInfo editorMusicInfo) {
        EditorTrackView editorTrackView = this.f107968t.f13207l;
        if (editorTrackView == null) {
            return;
        }
        if (z6) {
            editorTrackView.f110316G = 0;
        }
        Lazy<UC0.n> lazy = UC0.n.f24629b;
        n.a.a().getClass();
        int iDp2px = DensityUtil.dp2px(editorTrackView.getContext(), 44.0f);
        ArrayList<qD0.a> arrayList = new ArrayList<>();
        for (BClip bClip : list) {
            qD0.a aVar = new qD0.a();
            aVar.a(bClip, TransitionInfo.DEFAULT_DURATION, iDp2px);
            arrayList.add(aVar);
        }
        editorTrackView.f110336o.setMediaClipList(arrayList);
        TimeAxisZoomView timeAxisZoomView = this.f107968t.f13208m;
        if (timeAxisZoomView == null) {
            return;
        }
        timeAxisZoomView.setTotalDuration(editorTrackView.getTotalDuration());
        long frameDuration = timeAxisZoomView.getFrameDuration();
        BiliEditorMediaTrackView biliEditorMediaTrackView = editorTrackView.f110336o;
        Iterator<T> it = biliEditorMediaTrackView.f110516i.iterator();
        while (it.hasNext()) {
            ((qD0.a) it.next()).b(frameDuration);
        }
        biliEditorMediaTrackView.h();
        biliEditorMediaTrackView.postInvalidate();
        Df(editorMusicInfo);
        editorTrackView.f110318I = -1;
        editorTrackView.t();
    }

    @Override // fz0.InterfaceC7206a
    @NotNull
    public final EditorPage z0() {
        return EditorPage.MUSIC;
    }

    @Nullable
    public View zf(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        q0 q0VarInflate = q0.inflate(layoutInflater, viewGroup, false);
        this.f107960l = q0VarInflate;
        LinearLayout linearLayout = null;
        if (q0VarInflate == null) {
            q0VarInflate = null;
        }
        if (q0VarInflate != null) {
            linearLayout = q0VarInflate.f23930a;
        }
        return linearLayout;
    }
}
