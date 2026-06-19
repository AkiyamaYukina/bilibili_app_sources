package com.bilibili.studio.editor.moudle.editormain.ui.fragments.template;

import Gy0.g;
import Mw0.e;
import No0.t;
import P50.n;
import TB0.d0;
import Xz0.i;
import aC0.InterfaceC3194a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.commons.ObjectUtils;
import com.bilibili.pegasus.holders.ViewOnClickListenerC5699t0;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.editormain.constans.EditorPage;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.template.music.BiliEditorMusicChangeStartFragmentOfTemV3;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.template.music.BiliEditorMusicListFragmentOfTemV3;
import com.bilibili.studio.editor.moudle.editormain.usecase.middlemodule.MiddleControlUseCase;
import com.bilibili.studio.editor.moudle.musicv3.ui.l;
import com.bilibili.studio.editor.moudle.templatev2.BiliEditTemplateBaseFragment;
import com.bilibili.studio.editor.moudle.templatev2.ui.BiliEditorTemplateMusicFragment;
import com.bilibili.studio.editor.moudle.templatev2.vm.j;
import com.bilibili.studio.editor.moudle.templatev2.vm.k;
import com.bilibili.studio.editor.timeline.i;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoIntelligenceInfo;
import com.bilibili.studio.videoeditor.extension.FragmentExtKt;
import com.bilibili.studio.videoeditor.util.EditorMonStatsExtraUtils;
import com.bilibili.studio.videoeditor.util.EditorUsedFunctionUtil;
import dz0.h;
import ez0.d;
import fz0.InterfaceC7206a;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import px0.b;
import tv.danmaku.android.log.BLog;
import uy0.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/template/BiliEditorTemplateFragmentV5.class */
public final class BiliEditorTemplateFragmentV5 extends BiliEditTemplateBaseFragment implements e, j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public d0 f106991l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public uy0.a f106992m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public InterfaceC3194a f106993n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public Function1<? super Boolean, Unit> f106994o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public String f106995p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final k.c f106996q = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final c f106997r = new c(this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final b f106998s = new b(this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final a f106999t = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/template/BiliEditorTemplateFragmentV5$a.class */
    public static final class a implements b.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliEditorTemplateFragmentV5 f107000a;

        public a(BiliEditorTemplateFragmentV5 biliEditorTemplateFragmentV5) {
            this.f107000a = biliEditorTemplateFragmentV5;
        }

        @Override // px0.b.d
        public final boolean a(MotionEvent motionEvent) {
            this.f107000a.xf(false);
            return false;
        }

        @Override // px0.b.d
        public final void b() {
        }

        @Override // px0.b.d
        public final void c() {
        }

        @Override // px0.b.d
        public final void d(float f7) {
        }

        @Override // px0.b.d
        public final boolean e(MotionEvent motionEvent) {
            this.f107000a.xf(false);
            return false;
        }

        @Override // px0.b.d
        public final void f(float f7, float f8) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/template/BiliEditorTemplateFragmentV5$b.class */
    public static final class b implements k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliEditorTemplateFragmentV5 f107001a;

        public b(BiliEditorTemplateFragmentV5 biliEditorTemplateFragmentV5) {
            this.f107001a = biliEditorTemplateFragmentV5;
        }

        @Override // com.bilibili.studio.editor.moudle.templatev2.vm.k.a
        public final void a(InterfaceC3194a interfaceC3194a) {
            this.f107001a.f106993n = interfaceC3194a;
        }

        @Override // com.bilibili.studio.editor.moudle.templatev2.vm.k.a
        public final void b(l lVar) {
            BiliEditorTemplateFragmentV5 biliEditorTemplateFragmentV5 = this.f107001a;
            d0 d0Var = biliEditorTemplateFragmentV5.f106991l;
            if (d0Var != null) {
                int id = d0Var.f23759d.getId();
                FragmentTransaction fragmentTransactionBeginTransaction = biliEditorTemplateFragmentV5.getChildFragmentManager().beginTransaction();
                Fragment fragmentFindFragmentByTag = biliEditorTemplateFragmentV5.getChildFragmentManager().findFragmentByTag("BiliEditorMusicListFragmentOfTemV3");
                if (fragmentFindFragmentByTag != null) {
                    fragmentTransactionBeginTransaction.hide(fragmentFindFragmentByTag);
                }
                Fragment fragmentFindFragmentByTag2 = biliEditorTemplateFragmentV5.getChildFragmentManager().findFragmentByTag("BiliEditorMusicChangeStartFragmentOfTemV3");
                if (fragmentFindFragmentByTag2 != null) {
                    fragmentTransactionBeginTransaction.show(fragmentFindFragmentByTag2);
                } else {
                    Bundle bundleB = B1.a.b(1, "cut_tab_from");
                    BiliEditorMusicChangeStartFragmentOfTemV3 biliEditorMusicChangeStartFragmentOfTemV3 = new BiliEditorMusicChangeStartFragmentOfTemV3();
                    biliEditorMusicChangeStartFragmentOfTemV3.setArguments(bundleB);
                    biliEditorMusicChangeStartFragmentOfTemV3.f107954n = lVar;
                    fragmentTransactionBeginTransaction.add(id, biliEditorMusicChangeStartFragmentOfTemV3, "BiliEditorMusicChangeStartFragmentOfTemV3");
                }
                fragmentTransactionBeginTransaction.commitAllowingStateLoss();
                biliEditorTemplateFragmentV5.f106995p = "BiliEditorMusicChangeStartFragmentOfTemV3";
            }
        }

        @Override // com.bilibili.studio.editor.moudle.templatev2.vm.k.a
        public final void c(float f7) {
            BiliEditorTemplateFragmentV5 biliEditorTemplateFragmentV5 = this.f107001a;
            EditVideoInfo editVideoInfoYf = biliEditorTemplateFragmentV5.yf();
            if (editVideoInfoYf != null) {
                editVideoInfoYf.setUserTrackNativeVolume(f7);
            }
            EditVideoInfo editVideoInfoZf = biliEditorTemplateFragmentV5.zf();
            if (editVideoInfoZf != null) {
                editVideoInfoZf.setUserTrackNativeVolume(f7);
            }
        }

        @Override // com.bilibili.studio.editor.moudle.templatev2.vm.k.a
        public final void d() {
            BiliEditorTemplateFragmentV5 biliEditorTemplateFragmentV5 = this.f107001a;
            FragmentTransaction fragmentTransactionBeginTransaction = biliEditorTemplateFragmentV5.getChildFragmentManager().beginTransaction();
            Fragment fragmentFindFragmentByTag = biliEditorTemplateFragmentV5.getChildFragmentManager().findFragmentByTag("BiliEditorMusicChangeStartFragmentOfTemV3");
            if (fragmentFindFragmentByTag != null) {
                fragmentTransactionBeginTransaction.remove(fragmentFindFragmentByTag);
            }
            Fragment fragmentFindFragmentByTag2 = biliEditorTemplateFragmentV5.getChildFragmentManager().findFragmentByTag("BiliEditorMusicListFragmentOfTemV3");
            if (fragmentFindFragmentByTag2 != null) {
                fragmentTransactionBeginTransaction.show(fragmentFindFragmentByTag2);
            }
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
            biliEditorTemplateFragmentV5.f106995p = "BiliEditorMusicListFragmentOfTemV3";
        }

        @Override // com.bilibili.studio.editor.moudle.templatev2.vm.k.a
        public final void e(boolean z6) {
            BiliEditorTemplateFragmentV5 biliEditorTemplateFragmentV5 = this.f107001a;
            d0 d0Var = biliEditorTemplateFragmentV5.f106991l;
            if (d0Var != null) {
                d0Var.f23760e.setVisibility(0);
            }
            FragmentTransaction fragmentTransactionBeginTransaction = biliEditorTemplateFragmentV5.getChildFragmentManager().beginTransaction();
            Fragment fragmentFindFragmentByTag = biliEditorTemplateFragmentV5.getChildFragmentManager().findFragmentByTag("BiliEditorMusicListFragmentOfTemV3");
            if (fragmentFindFragmentByTag != null) {
                fragmentTransactionBeginTransaction.remove(fragmentFindFragmentByTag);
            }
            Fragment fragmentFindFragmentByTag2 = biliEditorTemplateFragmentV5.getChildFragmentManager().findFragmentByTag("BiliEditorTemplateMusicFragment");
            if (fragmentFindFragmentByTag2 != null) {
                fragmentTransactionBeginTransaction.show(fragmentFindFragmentByTag2);
            }
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
            dz0.c cVar = ((Yv0.b) biliEditorTemplateFragmentV5.f105685b.a).B;
            if (cVar != null) {
                cVar.c.d.getClass();
            }
            uy0.a aVar = biliEditorTemplateFragmentV5.f106992m;
            uy0.a aVar2 = aVar;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                aVar2 = null;
            }
            EditVideoInfo editVideoInfoYf = biliEditorTemplateFragmentV5.yf();
            aVar2.getClass();
            if (!z6 && editVideoInfoYf != null) {
                aVar2.g = new a.a(editVideoInfoYf.getNativeVolume(), editVideoInfoYf.getEditorMusicInfo());
            }
            Function1<? super Boolean, Unit> function1 = biliEditorTemplateFragmentV5.f106994o;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(z6));
            }
            biliEditorTemplateFragmentV5.f106995p = "BiliEditorTemplateMusicFragment";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/template/BiliEditorTemplateFragmentV5$c.class */
    public static final class c implements k.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliEditorTemplateFragmentV5 f107002a;

        public c(BiliEditorTemplateFragmentV5 biliEditorTemplateFragmentV5) {
            this.f107002a = biliEditorTemplateFragmentV5;
        }

        @Override // com.bilibili.studio.editor.moudle.templatev2.vm.k.b
        public final void a() {
            BiliEditorTemplateFragmentV5 biliEditorTemplateFragmentV5 = this.f107002a;
            EditVideoInfo editVideoInfoYf = biliEditorTemplateFragmentV5.yf();
            Ez0.e.b().h(editVideoInfoYf != null ? editVideoInfoYf.getTemplateMusicList() : null);
            EditVideoInfo editVideoInfoYf2 = biliEditorTemplateFragmentV5.yf();
            boolean zAf = BiliEditorTemplateFragmentV5.Af(editVideoInfoYf2 != null ? editVideoInfoYf2.getCaptionInfoList() : null);
            dz0.c cVar = ((Yv0.b) biliEditorTemplateFragmentV5.f105685b.a).B;
            if (cVar != null) {
                d dVar = cVar.c.d;
                dVar.g.setValue(Gy0.c.a(dVar.b(), zAf, null, 5));
            }
            EditorMonStatsExtraUtils.a(biliEditorTemplateFragmentV5.yf(), biliEditorTemplateFragmentV5.f105687d);
            ey0.c cVar2 = biliEditorTemplateFragmentV5.f105685b;
            if (cVar2 != null) {
                i iVar = biliEditorTemplateFragmentV5.f105687d;
                n nVarI = null;
                if (iVar != null) {
                    nVarI = iVar.i();
                }
                cVar2.z(nVarI);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bilibili.studio.editor.moudle.templatev2.vm.k.b
        public final void b(boolean z6, boolean z7, boolean z8) {
            h hVar;
            MiddleControlUseCase middleControlUseCase;
            BLog.e("BiliEditorTemplateFragmentV5", "switchPlayEnable enable=" + z6 + ",playIfEnable=" + z7);
            BiliEditorTemplateFragmentV5 biliEditorTemplateFragmentV5 = this.f107002a;
            dz0.c cVar = ((Yv0.b) biliEditorTemplateFragmentV5.f105685b.a).B;
            if (cVar != null && (hVar = cVar.e) != null && (middleControlUseCase = hVar.i) != null) {
                MutableLiveData mutableLiveData = middleControlUseCase.f107186d.c;
                mutableLiveData.setValue(new g(z6));
            }
            if (!z6) {
                biliEditorTemplateFragmentV5.jf();
                return;
            }
            if (z7) {
                i iVar = biliEditorTemplateFragmentV5.f105687d;
                if (iVar == null || !iVar.m()) {
                    if (z8) {
                        biliEditorTemplateFragmentV5.lf(0L);
                    } else {
                        biliEditorTemplateFragmentV5.kf();
                    }
                }
            }
        }

        @Override // com.bilibili.studio.editor.moudle.templatev2.vm.k.b
        public final void c(Function1<? super Boolean, Unit> function1) {
            this.f107002a.f106994o = function1;
        }

        @Override // com.bilibili.studio.editor.moudle.templatev2.vm.k.b
        public final void d() {
            BiliEditorTemplateFragmentV5 biliEditorTemplateFragmentV5 = this.f107002a;
            d0 d0Var = biliEditorTemplateFragmentV5.f106991l;
            if (d0Var != null) {
                int id = d0Var.f23759d.getId();
                d0 d0Var2 = biliEditorTemplateFragmentV5.f106991l;
                if (d0Var2 != null) {
                    d0Var2.f23760e.setVisibility(8);
                }
                FragmentTransaction fragmentTransactionBeginTransaction = biliEditorTemplateFragmentV5.getChildFragmentManager().beginTransaction();
                Fragment fragmentFindFragmentByTag = biliEditorTemplateFragmentV5.getChildFragmentManager().findFragmentByTag("BiliEditorTemplateMusicFragment");
                if (fragmentFindFragmentByTag != null) {
                    fragmentTransactionBeginTransaction.hide(fragmentFindFragmentByTag);
                }
                Fragment fragmentFindFragmentByTag2 = biliEditorTemplateFragmentV5.getChildFragmentManager().findFragmentByTag("BiliEditorMusicListFragmentOfTemV3");
                if (fragmentFindFragmentByTag2 != null) {
                    fragmentTransactionBeginTransaction.show(fragmentFindFragmentByTag2);
                } else {
                    fragmentTransactionBeginTransaction.add(id, new BiliEditorMusicListFragmentOfTemV3(), "BiliEditorMusicListFragmentOfTemV3");
                }
                fragmentTransactionBeginTransaction.commitAllowingStateLoss();
                dz0.c cVar = ((Yv0.b) biliEditorTemplateFragmentV5.f105685b.a).B;
                if (cVar != null) {
                    cVar.c.d.getClass();
                }
                biliEditorTemplateFragmentV5.f106995p = "BiliEditorMusicListFragmentOfTemV3";
            }
        }
    }

    public static boolean Af(List list) {
        Object next;
        CaptionInfo captionInfo = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                next = null;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
                String str = ((CaptionInfo) next).materialId;
                if (str != null && str.length() != 0) {
                    break;
                }
            }
            captionInfo = (CaptionInfo) next;
        }
        return captionInfo != null;
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, aC0.InterfaceC3194a
    public final void D6() {
        super.D6();
        InterfaceC3194a interfaceC3194a = this.f106993n;
        if (interfaceC3194a != null) {
            interfaceC3194a.D6();
        }
        Lazy<Xz0.i> lazy = Xz0.i.f28467f;
        i.a.a().a();
    }

    @Override // com.bilibili.studio.editor.moudle.templatev2.vm.j
    @NotNull
    public final com.bilibili.studio.editor.moudle.editormain.ui.fragments.template.a G6() {
        return new com.bilibili.studio.editor.moudle.editormain.ui.fragments.template.a(this);
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, fz0.InterfaceC7206a
    public final void La(@NotNull Function1<? super Boolean, Unit> function1) {
        ActivityResultCaller activityResultCallerFindFragmentByTag = getChildFragmentManager().findFragmentByTag(this.f106995p);
        if (activityResultCallerFindFragmentByTag instanceof InterfaceC7206a) {
            ((InterfaceC7206a) activityResultCallerFindFragmentByTag).La(new t(3, function1, this));
            return;
        }
        uy0.a aVar = this.f106992m;
        uy0.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            aVar2 = null;
        }
        aVar2.c();
        function1.invoke(Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, fz0.InterfaceC7206a
    @Nullable
    public final EditVideoInfo Q0() {
        EditVideoInfo editVideoInfoQ0;
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag(this.f106995p);
        if (FragmentExtKt.isFragmentActive(fragmentFindFragmentByTag) && (fragmentFindFragmentByTag instanceof InterfaceC7206a)) {
            editVideoInfoQ0 = ((InterfaceC7206a) fragmentFindFragmentByTag).Q0();
        } else {
            Mw0.d dVar = this.f106992m;
            Mw0.d dVar2 = dVar;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                dVar2 = null;
            }
            EditVideoInfo editVideoInfoM10450clone = ((EditVideoInfo) ((Rz0.a) dVar2.f16455d).f16451b).m10450clone();
            if (!EditorUsedFunctionUtil.d(editVideoInfoM10450clone, "模板")) {
                Rz0.a aVar = (Rz0.a) dVar2.f16455d;
                if (EditorUsedFunctionUtil.l((EditVideoInfo) aVar.f16450a, (EditVideoInfo) aVar.f16451b)) {
                    EditorUsedFunctionUtil.a(editVideoInfoM10450clone, "模板");
                }
            }
            Rz0.a aVar2 = (Rz0.a) dVar2.f16455d;
            if (!ObjectUtils.equals((EditVideoInfo) aVar2.f16451b, (EditVideoInfo) aVar2.f16450a)) {
                editVideoInfoM10450clone.setIsEdited(true);
            }
            editVideoInfoQ0 = editVideoInfoM10450clone;
        }
        return editVideoInfoQ0;
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, px0.b.c
    @NotNull
    public final b.d S8() {
        return this.f106999t;
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, aC0.InterfaceC3194a
    public final void j8() {
        super.j8();
        InterfaceC3194a interfaceC3194a = this.f106993n;
        if (interfaceC3194a != null) {
            interfaceC3194a.j8();
        }
        Lazy<Xz0.i> lazy = Xz0.i.f28467f;
        i.a.a().a();
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment
    public final void jf() {
        super.jf();
        Lazy<Xz0.i> lazy = Xz0.i.f28467f;
        i.a.a().a();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb  */
    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, aC0.InterfaceC3194a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l4(long r9) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.template.BiliEditorTemplateFragmentV5.l4(long):void");
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        d0 d0VarInflate = d0.inflate(layoutInflater, viewGroup, false);
        this.f106991l = d0VarInflate;
        return d0VarInflate != null ? d0VarInflate.f23756a : null;
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f106991l = null;
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        EditVideoIntelligenceInfo intelligenceInfo;
        super.onViewCreated(view, bundle);
        this.f106992m = new uy0.a(this, this.f105686c, this.f105687d);
        k.c cVar = this.f106996q;
        EditVideoInfo editVideoInfo = this.f105686c;
        cVar.f108204f = (editVideoInfo == null || (intelligenceInfo = editVideoInfo.getIntelligenceInfo()) == null) ? 0 : intelligenceInfo.enterFrom;
        d0 d0Var = this.f106991l;
        if (d0Var != null) {
            EditVideoInfo editVideoInfoYf = yf();
            boolean zAf = Af(editVideoInfoYf != null ? editVideoInfoYf.getCaptionInfoList() : null);
            dz0.c cVar2 = ((Yv0.b) this.f105685b.a).B;
            if (cVar2 != null) {
                d dVar = cVar2.c.d;
                dVar.g.setValue(Gy0.c.a(dVar.b(), zAf, null, 5));
            }
            d0 d0Var2 = this.f106991l;
            if (d0Var2 != null) {
                Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("BiliEditorTemplateMusicFragment");
                Fragment biliEditorTemplateMusicFragment = fragmentFindFragmentByTag;
                if (fragmentFindFragmentByTag == null) {
                    biliEditorTemplateMusicFragment = new BiliEditorTemplateMusicFragment();
                }
                getChildFragmentManager().beginTransaction().add(d0Var2.f23759d.getId(), biliEditorTemplateMusicFragment, "BiliEditorTemplateMusicFragment").commitAllowingStateLoss();
                this.f106995p = "BiliEditorTemplateMusicFragment";
                Unit unit = Unit.INSTANCE;
            }
            d0Var.f23758c.setOnClickListener(new AK.g(this, 5));
            d0Var.f23757b.setVisibility(8);
            d0Var.f23757b.setOnClickListener(new ViewOnClickListenerC5699t0(this, 2));
            Unit unit2 = Unit.INSTANCE;
        }
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment
    public final boolean qf() {
        return true;
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment
    public final boolean rf() {
        return true;
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, aC0.InterfaceC3194a
    public final void vd() {
        super.vd();
        InterfaceC3194a interfaceC3194a = this.f106993n;
        if (interfaceC3194a != null) {
            interfaceC3194a.vd();
        }
        Lazy<Xz0.i> lazy = Xz0.i.f28467f;
        i.a.a().a();
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, aC0.InterfaceC3194a
    public final void w2(long j7) {
        super.w2(j7);
        InterfaceC3194a interfaceC3194a = this.f106993n;
        if (interfaceC3194a != null) {
            interfaceC3194a.w2(j7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018d  */
    @Override // com.bilibili.studio.editor.moudle.templatev2.BiliEditTemplateBaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void wf(boolean r9) {
        /*
            Method dump skipped, instruction units count: 1751
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.template.BiliEditorTemplateFragmentV5.wf(boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void xf(boolean r6) {
        /*
            Method dump skipped, instruction units count: 1158
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.template.BiliEditorTemplateFragmentV5.xf(boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final EditVideoInfo yf() {
        Mw0.d dVar = this.f106992m;
        Mw0.d dVar2 = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            dVar2 = null;
        }
        Rz0.a aVar = (Rz0.a) dVar2.f16455d;
        EditVideoInfo editVideoInfo = null;
        if (aVar != null) {
            editVideoInfo = (EditVideoInfo) aVar.f16451b;
        }
        return editVideoInfo;
    }

    @Override // fz0.InterfaceC7206a
    @NotNull
    public final EditorPage z0() {
        return Intrinsics.areEqual(this.f106995p, "BiliEditorTemplateMusicFragment") ? EditorPage.TEMPLATE : EditorPage.MUSIC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final EditVideoInfo zf() {
        Mw0.d dVar = this.f106992m;
        Mw0.d dVar2 = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            dVar2 = null;
        }
        Rz0.a aVar = (Rz0.a) dVar2.f16455d;
        EditVideoInfo editVideoInfo = null;
        if (aVar != null) {
            editVideoInfo = (EditVideoInfo) aVar.f16450a;
        }
        return editVideoInfo;
    }
}
