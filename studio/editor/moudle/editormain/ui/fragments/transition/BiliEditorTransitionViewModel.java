package com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition;

import Ex0.n;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.studio.editor.timeline.backup.BackUpTag;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.ms.transition.TransitionData;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import com.bilibili.studio.videoeditor.ms.transition.TransitionSelectItem;
import com.bilibili.studio.videoeditor.util.EditorUsedFunctionUtil;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/transition/BiliEditorTransitionViewModel.class */
public final class BiliEditorTransitionViewModel extends Yv0.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final cz0.a f107015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final j f107016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Ex0.c f107017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final n f107018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final EditVideoClip f107019g;

    @Nullable
    public List<? extends TransitionInfo> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final List<TransitionInfo> f107020i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f107021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Integer f107022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Pair<Long, Long> f107023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public TransitionInfo f107024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<TransitionData.TransitionTabBean>> f107025n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<TransitionSelectItem>> f107026o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f107027p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<TransitionSelectItem> f107028q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Long> f107029r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f107030s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final TransitionSelectItem f107031t;

    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    @javax.inject.Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BiliEditorTransitionViewModel(@org.jetbrains.annotations.NotNull android.app.Application r5, @org.jetbrains.annotations.NotNull cz0.a r6, @org.jetbrains.annotations.NotNull com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition.j r7, @org.jetbrains.annotations.NotNull Ex0.c r8, @org.jetbrains.annotations.NotNull Ex0.n r9) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition.BiliEditorTransitionViewModel.<init>(android.app.Application, cz0.a, com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition.j, Ex0.c, Ex0.n):void");
    }

    public final void J0(TransitionInfo transitionInfo, Long l7) {
        MutableLiveData<Long> mutableLiveData = this.f107029r;
        if (transitionInfo == null) {
            mutableLiveData.setValue(0L);
            return;
        }
        Pair<Long, Long> pair = this.f107023l;
        if (pair == null) {
            return;
        }
        if (l7 != null) {
            transitionInfo.duration = l7.longValue();
        }
        if (transitionInfo.duration < ((Number) pair.getFirst()).longValue()) {
            transitionInfo.duration = ((Number) pair.getFirst()).longValue();
        } else if (transitionInfo.duration > ((Number) pair.getSecond()).longValue()) {
            transitionInfo.duration = ((Number) pair.getSecond()).longValue();
        }
        mutableLiveData.setValue(Long.valueOf(transitionInfo.duration));
    }

    public final void K0(EditVideoInfo editVideoInfo) {
        if (!EditorUsedFunctionUtil.d(editVideoInfo, "转场") && EditorUsedFunctionUtil.m(this.h, this.f107020i)) {
            EditorUsedFunctionUtil.a(editVideoInfo, "转场");
        }
        if (this.f107020i.size() > 0) {
            editVideoInfo.setIsEdited(true);
        }
    }

    @Nullable
    public final TransitionData.TransitionTabBean L0() {
        Integer value = this.f107027p.getValue();
        TransitionData.TransitionTabBean transitionTabBean = null;
        if (value != null) {
            int iIntValue = value.intValue();
            List<TransitionData.TransitionTabBean> value2 = this.f107025n.getValue();
            transitionTabBean = null;
            if (value2 != null) {
                transitionTabBean = (TransitionData.TransitionTabBean) CollectionsKt.getOrNull(value2, iIntValue);
            }
        }
        return transitionTabBean;
    }

    public final void M0(int i7, boolean z6) {
        List<TransitionData.TransitionTabBean> value = this.f107025n.getValue();
        if (value != null && i7 >= 0 && i7 < value.size()) {
            this.f107027p.setValue(Integer.valueOf(i7));
            if (z6) {
                List<TransitionSelectItem> value2 = this.f107026o.getValue();
                int i8 = 0;
                if (value2 != null) {
                    Iterator<TransitionSelectItem> it = value2.iterator();
                    i8 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i8 = -1;
                            break;
                        } else if (it.next().tabIndex == i7) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                this.f107030s.setValue(Integer.valueOf(i8));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N0(boolean z6) {
        EditVideoInfo editVideoInfo = this.f107017e.f4806b;
        if (editVideoInfo == null) {
            return;
        }
        K0(editVideoInfo);
        this.h = com.bilibili.studio.videoeditor.extension.j.a(this.f107020i, BiliEditorTransitionViewModel$saveEditingTransition$1.INSTANCE);
        EditVideoClip userVideoTrack = editVideoInfo.getUserVideoTrack();
        if (userVideoTrack != 0) {
            userVideoTrack.setTransitionInfoList(this.h);
        }
        BackUpTag backUpTag = z6 ? BackUpTag.TRANS_APPLY_ALL : BackUpTag.TRANS_APPLY;
        com.bilibili.studio.editor.timeline.i iVar = this.f107018f.f4833c;
        if (iVar != null) {
            iVar.a(editVideoInfo, backUpTag);
        }
        this.f107017e.a();
    }

    public final void O0() {
        TransitionSelectItem value = this.f107028q.getValue();
        if (value == null) {
            return;
        }
        this.f107027p.setValue(Integer.valueOf(value.tabIndex));
    }

    public final void P0() {
        List<BClip> bClipList;
        BClip bClip;
        String str;
        List<BClip> bClipList2;
        BClip bClip2;
        String str2;
        Object next;
        TransitionInfo transitionInfo;
        Integer value = this.f107021j.getValue();
        if (value != null) {
            int iIntValue = value.intValue();
            EditVideoClip editVideoClip = this.f107019g;
            if (editVideoClip == null || (bClipList = editVideoClip.getBClipList()) == null || (bClip = (BClip) CollectionsKt.getOrNull(bClipList, iIntValue)) == null || (str = bClip.id) == null || (bClipList2 = editVideoClip.getBClipList()) == null || (bClip2 = (BClip) CollectionsKt.getOrNull(bClipList2, iIntValue + 1)) == null || (str2 = bClip2.id) == null) {
                return;
            }
            Iterator<T> it = this.f107020i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                TransitionInfo transitionInfo2 = (TransitionInfo) next;
                if (Intrinsics.areEqual(transitionInfo2.preBClipId, str) && Intrinsics.areEqual(transitionInfo2.nextBClipId, str2)) {
                    break;
                }
            }
            TransitionInfo transitionInfo3 = (TransitionInfo) next;
            this.f107024m = transitionInfo3;
            J0(transitionInfo3, null);
            MutableLiveData<TransitionSelectItem> mutableLiveData = this.f107028q;
            TransitionSelectItem value2 = mutableLiveData.getValue();
            if (value2 == null || (transitionInfo = this.f107024m) == null || value2.id != transitionInfo.selectId) {
                MutableLiveData<List<TransitionSelectItem>> mutableLiveData2 = this.f107026o;
                List<TransitionSelectItem> value3 = mutableLiveData2.getValue();
                int i7 = -1;
                if (value3 != null) {
                    Iterator<TransitionSelectItem> it2 = value3.iterator();
                    int i8 = 0;
                    while (true) {
                        i7 = -1;
                        if (!it2.hasNext()) {
                            break;
                        }
                        TransitionSelectItem next2 = it2.next();
                        TransitionInfo transitionInfo4 = this.f107024m;
                        if (transitionInfo4 != null && next2.id == transitionInfo4.selectId) {
                            i7 = i8;
                            break;
                        }
                        i8++;
                    }
                }
                MutableLiveData<Integer> mutableLiveData3 = this.f107030s;
                if (i7 < 0) {
                    if (this.f107024m != null) {
                        mutableLiveData.setValue(null);
                        return;
                    } else {
                        mutableLiveData.setValue(this.f107031t);
                        mutableLiveData3.setValue(0);
                        return;
                    }
                }
                List<TransitionSelectItem> value4 = mutableLiveData2.getValue();
                TransitionSelectItem transitionSelectItem = null;
                if (value4 != null) {
                    transitionSelectItem = value4.get(i7);
                }
                mutableLiveData.setValue(transitionSelectItem);
                mutableLiveData3.setValue(Integer.valueOf(i7));
            }
        }
    }
}
