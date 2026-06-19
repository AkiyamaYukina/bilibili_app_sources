package com.bilibili.studio.editor.moudle.editormain.ui.fragments.clip;

import Mx0.a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.studio.editor.moudle.clip.ui.BiliEditorSortFragment;
import com.bilibili.studio.editor.moudle.editormain.track.cover.enums.BiliEditorTrackMode;
import com.bilibili.studio.editor.timeline.backup.BackUpTag;
import com.bilibili.studio.editor.timeline.i;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.util.EditorUsedFunctionUtil;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/clip/BiliEditorSortFragmentV3.class */
public final class BiliEditorSortFragmentV3 extends BiliEditorSortFragment {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public Integer f106754m;

    @Override // com.bilibili.studio.editor.moudle.clip.ui.BiliEditorSortFragment, fz0.InterfaceC7206a
    public final void La(@NotNull Function1<? super Boolean, Unit> function1) {
        nf(false);
        EditVideoInfo editVideoInfo = this.f106057d;
        if (editVideoInfo != null) {
            editVideoInfo.setUserVideoTrack(this.f106058e);
        }
        function1.invoke(Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.studio.editor.moudle.clip.ui.BiliEditorSortFragment
    /* JADX INFO: renamed from: if */
    public final void mo9892if(@Nullable EditVideoInfo editVideoInfo, @Nullable BackUpTag backUpTag) {
        List<BClip> bClipList;
        BClip bClip;
        dz0.c cVar;
        dz0.g gVar;
        ez0.c cVar2;
        if (editVideoInfo != null) {
            editVideoInfo.setUserVideoTrack(this.f106058e);
        }
        ey0.c cVar3 = this.f106059f;
        if (cVar3 != null) {
            cVar3.n(editVideoInfo, backUpTag);
        }
        Integer num = this.f106754m;
        int value = BiliEditorTrackMode.TRACK_MODE_EDIT.getValue();
        if (num == null || num.intValue() != value || (bClipList = this.f106058e.getBClipList()) == null || (bClip = (BClip) CollectionsKt.getOrNull(bClipList, this.f106064l)) == null) {
            return;
        }
        long inPoint = bClip.getInPoint();
        Long lValueOf = Long.valueOf(inPoint);
        if (inPoint < 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            ey0.c cVar4 = this.f106059f;
            if (cVar4 == null || (cVar = ((Yv0.b) cVar4.a).B) == null || (gVar = cVar.c) == null || (cVar2 = gVar.c) == null) {
                return;
            }
            Mx0.a aVar = Mx0.a.f16457j;
            int iE = a.C0086a.e(jLongValue);
            MutableLiveData mutableLiveData = cVar2.t;
            mutableLiveData.setValue(new Fy0.f(Long.valueOf(jLongValue), false, iE));
        }
    }

    @Override // com.bilibili.studio.editor.moudle.clip.ui.BiliEditorSortFragment
    @NotNull
    public final tx0.b jf() {
        return new tx0.b(this.f106055b, this.f106057d.getEditorMode(), true);
    }

    @Override // com.bilibili.studio.editor.moudle.clip.ui.BiliEditorSortFragment
    public final void mf(boolean z6) {
        this.f106057d.setUserVideoTrack(this.f106058e);
        i iVarE = this.f106059f.e();
        if (iVarE != null) {
            iVarE.s();
        }
        i iVarE2 = this.f106059f.e();
        if (iVarE2 != null) {
            iVarE2.b(this.f106057d, true, "BiliEditorSortFragmentV3-notifyClipChange");
        }
        if (z6) {
            EditorUsedFunctionUtil.a(this.f106057d, EditorUsedFunctionUtil.ClipBehavior.SORT.getValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final Animation onCreateAnimation(int i7, boolean z6, int i8) {
        return z6 ? AnimationUtils.loadAnimation(requireContext(), 2130772427) : AnimationUtils.loadAnimation(requireContext(), 2130772428);
    }

    @Override // com.bilibili.studio.editor.moudle.clip.ui.BiliEditorSortFragment, androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131501849, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View$OnTouchListener, java.lang.Object] */
    @Override // com.bilibili.studio.editor.moudle.clip.ui.BiliEditorSortFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.f106754m = arguments != null ? Integer.valueOf(arguments.getInt("track_select_status")) : null;
        view.setOnTouchListener(new Object());
    }
}
