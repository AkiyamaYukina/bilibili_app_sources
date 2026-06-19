package com.bilibili.studio.editor.moudle.editormain.ui.fragments.clip;

import TB0.I;
import TB0.U;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bilibili.studio.editor.moudle.editormain.constans.EditorPage;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.BiliEditorMainBaseFragment;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.clip.BiliEditorMainMaterialFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.SearchPreTagLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/clip/BiliEditorMainMaterialFragment.class */
public final class BiliEditorMainMaterialFragment extends BiliEditorMainBaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public U f106752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public a f106753c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/clip/BiliEditorMainMaterialFragment$a.class */
    public interface a {
        void a(int i7);

        void b();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        I i7;
        U uInflate = U.inflate(layoutInflater, viewGroup, false);
        this.f106752b = uInflate;
        if (uInflate != null) {
            uInflate.f23689c.setOnClickListener(new com.bilibili.app.history.d(this, 2));
        }
        U u7 = this.f106752b;
        if (u7 != null) {
            final int i8 = 0;
            u7.f23688b.setOnClickListener(new View.OnClickListener(this, i8) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.clip.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f106773a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f106774b;

                {
                    this.f106773a = i8;
                    this.f106774b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (this.f106773a) {
                        case 0:
                            BiliEditorMainMaterialFragment.a aVar = ((BiliEditorMainMaterialFragment) this.f106774b).f106753c;
                            if (aVar != null) {
                                aVar.a(2);
                            }
                            break;
                        default:
                            SearchPreTagLayout.b bVar = (SearchPreTagLayout.b) this.f106774b;
                            if (bVar.d != null) {
                                bVar.setState(0);
                                bVar.d.g0(((Integer) bVar.getTag(1593835520)).intValue(), bVar.e);
                            }
                            break;
                    }
                }
            });
        }
        U u8 = this.f106752b;
        if (u8 != null) {
            u8.f23690d.setOnClickListener(new com.bilibili.app.history.f(2, this));
        }
        U u9 = this.f106752b;
        if (u9 != null && (i7 = u9.f23691e) != null) {
            i7.f23523b.setVisibility(8);
            final int i9 = 0;
            i7.f23524c.setOnClickListener(new View.OnClickListener(this, i9) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.clip.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f106775a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f106776b;

                {
                    this.f106775a = i9;
                    this.f106776b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (this.f106775a) {
                        case 0:
                            BiliEditorMainMaterialFragment.a aVar = ((BiliEditorMainMaterialFragment) this.f106776b).f106753c;
                            if (aVar != null) {
                                aVar.b();
                            }
                            break;
                        default:
                            SearchPreTagLayout.b bVar = (SearchPreTagLayout.b) this.f106776b;
                            if (bVar.d != null && view.isClickable() && view.isShown()) {
                                ((ViewGroup) bVar.getParent()).removeView(bVar);
                                SearchPreTagLayout.b.a aVar2 = bVar.d;
                                if (aVar2 != null) {
                                    aVar2.G(((Integer) bVar.getTag(1593835520)).intValue());
                                }
                            }
                            break;
                    }
                }
            });
            i7.f23525d.setText(2131842206);
        }
        U u10 = this.f106752b;
        return u10 != null ? u10.f23687a : null;
    }

    @Override // fz0.InterfaceC7206a
    @NotNull
    public final EditorPage z0() {
        return EditorPage.MAIN;
    }
}
