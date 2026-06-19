package com.bilibili.studio.editor.moudle.clip.ui;

import Dy0.C1606b;
import Hr.f;
import Ky0.a0;
import UC0.k;
import Xz0.d;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.analytics.C4667i;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.studio.editor.moudle.editormain.constans.EditorPage;
import com.bilibili.studio.editor.moudle.editormain.ui.BiliEditorMainActivity;
import com.bilibili.studio.editor.repository.entity.BiliEditorMusicRhythmVideoClip;
import com.bilibili.studio.editor.timeline.UpperTimeline;
import com.bilibili.studio.editor.timeline.backup.BackUpTag;
import com.bilibili.studio.editor.timeline.i;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.editbase.filter.model.EditFxFilterClip;
import com.bilibili.studio.videoeditor.editbase.filter.model.EditFxFilterInfo;
import com.bilibili.studio.videoeditor.editbase.visualeffects.model.EditVisualEffectsInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.util.C6635h;
import com.bilibili.studio.videoeditor.util.EditorUsedFunctionUtil;
import com.bilibili.studio.videoeditor.util.V;
import ey0.c;
import fz0.InterfaceC7206a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tx0.b;
import ux0.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/clip/ui/BiliEditorSortFragment.class */
public class BiliEditorSortFragment extends androidx_fragment_app_Fragment implements View.OnClickListener, InterfaceC7206a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f106055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f106056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EditVideoInfo f106057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EditVideoClip f106058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f106059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i f106060g;
    public ImageView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f106061i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f106062j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Context f106063k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f106064l = -1;

    @Override // fz0.InterfaceC7206a
    public void La(@NonNull Function1<? super Boolean, Unit> function1) {
    }

    @Override // fz0.InterfaceC7206a
    @Nullable
    public final EditVideoInfo Q0() {
        b bVar = this.f106056c;
        if (bVar == null || bVar.a == null || this.f106060g.f108300b == null || this.f106058e == null || this.f106057d == null || this.f106059f == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.f106056c.a);
        of(arrayList);
        hf(arrayList);
        EditVideoClip editVideoClipM10449clone = this.f106058e.m10449clone();
        editVideoClipM10449clone.setBClipListAndUpdate(arrayList);
        EditVideoInfo editVideoInfoM10450clone = this.f106057d.m10450clone();
        editVideoInfoM10450clone.setUserVideoTrack(editVideoClipM10449clone);
        k editVideoTrack = this.f106060g.f108300b.getEditVideoTrack();
        EditVideoClip userVideoTrack = editVideoInfoM10450clone.getUserVideoTrack();
        if (editVideoTrack != null && userVideoTrack != null) {
            List<EditFxFilterClip> listT = editVideoTrack.t();
            EditFxFilterInfo editFxFilterInfo = userVideoTrack.getEditFxFilterInfo();
            if (editFxFilterInfo != null) {
                editFxFilterInfo.setFilterClips(listT);
            }
            EditVisualEffectsInfo editVisualEffectsInfo = userVideoTrack.getEditVisualEffectsInfo();
            if (editVisualEffectsInfo != null) {
                editVisualEffectsInfo.clips = editVideoTrack.s();
            }
        }
        return editVideoInfoM10450clone;
    }

    public final void hf(List<BClip> list) {
        List<BClip> userTrackBClipList = this.f106057d.getUserTrackBClipList();
        if (V.e(userTrackBClipList)) {
            return;
        }
        BClip bClip = V.e(userTrackBClipList) ? null : userTrackBClipList.get(0);
        if (bClip != null && (bClip.getRoleInTheme() == 1 || bClip.getRoleInTheme() == 1011)) {
            list.add(0, bClip);
        }
        BClip bClip2 = (BClip) (V.e(userTrackBClipList) ? null : C4667i.a(1, userTrackBClipList));
        if (bClip2 != null) {
            if (bClip2.getRoleInTheme() == 2 || bClip2.getRoleInTheme() == 1012) {
                list.add(bClip2);
            }
        }
    }

    /* JADX INFO: renamed from: if, reason: not valid java name */
    public void mo9892if(EditVideoInfo editVideoInfo, BackUpTag backUpTag) {
    }

    public b jf() {
        return new b(this.f106055b, this.f106057d.getEditorMode(), false);
    }

    public final List<BClip> kf() {
        List<BClip> bClipListExcludeRoleTheme = this.f106058e.getBClipListExcludeRoleTheme();
        ArrayList arrayList = new ArrayList();
        for (BClip bClip : bClipListExcludeRoleTheme) {
            if (bClip.getRoleInTheme() != 1011 && bClip.getRoleInTheme() != 1012) {
                arrayList.add(bClip);
            }
        }
        return arrayList;
    }

    public final void lf() {
        boolean zNf = nf(true);
        mo9892if(this.f106057d, BackUpTag.CLIP_SORT);
        dz0.c cVar = ((Yv0.b) this.f106059f.a).B;
        if (cVar != null) {
            a0 a0Var = cVar.e.p;
            a0Var.getClass();
            a0Var.f13074a.G.setValue(new C1606b(new f(a0Var, 1)));
        }
        InfoEyesManager.getInstance().report2(false, "000225", new String[]{"contribute_clip_sort_behave_confirm", "click", C6635h.e(), zNf ? "1" : "0"});
    }

    public void mf(boolean z6) {
    }

    public final boolean nf(boolean z6) {
        boolean z7;
        b bVar = this.f106056c;
        if (bVar == null) {
            return false;
        }
        List<BClip> list = bVar.a;
        List<BClip> listKf = kf();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) listKf;
            if (i7 >= arrayList.size()) {
                z7 = false;
                break;
            }
            if (!((BClip) arrayList.get(i7)).id.equals(((BClip) ((ArrayList) list).get(i7)).id)) {
                z7 = true;
                break;
            }
            i7++;
        }
        if (z6) {
            this.f106055b = null;
            this.f106056c = null;
        }
        of(list);
        hf(list);
        this.f106058e.setBClipListAndUpdate(list);
        mf(z7);
        UpperTimeline upperTimeline = this.f106060g.f108300b;
        if (upperTimeline == null) {
            return false;
        }
        k editVideoTrack = upperTimeline.getEditVideoTrack();
        EditVideoClip userVideoTrack = this.f106057d.getUserVideoTrack();
        if (editVideoTrack != null && userVideoTrack != null) {
            List<EditFxFilterClip> listT = editVideoTrack.t();
            EditFxFilterInfo editFxFilterInfo = userVideoTrack.getEditFxFilterInfo();
            if (editFxFilterInfo != null) {
                editFxFilterInfo.setFilterClips(listT);
            }
            EditVisualEffectsInfo editVisualEffectsInfo = userVideoTrack.getEditVisualEffectsInfo();
            if (editVisualEffectsInfo != null) {
                editVisualEffectsInfo.clips = editVideoTrack.s();
            }
        }
        return z7;
    }

    public final void of(List<BClip> list) {
        if (this.f106057d.getEditorMode() != 68 || this.f106057d.getBiliEditorMusicRhythmEntity() == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) list;
        if (this.f106057d.getBiliEditorMusicRhythmEntity().getVideoClips().size() < arrayList.size()) {
            return;
        }
        ArrayList<BiliEditorMusicRhythmVideoClip> videoClips = this.f106057d.getBiliEditorMusicRhythmEntity().getVideoClips();
        List<BClip> listKf = kf();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) listKf;
            if (i7 >= arrayList2.size()) {
                return;
            }
            BClip bClip = (BClip) arrayList2.get(i7);
            BClip bClip2 = (BClip) arrayList.get(i7);
            if (!bClip.id.equals(bClip2.id)) {
                bClip2.setTrimIn(0L);
                bClip2.setTrimOut(videoClips.get(i7).getDuration());
            }
            i7++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@NonNull Activity activity) {
        super.onAttach(activity);
        this.f106063k = activity.getApplicationContext();
        c cVar = new c((BiliEditorMainActivity) activity);
        this.f106059f = cVar;
        this.f106060g = cVar.e();
        EditVideoInfo editVideoInfoQ = this.f106059f.q();
        this.f106057d = editVideoInfoQ;
        if (editVideoInfoQ != null) {
            this.f106058e = editVideoInfoQ.getUserVideoTrackClone();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FragmentActivity fragmentActivityP3;
        int id = view.getId();
        if (id != 2131302460) {
            if (id == 2131302459) {
                this.f106055b = null;
                this.f106056c = null;
                dz0.c cVar = ((Yv0.b) this.f106059f.a).B;
                if (cVar != null) {
                    a0 a0Var = cVar.e.p;
                    a0Var.getClass();
                    a0Var.f13074a.G.setValue(new C1606b(new f(a0Var, 1)));
                }
                InfoEyesManager.getInstance().report2(false, "000225", new String[]{"contribute_clip_sort_behave_cancel", "click", C6635h.e()});
                d dVar = d.f28458a;
                String value = EditorUsedFunctionUtil.ClipBehavior.SORT.getValue();
                dVar.getClass();
                d.r("剪辑", value);
                return;
            }
            return;
        }
        if (this.f106057d.getEditorMode() == 68) {
            List<BClip> listKf = kf();
            b bVar = this.f106056c;
            if (bVar != null) {
                List list = bVar.a;
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = (ArrayList) listKf;
                    if (i7 >= arrayList.size()) {
                        break;
                    }
                    BClip bClip = (BClip) arrayList.get(i7);
                    BClip bClip2 = (BClip) ((ArrayList) list).get(i7);
                    if (bClip.getTrimIn() != 0 && !bClip.id.equals(bClip2.id)) {
                        FragmentActivity fragmentActivityP32 = p3();
                        if (fragmentActivityP32 == null || (fragmentActivityP3 = p3()) == null || fragmentActivityP3.isDestroyed() || fragmentActivityP3.isFinishing()) {
                            return;
                        }
                        AlertDialog alertDialogCreate = new AlertDialog.Builder(fragmentActivityP32).setMessage(2131841803).setCancelable(false).setNegativeButton(2131842224, (DialogInterface.OnClickListener) null).setPositiveButton(2131842251, (DialogInterface.OnClickListener) new a(this)).create();
                        alertDialogCreate.show();
                        fA0.a.a(alertDialogCreate);
                        return;
                    }
                    i7++;
                }
            }
        }
        lf();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131494062, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f106059f.A(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f106055b = (RecyclerView) view.findViewById(2131310774);
        this.h = (ImageView) view.findViewById(2131302459);
        this.f106061i = (ImageView) view.findViewById(2131302460);
        this.f106062j = (TextView) view.findViewById(2131309694);
        this.f106059f.A(false);
        this.h.setOnClickListener(this);
        this.f106061i.setOnClickListener(this);
        this.f106062j.setText(2131841981);
        this.f106055b.setLayoutManager(new LinearLayoutManager(this.f106063k, 0, false));
        b bVarJf = jf();
        this.f106056c = bVarJf;
        bVarJf.b = this.f106057d.getBiliEditorMusicRhythmEntity();
        this.f106056c.a = kf();
        this.f106055b.setAdapter(this.f106056c);
        new ItemTouchHelper(new AC0.b(this.f106055b, new ux0.d(this))).attachToRecyclerView(this.f106055b);
        EditVideoInfo editVideoInfo = this.f106057d;
        if (editVideoInfo == null) {
            return;
        }
        boolean zE = V.e(editVideoInfo.getCaptionInfoList());
        boolean zE2 = V.e(editVideoInfo.getRecordInfoList());
        boolean zE3 = V.e(editVideoInfo.getBiliEditorStickerInfoList());
        List<BClip> userTrackBClipList = editVideoInfo.getUserTrackBClipList();
        boolean z6 = false;
        if (userTrackBClipList != null) {
            z6 = false;
            if (userTrackBClipList.size() > 0) {
                Iterator<BClip> it = userTrackBClipList.iterator();
                while (true) {
                    z6 = false;
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next().playRate != 1.0f) {
                        z6 = true;
                        break;
                    }
                }
            }
        }
        if (zE && zE2 && !z6 && zE3) {
            return;
        }
        SharedPreferencesHelper sharedPreferencesHelper = new SharedPreferencesHelper(this.f106063k);
        boolean zOptBoolean = sharedPreferencesHelper.optBoolean("show_dialog", true);
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 == null || !zOptBoolean || fragmentActivityP3.isDestroyed() || fragmentActivityP3.isFinishing()) {
            return;
        }
        AlertDialog alertDialogCreate = new AlertDialog.Builder(fragmentActivityP3).setMessage(getString(2131841774)).setCancelable(true).setNegativeButton((CharSequence) getString(2131842182), (DialogInterface.OnClickListener) new ux0.b(this, sharedPreferencesHelper)).setPositiveButton((CharSequence) getString(2131841919), (DialogInterface.OnClickListener) new ux0.c(this)).create();
        alertDialogCreate.show();
        fA0.a.a(alertDialogCreate);
    }

    @Override // fz0.InterfaceC7206a
    @NonNull
    public final EditorPage z0() {
        return EditorPage.CLIP;
    }
}
