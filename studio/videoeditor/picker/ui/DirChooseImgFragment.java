package com.bilibili.studio.videoeditor.picker.ui;

import Ei.c;
import Ei.d;
import XC0.c;
import XC0.m;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.studio.editor.moudle.sticker.ui.BiliEditorStickerImagePickerActivity;
import com.bilibili.studio.videoeditor.picker.bean.StorageBean;
import com.bilibili.studio.videoeditor.util.Q;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/picker/ui/DirChooseImgFragment.class */
public final class DirChooseImgFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f109880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f109881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public BiliEditorStickerImagePickerActivity.b f109882d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/picker/ui/DirChooseImgFragment$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DirChooseImgFragment f109883a;

        public a(DirChooseImgFragment dirChooseImgFragment) {
            this.f109883a = dirChooseImgFragment;
        }

        public final void a(int i7) {
            View view = null;
            DirChooseImgFragment dirChooseImgFragment = this.f109883a;
            if (i7 == 0) {
                View view2 = dirChooseImgFragment.f109880b;
                if (view2 != null) {
                    view = view2;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("mDirUp");
                }
                view.setVisibility(8);
                return;
            }
            View view3 = dirChooseImgFragment.f109880b;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDirUp");
                view3 = null;
            }
            view3.setVisibility(0);
        }
    }

    @NotNull
    public final m jf() {
        m mVar = this.f109881c;
        if (mVar != null) {
            return mVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDirChooseAdapter");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final Animation onCreateAnimation(int i7, boolean z6, int i8) {
        return z6 ? AnimationUtils.loadAnimation(p3(), 2130771997) : AnimationUtils.loadAnimation(p3(), 2130771996);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [XC0.c, XC0.m] */
    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131498305, (ViewGroup) null);
        viewInflate.findViewById(2131302849).setOnClickListener(new c(this, 1));
        View viewFindViewById = viewInflate.findViewById(2131299602);
        this.f109880b = viewFindViewById;
        if (viewFindViewById == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDirUp");
            viewFindViewById = null;
        }
        viewFindViewById.setOnClickListener(new d(this, 1));
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(2131308035);
        ?? cVar = new XC0.c(recyclerView);
        cVar.f27965f = Oz0.c.f18133a;
        this.f109881c = cVar;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(jf());
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        }
        return viewInflate;
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context == null) {
            return;
        }
        List<StorageBean> listA = Q.a(context);
        ArrayList arrayList = new ArrayList();
        for (StorageBean storageBean : listA) {
            if (Intrinsics.areEqual(storageBean.mounted, "mounted")) {
                c.b bVar = new c.b();
                bVar.f27975a = !storageBean.removable;
                bVar.f27976b = new File(storageBean.path);
                arrayList.add(bVar);
            }
        }
        m mVarJf = jf();
        mVarJf.f27966g = 0;
        mVarJf.h = arrayList;
        mVarJf.f27963d = arrayList;
        mVarJf.notifyDataSetChanged();
        jf().f27972n = new a(this);
        jf().f28027o = this.f109882d;
    }
}
