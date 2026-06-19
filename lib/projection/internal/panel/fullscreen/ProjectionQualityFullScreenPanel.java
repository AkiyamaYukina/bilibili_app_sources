package com.bilibili.lib.projection.internal.panel.fullscreen;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.compose.foundation.text.C3591b1;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.lib.projection.ProjectionClientConfig;
import com.bilibili.lib.projection.ProjectionTheme;
import com.bilibili.lib.projection.internal.api.model.ProjectionQualityInfo;
import com.bilibili.lib.projection.internal.nirvana.NirvanaEngine;
import com.bilibili.lib.projection.internal.projectionitem.CloudPlayableItemWrapper;
import com.bilibili.lib.projection.internal.projectionitem.LinkPlayableItemWrapper;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionPlayableItem;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.upper.module.contribute.up.ui.section.dialog.InputDialog;
import he0.C7433b;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import le0.C7838f;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/ProjectionQualityFullScreenPanel.class */
public final class ProjectionQualityFullScreenPanel extends ProjectionDialogFragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f63391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public List<ProjectionQualityInfo> f63392e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f63394g;
    public a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Disposable f63395i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f63393f = 32;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public ProjectionTheme f63396j = ProjectionTheme.PINK;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/ProjectionQualityFullScreenPanel$a.class */
    public final class a extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionQualityFullScreenPanel f63397a;

        public a(ProjectionQualityFullScreenPanel projectionQualityFullScreenPanel) {
            this.f63397a = projectionQualityFullScreenPanel;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            List<ProjectionQualityInfo> list = this.f63397a.f63392e;
            return list != null ? list.size() : 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r8, int r9) {
            /*
                Method dump skipped, instruction units count: 564
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.panel.fullscreen.ProjectionQualityFullScreenPanel.a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new b(p.a(viewGroup, 2131496569, viewGroup, false));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/ProjectionQualityFullScreenPanel$b.class */
    public final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TextView f63398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final TextView f63399b;

        public b(@NotNull View view) {
            super(view);
            this.f63398a = (TextView) view.findViewById(2131315063);
            this.f63399b = (TextView) view.findViewById(2131315064);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/ProjectionQualityFullScreenPanel$c.class */
    public static final class c<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionQualityFullScreenPanel f63400a;

        public c(ProjectionQualityFullScreenPanel projectionQualityFullScreenPanel) {
            this.f63400a = projectionQualityFullScreenPanel;
        }

        public final void accept(Object obj) {
            com.bilibili.lib.projection.internal.device.a aVar = (com.bilibili.lib.projection.internal.device.a) obj;
            List<Float> list = C7433b.f120827a;
            boolean zB = C7433b.b(aVar.getDevice());
            ProjectionQualityFullScreenPanel projectionQualityFullScreenPanel = this.f63400a;
            projectionQualityFullScreenPanel.f63394g = zB;
            IProjectionPlayableItem mediaSource = aVar.getDevice().getMediaSource();
            a aVar2 = null;
            int i7 = 32;
            if (mediaSource instanceof CloudPlayableItemWrapper) {
                CloudPlayableItemWrapper cloudPlayableItemWrapper = (CloudPlayableItemWrapper) mediaSource;
                if (!cloudPlayableItemWrapper.f63462b) {
                    ProjectionQualityInfo projectionQualityInfo = cloudPlayableItemWrapper.f63463c;
                    if (projectionQualityInfo != null) {
                        i7 = projectionQualityInfo.f63004a;
                    }
                    projectionQualityFullScreenPanel.f63393f = i7;
                    projectionQualityFullScreenPanel.f63392e = cloudPlayableItemWrapper.f63464d;
                    a aVar3 = projectionQualityFullScreenPanel.h;
                    if (aVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mQualityAdapter");
                        aVar3 = null;
                    }
                    aVar3.notifyDataSetChanged();
                    return;
                }
            }
            if (mediaSource instanceof NirvanaEngine.NirvanaAutoNextPlayableItemWrapper) {
                NirvanaEngine.NirvanaAutoNextPlayableItemWrapper nirvanaAutoNextPlayableItemWrapper = (NirvanaEngine.NirvanaAutoNextPlayableItemWrapper) mediaSource;
                ProjectionQualityInfo projectionQualityInfo2 = nirvanaAutoNextPlayableItemWrapper.f63241b;
                if (projectionQualityInfo2 != null) {
                    i7 = projectionQualityInfo2.f63004a;
                }
                projectionQualityFullScreenPanel.f63393f = i7;
                projectionQualityFullScreenPanel.f63392e = nirvanaAutoNextPlayableItemWrapper.f63242c;
                a aVar4 = projectionQualityFullScreenPanel.h;
                if (aVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mQualityAdapter");
                    aVar4 = null;
                }
                aVar4.notifyDataSetChanged();
                return;
            }
            if (mediaSource instanceof LinkPlayableItemWrapper) {
                LinkPlayableItemWrapper linkPlayableItemWrapper = (LinkPlayableItemWrapper) mediaSource;
                ProjectionQualityInfo projectionQualityInfo3 = linkPlayableItemWrapper.f63470b;
                if (projectionQualityInfo3 != null) {
                    i7 = projectionQualityInfo3.f63004a;
                }
                projectionQualityFullScreenPanel.f63393f = i7;
                projectionQualityFullScreenPanel.f63392e = linkPlayableItemWrapper.f63471c;
                a aVar5 = projectionQualityFullScreenPanel.h;
                if (aVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mQualityAdapter");
                } else {
                    aVar2 = aVar5;
                }
                aVar2.notifyDataSetChanged();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(2131496568, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(2131309531);
        final int i7 = 0;
        viewInflate.setOnClickListener(new View.OnClickListener(this, i7) { // from class: com.bilibili.lib.projection.internal.panel.fullscreen.D

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f63341a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final DialogFragment f63342b;

            {
                this.f63341a = i7;
                this.f63342b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f63341a) {
                    case 0:
                        ((ProjectionQualityFullScreenPanel) this.f63342b).dismissAllowingStateLoss();
                        break;
                    default:
                        InputDialog inputDialog = this.f63342b;
                        inputDialog.d.setText("");
                        InputDialog.b bVar = inputDialog.j;
                        if (bVar != null) {
                            bVar.a();
                        }
                        inputDialog.dismissAllowingStateLoss();
                        break;
                }
            }
        });
        viewFindViewById.setOnClickListener(new Object());
        RecyclerView recyclerView = (RecyclerView) viewFindViewById.findViewById(2131306580);
        this.f63391d = recyclerView;
        a aVar = null;
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(getLayoutInflater().getContext(), 1, false));
        this.h = new a(this);
        RecyclerView recyclerView3 = this.f63391d;
        RecyclerView recyclerView4 = recyclerView3;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
            recyclerView4 = null;
        }
        a aVar2 = this.h;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mQualityAdapter");
        } else {
            aVar = aVar2;
        }
        recyclerView4.setAdapter(aVar);
        this.f63351c = viewFindViewById;
        return viewInflate;
    }

    @Override // com.bilibili.lib.projection.internal.panel.fullscreen.ProjectionDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        Disposable disposable = this.f63395i;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f63395i = null;
        super.onDismiss(dialogInterface);
    }

    @Override // com.bilibili.lib.projection.internal.panel.fullscreen.ProjectionDialogFragment
    public final void onShow() {
        InterfaceC7845m interfaceC7845mM6;
        C7838f.a aVarI;
        InterfaceC7845m interfaceC7845mM62;
        ProjectionClientConfig config;
        InterfaceC7845m interfaceC7845mM63;
        io.reactivex.rxjava3.subjects.a aVarF;
        super.onShow();
        InterfaceC5317a interfaceC5317a = this.f63350b;
        this.f63395i = (interfaceC5317a == null || (interfaceC7845mM63 = interfaceC5317a.M6()) == null || (aVarF = interfaceC7845mM63.f()) == null) ? null : aVarF.subscribe(new c(this));
        InterfaceC5317a interfaceC5317a2 = this.f63350b;
        if (interfaceC5317a2 != null && (interfaceC7845mM62 = interfaceC5317a2.M6()) != null && (config = interfaceC7845mM62.getConfig()) != null) {
            this.f63396j = config.getTheme$biliscreencast_release();
        }
        InterfaceC5317a interfaceC5317a3 = this.f63350b;
        IProjectionPlayableItem iProjectionPlayableItemA = (interfaceC5317a3 == null || (interfaceC7845mM6 = interfaceC5317a3.M6()) == null || (aVarI = interfaceC7845mM6.i()) == null) ? null : aVarI.a();
        StandardProjectionPlayableItem standardProjectionPlayableItem = iProjectionPlayableItemA instanceof StandardProjectionPlayableItem ? (StandardProjectionPlayableItem) iProjectionPlayableItemA : null;
        if (standardProjectionPlayableItem != null) {
            this.f63393f = standardProjectionPlayableItem.F0().f63004a;
            this.f63392e = standardProjectionPlayableItem.getSupportQualities();
            a aVar = this.h;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mQualityAdapter");
                aVar = null;
            }
            aVar.notifyDataSetChanged();
        }
    }

    @Override // com.bilibili.lib.projection.internal.panel.fullscreen.ProjectionDialogFragment, androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        if (getDialog() == null || getView() == null) {
            return;
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        attributes.gravity = 80;
        requireView().measure(View.MeasureSpec.makeMeasureSpec(attributes.width, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        window.setAttributes(attributes);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenAdjustUtilsKt.collectWindowSize$default(this, false, new Ie0.h(0, this, new C3591b1(this, 3)), 1, (Object) null);
    }
}
